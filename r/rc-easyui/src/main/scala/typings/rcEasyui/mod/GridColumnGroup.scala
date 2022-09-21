package typings.rcEasyui.mod

import typings.rcEasyui.anon.Align
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "GridColumnGroup")
@js.native
open class GridColumnGroup protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MGridColumnGroup(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGridColumnGroup(): Unit = js.native
  
  def onRowAdd(e: Any): Unit = js.native
  
  def onRowRemove(e: Any): Unit = js.native
}
/* static members */
object GridColumnGroup {
  
  @JSImport("rc-easyui", "GridColumnGroup")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridColumnGroup.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.contextTypes.locale
      @JSImport("rc-easyui", "GridColumnGroup.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridColumnGroup.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.contextTypes.t
      @JSImport("rc-easyui", "GridColumnGroup.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "GridColumnGroup.defaultProps")
  @js.native
  def defaultProps: Align = js.native
  inline def defaultProps_=(x: Align): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object align {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.align")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.align
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.align.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object frozen {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.frozen")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.frozen
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.frozen.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object width {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.width")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.GridColumnGroup.propTypes.width
      @JSImport("rc-easyui", "GridColumnGroup.propTypes.width.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
