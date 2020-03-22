package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallGV[T2, R] extends js.Object {
  def apply[T1](g: js.Function1[/* x */ T1, T2]): js.Function1[/* v */ T1, R] = js.native
  def apply[T1](g: js.Function1[/* x */ T1, T2], v: T1): R = js.native
}

