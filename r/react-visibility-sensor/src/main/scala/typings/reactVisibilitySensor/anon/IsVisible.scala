package typings.reactVisibilitySensor.anon

import typings.reactVisibilitySensor.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsVisible extends js.Object {
  
  var isVisible: Boolean = js.native
  
  var visibilityRect: js.UndefOr[Shape] = js.native
}
object IsVisible {
  
  @scala.inline
  def apply(isVisible: Boolean): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVisible]
  }
  
  @scala.inline
  implicit class IsVisibleOps[Self <: IsVisible] (val x: Self) extends AnyVal {
    
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
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityRect(value: Shape): Self = this.set("visibilityRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilityRect: Self = this.set("visibilityRect", js.undefined)
  }
}
