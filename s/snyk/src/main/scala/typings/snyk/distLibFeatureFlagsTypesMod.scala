package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFeatureFlagsTypesMod {
  
  trait OrgFeatureFlagResponse extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var ok: js.UndefOr[Boolean] = js.undefined
    
    var userMessage: js.UndefOr[String] = js.undefined
  }
  object OrgFeatureFlagResponse {
    
    inline def apply(): OrgFeatureFlagResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrgFeatureFlagResponse]
    }
    
    extension [Self <: OrgFeatureFlagResponse](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setUserMessage(value: String): Self = StObject.set(x, "userMessage", value.asInstanceOf[js.Any])
      
      inline def setUserMessageUndefined: Self = StObject.set(x, "userMessage", js.undefined)
    }
  }
}
