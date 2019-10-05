package typings.rmcDashCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.PureComponent
import typings.rmcDashCalendar.libCalendarMod.Calendar
import typings.rmcDashCalendar.libCalendarMod.StateType
import typings.rmcDashCalendar.libCalendarPropsMod.PropsType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/Calendar", JSImport.Namespace)
@js.native
object libCalendarMod extends js.Object {
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
  
  @js.native
  class StateType () extends js.Object {
    var clientHight: js.UndefOr[Double] = js.native
    var disConfirmBtn: js.UndefOr[Boolean] = js.native
    var endDate: js.UndefOr[Date] = js.native
    var showTimePicker: Boolean = js.native
    var startDate: js.UndefOr[Date] = js.native
    var timePickerTitle: js.UndefOr[String] = js.native
  }
  
  @js.native
  class default protected () extends Calendar {
    def this(props: PropsType) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultHeader: TypeofClassHeaderDefaultProps = js.native
    var DefaultShortcut: Instantiable0[typings.rmcDashCalendar.libCalendarShortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  type ExtraData = typings.rmcDashCalendar.libDateDataTypesMod.Models.ExtraData
}

