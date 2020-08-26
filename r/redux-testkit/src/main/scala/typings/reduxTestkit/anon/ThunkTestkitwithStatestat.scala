package typings.reduxTestkit.anon

import typings.reduxTestkit.mod.ThunkTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
@js.native
trait ThunkTestkitwithStatestat extends js.Object {
  def execute(args: js.Any*): js.Any = js.native
  def withState(state: js.Any): ThunkTestkit = js.native
}

object ThunkTestkitwithStatestat {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any, withState: js.Any => ThunkTestkit): ThunkTestkitwithStatestat = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
    __obj.asInstanceOf[ThunkTestkitwithStatestat]
  }
  @scala.inline
  implicit class ThunkTestkitwithStatestatOps[Self <: ThunkTestkitwithStatestat] (val x: Self) extends AnyVal {
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
    def setExecute(value: /* repeated */ js.Any => js.Any): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def setWithState(value: js.Any => ThunkTestkit): Self = this.set("withState", js.Any.fromFunction1(value))
  }
  
}

