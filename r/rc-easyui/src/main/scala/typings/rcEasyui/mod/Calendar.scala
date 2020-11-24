package typings.rcEasyui.mod

import typings.react.mod.Component
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
@JSImport("rc-easyui", "Calendar")
@js.native
object Calendar extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    val border: Boolean = js.native
    
    def defaultInfo(e: js.Any): js.Any = js.native
    
    val defaultMonths: js.Array[String] = js.native
    
    val defaultWeeks: js.Array[String] = js.native
    
    val firstDay: Double = js.native
    
    val info: js.Any = js.native
    
    val month: Double = js.native
    
    def onSelectionChange(e: js.Any): Unit = js.native
    
    val showInfo: Boolean = js.native
    
    val showWeek: Boolean = js.native
    
    def validator(e: js.Any): js.Any = js.native
    
    val weekNumberHeader: String = js.native
    
    val year: Double = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object border extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.border
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object className extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.className
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object firstDay extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.firstDay
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object info extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.info
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object month extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.month
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object months extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.months
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object selection extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.selection
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object showInfo extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showInfo
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object showWeek extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.showWeek
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object style extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.style
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object validator extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.validator
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object weekNumberHeader extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weekNumberHeader
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object weeks extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.weeks
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object year extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Calendar.propTypes.year
      val isRequired: js.Any = js.native
    }
  }
}
