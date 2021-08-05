package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlBuilder extends StObject {
  
  def addAttribute(name: String, value: String): Unit
  
  def addCommunitiesCssClass(cssClassName: String): Unit
  
  def addCssClass(cssClassName: String): Unit
  
  def renderBeginTag(tagName: String): Unit
  
  def renderEndTag(): Unit
  
  def write(s: String): Unit
  
  def writeEncoded(s: String): Unit
}
object HtmlBuilder {
  
  inline def apply(
    addAttribute: (String, String) => Unit,
    addCommunitiesCssClass: String => Unit,
    addCssClass: String => Unit,
    renderBeginTag: String => Unit,
    renderEndTag: () => Unit,
    write: String => Unit,
    writeEncoded: String => Unit
  ): HtmlBuilder = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addCommunitiesCssClass = js.Any.fromFunction1(addCommunitiesCssClass), addCssClass = js.Any.fromFunction1(addCssClass), renderBeginTag = js.Any.fromFunction1(renderBeginTag), renderEndTag = js.Any.fromFunction0(renderEndTag), write = js.Any.fromFunction1(write), writeEncoded = js.Any.fromFunction1(writeEncoded))
    __obj.asInstanceOf[HtmlBuilder]
  }
  
  extension [Self <: HtmlBuilder](x: Self) {
    
    inline def setAddAttribute(value: (String, String) => Unit): Self = StObject.set(x, "addAttribute", js.Any.fromFunction2(value))
    
    inline def setAddCommunitiesCssClass(value: String => Unit): Self = StObject.set(x, "addCommunitiesCssClass", js.Any.fromFunction1(value))
    
    inline def setAddCssClass(value: String => Unit): Self = StObject.set(x, "addCssClass", js.Any.fromFunction1(value))
    
    inline def setRenderBeginTag(value: String => Unit): Self = StObject.set(x, "renderBeginTag", js.Any.fromFunction1(value))
    
    inline def setRenderEndTag(value: () => Unit): Self = StObject.set(x, "renderEndTag", js.Any.fromFunction0(value))
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    inline def setWriteEncoded(value: String => Unit): Self = StObject.set(x, "writeEncoded", js.Any.fromFunction1(value))
  }
}
