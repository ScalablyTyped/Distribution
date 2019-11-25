package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.set method
  */
trait InstanceSetOptions extends js.Object {
  /**
    * If set to true, field and virtual setters will be ignored
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * Clear all previously set data values
    */
  var reset: js.UndefOr[Boolean] = js.undefined
}

object InstanceSetOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined, reset: js.UndefOr[Boolean] = js.undefined): InstanceSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSetOptions]
  }
}

