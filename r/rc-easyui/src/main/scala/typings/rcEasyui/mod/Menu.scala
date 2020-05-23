package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "Menu")
@js.native
class Menu protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  def alignContextMenu(): Unit = js.native
  def alignTo(e: js.Any, args: js.Any*): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMenu(): Unit = js.native
  def containerClasses(): js.Any = js.native
  def containerStyle(): js.Any = js.native
  def delayHide(): Unit = js.native
  def handleDocumentClick(e: js.Any): Unit = js.native
  def handleItemClick(e: js.Any): Unit = js.native
  def handleMouseOut(): Unit = js.native
  def handleMouseOver(): Unit = js.native
  def hide(): Unit = js.native
  def show(e: js.Any, n: js.Any): js.Any = js.native
  def showAt(e: js.Any, args: js.Any*): js.Any = js.native
  def showContextMenu(e: js.Any, t: js.Any): js.Any = js.native
}

/* static members */
@JSImport("rc-easyui", "Menu")
@js.native
object Menu extends js.Object {
  var zIndex: Double = js.native
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Menu.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Menu.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val duration: Double = js.native
    val `inline`: Boolean = js.native
    val noline: Boolean = js.native
    def onHide(): Unit = js.native
    def onItemClick(e: js.Any): Unit = js.native
    def onShow(): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object duration extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.duration
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object `inline` extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.inline
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object menuCls extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.menuCls
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object menuStyle extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.menuStyle
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object menuWidth extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.menuWidth
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object noline extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.noline
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.Menu.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

