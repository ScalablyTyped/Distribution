package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageVariant extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "LanguageVariant")
@js.native
object LanguageVariant extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVariant & Double] = js.native
  
  @js.native
  sealed trait JSX
    extends StObject
       with LanguageVariant
  /* 1 */ val JSX: typings.schematicsAngular.typescriptMod.LanguageVariant.JSX & Double = js.native
  
  @js.native
  sealed trait Standard
    extends StObject
       with LanguageVariant
  /* 0 */ val Standard: typings.schematicsAngular.typescriptMod.LanguageVariant.Standard & Double = js.native
}
