package typings
package atReachRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushState extends js.Object {
  val state: js.Any
  def pushState(state: js.Any, title: java.lang.String, uri: java.lang.String): scala.Unit
  def replaceState(state: js.Any, title: java.lang.String, uri: java.lang.String): scala.Unit
}

object Anon_PushState {
  @scala.inline
  def apply(
    pushState: (js.Any, java.lang.String, java.lang.String) => scala.Unit,
    replaceState: (js.Any, java.lang.String, java.lang.String) => scala.Unit,
    state: js.Any
  ): Anon_PushState = {
    val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state)
  
    __obj.asInstanceOf[Anon_PushState]
  }
}

