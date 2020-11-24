package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraState extends js.Object {
  
  var inTransition: js.UndefOr[Boolean] = js.native
  
  var isDragging: js.UndefOr[Boolean] = js.native
  
  var isHovering: js.UndefOr[Boolean] = js.native
  
  var isPanning: js.UndefOr[Boolean] = js.native
  
  var isRotating: js.UndefOr[Boolean] = js.native
  
  var isZooming: js.UndefOr[Boolean] = js.native
}
object ExtraState {
  
  @scala.inline
  def apply(): ExtraState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraState]
  }
  
  @scala.inline
  implicit class ExtraStateOps[Self <: ExtraState] (val x: Self) extends AnyVal {
    
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
    def setInTransition(value: Boolean): Self = this.set("inTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInTransition: Self = this.set("inTransition", js.undefined)
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDragging: Self = this.set("isDragging", js.undefined)
    
    @scala.inline
    def setIsHovering(value: Boolean): Self = this.set("isHovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHovering: Self = this.set("isHovering", js.undefined)
    
    @scala.inline
    def setIsPanning(value: Boolean): Self = this.set("isPanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPanning: Self = this.set("isPanning", js.undefined)
    
    @scala.inline
    def setIsRotating(value: Boolean): Self = this.set("isRotating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRotating: Self = this.set("isRotating", js.undefined)
    
    @scala.inline
    def setIsZooming(value: Boolean): Self = this.set("isZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsZooming: Self = this.set("isZooming", js.undefined)
  }
}
