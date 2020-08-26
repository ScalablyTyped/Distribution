package typings.primereact.pickListControlsMod

import typings.primereact.anon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListControlsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var list: js.UndefOr[js.Array[_]] = js.native
  var onReorder: js.UndefOr[js.Function1[/* e */ Direction, Unit]] = js.native
  var selection: js.UndefOr[js.Array[_]] = js.native
}

object PickListControlsProps {
  @scala.inline
  def apply(): PickListControlsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListControlsProps]
  }
  @scala.inline
  implicit class PickListControlsPropsOps[Self <: PickListControlsProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setListVarargs(value: js.Any*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[_]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setOnReorder(value: /* e */ Direction => Unit): Self = this.set("onReorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReorder: Self = this.set("onReorder", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: js.Any*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[_]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
  
}

