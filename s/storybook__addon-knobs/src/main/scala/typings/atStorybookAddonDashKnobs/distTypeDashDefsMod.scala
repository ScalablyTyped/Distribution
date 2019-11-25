package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.accept
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.max
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.min
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.options
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.optionsObj
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.range
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.separator
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.step
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.value
import typings.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesColorMod.ColorTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesDateMod.DateTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FileTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobType
import typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesObjectMod.ObjectTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesTextMod.TextTypeKnob
import typings.atStorybookAddonDashKnobs.distTypeDashDefsMod.KnobPlus
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/type-defs", JSImport.Namespace)
@js.native
object distTypeDashDefsMod extends js.Object {
  @js.native
  trait Mutable[T] extends js.Object {
    var readonly: js.Any = js.native
  }
  
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    ((Pick[SelectTypeKnob[SelectTypeKnobValue], value | options]) with Anon_SelectV2) | Anon_Callback | (Pick[
      ArrayTypeKnob | BooleanTypeKnob | ColorTypeKnob | DateTypeKnob | FileTypeKnob | NumberTypeKnob | ObjectTypeKnob[js.Any] | OptionsTypeKnob[js.Any] | RadiosTypeKnob | TextTypeKnob, 
      options | value | optionsObj | accept | separator | range | min | max | step
    ])
  ]
  type KnobPlus[T /* <: KnobType */, K] = K with Anon_GroupId[T]
}

