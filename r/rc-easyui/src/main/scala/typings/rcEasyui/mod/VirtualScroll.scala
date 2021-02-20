package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
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
object VirtualScroll {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.locale
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.contextTypes.t
      @JSImport("rc-easyui", "VirtualScroll.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.data")
    @js.native
    val data: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.maxDivHeight")
    @js.native
    val maxDivHeight: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.maxVisibleHeight")
    @js.native
    val maxVisibleHeight: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.onBodyScroll")
    @js.native
    def onBodyScroll(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.onPageChange")
    @js.native
    def onPageChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.onUpdate")
    @js.native
    def onUpdate(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.pageNumber")
    @js.native
    val pageNumber: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.pageSize")
    @js.native
    val pageSize: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.rowHeight")
    @js.native
    val rowHeight: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.total")
    @js.native
    val total: Double = js.native
    
    @JSImport("rc-easyui", "VirtualScroll.defaultProps.lazy")
    @js.native
    val `lazy`: Boolean = js.native
  }
  
  object propTypes {
    
    object data {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.data")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.data
      @JSImport("rc-easyui", "VirtualScroll.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object maxDivHeight {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxDivHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxDivHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxDivHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object maxVisibleHeight {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxVisibleHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.maxVisibleHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.maxVisibleHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onPageChange {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onPageChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onPageChange
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onPageChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onUpdate {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onUpdate")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.onUpdate
      @JSImport("rc-easyui", "VirtualScroll.propTypes.onUpdate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageNumber {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageNumber")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageNumber
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageNumber.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object pageSize {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageSize")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.pageSize
      @JSImport("rc-easyui", "VirtualScroll.propTypes.pageSize.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderItem {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItem")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItem
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItem.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object renderItems {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItems")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.renderItems
      @JSImport("rc-easyui", "VirtualScroll.propTypes.renderItems.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object reset {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.reset")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.reset
      @JSImport("rc-easyui", "VirtualScroll.propTypes.reset.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object rowHeight {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.rowHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.rowHeight
      @JSImport("rc-easyui", "VirtualScroll.propTypes.rowHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object total {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.total")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.total
      @JSImport("rc-easyui", "VirtualScroll.propTypes.total.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `lazy` {
      
      @JSImport("rc-easyui", "VirtualScroll.propTypes.lazy")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.VirtualScroll.propTypes.lazy
      @JSImport("rc-easyui", "VirtualScroll.propTypes.lazy.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
