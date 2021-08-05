package typings.reactFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("react-fns/dist/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(func: js.Function, wait: Double): js.ThisFunction0[/* this */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Any, Unit]]
  inline def debounce(func: js.Function, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Any, Unit]]
}
