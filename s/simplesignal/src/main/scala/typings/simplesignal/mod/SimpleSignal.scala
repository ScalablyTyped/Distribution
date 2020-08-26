package typings.simplesignal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any = js.native
  def add(func: F): Boolean = js.native
  def dispatch(args: js.Any*): Unit = js.native
  def numItems: Double = js.native
  def remove(func: F): Boolean = js.native
  def removeAll(): Boolean = js.native
}

object SimpleSignal {
  @scala.inline
  def apply[/* <: js.Function */ F](
    add: F => Boolean,
    dispatch: /* repeated */ js.Any => Unit,
    functions: js.Any,
    numItems: () => Double,
    remove: F => Boolean,
    removeAll: () => Boolean
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispatch = js.Any.fromFunction1(dispatch), functions = functions.asInstanceOf[js.Any], numItems = js.Any.fromFunction0(numItems), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll))
    __obj.asInstanceOf[SimpleSignal[F]]
  }
  @scala.inline
  implicit class SimpleSignalOps[Self <: SimpleSignal[_], /* <: js.Function */ F] (val x: Self with SimpleSignal[F]) extends AnyVal {
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
    def setAdd(value: F => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setDispatch(value: /* repeated */ js.Any => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setFunctions(value: js.Any): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumItems(value: () => Double): Self = this.set("numItems", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: F => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAll(value: () => Boolean): Self = this.set("removeAll", js.Any.fromFunction0(value))
  }
  
}

