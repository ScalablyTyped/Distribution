package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelAnimationStatus extends js.Object {
  
  /** The animation to which the status applies. */
  var anim: RaphaelAnimation = js.native
  
  /** The current status of the animation, i.e. the normalized animation time, a value between `0` and `1`. */
  var status: Double = js.native
}
object RaphaelAnimationStatus {
  
  @scala.inline
  def apply(anim: RaphaelAnimation, status: Double): RaphaelAnimationStatus = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAnimationStatus]
  }
  
  @scala.inline
  implicit class RaphaelAnimationStatusOps[Self <: RaphaelAnimationStatus] (val x: Self) extends AnyVal {
    
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
    def setAnim(value: RaphaelAnimation): Self = this.set("anim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
