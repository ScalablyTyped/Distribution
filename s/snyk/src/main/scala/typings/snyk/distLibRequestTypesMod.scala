package typings.snyk

import typings.needle.mod.NeedleHttpVerbs
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRequestTypesMod {
  
  trait Payload extends StObject {
    
    var body: Any
    
    var family: js.UndefOr[Double] = js.undefined
    
    var headers: OutgoingHttpHeaders
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var method: NeedleHttpVerbs
    
    var qs: js.UndefOr[js.Object] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object Payload {
    
    inline def apply(body: Any, headers: OutgoingHttpHeaders, method: NeedleHttpVerbs, url: String): Payload = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMethod(value: NeedleHttpVerbs): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
