package typings.atPulumiAws.typesOutputMod.rdsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupOptionOptionSetting extends js.Object {
  /**
    * The Name of the setting.
    */
  var name: String
  /**
    * The Value of the setting.
    */
  var value: String
}

object OptionGroupOptionOptionSetting {
  @scala.inline
  def apply(name: String, value: String): OptionGroupOptionOptionSetting = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[OptionGroupOptionOptionSetting]
  }
}

