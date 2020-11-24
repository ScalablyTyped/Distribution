package typings.reactFns

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def debounce(func: js.Function, wait: Double): js.ThisFunction0[/* this */ js.Any, Unit] = js.native
  def debounce(func: js.Function, wait: Double, immediate: Boolean): js.ThisFunction0[/* this */ js.Any, Unit] = js.native
  
  def isEmptyChildren(children: js.Any): Boolean = js.native
  
  def throttle(func: js.Function, wait: Number): js.Function0[Unit] = js.native
}
