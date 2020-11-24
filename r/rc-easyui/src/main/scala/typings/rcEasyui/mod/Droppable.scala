package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Droppable")
@js.native
class Droppable protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MDroppable(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDroppable(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDroppable(): Unit = js.native
}
@JSImport("rc-easyui", "Droppable")
@js.native
object Droppable extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object defaultProps extends js.Object {
    
    val disabled: Boolean = js.native
    
    def onDragEnter(e: js.Any): Unit = js.native
    
    def onDragLeave(e: js.Any): Unit = js.native
    
    def onDragOver(e: js.Any): Unit = js.native
    
    def onDrop(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object disabled extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.disabled
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object scope extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.scope
      val isRequired: js.Any = js.native
    }
  }
}
