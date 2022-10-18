package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpInvokedReason
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpCharacterTypedReason
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  inline def SignatureHelpCharacterTypedReason(triggerCharacter: SignatureHelpTriggerCharacter): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpCharacterTypedReason]
  }
  
  inline def SignatureHelpInvokedReason(triggerCharacter: Unit): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpInvokedReason]
  }
  
  inline def SignatureHelpRetriggeredReason(): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SignatureHelpRetriggeredReason]
  }
}
