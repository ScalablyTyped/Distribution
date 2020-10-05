package typings.reactNative.anon

import typings.reactNative.mod.LayoutAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EaseInEaseOut extends js.Object {
  var easeInEaseOut: LayoutAnimationConfig = js.native
  var linear: LayoutAnimationConfig = js.native
  var spring: LayoutAnimationConfig = js.native
}

object EaseInEaseOut {
  @scala.inline
  def apply(easeInEaseOut: LayoutAnimationConfig, linear: LayoutAnimationConfig, spring: LayoutAnimationConfig): EaseInEaseOut = {
    val __obj = js.Dynamic.literal(easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseInEaseOut]
  }
  @scala.inline
  implicit class EaseInEaseOutOps[Self <: EaseInEaseOut] (val x: Self) extends AnyVal {
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
    def setEaseInEaseOut(value: LayoutAnimationConfig): Self = this.set("easeInEaseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinear(value: LayoutAnimationConfig): Self = this.set("linear", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpring(value: LayoutAnimationConfig): Self = this.set("spring", value.asInstanceOf[js.Any])
  }
  
}

