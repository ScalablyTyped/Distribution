package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.locale
      @JSImport("rc-easyui", "Droppable.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.contextTypes.t
      @JSImport("rc-easyui", "Droppable.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Droppable.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Droppable.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @scala.inline
    def onDragEnter(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragEnter")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onDragLeave(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragLeave")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onDragOver(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDragOver")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onDrop(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDrop")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object disabled {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.disabled
      @JSImport("rc-easyui", "Droppable.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object scope {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Droppable.propTypes.scope")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Droppable.propTypes.scope
      @JSImport("rc-easyui", "Droppable.propTypes.scope.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
