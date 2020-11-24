package typings.reactNativeModal.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animations extends js.Object {
  
  var animationIn: String = js.native
  
  var animationOut: String = js.native
}
object Animations {
  
  @scala.inline
  def apply(animationIn: String, animationOut: String): Animations = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  
  @scala.inline
  implicit class AnimationsOps[Self <: Animations] (val x: Self) extends AnyVal {
    
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
    def setAnimationIn(value: String): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOut(value: String): Self = this.set("animationOut", value.asInstanceOf[js.Any])
  }
}
