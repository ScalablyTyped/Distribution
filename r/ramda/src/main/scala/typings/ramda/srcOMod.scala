package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/o", JSImport.Namespace)
@js.native
object srcOMod extends js.Object {
  def default[T2, R](f: js.Function1[/* x */ T2, R]): Fn_G[T2, R] = js.native
  def default[T1, T2, R](f: js.Function1[/* x */ T2, R], g: js.Function1[/* x */ T1, T2]): js.Function1[/* v */ T1, R] = js.native
  def default[T1, T2, R](f: js.Function1[/* x */ T2, R], g: js.Function1[/* x */ T1, T2], v: T1): R = js.native
}

