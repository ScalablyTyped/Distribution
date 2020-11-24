package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Resizable")
@js.native
class Resizable protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MResizable(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizable(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizable(): Unit = js.native
}
@JSImport("rc-easyui", "Resizable")
@js.native
object Resizable extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    val disabled: Boolean = js.native
    
    val edge: Double = js.native
    
    val handles: String = js.native
    
    val maxHeight: Double = js.native
    
    val maxWidth: Double = js.native
    
    val minHeight: Double = js.native
    
    val minWidth: Double = js.native
    
    def onResizeStart(e: js.Any): Unit = js.native
    
    def onResizeStop(e: js.Any): Unit = js.native
    
    def onResizing(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object disabled extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.disabled
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object edge extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.edge
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object handles extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.handles
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object maxHeight extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.maxHeight
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object maxWidth extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.maxWidth
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object minHeight extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.minHeight
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object minWidth extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.minWidth
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object onResizeStart extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizeStart
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object onResizeStop extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizeStop
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object onResizing extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizing
      val isRequired: js.Any = js.native
    }
  }
}
