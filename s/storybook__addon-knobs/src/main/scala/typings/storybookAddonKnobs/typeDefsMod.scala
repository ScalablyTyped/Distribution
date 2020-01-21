package typings.storybookAddonKnobs

import typings.std.Pick
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.colorMod.ColorTypeKnob
import typings.storybookAddonKnobs.dateMod.DateTypeKnob
import typings.storybookAddonKnobs.filesMod.FileTypeKnob
import typings.storybookAddonKnobs.numberMod.NumberTypeKnob
import typings.storybookAddonKnobs.objectMod.ObjectTypeKnob
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import typings.storybookAddonKnobs.radioMod.RadiosTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.accept
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.max
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.min
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.options
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.optionsObj
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.range
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.separator
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.step
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.value
import typings.storybookAddonKnobs.textMod.TextTypeKnob
import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/type-defs", JSImport.Namespace)
@js.native
object typeDefsMod extends js.Object {
  @js.native
  trait Mutable[T] extends js.Object {
    var readonly: js.Any = js.native
  }
  
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    ((Pick[SelectTypeKnob[SelectTypeKnobValue], value | options]) with AnonSelectV2) | AnonCallbackHideLabel | (Pick[
      ArrayTypeKnob | BooleanTypeKnob | ColorTypeKnob | DateTypeKnob | FileTypeKnob | NumberTypeKnob | ObjectTypeKnob[js.Any] | OptionsTypeKnob[js.Any] | RadiosTypeKnob | TextTypeKnob, 
      options | value | optionsObj | accept | separator | range | min | max | step
    ])
  ]
  type KnobPlus[T /* <: KnobType */, K] = K with AnonGroupId[T]
}

