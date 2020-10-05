package typings.reactNative.anon

import typings.reactNative.mod.Animated.AnimatedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y extends js.Object {
  var x: Double | AnimatedValue = js.native
  var y: Double | AnimatedValue = js.native
}

object Y {
  @scala.inline
  def apply(x: Double | AnimatedValue, y: Double | AnimatedValue): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  @scala.inline
  implicit class YOps[Self <: Y] (val x: Self) extends AnyVal {
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
    def setX(value: Double | AnimatedValue): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double | AnimatedValue): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

