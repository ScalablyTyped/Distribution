package typings.reactNativeModal.modalMod

import typings.reactNativeModal.typesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSwipeCompleteParams extends js.Object {
  
  var swipingDirection: Direction = js.native
}
object OnSwipeCompleteParams {
  
  @scala.inline
  def apply(swipingDirection: Direction): OnSwipeCompleteParams = {
    val __obj = js.Dynamic.literal(swipingDirection = swipingDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSwipeCompleteParams]
  }
  
  @scala.inline
  implicit class OnSwipeCompleteParamsOps[Self <: OnSwipeCompleteParams] (val x: Self) extends AnyVal {
    
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
    def setSwipingDirection(value: Direction): Self = this.set("swipingDirection", value.asInstanceOf[js.Any])
  }
}
