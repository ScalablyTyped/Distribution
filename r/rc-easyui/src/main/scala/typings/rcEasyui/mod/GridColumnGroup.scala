package typings.rcEasyui.mod

import typings.rcEasyui.anon.Align
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "GridColumnGroup")
@js.native
class GridColumnGroup protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MGridColumnGroup(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGridColumnGroup(): Unit = js.native
  
  def onRowAdd(e: js.Any): Unit = js.native
  
  def onRowRemove(e: js.Any): Unit = js.native
}
/* static members */
@JSImport("rc-easyui", "GridColumnGroup")
@js.native
object GridColumnGroup extends js.Object {
  
  var defaultProps: Align = js.native
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object align extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.align
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object frozen extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.frozen
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object width extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.width
      val isRequired: js.Any = js.native
    }
  }
}
