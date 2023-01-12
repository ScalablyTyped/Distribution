package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpItemsOptions extends StObject {
  
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.undefined
}
object SignatureHelpItemsOptions {
  
  inline def apply(): SignatureHelpItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpItemsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureHelpItemsOptions] (val x: Self) extends AnyVal {
    
    inline def setTriggerReason(value: SignatureHelpTriggerReason): Self = StObject.set(x, "triggerReason", value.asInstanceOf[js.Any])
    
    inline def setTriggerReasonUndefined: Self = StObject.set(x, "triggerReason", js.undefined)
  }
}
