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
  
  @scala.inline
  def apply(handler: RequestHandler | js.Array[RequestHandler]): HandlerCandidate = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerCandidate]
  }
  
  @scala.inline
  implicit class HandlerCandidateMutableBuilder[Self <: HandlerCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String | js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value :_*))
    
    @scala.inline
    def setHandler(value: RequestHandler | js.Array[RequestHandler]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerFunction3(value: (/* req */ Request, /* res */ Response, /* next */ Next) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandlerVarargs(value: RequestHandler*): Self = StObject.set(x, "handler", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String | js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
