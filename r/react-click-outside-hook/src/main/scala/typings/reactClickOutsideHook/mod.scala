package typings.reactClickOutsideHook

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-click-outside-hook", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useClickOutside(): HookReturnTuple = js.native
  
  type HookReturnTuple = js.Tuple2[js.Function1[/* node */ js.UndefOr[Element | Null], Unit], Boolean]
}
