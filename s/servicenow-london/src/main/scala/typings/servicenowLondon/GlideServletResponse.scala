package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideServletResponse extends StObject {
  
  def setContentType(`type`: String): Unit
  
  def setHeader(name: String, value: String): Unit
  
  def setStatus(value: Double): Unit
}
object GlideServletResponse {
  
  @scala.inline
  def apply(setContentType: String => Unit, setHeader: (String, String) => Unit, setStatus: Double => Unit): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = js.Any.fromFunction1(setContentType), setHeader = js.Any.fromFunction2(setHeader), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[GlideServletResponse]
  }
  
  @scala.inline
  implicit class GlideServletResponseMutableBuilder[Self <: GlideServletResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetContentType(value: String => Unit): Self = StObject.set(x, "setContentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStatus(value: Double => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
  }
}
