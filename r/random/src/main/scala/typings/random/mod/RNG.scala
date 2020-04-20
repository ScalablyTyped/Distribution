package typings.random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNG extends js.Object {
  var name: String
  def clone(seed: Double, opts: js.Object): RNG
  def next(): Double
  def seed(seed: Double, opts: js.Object): Unit
}

object RNG {
  @scala.inline
  def apply(
    clone: (Double, js.Object) => RNG,
    name: String,
    next: () => Double,
    seed: (Double, js.Object) => Unit
  ): RNG = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction2(clone), name = name.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), seed = js.Any.fromFunction2(seed))
    __obj.asInstanceOf[RNG]
  }
}

