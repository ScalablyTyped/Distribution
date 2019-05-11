package typings
package rmcDashCalendarLib.esDateSingleMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMonth
  extends reactLib.reactMod.PureComponent[PropsType, rmcDashCalendarLib.Anon_WeekComponents, js.Any] {
  var wrapperDivDOM: stdLib.HTMLDivElement | scala.Null = js.native
  @JSName("componentWillMount")
  def componentWillMount_MSingleMonth(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): scala.Unit = js.native
  def genWeek(weeksData: js.Array[rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.CellData], index: scala.Double): scala.Unit = js.native
  def setWarpper(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def updateWeeks(): scala.Unit = js.native
  def updateWeeks(monthData: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData): scala.Unit = js.native
}

