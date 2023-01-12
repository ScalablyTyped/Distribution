package typings.sanitizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sanitizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeSaxParser(yourHandler: ISaxHandler): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSaxParser")(yourHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def normalizeRCData(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRCData")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sanitize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeEntities(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeEntities")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ISaxHandler extends StObject {
    
    def cdata(text: String, param: Any): Unit
    
    def comment(text: String, param: Any): Unit
    
    def endDoc(param: Any): Unit
    
    def endTag(name: String, param: Any): Unit
    
    def pcdata(text: String, param: Any): Unit
    
    def rcdata(text: String, param: Any): Unit
    
    def startDoc(param: Any): Unit
    
    def startTag(name: String, attribs: js.Array[String], param: Any): Unit
  }
  object ISaxHandler {
    
    inline def apply(
      cdata: (String, Any) => Unit,
      comment: (String, Any) => Unit,
      endDoc: Any => Unit,
      endTag: (String, Any) => Unit,
      pcdata: (String, Any) => Unit,
      rcdata: (String, Any) => Unit,
      startDoc: Any => Unit,
      startTag: (String, js.Array[String], Any) => Unit
    ): ISaxHandler = {
      val __obj = js.Dynamic.literal(cdata = js.Any.fromFunction2(cdata), comment = js.Any.fromFunction2(comment), endDoc = js.Any.fromFunction1(endDoc), endTag = js.Any.fromFunction2(endTag), pcdata = js.Any.fromFunction2(pcdata), rcdata = js.Any.fromFunction2(rcdata), startDoc = js.Any.fromFunction1(startDoc), startTag = js.Any.fromFunction3(startTag))
      __obj.asInstanceOf[ISaxHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISaxHandler] (val x: Self) extends AnyVal {
      
      inline def setCdata(value: (String, Any) => Unit): Self = StObject.set(x, "cdata", js.Any.fromFunction2(value))
      
      inline def setComment(value: (String, Any) => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction2(value))
      
      inline def setEndDoc(value: Any => Unit): Self = StObject.set(x, "endDoc", js.Any.fromFunction1(value))
      
      inline def setEndTag(value: (String, Any) => Unit): Self = StObject.set(x, "endTag", js.Any.fromFunction2(value))
      
      inline def setPcdata(value: (String, Any) => Unit): Self = StObject.set(x, "pcdata", js.Any.fromFunction2(value))
      
      inline def setRcdata(value: (String, Any) => Unit): Self = StObject.set(x, "rcdata", js.Any.fromFunction2(value))
      
      inline def setStartDoc(value: Any => Unit): Self = StObject.set(x, "startDoc", js.Any.fromFunction1(value))
      
      inline def setStartTag(value: (String, js.Array[String], Any) => Unit): Self = StObject.set(x, "startTag", js.Any.fromFunction3(value))
    }
  }
}
