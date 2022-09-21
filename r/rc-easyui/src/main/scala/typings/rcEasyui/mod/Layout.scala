package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Layout")
@js.native
open class Layout protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def changePanels(): Unit = js.native
  
  def getPaddingValue(e: Any): Any = js.native
  
  def getPanel(e: Any): Any = js.native
  
  def handleClick(e: Any): Any = js.native
  
  def handlePanelAdd(e: Any): Unit = js.native
  
  def handlePanelRemove(e: Any): Unit = js.native
  
  def handlePanelResizeStart(e: Any, t: Any): Unit = js.native
  
  def handlePanelResizeStop(e: Any, t: Any): Unit = js.native
  
  def handlePanelResizing(e: Any, t: Any): Unit = js.native
  
  def renderCollapsedPanel(e: Any): Any = js.native
  
  def renderConsumer(): Any = js.native
  
  def renderLayout(): Any = js.native
  
  def updatePaddings(): Unit = js.native
}
object Layout {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.locale
      @JSImport("rc-easyui", "Layout.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.t
      @JSImport("rc-easyui", "Layout.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Layout.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    inline def onPanelResizeStart(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizeStart")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPanelResizeStop(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizeStop")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPanelResizing(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizing")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object selectedTab {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.propTypes.selectedTab
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
