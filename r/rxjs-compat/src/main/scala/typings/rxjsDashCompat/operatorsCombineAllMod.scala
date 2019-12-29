package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/combineAll", JSImport.Namespace)
@js.native
object operatorsCombineAllMod extends js.Object {
  def combineAll[T](): js.Any = js.native
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](): js.Any = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = js.native
}

