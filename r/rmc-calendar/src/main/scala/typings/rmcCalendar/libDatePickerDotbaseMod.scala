package typings.rmcCalendar

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.rmcCalendar.anon.Client
import typings.rmcCalendar.anon.FirstDate
import typings.rmcCalendar.libDateDataTypesMod.Models.CellData
import typings.rmcCalendar.libDateDataTypesMod.Models.MonthData
import typings.rmcCalendar.libDatePickerPropsMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerDotbaseMod {
  
  /* note: abstract class */ @JSImport("rmc-calendar/lib/DatePicker.base", JSImport.Default)
  @js.native
  open class default protected () extends DatePicker {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/DatePicker.base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/DatePicker.base", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker extends Component[PropsType, StateType, Any] {
    
    def canLoadNext(): Boolean = js.native
    
    def canLoadPrev(): Boolean = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MDatePicker(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDatePicker(nextProps: PropsType): Unit = js.native
    
    def computeVisible(clientHeight: Double, scrollTop: Double): Boolean = js.native
    
    def createOnScroll(): js.Function1[/* data */ Client, Unit] = js.native
    
    def genMonthComponent(data: MonthData): ReactNode = js.native
    
    def genMonthData(): MonthData = js.native
    def genMonthData(date: js.Date): MonthData = js.native
    def genMonthData(date: js.Date, addMonth: Double): MonthData = js.native
    def genMonthData(date: Unit, addMonth: Double): MonthData = js.native
    
    def genWeekData(firstDate: js.Date): js.Array[js.Array[CellData]] = js.native
    
    def getDateWithoutTime(): Double = js.native
    def getDateWithoutTime(date: js.Date): Double = js.native
    
    def getMonthDate(): FirstDate = js.native
    def getMonthDate(date: js.Date): FirstDate = js.native
    def getMonthDate(date: js.Date, addMonth: Double): FirstDate = js.native
    def getMonthDate(date: Unit, addMonth: Double): FirstDate = js.native
    
    def inDate(date: Double, tick: Double): Boolean = js.native
    
    def onCellClick(day: CellData): Unit = js.native
    
    def selectDateRange(startDate: js.Date): Unit = js.native
    def selectDateRange(startDate: js.Date, endDate: js.Date): Unit = js.native
    def selectDateRange(startDate: js.Date, endDate: js.Date, clear: Boolean): Unit = js.native
    def selectDateRange(startDate: js.Date, endDate: Unit, clear: Boolean): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDatePicker(nextProps: PropsType, nextState: StateType, nextContext: Any): Boolean = js.native
    
    var visibleMonth: js.Array[MonthData] = js.native
  }
  
  trait StateType extends StObject {
    
    var months: js.Array[MonthData]
  }
  object StateType {
    
    inline def apply(months: js.Array[MonthData]): StateType = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setMonths(value: js.Array[MonthData]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsVarargs(value: MonthData*): Self = StObject.set(x, "months", js.Array(value*))
    }
  }
}
