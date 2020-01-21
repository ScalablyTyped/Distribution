package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/uniqWith", JSImport.Namespace)
@js.native
object uniqWithMod extends js.Object {
  def default[T, U](pred: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T, U](pred: js.Function2[/* x */ T, /* y */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
}

