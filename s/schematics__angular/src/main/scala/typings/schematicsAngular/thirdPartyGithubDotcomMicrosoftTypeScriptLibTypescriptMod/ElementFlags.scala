package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ElementFlags")
@js.native
object ElementFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementFlags & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with ElementFlags
  /* 3 */ val Fixed: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Fixed & Double = js.native
  
  @js.native
  sealed trait NonRequired
    extends StObject
       with ElementFlags
  /* 14 */ val NonRequired: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.NonRequired & Double = js.native
  
  @js.native
  sealed trait NonRest
    extends StObject
       with ElementFlags
  /* 11 */ val NonRest: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.NonRest & Double = js.native
  
  @js.native
  sealed trait Optional
    extends StObject
       with ElementFlags
  /* 2 */ val Optional: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Optional & Double = js.native
  
  @js.native
  sealed trait Required
    extends StObject
       with ElementFlags
  /* 1 */ val Required: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Required & Double = js.native
  
  @js.native
  sealed trait Rest
    extends StObject
       with ElementFlags
  /* 4 */ val Rest: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Rest & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with ElementFlags
  /* 12 */ val Variable: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Variable & Double = js.native
  
  @js.native
  sealed trait Variadic
    extends StObject
       with ElementFlags
  /* 8 */ val Variadic: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ElementFlags.Variadic & Double = js.native
}
