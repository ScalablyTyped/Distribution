package typings.reactInteractive.anon

import typings.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextState extends js.Object {
  var nextState: State = js.native
  var prevState: State = js.native
}

object NextState {
  @scala.inline
  def apply(nextState: State, prevState: State): NextState = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextState]
  }
  @scala.inline
  implicit class NextStateOps[Self <: NextState] (val x: Self) extends AnyVal {
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
    def setNextState(value: State): Self = this.set("nextState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevState(value: State): Self = this.set("prevState", value.asInstanceOf[js.Any])
  }
  
}

