package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options used for Instance.restore method
     */

trait InstanceRestoreOptions extends js.Object {
  /**
           * A function that gets executed while running the query to log the sql.
           */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
           * Transaction to run query under
           */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

