package typings.rcEasyui.mod

import typings.rcEasyui.anon.SelectionMode
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
}
/* static members */
object ButtonGroup {
  
  @JSImport("rc-easyui", "ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "ButtonGroup.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.contextTypes.locale
      @JSImport("rc-easyui", "ButtonGroup.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "ButtonGroup.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.contextTypes.t
      @JSImport("rc-easyui", "ButtonGroup.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "ButtonGroup.defaultProps")
  @js.native
  def defaultProps: SelectionMode = js.native
  @scala.inline
  def defaultProps_=(x: SelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object selectionMode {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "ButtonGroup.propTypes.selectionMode")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.ButtonGroup.propTypes.selectionMode
      @JSImport("rc-easyui", "ButtonGroup.propTypes.selectionMode.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
