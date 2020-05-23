package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("rc-easyui", "Layout")
@js.native
object Layout extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Layout.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Layout.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    def onPanelResizeStart(e: js.Any): Unit = js.native
    def onPanelResizeStop(e: js.Any): Unit = js.native
    def onPanelResizing(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object selectedTab extends js.Object {
      // Circular reference from rc_easyui.Layout.propTypes.selectedTab
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

