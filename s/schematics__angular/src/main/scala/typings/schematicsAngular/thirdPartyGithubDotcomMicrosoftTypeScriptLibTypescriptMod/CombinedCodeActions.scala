package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinedCodeActions extends StObject {
  
  var changes: js.Array[FileTextChanges]
  
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.undefined
}
object CombinedCodeActions {
  
  inline def apply(changes: js.Array[FileTextChanges]): CombinedCodeActions = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeActions]
  }
  
  extension [Self <: CombinedCodeActions](x: Self) {
    
    inline def setChanges(value: js.Array[FileTextChanges]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: FileTextChanges*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setCommands(value: js.Array[CodeActionCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: CodeActionCommand*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}
