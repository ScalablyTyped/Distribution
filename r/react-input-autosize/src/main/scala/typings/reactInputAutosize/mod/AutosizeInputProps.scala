package typings.reactInputAutosize.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosizeInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement] {
  
  var extraWidth: js.UndefOr[String | Double] = js.native
  
  var injectStyles: js.UndefOr[Boolean] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement | Null, Unit]] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var minWidth: js.UndefOr[String | Double] = js.native
  
  var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ String | Double, Unit]] = js.native
  
  var placeholderIsMinWidth: js.UndefOr[Boolean] = js.native
}
object AutosizeInputProps {
  
  @scala.inline
  def apply(): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutosizeInputProps]
  }
  
  @scala.inline
  implicit class AutosizeInputPropsOps[Self <: AutosizeInputProps] (val x: Self) extends AnyVal {
    
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
    def setExtraWidth(value: String | Double): Self = this.set("extraWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraWidth: Self = this.set("extraWidth", js.undefined)
    
    @scala.inline
    def setInjectStyles(value: Boolean): Self = this.set("injectStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectStyles: Self = this.set("injectStyles", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOnAutosize(value: /* inputWidth */ String | Double => Unit): Self = this.set("onAutosize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAutosize: Self = this.set("onAutosize", js.undefined)
    
    @scala.inline
    def setPlaceholderIsMinWidth(value: Boolean): Self = this.set("placeholderIsMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderIsMinWidth: Self = this.set("placeholderIsMinWidth", js.undefined)
  }
}
