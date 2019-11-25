package typings.atStorybookAddonDashKnobs.distComponentsTypesFilesMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeKnob extends KnobControlConfig[DateTypeKnobValue] {
  var accept: String
}

object FileTypeKnob {
  @scala.inline
  def apply(accept: String, name: String, value: DateTypeKnobValue, defaultValue: DateTypeKnobValue = null): FileTypeKnob = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypeKnob]
  }
}

