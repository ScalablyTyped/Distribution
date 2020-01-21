package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/zipAll", JSImport.Namespace)
@js.native
object zipAllMod extends js.Object {
  def zipAll[T](): js.Any = js.native
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](): js.Any = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = js.native
}

