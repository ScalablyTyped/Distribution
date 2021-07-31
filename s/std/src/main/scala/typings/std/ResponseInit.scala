package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInit extends StObject {
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}
object ResponseInit {
  
  @scala.inline
  def apply(): ResponseInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseInit]
  }
  
  @scala.inline
  implicit class ResponseInitMutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[java.lang.String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
