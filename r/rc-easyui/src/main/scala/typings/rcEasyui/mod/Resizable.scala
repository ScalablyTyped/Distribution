package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Resizable")
@js.native
open class Resizable protected ()
  extends Component[Any, js.Object, Any] {
  def this(args: Any*) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MResizable(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizable(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizable(): Unit = js.native
}
object Resizable {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.contextTypes.locale
      @JSImport("rc-easyui", "Resizable.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.contextTypes.t
      @JSImport("rc-easyui", "Resizable.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Resizable.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.edge")
    @js.native
    val edge: Double = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.handles")
    @js.native
    val handles: String = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.maxHeight")
    @js.native
    val maxHeight: Double = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.maxWidth")
    @js.native
    val maxWidth: Double = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.minHeight")
    @js.native
    val minHeight: Double = js.native
    
    @JSImport("rc-easyui", "Resizable.defaultProps.minWidth")
    @js.native
    val minWidth: Double = js.native
    
    inline def onResizeStart(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResizeStart")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onResizeStop(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResizeStop")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onResizing(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResizing")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object disabled {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.disabled
      @JSImport("rc-easyui", "Resizable.propTypes.disabled.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object edge {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.edge")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.edge
      @JSImport("rc-easyui", "Resizable.propTypes.edge.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object handles {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.handles")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.handles
      @JSImport("rc-easyui", "Resizable.propTypes.handles.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object maxHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.maxHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.maxHeight
      @JSImport("rc-easyui", "Resizable.propTypes.maxHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object maxWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.maxWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.maxWidth
      @JSImport("rc-easyui", "Resizable.propTypes.maxWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object minHeight {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.minHeight")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.minHeight
      @JSImport("rc-easyui", "Resizable.propTypes.minHeight.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object minWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.minWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.minWidth
      @JSImport("rc-easyui", "Resizable.propTypes.minWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onResizeStart {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.onResizeStart")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizeStart
      @JSImport("rc-easyui", "Resizable.propTypes.onResizeStart.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onResizeStop {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.onResizeStop")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizeStop
      @JSImport("rc-easyui", "Resizable.propTypes.onResizeStop.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onResizing {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Resizable.propTypes.onResizing")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Resizable.propTypes.onResizing
      @JSImport("rc-easyui", "Resizable.propTypes.onResizing.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
