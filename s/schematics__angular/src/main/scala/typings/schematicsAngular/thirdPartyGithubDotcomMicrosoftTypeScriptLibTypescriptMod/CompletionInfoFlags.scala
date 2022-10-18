package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionInfoFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "CompletionInfoFlags")
@js.native
object CompletionInfoFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionInfoFlags & Double] = js.native
  
  @js.native
  sealed trait IsContinuation
    extends StObject
       with CompletionInfoFlags
  /* 4 */ val IsContinuation: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.IsContinuation & Double = js.native
  
  @js.native
  sealed trait IsImportStatementCompletion
    extends StObject
       with CompletionInfoFlags
  /* 2 */ val IsImportStatementCompletion: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.IsImportStatementCompletion & Double = js.native
  
  @js.native
  sealed trait MayIncludeAutoImports
    extends StObject
       with CompletionInfoFlags
  /* 1 */ val MayIncludeAutoImports: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.MayIncludeAutoImports & Double = js.native
  
  @js.native
  sealed trait MayIncludeMethodSnippets
    extends StObject
       with CompletionInfoFlags
  /* 32 */ val MayIncludeMethodSnippets: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.MayIncludeMethodSnippets & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CompletionInfoFlags
  /* 0 */ val None: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.None & Double = js.native
  
  @js.native
  sealed trait ResolvedModuleSpecifiers
    extends StObject
       with CompletionInfoFlags
  /* 8 */ val ResolvedModuleSpecifiers: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.ResolvedModuleSpecifiers & Double = js.native
  
  @js.native
  sealed trait ResolvedModuleSpecifiersBeyondLimit
    extends StObject
       with CompletionInfoFlags
  /* 16 */ val ResolvedModuleSpecifiersBeyondLimit: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompletionInfoFlags.ResolvedModuleSpecifiersBeyondLimit & Double = js.native
}
