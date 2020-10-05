package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operators/combineAll", JSImport.Namespace)
@js.native
object combineAllMod extends js.Object {
  def combineAll[T](): js.Any = js.native
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = js.native
}

