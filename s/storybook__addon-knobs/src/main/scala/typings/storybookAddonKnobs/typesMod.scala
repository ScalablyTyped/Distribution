package typings.storybookAddonKnobs

import typings.react.mod.ComponentType
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
  /* Rewritten from type alias, can be one of: 
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.text
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.number
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.color
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.boolean
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.`object`
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.select
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.radios
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.array
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.date
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.button
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.files
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.options
  */
  trait KnobType extends js.Object
  
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofArrayType = js.native
    var boolean: FunctionComponentBooleanT = js.native
    var button: FunctionComponentButtonTy = js.native
    var color: TypeofColorType = js.native
    var date: TypeofDateType = js.native
    var files: FunctionComponentFilesTyp = js.native
    var number: TypeofNumberType = js.native
    var `object`: TypeofObjectType = js.native
    var options: FunctionComponentOptionsT = js.native
    var radios: TypeofRadiosType = js.native
    var select: FunctionComponentSelectTy = js.native
    var text: TypeofTextType = js.native
  }
  
  type KnobControlType = ComponentType[_] with AnonDeserialize
}

