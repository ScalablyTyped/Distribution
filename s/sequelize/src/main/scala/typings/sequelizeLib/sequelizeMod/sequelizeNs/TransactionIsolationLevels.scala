package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Isolations levels can be set per-transaction by passing `options.isolationLevel` to `sequelize.transaction`.
  * Default to `REPEATABLE_READ` but you can override the default isolation level by passing
  * `options.isolationLevel` in `new Sequelize`.
  */
trait TransactionIsolationLevels extends js.Object {
   // 'READ UNCOMMITTED'
  var READ_COMMITTED: TransactionIsolationLevelReadCommitted
  var READ_UNCOMMITTED: TransactionIsolationLevelReadUncommitted
   // 'READ COMMITTED'
  var REPEATABLE_READ: TransactionIsolationLevelRepeatableRead
   // 'REPEATABLE READ'
  var SERIALIZABLE: TransactionIsolationLevelSerializable
}

