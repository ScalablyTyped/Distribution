package typings.rmcDashCalendar.esDateDataTypesMod.Models

import typings.react.reactMod.ReactNode
import typings.rmcDashCalendar.esDateSingleMonthMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthData extends js.Object {
  var component: js.UndefOr[ReactNode] = js.undefined
  var componentRef: js.UndefOr[default] = js.undefined
  var firstDate: Date
  var height: js.UndefOr[Double] = js.undefined
  var lastDate: Date
  var title: String
  var updateLayout: js.UndefOr[js.Function] = js.undefined
  var weeks: js.Array[js.Array[CellData]]
  var y: js.UndefOr[Double] = js.undefined
}

object MonthData {
  @scala.inline
  def apply(
    firstDate: Date,
    lastDate: Date,
    title: String,
    weeks: js.Array[js.Array[CellData]],
    component: ReactNode = null,
    componentRef: default = null,
    height: Int | Double = null,
    updateLayout: js.Function = null,
    y: Int | Double = null
  ): MonthData = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (updateLayout != null) __obj.updateDynamic("updateLayout")(updateLayout.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthData]
  }
}

