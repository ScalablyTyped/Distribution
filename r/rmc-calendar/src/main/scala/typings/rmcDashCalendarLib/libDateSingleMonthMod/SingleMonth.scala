package typings
package rmcDashCalendarLib.libDateSingleMonthMod

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
  def genWeek(weeksData: js.Array[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.CellData], index: scala.Double): scala.Unit = js.native
  def setWarpper(dom: stdLib.HTMLDivElement): scala.Unit = js.native
  def updateWeeks(): scala.Unit = js.native
  def updateWeeks(monthData: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.MonthData): scala.Unit = js.native
}

