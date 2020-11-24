package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "VirtualScroll")
@js.native
class VirtualScroll protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MVirtualScroll(): js.Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MVirtualScroll(e: js.Any): Unit = js.native
  
  def fetchPage(e: js.Any): Unit = js.native
  
  def handleScroll(e: js.Any): Unit = js.native
  
  def loadPage(e: js.Any): Unit = js.native
  
  def populate(e: js.Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def relativeScrollTop(): js.Any = js.native
  
  def renderContent(): js.Any = js.native
  
  def resetData(e: js.Any): Unit = js.native
  
  def scrollLeft(e: js.Any): js.Any = js.native
  
  def scrollState(e: js.Any): js.Any = js.native
  
  def scrollTop(e: js.Any): js.Any = js.native
  
  def scrollbarWidth(): js.Any = js.native
  
  def scrolling(): Unit = js.native
  
  def setData(e: js.Any): Unit = js.native
  
  def splitHeights(e: js.Any): js.Any = js.native
}
@JSImport("rc-easyui", "VirtualScroll")
@js.native
object VirtualScroll extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    val data: js.Array[js.Any] = js.native
    
    val `lazy`: Boolean = js.native
    
    val maxDivHeight: Double = js.native
    
    val maxVisibleHeight: Double = js.native
    
    def onBodyScroll(e: js.Any): Unit = js.native
    
    def onPageChange(e: js.Any): Unit = js.native
    
    def onUpdate(e: js.Any): Unit = js.native
    
    val pageNumber: Double = js.native
    
    val pageSize: Double = js.native
    
    val rowHeight: Double = js.native
    
    val total: Double = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object data extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.data
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object `lazy` extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.lazy
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object maxDivHeight extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxDivHeight
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object maxVisibleHeight extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxVisibleHeight
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object onPageChange extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onPageChange
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object onUpdate extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onUpdate
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object pageNumber extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageNumber
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object pageSize extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageSize
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object renderItem extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItem
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object renderItems extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItems
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object reset extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.reset
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object rowHeight extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.rowHeight
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object total extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.total
      val isRequired: js.Any = js.native
    }
  }
}
