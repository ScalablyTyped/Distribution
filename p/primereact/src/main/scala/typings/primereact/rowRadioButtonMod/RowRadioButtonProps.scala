package typings.primereact.rowRadioButtonMod

import typings.primereact.anon.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowRadioButtonProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ DataObject, Unit]] = js.native
  var rowData: js.UndefOr[js.Object] = js.native
  var selected: js.UndefOr[Boolean] = js.native
}

object RowRadioButtonProps {
  @scala.inline
  def apply(): RowRadioButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowRadioButtonProps]
  }
  @scala.inline
  implicit class RowRadioButtonPropsOps[Self <: RowRadioButtonProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: /* e */ DataObject => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRowData(value: js.Object): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

