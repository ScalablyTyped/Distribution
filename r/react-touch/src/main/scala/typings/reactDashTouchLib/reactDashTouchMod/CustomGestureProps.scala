package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGestureProps extends js.Object {
  var config: js.Array[moves]
  def onGesture(): scala.Unit
}

object CustomGestureProps {
  @scala.inline
  def apply(config: js.Array[moves], onGesture: () => scala.Unit): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config, onGesture = js.Any.fromFunction0(onGesture))
  
    __obj.asInstanceOf[CustomGestureProps]
  }
}

