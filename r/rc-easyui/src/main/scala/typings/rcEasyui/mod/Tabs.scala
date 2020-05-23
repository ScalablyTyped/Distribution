package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("rc-easyui", "Tabs")
@js.native
object Tabs extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Tabs.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Tabs.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val border: Boolean = js.native
    val headerHeight: Double = js.native
    val headerWidth: Double = js.native
    val justified: Boolean = js.native
    val narrow: Boolean = js.native
    val plain: Boolean = js.native
    val scrollIncrement: Double = js.native
    val scrollable: Boolean = js.native
    val selectedIndex: Double = js.native
    val tabHeight: Double = js.native
    val tabPosition: String = js.native
    def onTabClose(e: js.Any): Unit = js.native
    def onTabSelect(e: js.Any): Unit = js.native
    def onTabUnselect(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object border extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.border
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object headerHeight extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.headerHeight
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object headerWidth extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.headerWidth
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object justified extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.justified
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object narrow extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.narrow
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object plain extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.plain
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object scrollIncrement extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.scrollIncrement
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object scrollable extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.scrollable
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object selectedIndex extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.selectedIndex
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object tabHeight extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.tabHeight
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object tabPosition extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.tabPosition
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object tabWidth extends js.Object {
      // Circular reference from rc_easyui.Tabs.propTypes.tabWidth
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

