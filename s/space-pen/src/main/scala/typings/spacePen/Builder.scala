package typings.spacePen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Builder extends StObject {
  
  def buildHtml(): js.Array[Any]
  
  def closeTag(name: String): Unit
  
  var document: js.Array[Any]
  
  def extractOptions(args: Any): Any
  
  def openTag(name: String, attributes: Any): Unit
  
  var postProcessingSteps: js.Array[Any]
  
  def raw(str: String): Unit
  
  def subview(outletName: Any, subview: View): Unit
  
  def tag(name: String, args: Any*): Unit
  
  def text(str: String): Unit
}
object Builder {
  
  inline def apply(
    buildHtml: () => js.Array[Any],
    closeTag: String => Unit,
    document: js.Array[Any],
    extractOptions: Any => Any,
    openTag: (String, Any) => Unit,
    postProcessingSteps: js.Array[Any],
    raw: String => Unit,
    subview: (Any, View) => Unit,
    tag: (String, /* repeated */ Any) => Unit,
    text: String => Unit
  ): Builder = {
    val __obj = js.Dynamic.literal(buildHtml = js.Any.fromFunction0(buildHtml), closeTag = js.Any.fromFunction1(closeTag), document = document.asInstanceOf[js.Any], extractOptions = js.Any.fromFunction1(extractOptions), openTag = js.Any.fromFunction2(openTag), postProcessingSteps = postProcessingSteps.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), subview = js.Any.fromFunction2(subview), tag = js.Any.fromFunction2(tag), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
    
    inline def setBuildHtml(value: () => js.Array[Any]): Self = StObject.set(x, "buildHtml", js.Any.fromFunction0(value))
    
    inline def setCloseTag(value: String => Unit): Self = StObject.set(x, "closeTag", js.Any.fromFunction1(value))
    
    inline def setDocument(value: js.Array[Any]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentVarargs(value: Any*): Self = StObject.set(x, "document", js.Array(value*))
    
    inline def setExtractOptions(value: Any => Any): Self = StObject.set(x, "extractOptions", js.Any.fromFunction1(value))
    
    inline def setOpenTag(value: (String, Any) => Unit): Self = StObject.set(x, "openTag", js.Any.fromFunction2(value))
    
    inline def setPostProcessingSteps(value: js.Array[Any]): Self = StObject.set(x, "postProcessingSteps", value.asInstanceOf[js.Any])
    
    inline def setPostProcessingStepsVarargs(value: Any*): Self = StObject.set(x, "postProcessingSteps", js.Array(value*))
    
    inline def setRaw(value: String => Unit): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
    
    inline def setSubview(value: (Any, View) => Unit): Self = StObject.set(x, "subview", js.Any.fromFunction2(value))
    
    inline def setTag(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "tag", js.Any.fromFunction2(value))
    
    inline def setText(value: String => Unit): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
