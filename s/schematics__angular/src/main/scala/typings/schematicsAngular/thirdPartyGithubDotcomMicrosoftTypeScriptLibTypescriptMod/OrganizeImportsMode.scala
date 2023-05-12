package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OrganizeImportsMode extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "OrganizeImportsMode")
@js.native
object OrganizeImportsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[OrganizeImportsMode & java.lang.String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with OrganizeImportsMode
  /* "All" */ val All: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OrganizeImportsMode.All & java.lang.String = js.native
  
  @js.native
  sealed trait RemoveUnused
    extends StObject
       with OrganizeImportsMode
  /* "RemoveUnused" */ val RemoveUnused: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OrganizeImportsMode.RemoveUnused & java.lang.String = js.native
  
  @js.native
  sealed trait SortAndCombine
    extends StObject
       with OrganizeImportsMode
  /* "SortAndCombine" */ val SortAndCombine: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OrganizeImportsMode.SortAndCombine & java.lang.String = js.native
}
