package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
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
object Droppable {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Droppable.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.locale
      @JSImport("rc-easyui", "Droppable.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Droppable.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.t
      @JSImport("rc-easyui", "Droppable.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Droppable.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.onDragEnter")
    @js.native
    def onDragEnter(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.onDragLeave")
    @js.native
    def onDragLeave(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.onDragOver")
    @js.native
    def onDragOver(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.onDrop")
    @js.native
    def onDrop(e: js.Any): Unit = js.native
  }
  
  object propTypes {
    
    object disabled {
      
      @JSImport("rc-easyui", "Droppable.propTypes.disabled")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.disabled
      @JSImport("rc-easyui", "Droppable.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object scope {
      
      @JSImport("rc-easyui", "Droppable.propTypes.scope")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.scope
      @JSImport("rc-easyui", "Droppable.propTypes.scope.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
