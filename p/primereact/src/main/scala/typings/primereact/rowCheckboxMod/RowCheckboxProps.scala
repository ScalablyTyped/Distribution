package typings.primereact.rowCheckboxMod

import typings.primereact.AnonCheckedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowCheckboxProps extends js.Object {
  var onClick: js.UndefOr[js.Function1[/* e */ AnonCheckedData, Unit]] = js.undefined
  var rowData: js.UndefOr[js.Object] = js.undefined
}

object RowCheckboxProps {
  @scala.inline
  def apply(onClick: /* e */ AnonCheckedData => Unit = null, rowData: js.Object = null): RowCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCheckboxProps]
  }
}

