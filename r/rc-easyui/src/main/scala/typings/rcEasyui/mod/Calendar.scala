package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Calendar")
@js.native
class Calendar protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MCalendar(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalendar(e: js.Any): js.Any = js.native
  
  def getHeaderData(): js.Any = js.native
  
  def getWeeks(): js.Any = js.native
  
  def handleDayClick(e: js.Any): Unit = js.native
  
  def handleDayMouseEnter(e: js.Any): Unit = js.native
  
  def handleDayMouseLeave(): Unit = js.native
  
  def handleMenuClick(): Unit = js.native
  
  def handleMonthClick(e: js.Any): js.Any = js.native
  
  def handleMonthMouseEnter(e: js.Any): Unit = js.native
  
  def handleMonthMouseLeave(): Unit = js.native
  
  def handleMonthNext(): Unit = js.native
  
  def handleMonthPrev(): Unit = js.native
  
  def handleYearChange(e: js.Any): js.Any = js.native
  
  def handleYearNext(): Unit = js.native
  
  def handleYearPrev(): Unit = js.native
  
  def highlightDate(e: js.Any): Unit = js.native
  
  def isDiff(e: js.Any, t: js.Any): js.Any = js.native
  
  def isStateEmpty(e: js.Any): js.Any = js.native
  
  def isValid(e: js.Any): js.Any = js.native
  
  def moveTo(e: js.Any): js.Any = js.native
  
  def navDate(e: js.Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def selectDate(args: js.Any*): Unit = js.native
  
  def toArray(e: js.Any): js.Any = js.native
  
  def toDate(e: js.Any): js.Any = js.native
}
object Calendar {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Calendar.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.locale
      @JSImport("rc-easyui", "Calendar.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Calendar.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.t
      @JSImport("rc-easyui", "Calendar.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Calendar.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.defaultInfo")
    @js.native
    def defaultInfo(e: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.defaultMonths")
    @js.native
    val defaultMonths: js.Array[String] = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.defaultWeeks")
    @js.native
    val defaultWeeks: js.Array[String] = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.firstDay")
    @js.native
    val firstDay: Double = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.info")
    @js.native
    val info: js.Any = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.month")
    @js.native
    val month: Double = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.onSelectionChange")
    @js.native
    def onSelectionChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.showInfo")
    @js.native
    val showInfo: Boolean = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.showWeek")
    @js.native
    val showWeek: Boolean = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.validator")
    @js.native
    def validator(e: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.weekNumberHeader")
    @js.native
    val weekNumberHeader: String = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.year")
    @js.native
    val year: Double = js.native
  }
  
  object propTypes {
    
    object border {
      
      @JSImport("rc-easyui", "Calendar.propTypes.border")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.border
      @JSImport("rc-easyui", "Calendar.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      @JSImport("rc-easyui", "Calendar.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.className
      @JSImport("rc-easyui", "Calendar.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object firstDay {
      
      @JSImport("rc-easyui", "Calendar.propTypes.firstDay")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.firstDay
      @JSImport("rc-easyui", "Calendar.propTypes.firstDay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object info {
      
      @JSImport("rc-easyui", "Calendar.propTypes.info")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.info
      @JSImport("rc-easyui", "Calendar.propTypes.info.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object month {
      
      @JSImport("rc-easyui", "Calendar.propTypes.month")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.month
      @JSImport("rc-easyui", "Calendar.propTypes.month.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object months {
      
      @JSImport("rc-easyui", "Calendar.propTypes.months")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.months
      @JSImport("rc-easyui", "Calendar.propTypes.months.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @JSImport("rc-easyui", "Calendar.propTypes.selection")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.selection
      @JSImport("rc-easyui", "Calendar.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showInfo {
      
      @JSImport("rc-easyui", "Calendar.propTypes.showInfo")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showInfo
      @JSImport("rc-easyui", "Calendar.propTypes.showInfo.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showWeek {
      
      @JSImport("rc-easyui", "Calendar.propTypes.showWeek")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showWeek
      @JSImport("rc-easyui", "Calendar.propTypes.showWeek.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "Calendar.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.style
      @JSImport("rc-easyui", "Calendar.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object validator {
      
      @JSImport("rc-easyui", "Calendar.propTypes.validator")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.validator
      @JSImport("rc-easyui", "Calendar.propTypes.validator.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object weekNumberHeader {
      
      @JSImport("rc-easyui", "Calendar.propTypes.weekNumberHeader")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weekNumberHeader
      @JSImport("rc-easyui", "Calendar.propTypes.weekNumberHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object weeks {
      
      @JSImport("rc-easyui", "Calendar.propTypes.weeks")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weeks
      @JSImport("rc-easyui", "Calendar.propTypes.weeks.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object year {
      
      @JSImport("rc-easyui", "Calendar.propTypes.year")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.year
      @JSImport("rc-easyui", "Calendar.propTypes.year.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
