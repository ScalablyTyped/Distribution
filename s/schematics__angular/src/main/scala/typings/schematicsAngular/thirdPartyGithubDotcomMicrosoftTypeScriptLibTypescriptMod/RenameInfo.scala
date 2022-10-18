package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoSuccess
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  inline def RenameInfoFailure(localizedErrorMessage: java.lang.String): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoFailure]
  }
  
  inline def RenameInfoSuccess(
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.RenameInfoSuccess]
  }
}
