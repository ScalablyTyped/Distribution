package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Displacement extends js.Object {
  
  var draggableId: DraggableId = js.native
  
  var shouldAnimate: Boolean = js.native
}
object Displacement {
  
  @scala.inline
  def apply(draggableId: DraggableId, shouldAnimate: Boolean): Displacement = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displacement]
  }
  
  @scala.inline
  implicit class DisplacementOps[Self <: Displacement] (val x: Self) extends AnyVal {
    
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
    def setDraggableId(value: DraggableId): Self = this.set("draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = this.set("shouldAnimate", value.asInstanceOf[js.Any])
  }
}
