package typings.reactFns

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-fns/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(func: js.Function, wait: Double): js.ThisFunction0[/* this */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Any, Unit]]
  inline def debounce(func: js.Function, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ js.Any, Unit]]
  
  inline def isEmptyChildren(children: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def throttle(func: js.Function, wait: Number): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
