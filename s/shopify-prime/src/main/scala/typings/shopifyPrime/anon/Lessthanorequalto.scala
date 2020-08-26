package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lessthanorequalto extends js.Object {
  var less_than_or_equal_to: Double = js.native
}

object Lessthanorequalto {
  @scala.inline
  def apply(less_than_or_equal_to: Double): Lessthanorequalto = {
    val __obj = js.Dynamic.literal(less_than_or_equal_to = less_than_or_equal_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lessthanorequalto]
  }
  @scala.inline
  implicit class LessthanorequaltoOps[Self <: Lessthanorequalto] (val x: Self) extends AnyVal {
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
    def setLess_than_or_equal_to(value: Double): Self = this.set("less_than_or_equal_to", value.asInstanceOf[js.Any])
  }
  
}

