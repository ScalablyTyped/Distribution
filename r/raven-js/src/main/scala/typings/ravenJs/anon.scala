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
    
    @scala.inline
    def apply(message: String, name: String): ErrorrequestXMLHttpReques = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorrequestXMLHttpReques]
    }
    
    @scala.inline
    implicit class ErrorrequestXMLHttpRequesMutableBuilder[Self <: ErrorrequestXMLHttpReques] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Sentryclient extends StObject {
    
    var sentry_client: String
    
    var sentry_key: String
    
    var sentry_version: String
  }
  object Sentryclient {
    
    @scala.inline
    def apply(sentry_client: String, sentry_key: String, sentry_version: String): Sentryclient = {
      val __obj = js.Dynamic.literal(sentry_client = sentry_client.asInstanceOf[js.Any], sentry_key = sentry_key.asInstanceOf[js.Any], sentry_version = sentry_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sentryclient]
    }
    
    @scala.inline
    implicit class SentryclientMutableBuilder[Self <: Sentryclient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSentry_client(value: String): Self = StObject.set(x, "sentry_client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentry_key(value: String): Self = StObject.set(x, "sentry_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentry_version(value: String): Self = StObject.set(x, "sentry_version", value.asInstanceOf[js.Any])
    }
  }
}
