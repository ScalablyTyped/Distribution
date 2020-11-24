package typings.rcTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tabs/es/hooks/useRaf", JSImport.Namespace)
@js.native
object useRafMod extends js.Object {
  
  def default[Callback /* <: js.Function */](callback: Callback): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  def useRafState[T](defaultState: T): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = js.native
  def useRafState[T](defaultState: js.Function0[T]): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = js.native
  
  type Callback[T] = js.Function1[/* ori */ T, T]
}
