package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      
      @JSImport("rc-easyui", "Layout.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.locale
      @JSImport("rc-easyui", "Layout.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Layout.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Layout.contextTypes.t
      @JSImport("rc-easyui", "Layout.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Layout.defaultProps.onPanelResizeStart")
    @js.native
    def onPanelResizeStart(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Layout.defaultProps.onPanelResizeStop")
    @js.native
    def onPanelResizeStop(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Layout.defaultProps.onPanelResizing")
    @js.native
    def onPanelResizing(e: js.Any): Unit = js.native
  }
  
  object propTypes {
    
    object selectedTab {
      
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Layout.propTypes.selectedTab
      @JSImport("rc-easyui", "Layout.propTypes.selectedTab.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
