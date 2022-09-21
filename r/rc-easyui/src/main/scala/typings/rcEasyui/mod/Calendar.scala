package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Calendar")
@js.native
open class Calendar protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MCalendar(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalendar(e: Any): Any = js.native
  
  def getHeaderData(): Any = js.native
  
  def getWeeks(): Any = js.native
  
  def handleDayClick(e: Any): Unit = js.native
  
  def handleDayMouseEnter(e: Any): Unit = js.native
  
  def handleDayMouseLeave(): Unit = js.native
  
  def handleMenuClick(): Unit = js.native
  
  def handleMonthClick(e: Any): Any = js.native
  
  def handleMonthMouseEnter(e: Any): Unit = js.native
  
  def handleMonthMouseLeave(): Unit = js.native
  
  def handleMonthNext(): Unit = js.native
  
  def handleMonthPrev(): Unit = js.native
  
  def handleYearChange(e: Any): Any = js.native
  
  def handleYearNext(): Unit = js.native
  
  def handleYearPrev(): Unit = js.native
  
  def highlightDate(e: Any): Unit = js.native
  
  def isDiff(e: Any, t: Any): Any = js.native
  
  def isStateEmpty(e: Any): Any = js.native
  
  def isValid(e: Any): Any = js.native
  
  def moveTo(e: Any): Any = js.native
  
  def navDate(e: Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def selectDate(args: Any*): Unit = js.native
  
  def toArray(e: Any): Any = js.native
  
  def toDate(e: Any): Any = js.native
}
object Calendar {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.locale
      @JSImport("rc-easyui", "Calendar.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.t
      @JSImport("rc-easyui", "Calendar.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Calendar.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    inline def defaultInfo(e: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultInfo")(e.asInstanceOf[js.Any]).asInstanceOf[Any]
    
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
    val info: Any = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.month")
    @js.native
    val month: Double = js.native
    
    inline def onSelectionChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Calendar.defaultProps.showInfo")
    @js.native
    val showInfo: Boolean = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.showWeek")
    @js.native
    val showWeek: Boolean = js.native
    
    inline def validator(e: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("validator")(e.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("rc-easyui", "Calendar.defaultProps.weekNumberHeader")
    @js.native
    val weekNumberHeader: String = js.native
    
    @JSImport("rc-easyui", "Calendar.defaultProps.year")
    @js.native
    val year: Double = js.native
  }
  
  object propTypes {
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.border
      @JSImport("rc-easyui", "Calendar.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object className {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.className
      @JSImport("rc-easyui", "Calendar.propTypes.className.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object firstDay {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.firstDay")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.firstDay
      @JSImport("rc-easyui", "Calendar.propTypes.firstDay.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object info {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.info")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.info
      @JSImport("rc-easyui", "Calendar.propTypes.info.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object month {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.month")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.month
      @JSImport("rc-easyui", "Calendar.propTypes.month.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object months {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.months")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.months
      @JSImport("rc-easyui", "Calendar.propTypes.months.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selection {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.selection
      @JSImport("rc-easyui", "Calendar.propTypes.selection.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showInfo {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.showInfo")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showInfo
      @JSImport("rc-easyui", "Calendar.propTypes.showInfo.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showWeek {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.showWeek")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showWeek
      @JSImport("rc-easyui", "Calendar.propTypes.showWeek.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object style {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.style
      @JSImport("rc-easyui", "Calendar.propTypes.style.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object validator {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.validator")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.validator
      @JSImport("rc-easyui", "Calendar.propTypes.validator.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object weekNumberHeader {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.weekNumberHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weekNumberHeader
      @JSImport("rc-easyui", "Calendar.propTypes.weekNumberHeader.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object weeks {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.weeks")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weeks
      @JSImport("rc-easyui", "Calendar.propTypes.weeks.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object year {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Calendar.propTypes.year")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.year
      @JSImport("rc-easyui", "Calendar.propTypes.year.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
