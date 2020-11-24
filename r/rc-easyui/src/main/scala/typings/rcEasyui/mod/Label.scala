package typings.rcEasyui.mod

import typings.rcEasyui.anon.AlignString
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Label")
@js.native
class Label protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
}
/* static members */
@JSImport("rc-easyui", "Label")
@js.native
object Label extends js.Object {
  
  var defaultProps: AlignString = js.native
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object align extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Label.propTypes.align
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object htmlFor extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Label.propTypes.htmlFor
      val isRequired: js.Any = js.native
    }
  }
}
