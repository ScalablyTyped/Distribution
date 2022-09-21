package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with DiagnosticCategory
  /* 1 */ val Error: typings.schematicsAngular.typescriptMod.DiagnosticCategory.Error & Double = js.native
  
  @js.native
  sealed trait Message
    extends StObject
       with DiagnosticCategory
  /* 3 */ val Message: typings.schematicsAngular.typescriptMod.DiagnosticCategory.Message & Double = js.native
  
  @js.native
  sealed trait Suggestion
    extends StObject
       with DiagnosticCategory
  /* 2 */ val Suggestion: typings.schematicsAngular.typescriptMod.DiagnosticCategory.Suggestion & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with DiagnosticCategory
  /* 0 */ val Warning: typings.schematicsAngular.typescriptMod.DiagnosticCategory.Warning & Double = js.native
}
