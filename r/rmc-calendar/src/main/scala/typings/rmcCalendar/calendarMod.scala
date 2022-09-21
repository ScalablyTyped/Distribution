package typings.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.PureComponent
import typings.rmcCalendar.anon.EndDate
import typings.rmcCalendar.anon.ReadonlychildrenReactNode
import typings.rmcCalendar.anon.TypeofHeader
import typings.rmcCalendar.calendarPropsMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("rmc-calendar/lib/Calendar", JSImport.Default)
  @js.native
  open class default protected () extends Calendar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/Calendar", "default.DefaultHeader")
    @js.native
    def DefaultHeader: TypeofHeader = js.native
    inline def DefaultHeader_=(x: TypeofHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar/lib/Calendar", "default.DefaultShortcut")
    @js.native
    def DefaultShortcut: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default] = js.native
    inline def DefaultShortcut_=(x: Instantiable0[typings.rmcCalendar.shortcutPanelMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultShortcut")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar/lib/Calendar", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-calendar/lib/Calendar", "StateType")
  @js.native
  open class StateType () extends StObject {
    
    var clientHight: js.UndefOr[Double] = js.native
    
    var disConfirmBtn: js.UndefOr[Boolean] = js.native
    
    var endDate: js.UndefOr[js.Date] = js.native
    
    var showTimePicker: Boolean = js.native
    
    var startDate: js.UndefOr[js.Date] = js.native
    
    var timePickerTitle: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Calendar extends PureComponent[PropsType, StateType, Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCalendar(nextProps: PropsType): Unit = js.native
    
    def onCancel(): Unit = js.native
    
    def onClear(): Unit = js.native
    
    def onClose(): Unit = js.native
    
    def onConfirm(): Unit = js.native
    
    def onSelectHasDisableDate(date: js.Array[js.Date]): Unit = js.native
    
    def onSelectedDate(date: js.Date): Unit = js.native
    
    def onTimeChange(date: js.Date): Unit = js.native
    
    def selectDate(date: js.Date): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: Unit, props: ReadonlychildrenReactNode): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate, props: ReadonlychildrenReactNode): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Unit, oldState: Unit, props: ReadonlychildrenReactNode): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Unit, oldState: EndDate): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Unit, oldState: EndDate, props: ReadonlychildrenReactNode): StateType = js.native
    
    def setClientHeight(height: Double): Unit = js.native
    
    def shortcutSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
    def shortcutSelect(startDate: js.Date, endDate: js.Date, props: ReadonlychildrenReactNode): Unit = js.native
  }
  
  type ExtraData = typings.rmcCalendar.dataTypesMod.Models.ExtraData
}
