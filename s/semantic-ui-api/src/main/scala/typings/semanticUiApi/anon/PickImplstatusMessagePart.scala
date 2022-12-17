package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'statusMessage'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl>> */
trait PickImplstatusMessagePart
  extends StObject
     with Param {
  
  var JSONParse: js.UndefOr[String] = js.undefined
  
  var beforeSend: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var exitConditions: js.UndefOr[String] = js.undefined
  
  var legacyParameters: js.UndefOr[String] = js.undefined
  
  var missingAction: js.UndefOr[String] = js.undefined
  
  var missingSerialize: js.UndefOr[String] = js.undefined
  
  var missingURL: js.UndefOr[String] = js.undefined
  
  var noReturnedValue: js.UndefOr[String] = js.undefined
  
  var parseError: js.UndefOr[String] = js.undefined
  
  var requiredParameter: js.UndefOr[String] = js.undefined
  
  var statusMessage: String
  
  var timeout: js.UndefOr[String] = js.undefined
}
object PickImplstatusMessagePart {
  
  inline def apply(statusMessage: String): PickImplstatusMessagePart = {
    val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatusMessagePart]
  }
  
  extension [Self <: PickImplstatusMessagePart](x: Self) {
    
    inline def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
    
    inline def setExitConditionsUndefined: Self = StObject.set(x, "exitConditions", js.undefined)
    
    inline def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
    
    inline def setJSONParseUndefined: Self = StObject.set(x, "JSONParse", js.undefined)
    
    inline def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
    
    inline def setLegacyParametersUndefined: Self = StObject.set(x, "legacyParameters", js.undefined)
    
    inline def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
    
    inline def setMissingActionUndefined: Self = StObject.set(x, "missingAction", js.undefined)
    
    inline def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
    
    inline def setMissingSerializeUndefined: Self = StObject.set(x, "missingSerialize", js.undefined)
    
    inline def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
    
    inline def setMissingURLUndefined: Self = StObject.set(x, "missingURL", js.undefined)
    
    inline def setNoReturnedValue(value: String): Self = StObject.set(x, "noReturnedValue", value.asInstanceOf[js.Any])
    
    inline def setNoReturnedValueUndefined: Self = StObject.set(x, "noReturnedValue", js.undefined)
    
    inline def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
    
    inline def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
    
    inline def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
    
    inline def setRequiredParameterUndefined: Self = StObject.set(x, "requiredParameter", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
