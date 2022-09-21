package typings.storybookAddonKnobs

import org.scalablytyped.runtime.TopLevel
import typings.storybookAddonKnobs.anon.DisableDebounce
import typings.storybookAddonKnobs.anon.HideLabel
import typings.storybookAddonKnobs.anon.PickArrayTypeKnobvaluesep
import typings.storybookAddonKnobs.anon.PickBooleanTypeKnobvalue
import typings.storybookAddonKnobs.anon.PickColorTypeKnobvalue
import typings.storybookAddonKnobs.anon.PickDateTypeKnobvalue
import typings.storybookAddonKnobs.anon.PickFileTypeKnobvalueacce
import typings.storybookAddonKnobs.anon.PickNumberTypeKnobvaluera
import typings.storybookAddonKnobs.anon.PickObjectTypeKnobanyvalu
import typings.storybookAddonKnobs.anon.PickOptionsTypeKnobanyopt
import typings.storybookAddonKnobs.anon.PickRadiosTypeKnobvalueop
import typings.storybookAddonKnobs.anon.PickSelectTypeKnobSelectT
import typings.storybookAddonKnobs.anon.PickTextTypeKnobvalue
import typings.storybookAddonKnobs.typesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDefsMod {
  
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    HideLabel | PickArrayTypeKnobvaluesep | PickBooleanTypeKnobvalue | PickColorTypeKnobvalue | PickDateTypeKnobvalue | PickFileTypeKnobvalueacce | PickNumberTypeKnobvaluera | PickObjectTypeKnobanyvalu | PickOptionsTypeKnobanyopt | PickRadiosTypeKnobvalueop | PickSelectTypeKnobSelectT | PickTextTypeKnobvalue
  ]
  
  type KnobPlus[T /* <: KnobType */, K] = K & DisableDebounce[T]
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P] extends std.Array<infer U>? std.Array<any> : T[P]}
    */ typings.storybookAddonKnobs.storybookAddonKnobsStrings.Mutable & TopLevel[Any]
}
