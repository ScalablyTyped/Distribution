package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGestureProps extends js.Object {
  var config: js.Array[moves]
  def onGesture(): Unit
}

object CustomGestureProps {
  @scala.inline
  def apply(config: js.Array[moves], onGesture: () => Unit): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    __obj.asInstanceOf[CustomGestureProps]
  }
}

