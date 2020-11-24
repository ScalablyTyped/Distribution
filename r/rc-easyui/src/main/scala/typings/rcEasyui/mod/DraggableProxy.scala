package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "DraggableProxy")
@js.native
class DraggableProxy protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MDraggableProxy(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDraggableProxy(e: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDraggableProxy(): Unit = js.native
  
  def handleTransitionEnd(): Unit = js.native
  
  def proxyClasses(): js.Any = js.native
  
  def proxyStyles(): js.Any = js.native
}
@JSImport("rc-easyui", "DraggableProxy")
@js.native
object DraggableProxy extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DraggableProxy.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DraggableProxy.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object className extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DraggableProxy.propTypes.className
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object style extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.DraggableProxy.propTypes.style
      val isRequired: js.Any = js.native
    }
  }
}
