package typings.sanitizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sanitizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def makeSaxParser(yourHandler: ISaxHandler): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSaxParser")(yourHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def normalizeRCData(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRCData")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def sanitize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unescapeEntities(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeEntities")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ISaxHandler extends StObject {
    
    def cdata(text: String, param: js.Any): Unit
    
    def comment(text: String, param: js.Any): Unit
    
    def endDoc(param: js.Any): Unit
    
    def endTag(name: String, param: js.Any): Unit
    
    def pcdata(text: String, param: js.Any): Unit
    
    def rcdata(text: String, param: js.Any): Unit
    
    def startDoc(param: js.Any): Unit
    
    def startTag(name: String, attribs: js.Array[String], param: js.Any): Unit
  }
  object ISaxHandler {
    
    @scala.inline
    def apply(
      cdata: (String, js.Any) => Unit,
      comment: (String, js.Any) => Unit,
      endDoc: js.Any => Unit,
      endTag: (String, js.Any) => Unit,
      pcdata: (String, js.Any) => Unit,
      rcdata: (String, js.Any) => Unit,
      startDoc: js.Any => Unit,
      startTag: (String, js.Array[String], js.Any) => Unit
    ): ISaxHandler = {
      val __obj = js.Dynamic.literal(cdata = js.Any.fromFunction2(cdata), comment = js.Any.fromFunction2(comment), endDoc = js.Any.fromFunction1(endDoc), endTag = js.Any.fromFunction2(endTag), pcdata = js.Any.fromFunction2(pcdata), rcdata = js.Any.fromFunction2(rcdata), startDoc = js.Any.fromFunction1(startDoc), startTag = js.Any.fromFunction3(startTag))
      __obj.asInstanceOf[ISaxHandler]
    }
    
    @scala.inline
    implicit class ISaxHandlerMutableBuilder[Self <: ISaxHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCdata(value: (String, js.Any) => Unit): Self = StObject.set(x, "cdata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComment(value: (String, js.Any) => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndDoc(value: js.Any => Unit): Self = StObject.set(x, "endDoc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndTag(value: (String, js.Any) => Unit): Self = StObject.set(x, "endTag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPcdata(value: (String, js.Any) => Unit): Self = StObject.set(x, "pcdata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRcdata(value: (String, js.Any) => Unit): Self = StObject.set(x, "rcdata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartDoc(value: js.Any => Unit): Self = StObject.set(x, "startDoc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartTag(value: (String, js.Array[String], js.Any) => Unit): Self = StObject.set(x, "startTag", js.Any.fromFunction3(value))
    }
  }
}
