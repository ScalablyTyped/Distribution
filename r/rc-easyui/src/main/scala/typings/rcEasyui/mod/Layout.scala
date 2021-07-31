package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Layout")
@js.native
class Layout protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def changePanels(): Unit = js.native
  
  def getPaddingValue(e: js.Any): js.Any = js.native
  
  def getPanel(e: js.Any): js.Any = js.native
  
  def handleClick(e: js.Any): js.Any = js.native
  
  def handlePanelAdd(e: js.Any): Unit = js.native
  
  def handlePanelRemove(e: js.Any): Unit = js.native
  
  def handlePanelResizeStart(e: js.Any, t: js.Any): Unit = js.native
  
  def handlePanelResizeStop(e: js.Any, t: js.Any): Unit = js.native
  
  def handlePanelResizing(e: js.Any, t: js.Any): Unit = js.native
  
  def renderCollapsedPanel(e: js.Any): js.Any = js.native
  
  def renderConsumer(): js.Any = js.native
  
  def renderLayout(): js.Any = js.native
  
  def updatePaddings(): Unit = js.native
}
object Layout {
  
  object contextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.locale
      @JSImport("rc-easyui", "Layout.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.t
      @JSImport("rc-easyui", "Layout.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Layout.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def onPanelResizeStart(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizeStart")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onPanelResizeStop(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizeStop")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onPanelResizing(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelResizing")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object selectedTab {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Layout.propTypes.selectedTab
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
