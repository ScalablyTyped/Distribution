package typings.reduxDuck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux.redux.Action<string> & {  payload ? :any} */
trait FSAHack extends js.Object {
  var payload: js.UndefOr[js.Any] = js.undefined
  var `type`: String
}

object FSAHack {
  @scala.inline
  def apply(`type`: String, payload: js.Any = null): FSAHack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSAHack]
  }
}

