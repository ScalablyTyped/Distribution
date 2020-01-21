package typings.storybookAddonKnobs

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.storybookAddonKnobs.booleanMod.BooleanTypeProps
import typings.storybookAddonKnobs.buttonMod.ButtonTypeProps
import typings.storybookAddonKnobs.filesMod.FilesTypeProps
import typings.storybookAddonKnobs.optionsMod.OptionsTypeProps
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeProps
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.array
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.button
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.color
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.date
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.files
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.number
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.options
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.radios
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.select
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofClassArrayType = js.native
    var boolean: FunctionComponent[BooleanTypeProps] with AnonDeserializeSerializeValueBoolean = js.native
    var button: FunctionComponent[ButtonTypeProps] with AnonDeserializeSerializeUndefined = js.native
    var color: TypeofClassColorType = js.native
    var date: TypeofClassDateType = js.native
    var files: FunctionComponent[FilesTypeProps] with AnonDeserializeSerializeUndefined = js.native
    var number: TypeofClassNumberType = js.native
    var `object`: TypeofClassObjectType = js.native
    var options: FunctionComponent[OptionsTypeProps[_]] with AnonDeserializeSerializeValueT = js.native
    var radios: TypeofClassRadiosType = js.native
    var select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with AnonDeserializeSerializeValueSelectTypeKnobValue = js.native
    var text: TypeofClassTextType = js.native
  }
  
  type KnobControlType = ComponentType[_] with AnonDeserializeSerializeV
  type KnobType = String
}

