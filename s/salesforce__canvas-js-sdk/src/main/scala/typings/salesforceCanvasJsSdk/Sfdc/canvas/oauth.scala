package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth {
  
  trait LoginContext extends StObject {
    
    val callback: js.UndefOr[String] = js.undefined
    
    val params: LoginParams
    
    val uri: String
  }
  object LoginContext {
    
    inline def apply(params: LoginParams, uri: String): LoginContext = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoginContext] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setParams(value: LoginParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginParams extends StObject {
    
    val client_id: String
    
    val display: js.UndefOr[String] = js.undefined
    
    val redirect_uri: String
    
    val response_type: String
    
    val scope: js.UndefOr[String] = js.undefined
    
    val state: js.UndefOr[String] = js.undefined
  }
  object LoginParams {
    
    inline def apply(client_id: String, redirect_uri: String, response_type: String): LoginParams = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoginParams] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
