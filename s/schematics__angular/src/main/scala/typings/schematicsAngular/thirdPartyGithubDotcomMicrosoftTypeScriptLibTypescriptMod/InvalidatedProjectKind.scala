package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvalidatedProjectKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InvalidatedProjectKind & Double] = js.native
  
  @js.native
  sealed trait Build
    extends StObject
       with InvalidatedProjectKind
  /* 0 */ val Build: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InvalidatedProjectKind.Build & Double = js.native
  
  /** @deprecated */ @js.native
  sealed trait UpdateBundle
    extends StObject
       with InvalidatedProjectKind
  /* 1 */ val UpdateBundle: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InvalidatedProjectKind.UpdateBundle & Double = js.native
  
  @js.native
  sealed trait UpdateOutputFileStamps
    extends StObject
       with InvalidatedProjectKind
  /* 2 */ val UpdateOutputFileStamps: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.InvalidatedProjectKind.UpdateOutputFileStamps & Double = js.native
}
