package typings.sanitizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISaxHandler extends js.Object {
  
  def cdata(text: String, param: js.Any): Unit = js.native
  
  def comment(text: String, param: js.Any): Unit = js.native
  
  def endDoc(param: js.Any): Unit = js.native
  
  def endTag(name: String, param: js.Any): Unit = js.native
  
  def pcdata(text: String, param: js.Any): Unit = js.native
  
  def rcdata(text: String, param: js.Any): Unit = js.native
  
  def startDoc(param: js.Any): Unit = js.native
  
  def startTag(name: String, attribs: js.Array[String], param: js.Any): Unit = js.native
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
  implicit class ISaxHandlerOps[Self <: ISaxHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCdata(value: (String, js.Any) => Unit): Self = this.set("cdata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComment(value: (String, js.Any) => Unit): Self = this.set("comment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndDoc(value: js.Any => Unit): Self = this.set("endDoc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndTag(value: (String, js.Any) => Unit): Self = this.set("endTag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPcdata(value: (String, js.Any) => Unit): Self = this.set("pcdata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRcdata(value: (String, js.Any) => Unit): Self = this.set("rcdata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartDoc(value: js.Any => Unit): Self = this.set("startDoc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartTag(value: (String, js.Array[String], js.Any) => Unit): Self = this.set("startTag", js.Any.fromFunction3(value))
  }
}
