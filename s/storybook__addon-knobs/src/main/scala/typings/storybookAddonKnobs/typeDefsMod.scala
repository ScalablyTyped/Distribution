package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/type-defs", JSImport.Namespace)
@js.native
object typeDefsMod extends js.Object {
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    AnonHideLabel | PickArrayTypeKnobvaluesep | PickBooleanTypeKnobvalue | PickColorTypeKnobvalue | PickDateTypeKnobvalue | PickFileTypeKnobvalueacce | PickNumberTypeKnobvaluera | PickObjectTypeKnobanyvalu | PickOptionsTypeKnobanyopt | PickRadiosTypeKnobvalueop | PickSelectTypeKnobSelectT | PickTextTypeKnobvalue
  ]
  type KnobPlus[T /* <: KnobType */, K] = K with AnonGroupId[T]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P] extends std.Array<infer U>? std.Array<any> : T[P]}
    */ typings.storybookAddonKnobs.storybookAddonKnobsStrings.Mutable with js.Any
}

