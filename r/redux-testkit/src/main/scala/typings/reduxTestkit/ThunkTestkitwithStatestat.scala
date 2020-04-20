package typings.reduxTestkit

import typings.reduxTestkit.mod.ThunkTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
trait ThunkTestkitwithStatestat extends js.Object {
  def execute(args: js.Any*): js.Any
  def withState(state: js.Any): ThunkTestkit
}

object ThunkTestkitwithStatestat {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any, withState: js.Any => ThunkTestkit): ThunkTestkitwithStatestat = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
    __obj.asInstanceOf[ThunkTestkitwithStatestat]
  }
}

