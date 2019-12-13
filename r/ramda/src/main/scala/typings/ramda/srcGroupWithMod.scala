package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/groupWith", JSImport.Namespace)
@js.native
object srcGroupWithMod extends js.Object {
  def default[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[js.Array[T]]] = js.native
  def default[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean], list: String): js.Array[String] = js.native
  def default[T](fn: js.Function2[/* x */ T, /* y */ T, Boolean], list: js.Array[T]): js.Array[js.Array[T]] = js.native
}

