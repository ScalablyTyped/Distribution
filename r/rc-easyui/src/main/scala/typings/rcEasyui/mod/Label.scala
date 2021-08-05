package typings.rcEasyui.mod

import typings.rcEasyui.anon.AlignString
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Label")
@js.native
class Label protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
}
/* static members */
object Label {
  
  @JSImport("rc-easyui", "Label")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-easyui", "Label.defaultProps")
  @js.native
  def defaultProps: AlignString = js.native
  inline def defaultProps_=(x: AlignString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object align {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Label.propTypes.align")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Label.propTypes.align
      @JSImport("rc-easyui", "Label.propTypes.align.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object htmlFor {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Label.propTypes.htmlFor")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Label.propTypes.htmlFor
      @JSImport("rc-easyui", "Label.propTypes.htmlFor.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
