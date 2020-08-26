package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyEnum extends js.Object {
  var attention: Double = js.native
  var entropy: Double = js.native
}

object StrategyEnum {
  @scala.inline
  def apply(attention: Double, entropy: Double): StrategyEnum = {
    val __obj = js.Dynamic.literal(attention = attention.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyEnum]
  }
  @scala.inline
  implicit class StrategyEnumOps[Self <: StrategyEnum] (val x: Self) extends AnyVal {
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
    def setAttention(value: Double): Self = this.set("attention", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntropy(value: Double): Self = this.set("entropy", value.asInstanceOf[js.Any])
  }
  
}

