package typings.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPushState extends js.Object {
  val state: js.Any
  def pushState(state: js.Any, title: String, uri: String): Unit
  def replaceState(state: js.Any, title: String, uri: String): Unit
}

object AnonPushState {
  @scala.inline
  def apply(
    pushState: (js.Any, String, String) => Unit,
    replaceState: (js.Any, String, String) => Unit,
    state: js.Any
  ): AnonPushState = {
    val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPushState]
  }
}

