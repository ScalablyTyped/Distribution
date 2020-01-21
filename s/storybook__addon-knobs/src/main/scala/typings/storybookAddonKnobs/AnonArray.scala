package typings.storybookAddonKnobs

import typings.react.mod.FunctionComponent
import typings.storybookAddonKnobs.booleanMod.BooleanTypeProps
import typings.storybookAddonKnobs.buttonMod.ButtonTypeProps
import typings.storybookAddonKnobs.filesMod.FilesTypeProps
import typings.storybookAddonKnobs.optionsMod.OptionsTypeProps
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var boolean: FunctionComponent[BooleanTypeProps] with AnonDeserializeSerializeValueBoolean
  var button: FunctionComponent[ButtonTypeProps] with AnonDeserializeSerializeUndefined
  var files: FunctionComponent[FilesTypeProps] with AnonDeserializeSerializeUndefined
  var options: FunctionComponent[OptionsTypeProps[_]] with AnonDeserializeSerializeValueT
  var select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with AnonDeserializeSerializeValueSelectTypeKnobValue
}

object AnonArray {
  @scala.inline
  def apply(
    boolean: FunctionComponent[BooleanTypeProps] with AnonDeserializeSerializeValueBoolean,
    button: FunctionComponent[ButtonTypeProps] with AnonDeserializeSerializeUndefined,
    files: FunctionComponent[FilesTypeProps] with AnonDeserializeSerializeUndefined,
    options: FunctionComponent[OptionsTypeProps[_]] with AnonDeserializeSerializeValueT,
    select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with AnonDeserializeSerializeValueSelectTypeKnobValue
  ): AnonArray = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArray]
  }
}

