package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.rmcCalendar.anon.EndDate
import typings.rmcCalendar.anon.ReadonlychildrenReactNode
import typings.rmcCalendar.anon.TypeofHeader
import typings.rmcCalendar.calendarPropsMod.PropsType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/Calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  @js.native
  trait Calendar
    extends Component[PropsType, StateType, js.Any] {
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
    def selectDate(
      date: Date,
      useDateTime: js.UndefOr[scala.Nothing],
      oldState: js.UndefOr[scala.Nothing],
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: Date, useDateTime: js.UndefOr[scala.Nothing], oldState: EndDate): StateType = js.native
    def selectDate(
      date: Date,
      useDateTime: js.UndefOr[scala.Nothing],
      oldState: EndDate,
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: Date, useDateTime: Boolean): StateType = js.native
    def selectDate(
      date: Date,
      useDateTime: Boolean,
      oldState: js.UndefOr[scala.Nothing],
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: Date, useDateTime: Boolean, oldState: EndDate): StateType = js.native
    def selectDate(date: Date, useDateTime: Boolean, oldState: EndDate, props: ReadonlychildrenReactNode): StateType = js.native
    def setClientHeight(height: Double): Unit = js.native
    def shortcutSelect(startDate: Date, endDate: Date): Unit = js.native
    def shortcutSelect(startDate: Date, endDate: Date, props: ReadonlychildrenReactNode): Unit = js.native
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
    var DefaultHeader: TypeofHeader = js.native
    var DefaultShortcut: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  type ExtraData = typings.rmcCalendar.dataTypesMod.Models.ExtraData
}

