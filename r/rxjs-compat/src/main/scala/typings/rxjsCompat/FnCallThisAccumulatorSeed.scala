package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisAccumulatorSeed extends js.Object {
  def apply[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any = js.native
  def apply[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any = js.native
}

