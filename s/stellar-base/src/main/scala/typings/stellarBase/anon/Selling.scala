package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selling extends js.Object {
  var buying: Int64 = js.native
  var selling: Int64 = js.native
}

object Selling {
  @scala.inline
  def apply(buying: Int64, selling: Int64): Selling = {
    val __obj = js.Dynamic.literal(buying = buying.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selling]
  }
  @scala.inline
  implicit class SellingOps[Self <: Selling] (val x: Self) extends AnyVal {
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
    def setBuying(value: Int64): Self = this.set("buying", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelling(value: Int64): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
  
}

