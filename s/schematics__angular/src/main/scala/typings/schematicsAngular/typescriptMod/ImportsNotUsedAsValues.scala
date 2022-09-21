package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportsNotUsedAsValues extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ImportsNotUsedAsValues")
@js.native
object ImportsNotUsedAsValues extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportsNotUsedAsValues & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ImportsNotUsedAsValues
  /* 2 */ val Error: typings.schematicsAngular.typescriptMod.ImportsNotUsedAsValues.Error & Double = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with ImportsNotUsedAsValues
  /* 1 */ val Preserve: typings.schematicsAngular.typescriptMod.ImportsNotUsedAsValues.Preserve & Double = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with ImportsNotUsedAsValues
  /* 0 */ val Remove: typings.schematicsAngular.typescriptMod.ImportsNotUsedAsValues.Remove & Double = js.native
}
