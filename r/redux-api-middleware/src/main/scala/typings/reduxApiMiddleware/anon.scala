package typings.reduxApiMiddleware

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`false`
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[`false`] = js.undefined
    
    var `type`: String | js.Symbol
  }
  object Error {
    
    @scala.inline
    def apply(`type`: String | js.Symbol): Error = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait MetaMeta[Meta] extends StObject {
    
    var meta: Meta
  }
  object MetaMeta {
    
    @scala.inline
    def apply[Meta](meta: Meta): MetaMeta[Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaMeta[Meta]]
    }
    
    @scala.inline
    implicit class MetaMetaMutableBuilder[Self <: MetaMeta[?], Meta] (val x: Self & MetaMeta[Meta]) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadPayload[Payload] extends StObject {
    
    var payload: Payload
  }
  object PayloadPayload {
    
    @scala.inline
    def apply[Payload](payload: Payload): PayloadPayload[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadPayload[Payload]]
    }
    
    @scala.inline
    implicit class PayloadPayloadMutableBuilder[Self <: PayloadPayload[?], Payload] (val x: Self & PayloadPayload[Payload]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
