package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlValue extends js.Object {
  
  var delta: js.Any = js.native
  
  var htmlValue: String | Null = js.native
  
  var source: String = js.native
  
  var textValue: String = js.native
}
object HtmlValue {
  
  @scala.inline
  def apply(delta: js.Any, source: String, textValue: String): HtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlValue]
  }
  
  @scala.inline
  implicit class HtmlValueOps[Self <: HtmlValue] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: js.Any): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextValue(value: String): Self = this.set("textValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValue(value: String): Self = this.set("htmlValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlValueNull: Self = this.set("htmlValue", null)
  }
}
