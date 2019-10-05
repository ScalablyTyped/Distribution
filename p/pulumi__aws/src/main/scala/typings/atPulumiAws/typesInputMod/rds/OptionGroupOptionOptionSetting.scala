package typings.atPulumiAws.typesInputMod.rds

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupOptionOptionSetting extends js.Object {
  /**
    * The Name of the setting.
    */
  var name: Input[String]
  /**
    * The Value of the setting.
    */
  var value: Input[String]
}

object OptionGroupOptionOptionSetting {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): OptionGroupOptionOptionSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionGroupOptionOptionSetting]
  }
}

