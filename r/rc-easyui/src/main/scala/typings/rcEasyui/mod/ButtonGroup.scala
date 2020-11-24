package typings.rcEasyui.mod

import typings.rcEasyui.anon.SelectionMode
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
}
/* static members */
@JSImport("rc-easyui", "ButtonGroup")
@js.native
object ButtonGroup extends js.Object {
  
  var defaultProps: SelectionMode = js.native
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object selectionMode extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.propTypes.selectionMode
      val isRequired: js.Any = js.native
    }
  }
}
