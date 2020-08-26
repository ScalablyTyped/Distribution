package typings.primereact.rowCheckboxMod

import typings.primereact.anon.CheckedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowCheckboxProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ CheckedData, Unit]] = js.native
  var rowData: js.UndefOr[js.Object] = js.native
}

object RowCheckboxProps {
  @scala.inline
  def apply(): RowCheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowCheckboxProps]
  }
  @scala.inline
  implicit class RowCheckboxPropsOps[Self <: RowCheckboxProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: /* e */ CheckedData => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRowData(value: js.Object): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
  }
  
}

