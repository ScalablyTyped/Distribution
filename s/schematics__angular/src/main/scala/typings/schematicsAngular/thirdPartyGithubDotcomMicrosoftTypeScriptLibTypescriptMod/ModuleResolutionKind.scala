package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind & Double] = js.native
  
  @js.native
  sealed trait Bundler
    extends StObject
       with ModuleResolutionKind
  /* 100 */ val Bundler: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.Bundler & Double = js.native
  
  @js.native
  sealed trait Classic
    extends StObject
       with ModuleResolutionKind
  /* 1 */ val Classic: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.Classic & Double = js.native
  
  @js.native
  sealed trait Node10
    extends StObject
       with ModuleResolutionKind
  /* 2 */ val Node10: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.Node10 & Double = js.native
  
  @js.native
  sealed trait Node16
    extends StObject
       with ModuleResolutionKind
  /* 3 */ val Node16: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.Node16 & Double = js.native
  
  /**
    * @deprecated
    * `NodeJs` was renamed to `Node10` to better reflect the version of Node that it targets.
    * Use the new name or consider switching to a modern module resolution target.
    */
  @js.native
  sealed trait NodeJs
    extends StObject
       with ModuleResolutionKind
  /* 2 */ val NodeJs: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.NodeJs & Double = js.native
  
  @js.native
  sealed trait NodeNext
    extends StObject
       with ModuleResolutionKind
  /* 99 */ val NodeNext: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleResolutionKind.NodeNext & Double = js.native
}
