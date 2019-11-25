package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`object`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.array
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.boolean
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.button
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.color
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.date
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.files
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.number
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.options
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.radios
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.select
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.text
import typings.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FilesTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobControlType
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object distComponentsTypesMod extends js.Object {
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofClassArrayType = js.native
    var boolean: FunctionComponent[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean = js.native
    var button: FunctionComponent[ButtonTypeProps] with Anon_DeserializeSerializeUndefined = js.native
    var color: TypeofClassColorType = js.native
    var date: TypeofClassDateType = js.native
    var files: FunctionComponent[FilesTypeProps] with Anon_DeserializeSerializeUndefined = js.native
    var number: TypeofClassNumberType = js.native
    var `object`: TypeofClassObjectType = js.native
    var options: FunctionComponent[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT = js.native
    var radios: TypeofClassRadiosType = js.native
    var select: FunctionComponent[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue = js.native
    var text: TypeofClassTextType = js.native
  }
  
  type KnobControlType = ComponentType[_] with Anon_DeserializeSerializeV
  type KnobType = String
}

