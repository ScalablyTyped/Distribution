package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "LocaleProvider")
@js.native
open class LocaleProvider protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any, args: Any*) = this()
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLocaleProvider(e: Any): Unit = js.native
  
  def getChildContext(): Any = js.native
}
object LocaleProvider {
  
  object childContextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.locale
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.t
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
