package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Tabs")
@js.native
open class Tabs protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def addHis(e: Any): Unit = js.native
  
  def backHis(): Unit = js.native
  
  def bodyClasses(): Any = js.native
  
  def changePanels(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(e: Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTabs(): Unit = js.native
  
  def containerClasses(): Any = js.native
  
  def getPanel(e: Any): Any = js.native
  
  def getPanelIndex(e: Any): Any = js.native
  
  def getSelectedPanel(): Any = js.native
  
  def handlePanelAdd(e: Any): Unit = js.native
  
  def handlePanelRemove(e: Any): Unit = js.native
  
  def handleTabClick(e: Any): Unit = js.native
  
  def handleTabClose(e: Any): Unit = js.native
  
  def headerClasses(): Any = js.native
  
  def initPanels(): Any = js.native
  
  def initSelectedPanel(): Any = js.native
  
  def initUsedPanels(): Any = js.native
  
  def isHorizontal(): Any = js.native
  
  def isScrollable(): Any = js.native
  
  def isScrollerVisible(): Any = js.native
  
  def removeHis(e: Any): Any = js.native
  
  def scrollBy(e: Any): Unit = js.native
  
  def select(e: Any): Unit = js.native
  
  def setMaxScrollDistance(e: Any): Unit = js.native
  
  def setScrollers(): Unit = js.native
  
  def tabsClasses(): Any = js.native
  
  def tabsStyle(): Any = js.native
  
  def unselect(e: Any): Unit = js.native
}
object Tabs {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.contextTypes.locale
      @JSImport("rc-easyui", "Tabs.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.contextTypes.t
      @JSImport("rc-easyui", "Tabs.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Tabs.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
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
    
    inline def onTabClose(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTabClose")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onTabSelect(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTabSelect")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onTabUnselect(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTabUnselect")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.border
      @JSImport("rc-easyui", "Tabs.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object className {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.className
      @JSImport("rc-easyui", "Tabs.propTypes.className.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.headerHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.headerHeight
      @JSImport("rc-easyui", "Tabs.propTypes.headerHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.headerWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.headerWidth
      @JSImport("rc-easyui", "Tabs.propTypes.headerWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object justified {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.justified")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.justified
      @JSImport("rc-easyui", "Tabs.propTypes.justified.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object narrow {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.narrow")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.narrow
      @JSImport("rc-easyui", "Tabs.propTypes.narrow.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object plain {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.plain")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.plain
      @JSImport("rc-easyui", "Tabs.propTypes.plain.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object scrollIncrement {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.scrollIncrement")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.scrollIncrement
      @JSImport("rc-easyui", "Tabs.propTypes.scrollIncrement.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object scrollable {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.scrollable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.scrollable
      @JSImport("rc-easyui", "Tabs.propTypes.scrollable.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selectedIndex {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.selectedIndex")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.selectedIndex
      @JSImport("rc-easyui", "Tabs.propTypes.selectedIndex.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object style {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.style
      @JSImport("rc-easyui", "Tabs.propTypes.style.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object tabHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabHeight
      @JSImport("rc-easyui", "Tabs.propTypes.tabHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object tabPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabPosition
      @JSImport("rc-easyui", "Tabs.propTypes.tabPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object tabWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tabs.propTypes.tabWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tabs.propTypes.tabWidth
      @JSImport("rc-easyui", "Tabs.propTypes.tabWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
