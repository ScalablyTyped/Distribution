package typings.rcTextarea.mod

import typings.rcTextarea.anon.Height
import typings.rcTextarea.resizableTextAreaMod.AutoSizeType
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  
  var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
  
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
}
object TextAreaProps {
  
  @scala.inline
  def apply(): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaProps]
  }
  
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
    
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
    def setAutoSize(value: Boolean | AutoSizeType): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    
    @scala.inline
    def setOnPressEnter(value: KeyboardEvent[HTMLTextAreaElement] => Unit): Self = this.set("onPressEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressEnter: Self = this.set("onPressEnter", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* size */ Height => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
