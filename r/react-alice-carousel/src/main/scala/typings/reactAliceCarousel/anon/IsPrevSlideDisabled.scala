package typings.reactAliceCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsPrevSlideDisabled extends js.Object {
  
  var isNextSlideDisabled: Boolean = js.native
  
  var isPrevSlideDisabled: Boolean = js.native
}
object IsPrevSlideDisabled {
  
  @scala.inline
  def apply(isNextSlideDisabled: Boolean, isPrevSlideDisabled: Boolean): IsPrevSlideDisabled = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrevSlideDisabled]
  }
  
  @scala.inline
  implicit class IsPrevSlideDisabledOps[Self <: IsPrevSlideDisabled] (val x: Self) extends AnyVal {
    
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
    def setIsNextSlideDisabled(value: Boolean): Self = this.set("isNextSlideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrevSlideDisabled(value: Boolean): Self = this.set("isPrevSlideDisabled", value.asInstanceOf[js.Any])
  }
}
