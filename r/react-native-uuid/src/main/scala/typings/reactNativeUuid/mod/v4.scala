package typings.reactNativeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v4 extends js.Object {
  var random: js.UndefOr[js.Array[Double]] = js.native
  var rng: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
}

object v4 {
  @scala.inline
  def apply(): v4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[v4]
  }
  @scala.inline
  implicit class v4Ops[Self <: v4] (val x: Self) extends AnyVal {
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
    def setRandomVarargs(value: Double*): Self = this.set("random", js.Array(value :_*))
    @scala.inline
    def setRandom(value: js.Array[Double]): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setRng(value: /* args */ js.Any => Unit): Self = this.set("rng", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRng: Self = this.set("rng", js.undefined)
  }
  
}

