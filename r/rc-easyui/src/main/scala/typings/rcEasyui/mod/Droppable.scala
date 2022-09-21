package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Droppable")
@js.native
open class Droppable protected ()
  extends Component[Any, js.Object, Any] {
  def this(args: Any*) = this()
  
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
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.locale
      @JSImport("rc-easyui", "Droppable.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.t
      @JSImport("rc-easyui", "Droppable.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Droppable.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    inline def onDragEnter(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragEnter")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onDragLeave(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragLeave")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onDragOver(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragOver")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onDrop(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDrop")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object disabled {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.disabled
      @JSImport("rc-easyui", "Droppable.propTypes.disabled.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object scope {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.propTypes.scope")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.scope
      @JSImport("rc-easyui", "Droppable.propTypes.scope.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
