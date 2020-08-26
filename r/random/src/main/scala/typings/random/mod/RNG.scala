package typings.random.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNG extends js.Object {
  var name: String = js.native
  def clone(seed: Double, opts: js.Object): RNG = js.native
  def next(): Double = js.native
  def seed(seed: Double, opts: js.Object): Unit = js.native
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
  @scala.inline
  implicit class RNGOps[Self <: RNG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: (Double, js.Object) => RNG): Self = this.set("clone", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: () => Double): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setSeed(value: (Double, js.Object) => Unit): Self = this.set("seed", js.Any.fromFunction2(value))
  }
  
}

