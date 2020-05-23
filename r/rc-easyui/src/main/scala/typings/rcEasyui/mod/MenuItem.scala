package typings.rcEasyui.mod

import typings.rcEasyui.anon.Disabled
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "MenuItem")
@js.native
class MenuItem protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenuItem(e: js.Any): Unit = js.native
  def handleItemClick(e: js.Any): Unit = js.native
  def handleMenuAdd(e: js.Any): Unit = js.native
  def handleMenuRemove(): Unit = js.native
  def handleMouseEnter(): Unit = js.native
  def handleMouseLeave(): Unit = js.native
  def itemClasses(): js.Any = js.native
}

/* static members */
@JSImport("rc-easyui", "MenuItem")
@js.native
object MenuItem extends js.Object {
  var defaultProps: Disabled = js.native
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.MenuItem.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.MenuItem.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object disabled extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.disabled
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object iconCls extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.iconCls
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object text extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.text
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object value extends js.Object {
      // Circular reference from rc_easyui.MenuItem.propTypes.value
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

