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
    pushState: js.Function3[js.Any, java.lang.String, java.lang.String, scala.Unit],
    replaceState: js.Function3[js.Any, java.lang.String, java.lang.String, scala.Unit],
    state: js.Any
  ): Anon_PushState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pushState")(pushState)
    __obj.updateDynamic("replaceState")(replaceState)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_PushState]
  }
}

