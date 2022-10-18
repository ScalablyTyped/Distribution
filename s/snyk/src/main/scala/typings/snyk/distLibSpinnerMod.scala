package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSpinnerMod {
  
  object spinner {
    
    inline def apply(label: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("snyk/dist/lib/spinner", "spinner")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/spinner", "spinner.clear")
    @js.native
    def clear: js.Function1[/* label */ Any, js.Function1[/* valueToPassThrough */ Any, Any]] = js.native
    
    @JSImport("snyk/dist/lib/spinner", "spinner.clearAll")
    @js.native
    def clearAll: js.Function0[Unit] = js.native
    inline def clearAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(x.asInstanceOf[js.Any])
    
    inline def clear_=(x: js.Function1[/* label */ Any, js.Function1[/* valueToPassThrough */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/spinner", "spinner.sticky")
    @js.native
    def sticky: js.Function1[/* s */ js.UndefOr[Any], Unit] = js.native
    inline def sticky_=(x: js.Function1[/* s */ js.UndefOr[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sticky")(x.asInstanceOf[js.Any])
  }
}
