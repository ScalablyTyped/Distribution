package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceRShorthand extends js.Object {
  var d: Double = js.native
  var n: Double = js.native
}

object PriceRShorthand {
  @scala.inline
  def apply(d: Double, n: Double): PriceRShorthand = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceRShorthand]
  }
  @scala.inline
  implicit class PriceRShorthandOps[Self <: PriceRShorthand] (val x: Self) extends AnyVal {
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
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
  }
  
}

