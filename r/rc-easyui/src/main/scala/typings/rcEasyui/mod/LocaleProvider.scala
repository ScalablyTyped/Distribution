package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "LocaleProvider")
@js.native
class LocaleProvider protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any, args: js.Any*) = this()
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLocaleProvider(e: js.Any): Unit = js.native
  
  def getChildContext(): js.Any = js.native
}
object LocaleProvider {
  
  object childContextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.locale
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.t
      @JSImport("rc-easyui", "LocaleProvider.childContextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
