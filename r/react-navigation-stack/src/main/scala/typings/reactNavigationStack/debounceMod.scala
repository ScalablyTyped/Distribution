package typings.reactNavigationStack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](func: T, duration: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[T]
}
