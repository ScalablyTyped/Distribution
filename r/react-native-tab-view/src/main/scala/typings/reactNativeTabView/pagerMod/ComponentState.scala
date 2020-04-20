package typings.reactNativeTabView.pagerMod

import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentState extends js.Object {
  var childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]]
  var enabled: Boolean
}

object ComponentState {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]], enabled: Boolean): ComponentState = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentState]
  }
}

