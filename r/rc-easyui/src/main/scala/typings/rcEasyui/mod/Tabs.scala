package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Tabs")
@js.native
class Tabs protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def addHis(e: js.Any): Unit = js.native
  
  def backHis(): Unit = js.native
  
  def bodyClasses(): js.Any = js.native
  
  def changePanels(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(e: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTabs(): Unit = js.native
  
  def containerClasses(): js.Any = js.native
  
  def getPanel(e: js.Any): js.Any = js.native
  
  def getPanelIndex(e: js.Any): js.Any = js.native
  
  def getSelectedPanel(): js.Any = js.native
  
  def handlePanelAdd(e: js.Any): Unit = js.native
  
  def handlePanelRemove(e: js.Any): Unit = js.native
  
  def handleTabClick(e: js.Any): Unit = js.native
  
  def handleTabClose(e: js.Any): Unit = js.native
  
  def headerClasses(): js.Any = js.native
  
  def initPanels(): js.Any = js.native
  
  def initSelectedPanel(): js.Any = js.native
  
  def initUsedPanels(): js.Any = js.native
  
  def isHorizontal(): js.Any = js.native
  
  def isScrollable(): js.Any = js.native
  
  def isScrollerVisible(): js.Any = js.native
  
  def removeHis(e: js.Any): js.Any = js.native
  
  def scrollBy(e: js.Any): Unit = js.native
  
  def select(e: js.Any): Unit = js.native
  
  def setMaxScrollDistance(e: js.Any): Unit = js.native
  
  def setScrollers(): Unit = js.native
  
  def tabsClasses(): js.Any = js.native
  
  def tabsStyle(): js.Any = js.native
  
  def unselect(e: js.Any): Unit = js.native
}
object Tabs {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Tabs.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.contextTypes.locale
      @JSImport("rc-easyui", "Tabs.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Tabs.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.contextTypes.t
      @JSImport("rc-easyui", "Tabs.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Tabs.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.headerHeight")
    @js.native
    val headerHeight: Double = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.headerWidth")
    @js.native
    val headerWidth: Double = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.justified")
    @js.native
    val justified: Boolean = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.narrow")
    @js.native
    val narrow: Boolean = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.onTabClose")
    @js.native
    def onTabClose(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.onTabSelect")
    @js.native
    def onTabSelect(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.onTabUnselect")
    @js.native
    def onTabUnselect(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.plain")
    @js.native
    val plain: Boolean = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.scrollIncrement")
    @js.native
    val scrollIncrement: Double = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.scrollable")
    @js.native
    val scrollable: Boolean = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.selectedIndex")
    @js.native
    val selectedIndex: Double = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.tabHeight")
    @js.native
    val tabHeight: Double = js.native
    
    @JSImport("rc-easyui", "Tabs.defaultProps.tabPosition")
    @js.native
    val tabPosition: String = js.native
  }
  
  object propTypes {
    
    object border {
      
      @JSImport("rc-easyui", "Tabs.propTypes.border")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.border
      @JSImport("rc-easyui", "Tabs.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      @JSImport("rc-easyui", "Tabs.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.className
      @JSImport("rc-easyui", "Tabs.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerHeight {
      
      @JSImport("rc-easyui", "Tabs.propTypes.headerHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.headerHeight
      @JSImport("rc-easyui", "Tabs.propTypes.headerHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerWidth {
      
      @JSImport("rc-easyui", "Tabs.propTypes.headerWidth")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.headerWidth
      @JSImport("rc-easyui", "Tabs.propTypes.headerWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object justified {
      
      @JSImport("rc-easyui", "Tabs.propTypes.justified")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.justified
      @JSImport("rc-easyui", "Tabs.propTypes.justified.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object narrow {
      
      @JSImport("rc-easyui", "Tabs.propTypes.narrow")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.narrow
      @JSImport("rc-easyui", "Tabs.propTypes.narrow.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object plain {
      
      @JSImport("rc-easyui", "Tabs.propTypes.plain")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.plain
      @JSImport("rc-easyui", "Tabs.propTypes.plain.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object scrollIncrement {
      
      @JSImport("rc-easyui", "Tabs.propTypes.scrollIncrement")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.scrollIncrement
      @JSImport("rc-easyui", "Tabs.propTypes.scrollIncrement.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object scrollable {
      
      @JSImport("rc-easyui", "Tabs.propTypes.scrollable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.scrollable
      @JSImport("rc-easyui", "Tabs.propTypes.scrollable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectedIndex {
      
      @JSImport("rc-easyui", "Tabs.propTypes.selectedIndex")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.selectedIndex
      @JSImport("rc-easyui", "Tabs.propTypes.selectedIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "Tabs.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.style
      @JSImport("rc-easyui", "Tabs.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabHeight {
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabHeight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabHeight
      @JSImport("rc-easyui", "Tabs.propTypes.tabHeight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabPosition {
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabPosition
      @JSImport("rc-easyui", "Tabs.propTypes.tabPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabWidth {
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabWidth")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabWidth
      @JSImport("rc-easyui", "Tabs.propTypes.tabWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
