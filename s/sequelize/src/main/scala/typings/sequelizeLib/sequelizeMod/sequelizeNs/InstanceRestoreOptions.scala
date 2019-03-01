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

object InstanceRestoreOptions {
  @scala.inline
  def apply(logging: scala.Boolean | js.Function = null, transaction: Transaction = null): InstanceRestoreOptions = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[InstanceRestoreOptions]
  }
}

