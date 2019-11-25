package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FilesTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var boolean: FunctionComponent[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean
  var button: FunctionComponent[ButtonTypeProps] with Anon_DeserializeSerializeUndefined
  var files: FunctionComponent[FilesTypeProps] with Anon_DeserializeSerializeUndefined
  var options: FunctionComponent[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT
  var select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue
}

object Anon_Array {
  @scala.inline
  def apply(
    boolean: FunctionComponent[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean,
    button: FunctionComponent[ButtonTypeProps] with Anon_DeserializeSerializeUndefined,
    files: FunctionComponent[FilesTypeProps] with Anon_DeserializeSerializeUndefined,
    options: FunctionComponent[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT,
    select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Array]
  }
}

