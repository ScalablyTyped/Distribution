package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideServletRequest extends StObject {
  
  def getContentType(): String = js.native
  
  def getHeader(name: String): String = js.native
  
  def getParameter(name: String): String = js.native
  
  def writeOutput(mimeType: String, output: String): Unit = js.native
}
object GlideServletRequest {
  
  @scala.inline
  def apply(
    getContentType: () => String,
    getHeader: String => String,
    getParameter: String => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getParameter = js.Any.fromFunction1(getParameter), writeOutput = js.Any.fromFunction2(writeOutput))
    __obj.asInstanceOf[GlideServletRequest]
  }
  
  @scala.inline
  implicit class GlideServletRequestMutableBuilder[Self <: GlideServletRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContentType(value: () => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameter(value: String => String): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteOutput(value: (String, String) => Unit): Self = StObject.set(x, "writeOutput", js.Any.fromFunction2(value))
  }
}
