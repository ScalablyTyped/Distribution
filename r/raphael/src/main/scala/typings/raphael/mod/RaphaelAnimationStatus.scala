package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelAnimationStatus extends StObject {
  
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
  implicit class RaphaelAnimationStatusMutableBuilder[Self <: RaphaelAnimationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnim(value: RaphaelAnimation): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
