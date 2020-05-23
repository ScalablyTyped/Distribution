package typings.rcEasyui.mod

import typings.rcEasyui.anon.Buttons
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "Messager")
@js.native
class Messager protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  def alert(e: js.Any): Unit = js.native
  def close(e: js.Any): Unit = js.native
  def confirm(e: js.Any): Unit = js.native
  def openDialog(e: js.Any, args: js.Any*): Unit = js.native
  def prompt(e: js.Any): Unit = js.native
}

/* static members */
@JSImport("rc-easyui", "Messager")
@js.native
object Messager extends js.Object {
  var defaultProps: Buttons = js.native
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Messager.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Messager.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object buttons extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.buttons
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object content extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.content
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object icon extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.icon
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object messagerType extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.messagerType
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object msg extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.msg
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.Messager.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

