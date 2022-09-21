package typings.restify.mod.plugins

import typings.restify.mod.Next
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerCandidate extends StObject {
  
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var handler: RequestHandler | js.Array[RequestHandler]
  
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}
object HandlerCandidate {
  
  inline def apply(handler: RequestHandler | js.Array[RequestHandler]): HandlerCandidate = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerCandidate]
  }
  
  extension [Self <: HandlerCandidate](x: Self) {
    
    inline def setContentType(value: String | js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value*))
    
    inline def setHandler(value: RequestHandler | js.Array[RequestHandler]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerFunction3(value: (/* req */ Request, /* res */ Response, /* next */ Next) => Any): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    inline def setHandlerVarargs(value: RequestHandler*): Self = StObject.set(x, "handler", js.Array(value*))
    
    inline def setVersion(value: String | js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
