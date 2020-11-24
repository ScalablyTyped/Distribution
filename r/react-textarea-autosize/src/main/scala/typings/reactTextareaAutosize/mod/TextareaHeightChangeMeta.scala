package typings.reactTextareaAutosize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextareaHeightChangeMeta extends js.Object {
  
  var rowHeight: Double = js.native
}
object TextareaHeightChangeMeta {
  
  @scala.inline
  def apply(rowHeight: Double): TextareaHeightChangeMeta = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaHeightChangeMeta]
  }
  
  @scala.inline
  implicit class TextareaHeightChangeMetaOps[Self <: TextareaHeightChangeMeta] (val x: Self) extends AnyVal {
    
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
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
  }
}
