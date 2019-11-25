package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.destroy method
  */
trait InstanceDestroyOptions extends js.Object {
  /**
    * If set to true, paranoid models will actually be deleted
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * Transaction to run the query in
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

object InstanceDestroyOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    transaction: Transaction = null
  ): InstanceDestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDestroyOptions]
  }
}

