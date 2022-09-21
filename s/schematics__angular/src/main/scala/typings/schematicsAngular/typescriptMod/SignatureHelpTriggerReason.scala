package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.typescriptMod.SignatureHelpInvokedReason
  - typings.schematicsAngular.typescriptMod.SignatureHelpCharacterTypedReason
  - typings.schematicsAngular.typescriptMod.SignatureHelpRetriggeredReason
*/
trait SignatureHelpTriggerReason extends StObject
object SignatureHelpTriggerReason {
  
  inline def SignatureHelpCharacterTypedReason(triggerCharacter: SignatureHelpTriggerCharacter): typings.schematicsAngular.typescriptMod.SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = "characterTyped", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.SignatureHelpCharacterTypedReason]
  }
  
  inline def SignatureHelpInvokedReason(triggerCharacter: Unit): typings.schematicsAngular.typescriptMod.SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = "invoked", triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.SignatureHelpInvokedReason]
  }
  
  inline def SignatureHelpRetriggeredReason(): typings.schematicsAngular.typescriptMod.SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = "retrigger")
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.SignatureHelpRetriggeredReason]
  }
}
