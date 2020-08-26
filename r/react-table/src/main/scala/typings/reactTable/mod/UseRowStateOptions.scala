package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{initialRowStateAccessor (row : react-table.react-table.Row<D>): react-table.react-table.UseRowStateLocalState<D, unknown>, getResetRowStateDeps (instance : react-table.react-table.TableInstance<D>): std.Array<any>,   autoResetRowState :boolean | undefined}> */
@js.native
trait UseRowStateOptions[D /* <: js.Object */] extends js.Object {
  var autoResetRowState: js.UndefOr[Boolean] = js.native
  var getResetRowStateDeps: js.UndefOr[js.Function1[/* instance */ TableInstance[D], js.Array[_]]] = js.native
  var initialRowStateAccessor: js.UndefOr[js.Function1[/* row */ Row[D], UseRowStateLocalState[D, _]]] = js.native
}

object UseRowStateOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseRowStateOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowStateOptions[D]]
  }
  @scala.inline
  implicit class UseRowStateOptionsOps[Self <: UseRowStateOptions[_], /* <: js.Object */ D] (val x: Self with UseRowStateOptions[D]) extends AnyVal {
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
    def setAutoResetRowState(value: Boolean): Self = this.set("autoResetRowState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResetRowState: Self = this.set("autoResetRowState", js.undefined)
    @scala.inline
    def setGetResetRowStateDeps(value: /* instance */ TableInstance[D] => js.Array[_]): Self = this.set("getResetRowStateDeps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetResetRowStateDeps: Self = this.set("getResetRowStateDeps", js.undefined)
    @scala.inline
    def setInitialRowStateAccessor(value: /* row */ Row[D] => UseRowStateLocalState[D, _]): Self = this.set("initialRowStateAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialRowStateAccessor: Self = this.set("initialRowStateAccessor", js.undefined)
  }
  
}

