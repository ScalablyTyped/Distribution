package typings.rcTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragNodeHighlight extends js.Object {
  
  var dragNodeHighlight: Boolean = js.native
}
object DragNodeHighlight {
  
  @scala.inline
  def apply(dragNodeHighlight: Boolean): DragNodeHighlight = {
    val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragNodeHighlight]
  }
  
  @scala.inline
  implicit class DragNodeHighlightOps[Self <: DragNodeHighlight] (val x: Self) extends AnyVal {
    
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
    def setDragNodeHighlight(value: Boolean): Self = this.set("dragNodeHighlight", value.asInstanceOf[js.Any])
  }
}
