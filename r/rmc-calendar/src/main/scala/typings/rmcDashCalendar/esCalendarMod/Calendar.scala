package typings.rmcDashCalendar.esCalendarMod

import typings.react.reactMod.PureComponent
import typings.rmcDashCalendar.Anon_Children
import typings.rmcDashCalendar.Anon_EndDate
import typings.rmcDashCalendar.esCalendarPropsMod.PropsType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends PureComponent[PropsType, StateType, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCalendar(nextProps: PropsType): Unit = js.native
  def onCancel(): Unit = js.native
  def onClear(): Unit = js.native
  def onClose(): Unit = js.native
  def onConfirm(): Unit = js.native
  def onSelectHasDisableDate(date: js.Array[Date]): Unit = js.native
  def onSelectedDate(date: Date): Unit = js.native
  def onTimeChange(date: Date): Unit = js.native
  def selectDate(date: Date): StateType = js.native
  def selectDate(date: Date, useDateTime: Boolean): StateType = js.native
  def selectDate(date: Date, useDateTime: Boolean, oldState: Anon_EndDate): StateType = js.native
  def selectDate(date: Date, useDateTime: Boolean, oldState: Anon_EndDate, props: Anon_Children with PropsType): StateType = js.native
  def setClientHeight(height: Double): Unit = js.native
  def shortcutSelect(startDate: Date, endDate: Date): Unit = js.native
  def shortcutSelect(startDate: Date, endDate: Date, props: Anon_Children with PropsType): Unit = js.native
}

