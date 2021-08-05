package typings.reactClickOutsideHook

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-click-outside-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useClickOutside(): HookReturnTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("useClickOutside")().asInstanceOf[HookReturnTuple]
  
  type HookReturnTuple = js.Tuple2[js.Function1[/* node */ js.UndefOr[Element | Null], Unit], Boolean]
}
