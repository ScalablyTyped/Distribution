package typings.saxes

import typings.saxes.mod.AttributeEventForOptions
import typings.saxes.mod.AttributeHandler
import typings.saxes.mod.CDataHandler
import typings.saxes.mod.CloseTagHandler
import typings.saxes.mod.CommentHandler
import typings.saxes.mod.DoctypeHandler
import typings.saxes.mod.EndHandler
import typings.saxes.mod.ErrorHandler
import typings.saxes.mod.OpenTagHandler
import typings.saxes.mod.OpenTagStartHandler
import typings.saxes.mod.PIHandler
import typings.saxes.mod.ReadyHandler
import typings.saxes.mod.StartTagForOptions
import typings.saxes.mod.TagForOptions
import typings.saxes.mod.TextHandler
import typings.saxes.mod.XMLDecl
import typings.saxes.mod.XMLDeclHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attribute[O] extends StObject {
    
    def attribute(attribute: AttributeEventForOptions[O]): Unit
    @JSName("attribute")
    var attribute_Original: AttributeHandler[O]
    
    def cdata(cdata: String): Unit
    @JSName("cdata")
    var cdata_Original: CDataHandler
    
    def closetag(tag: TagForOptions[O]): Unit
    @JSName("closetag")
    var closetag_Original: CloseTagHandler[O]
    
    def comment(comment: String): Unit
    @JSName("comment")
    var comment_Original: CommentHandler
    
    def doctype(doctype: String): Unit
    @JSName("doctype")
    var doctype_Original: DoctypeHandler
    
    def end(): Unit
    @JSName("end")
    var end_Original: EndHandler
    
    def error(err: js.Error): Unit
    @JSName("error")
    var error_Original: ErrorHandler
    
    def opentag(tag: TagForOptions[O]): Unit
    @JSName("opentag")
    var opentag_Original: OpenTagHandler[O]
    
    def opentagstart(tag: StartTagForOptions[O]): Unit
    @JSName("opentagstart")
    var opentagstart_Original: OpenTagStartHandler[O]
    
    def processinginstruction(data: Body): Unit
    @JSName("processinginstruction")
    var processinginstruction_Original: PIHandler
    
    def ready(): Unit
    @JSName("ready")
    var ready_Original: ReadyHandler
    
    def text(text: String): Unit
    @JSName("text")
    var text_Original: TextHandler
    
    def xmldecl(decl: XMLDecl): Unit
    @JSName("xmldecl")
    var xmldecl_Original: XMLDeclHandler
  }
  object Attribute {
    
    inline def apply[O](
      attribute: /* attribute */ AttributeEventForOptions[O] => Unit,
      cdata: /* cdata */ String => Unit,
      closetag: /* tag */ TagForOptions[O] => Unit,
      comment: /* comment */ String => Unit,
      doctype: /* doctype */ String => Unit,
      end: () => Unit,
      error: /* err */ js.Error => Unit,
      opentag: /* tag */ TagForOptions[O] => Unit,
      opentagstart: /* tag */ StartTagForOptions[O] => Unit,
      processinginstruction: /* data */ Body => Unit,
      ready: () => Unit,
      text: /* text */ String => Unit,
      xmldecl: /* decl */ XMLDecl => Unit
    ): Attribute[O] = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction1(attribute), cdata = js.Any.fromFunction1(cdata), closetag = js.Any.fromFunction1(closetag), comment = js.Any.fromFunction1(comment), doctype = js.Any.fromFunction1(doctype), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), opentag = js.Any.fromFunction1(opentag), opentagstart = js.Any.fromFunction1(opentagstart), processinginstruction = js.Any.fromFunction1(processinginstruction), ready = js.Any.fromFunction0(ready), text = js.Any.fromFunction1(text), xmldecl = js.Any.fromFunction1(xmldecl))
      __obj.asInstanceOf[Attribute[O]]
    }
    
    extension [Self <: Attribute[?], O](x: Self & Attribute[O]) {
      
      inline def setAttribute(value: /* attribute */ AttributeEventForOptions[O] => Unit): Self = StObject.set(x, "attribute", js.Any.fromFunction1(value))
      
      inline def setCdata(value: /* cdata */ String => Unit): Self = StObject.set(x, "cdata", js.Any.fromFunction1(value))
      
      inline def setClosetag(value: /* tag */ TagForOptions[O] => Unit): Self = StObject.set(x, "closetag", js.Any.fromFunction1(value))
      
      inline def setComment(value: /* comment */ String => Unit): Self = StObject.set(x, "comment", js.Any.fromFunction1(value))
      
      inline def setDoctype(value: /* doctype */ String => Unit): Self = StObject.set(x, "doctype", js.Any.fromFunction1(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setOpentag(value: /* tag */ TagForOptions[O] => Unit): Self = StObject.set(x, "opentag", js.Any.fromFunction1(value))
      
      inline def setOpentagstart(value: /* tag */ StartTagForOptions[O] => Unit): Self = StObject.set(x, "opentagstart", js.Any.fromFunction1(value))
      
      inline def setProcessinginstruction(value: /* data */ Body => Unit): Self = StObject.set(x, "processinginstruction", js.Any.fromFunction1(value))
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setText(value: /* text */ String => Unit): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setXmldecl(value: /* decl */ XMLDecl => Unit): Self = StObject.set(x, "xmldecl", js.Any.fromFunction1(value))
    }
  }
  
  trait Body extends StObject {
    
    var body: String
    
    var target: String
  }
  object Body {
    
    inline def apply(body: String, target: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
