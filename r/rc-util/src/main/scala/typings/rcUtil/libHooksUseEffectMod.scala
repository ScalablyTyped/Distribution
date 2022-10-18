package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseEffectMod {
  
  @JSImport("rc-util/lib/hooks/useEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: js.Function1[/* prevDeps */ js.Array[Any], Unit], deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
