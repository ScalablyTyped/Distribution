package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateRowProps[D /* <: js.Object */] extends js.Object {
  var state: UseRowStateLocalState[D, _] = js.native
  def setState(updater: UseRowUpdater[_]): Unit = js.native
}

object UseRowStateRowProps {
  @scala.inline
  def apply[/* <: js.Object */ D](setState: UseRowUpdater[_] => Unit, state: UseRowStateLocalState[D, _]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
  @scala.inline
  implicit class UseRowStateRowPropsOps[Self <: UseRowStateRowProps[_], /* <: js.Object */ D] (val x: Self with UseRowStateRowProps[D]) extends AnyVal {
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
    def setSetState(value: UseRowUpdater[_] => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: UseRowStateLocalState[D, _]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

