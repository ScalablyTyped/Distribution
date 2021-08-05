package typings.ravenJs

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Error & {  request :std.XMLHttpRequest | undefined} */
  trait ErrorrequestXMLHttpReques extends StObject {
    
    var message: String
    
    var name: String
    
    var request: js.UndefOr[XMLHttpRequest] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorrequestXMLHttpReques {
    
    inline def apply(message: String, name: String): ErrorrequestXMLHttpReques = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorrequestXMLHttpReques]
    }
    
    extension [Self <: ErrorrequestXMLHttpReques](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Sentryclient extends StObject {
    
    var sentry_client: String
    
    var sentry_key: String
    
    var sentry_version: String
  }
  object Sentryclient {
    
    inline def apply(sentry_client: String, sentry_key: String, sentry_version: String): Sentryclient = {
      val __obj = js.Dynamic.literal(sentry_client = sentry_client.asInstanceOf[js.Any], sentry_key = sentry_key.asInstanceOf[js.Any], sentry_version = sentry_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sentryclient]
    }
    
    extension [Self <: Sentryclient](x: Self) {
      
      inline def setSentry_client(value: String): Self = StObject.set(x, "sentry_client", value.asInstanceOf[js.Any])
      
      inline def setSentry_key(value: String): Self = StObject.set(x, "sentry_key", value.asInstanceOf[js.Any])
      
      inline def setSentry_version(value: String): Self = StObject.set(x, "sentry_version", value.asInstanceOf[js.Any])
    }
  }
}
