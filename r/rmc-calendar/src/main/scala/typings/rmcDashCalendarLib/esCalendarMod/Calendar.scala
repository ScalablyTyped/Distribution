package typings
package rmcDashCalendarLib.esCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends reactLib.reactMod.PureComponent[rmcDashCalendarLib.esCalendarPropsMod.PropsType, StateType, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCalendar(nextProps: rmcDashCalendarLib.esCalendarPropsMod.PropsType): scala.Unit = js.native
  def onCancel(): scala.Unit = js.native
  def onClear(): scala.Unit = js.native
  def onClose(): scala.Unit = js.native
  def onConfirm(): scala.Unit = js.native
  def onSelectHasDisableDate(date: js.Array[stdLib.Date]): scala.Unit = js.native
  def onSelectedDate(date: stdLib.Date): scala.Unit = js.native
  def onTimeChange(date: stdLib.Date): scala.Unit = js.native
  def selectDate(date: stdLib.Date): StateType = js.native
  def selectDate(date: stdLib.Date, useDateTime: scala.Boolean): StateType = js.native
  def selectDate(date: stdLib.Date, useDateTime: scala.Boolean, oldState: rmcDashCalendarLib.Anon_EndDate): StateType = js.native
  def selectDate(
    date: stdLib.Date,
    useDateTime: scala.Boolean,
    oldState: rmcDashCalendarLib.Anon_EndDate,
    props: rmcDashCalendarLib.Anon_Children with rmcDashCalendarLib.esCalendarPropsMod.PropsType
  ): StateType = js.native
  def setClientHeight(height: scala.Double): scala.Unit = js.native
  def shortcutSelect(startDate: stdLib.Date, endDate: stdLib.Date): scala.Unit = js.native
  def shortcutSelect(
    startDate: stdLib.Date,
    endDate: stdLib.Date,
    props: rmcDashCalendarLib.Anon_Children with rmcDashCalendarLib.esCalendarPropsMod.PropsType
  ): scala.Unit = js.native
}

