package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideServletRequest extends StObject {
  
  def getContentType(): String
  
  def getHeader(name: String): String
  
  def getHeaderNames(): String
  
  def getHeaders(name: String): String
  
  def getParameter(name: String): String
  
  def getParameterNames(): String
  
  def getQueryString(): String
  
  def writeOutput(mimeType: String, output: String): Unit
}
object GlideServletRequest {
  
  inline def apply(
    getContentType: () => String,
    getHeader: String => String,
    getHeaderNames: () => String,
    getHeaders: String => String,
    getParameter: String => String,
    getParameterNames: () => String,
    getQueryString: () => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = js.Any.fromFunction0(getHeaderNames), getHeaders = js.Any.fromFunction1(getHeaders), getParameter = js.Any.fromFunction1(getParameter), getParameterNames = js.Any.fromFunction0(getParameterNames), getQueryString = js.Any.fromFunction0(getQueryString), writeOutput = js.Any.fromFunction2(writeOutput))
    __obj.asInstanceOf[GlideServletRequest]
  }
  
  extension [Self <: GlideServletRequest](x: Self) {
    
    inline def setGetContentType(value: () => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaderNames(value: () => String): Self = StObject.set(x, "getHeaderNames", js.Any.fromFunction0(value))
    
    inline def setGetHeaders(value: String => String): Self = StObject.set(x, "getHeaders", js.Any.fromFunction1(value))
    
    inline def setGetParameter(value: String => String): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    inline def setGetParameterNames(value: () => String): Self = StObject.set(x, "getParameterNames", js.Any.fromFunction0(value))
    
    inline def setGetQueryString(value: () => String): Self = StObject.set(x, "getQueryString", js.Any.fromFunction0(value))
    
    inline def setWriteOutput(value: (String, String) => Unit): Self = StObject.set(x, "writeOutput", js.Any.fromFunction2(value))
  }
}
