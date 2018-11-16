package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options provided when the transaction is created
     *
     * @see sequelize.transaction()
     */

trait TransactionOptions extends js.Object {
  var autocommit: js.UndefOr[scala.Boolean] = js.undefined
  /**
           *  See `Sequelize.Transaction.ISOLATION_LEVELS` for possible options
           */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.undefined
  /**
           * A function that gets executed while running the query to log the sql.
           */
  var logging: js.UndefOr[js.Function] = js.undefined
  /**
           *  See `Sequelize.Transaction.TYPES` for possible options
           */
  var `type`: js.UndefOr[TransactionType] = js.undefined
}

