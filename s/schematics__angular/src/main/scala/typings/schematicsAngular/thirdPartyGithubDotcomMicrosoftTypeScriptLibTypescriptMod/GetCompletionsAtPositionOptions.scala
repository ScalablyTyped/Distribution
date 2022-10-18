package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompletionsAtPositionOptions
  extends StObject
     with UserPreferences {
  
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.undefined
  
  var triggerKind: js.UndefOr[CompletionTriggerKind] = js.undefined
}
object GetCompletionsAtPositionOptions {
  
  inline def apply(): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
  
  extension [Self <: GetCompletionsAtPositionOptions](x: Self) {
    
    inline def setIncludeExternalModuleExports(value: Boolean): Self = StObject.set(x, "includeExternalModuleExports", value.asInstanceOf[js.Any])
    
    inline def setIncludeExternalModuleExportsUndefined: Self = StObject.set(x, "includeExternalModuleExports", js.undefined)
    
    inline def setIncludeInsertTextCompletions(value: Boolean): Self = StObject.set(x, "includeInsertTextCompletions", value.asInstanceOf[js.Any])
    
    inline def setIncludeInsertTextCompletionsUndefined: Self = StObject.set(x, "includeInsertTextCompletions", js.undefined)
    
    inline def setTriggerCharacter(value: CompletionsTriggerCharacter): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    inline def setTriggerKind(value: CompletionTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
    
    inline def setTriggerKindUndefined: Self = StObject.set(x, "triggerKind", js.undefined)
  }
}
