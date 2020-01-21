package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/splitWhen", JSImport.Namespace)
@js.native
object splitWhenMod extends js.Object {
  def default[T](pred: js.Function1[/* val */ T, Boolean]): js.Function1[/* list */ js.Array[_], js.Array[js.Array[_]]] = js.native
  def default[T, U](pred: js.Function1[/* val */ T, Boolean], list: js.Array[U]): js.Array[js.Array[U]] = js.native
}

