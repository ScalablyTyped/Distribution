package typings.rcEasyui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "LocaleBase")
@js.native
class LocaleBase protected () extends js.Object {
  def this(args: js.Any*) = this()
  
  def t(e: js.Any, args: js.Any*): js.Any = js.native
}
@JSImport("rc-easyui", "LocaleBase")
@js.native
object LocaleBase extends js.Object {
  
  @js.native
  object contextTypes extends js.Object {
    
    @js.native
    object locale extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.LocaleBase.contextTypes.locale
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.LocaleBase.contextTypes.t
      val isRequired: js.Any = js.native
    }
  }
  
  @js.native
  object propTypes extends js.Object {
    
    @js.native
    object className extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.LocaleBase.propTypes.className
      val isRequired: js.Any = js.native
    }
    
    @js.native
    object style extends js.Object {
      
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.LocaleBase.propTypes.style
      val isRequired: js.Any = js.native
    }
  }
}
