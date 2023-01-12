package typings.reactSelect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInternalUseScrollLockMod {
  
  @JSImport("react-select/dist/declarations/src/internal/useScrollLock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Options): js.Function1[/* element */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* element */ HTMLElement | Null, Unit]]
  
  trait Options extends StObject {
    
    val accountForScrollbars: js.UndefOr[Boolean] = js.undefined
    
    val isEnabled: Boolean
  }
  object Options {
    
    inline def apply(isEnabled: Boolean): Options = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAccountForScrollbars(value: Boolean): Self = StObject.set(x, "accountForScrollbars", value.asInstanceOf[js.Any])
      
      inline def setAccountForScrollbarsUndefined: Self = StObject.set(x, "accountForScrollbars", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
