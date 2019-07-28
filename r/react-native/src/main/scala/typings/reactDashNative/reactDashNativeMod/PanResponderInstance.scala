package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanResponderInstance extends js.Object {
  var panHandlers: GestureResponderHandlers
}

object PanResponderInstance {
  @scala.inline
  def apply(panHandlers: GestureResponderHandlers): PanResponderInstance = {
    val __obj = js.Dynamic.literal(panHandlers = panHandlers)
  
    __obj.asInstanceOf[PanResponderInstance]
  }
}

