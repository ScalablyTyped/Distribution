package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomGestureProps extends js.Object {
  var config: js.Array[moves] = js.native
  def onGesture(): Unit = js.native
}

object CustomGestureProps {
  @scala.inline
  def apply(config: js.Array[moves], onGesture: () => Unit): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    __obj.asInstanceOf[CustomGestureProps]
  }
  @scala.inline
  implicit class CustomGesturePropsOps[Self <: CustomGestureProps] (val x: Self) extends AnyVal {
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
    def setConfigVarargs(value: moves*): Self = this.set("config", js.Array(value :_*))
    @scala.inline
    def setConfig(value: js.Array[moves]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnGesture(value: () => Unit): Self = this.set("onGesture", js.Any.fromFunction0(value))
  }
  
}

