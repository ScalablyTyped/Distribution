package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionOptionSetting extends js.Object {
  /**
    * The Name of the setting.
    */
  var name: String = js.native
  /**
    * The Value of the setting.
    */
  var value: String = js.native
}

object OptionGroupOptionOptionSetting {
  @scala.inline
  def apply(name: String, value: String): OptionGroupOptionOptionSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOptionOptionSetting]
  }
}

