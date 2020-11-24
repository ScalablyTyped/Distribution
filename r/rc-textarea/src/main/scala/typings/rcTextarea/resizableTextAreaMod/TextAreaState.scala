package typings.rcTextarea.resizableTextAreaMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaState extends js.Object {
  
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizeStatus: js.UndefOr[RESIZE_STATUS] = js.native
  
  var textareaStyles: js.UndefOr[CSSProperties] = js.native
}
object TextAreaState {
  
  @scala.inline
  def apply(): TextAreaState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaState]
  }
  
  @scala.inline
  implicit class TextAreaStateOps[Self <: TextAreaState] (val x: Self) extends AnyVal {
    
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
    def setResizeStatus(value: RESIZE_STATUS): Self = this.set("resizeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeStatus: Self = this.set("resizeStatus", js.undefined)
    
    @scala.inline
    def setTextareaStyles(value: CSSProperties): Self = this.set("textareaStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextareaStyles: Self = this.set("textareaStyles", js.undefined)
  }
}
