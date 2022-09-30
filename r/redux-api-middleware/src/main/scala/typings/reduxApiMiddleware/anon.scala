package typings.reduxApiMiddleware

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`false`
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[`false`] = js.undefined
    
    var `type`: String | js.Symbol
  }
  object Error {
    
    inline def apply(`type`: String | js.Symbol): Error = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  trait MetaMeta[Meta] extends StObject {
    
    var meta: Meta
  }
  object MetaMeta {
    
    inline def apply[Meta](meta: Meta): MetaMeta[Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaMeta[Meta]]
    }
    
    extension [Self <: MetaMeta[?], Meta](x: Self & MetaMeta[Meta]) {
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadPayload[Payload] extends StObject {
    
    var payload: Payload
  }
  object PayloadPayload {
    
    inline def apply[Payload](payload: Payload): PayloadPayload[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadPayload[Payload]]
    }
    
    extension [Self <: PayloadPayload[?], Payload](x: Self & PayloadPayload[Payload]) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
