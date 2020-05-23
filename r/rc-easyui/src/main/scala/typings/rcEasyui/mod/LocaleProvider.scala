package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "LocaleProvider")
@js.native
class LocaleProvider protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any, args: js.Any*) = this()
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLocaleProvider(e: js.Any): Unit = js.native
  def getChildContext(): js.Any = js.native
}

@JSImport("rc-easyui", "LocaleProvider")
@js.native
object LocaleProvider extends js.Object {
  @js.native
  object childContextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.LocaleProvider.childContextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

