package typings
package rmcDashCalendarLib.esDatePickerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends reactLib.reactMod.Component[rmcDashCalendarLib.esDatePickerPropsMod.PropsType, StateType, js.Any] {
  var visibleMonth: js.Array[rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData] = js.native
  def canLoadNext(): scala.Boolean = js.native
  def canLoadPrev(): scala.Boolean = js.native
  @JSName("componentWillMount")
  def componentWillMount_MDatePicker(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePicker(nextProps: rmcDashCalendarLib.esDatePickerPropsMod.PropsType): scala.Unit = js.native
  def computeVisible(clientHeight: scala.Double, scrollTop: scala.Double): scala.Boolean = js.native
  def createOnScroll(): js.Function1[/* data */ rmcDashCalendarLib.Anon_Client, scala.Unit] = js.native
  def genMonthComponent(data: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData): reactLib.reactMod.ReactNode = js.native
  def genMonthData(): rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData = js.native
  def genMonthData(date: stdLib.Date): rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData = js.native
  def genMonthData(date: stdLib.Date, addMonth: scala.Double): rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.MonthData = js.native
  def genWeekData(firstDate: stdLib.Date): js.Array[js.Array[rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.CellData]] = js.native
  def getDateWithoutTime(): scala.Double = js.native
  def getDateWithoutTime(date: stdLib.Date): scala.Double = js.native
  def getMonthDate(): rmcDashCalendarLib.Anon_FirstDate = js.native
  def getMonthDate(date: stdLib.Date): rmcDashCalendarLib.Anon_FirstDate = js.native
  def getMonthDate(date: stdLib.Date, addMonth: scala.Double): rmcDashCalendarLib.Anon_FirstDate = js.native
  def inDate(date: scala.Double, tick: scala.Double): scala.Boolean = js.native
  def onCellClick(day: rmcDashCalendarLib.esDateDataTypesMod.ModelsNs.CellData): scala.Unit = js.native
  def selectDateRange(startDate: stdLib.Date): scala.Unit = js.native
  def selectDateRange(startDate: stdLib.Date, endDate: js.UndefOr[scala.Nothing], clear: scala.Boolean): scala.Unit = js.native
  def selectDateRange(startDate: stdLib.Date, endDate: stdLib.Date): scala.Unit = js.native
  def selectDateRange(startDate: stdLib.Date, endDate: stdLib.Date, clear: scala.Boolean): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDatePicker(
    nextProps: rmcDashCalendarLib.esDatePickerPropsMod.PropsType,
    nextState: StateType,
    nextContext: js.Any
  ): scala.Boolean = js.native
}

