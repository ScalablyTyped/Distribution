package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ScriptKind")
@js.native
object ScriptKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptKind & Double] = js.native
  
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with ScriptKind
  /* 7 */ val Deferred: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.Deferred & Double = js.native
  
  @js.native
  sealed trait External
    extends StObject
       with ScriptKind
  /* 5 */ val External: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.External & Double = js.native
  
  @js.native
  sealed trait JS
    extends StObject
       with ScriptKind
  /* 1 */ val JS: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.JS & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with ScriptKind
  /* 6 */ val JSON: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.JSON & Double = js.native
  
  @js.native
  sealed trait JSX
    extends StObject
       with ScriptKind
  /* 2 */ val JSX: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.JSX & Double = js.native
  
  @js.native
  sealed trait TS
    extends StObject
       with ScriptKind
  /* 3 */ val TS: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.TS & Double = js.native
  
  @js.native
  sealed trait TSX
    extends StObject
       with ScriptKind
  /* 4 */ val TSX: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.TSX & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ScriptKind
  /* 0 */ val Unknown: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScriptKind.Unknown & Double = js.native
}
