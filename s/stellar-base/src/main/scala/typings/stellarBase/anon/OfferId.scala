package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferId extends js.Object {
  var offerId: Int64 = js.native
  var sellerId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}

object OfferId {
  @scala.inline
  def apply(offerId: Int64, sellerId: typings.stellarBase.xdrMod.xdr.AccountId): OfferId = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], sellerId = sellerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferId]
  }
  @scala.inline
  implicit class OfferIdOps[Self <: OfferId] (val x: Self) extends AnyVal {
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
    def setOfferId(value: Int64): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSellerId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("sellerId", value.asInstanceOf[js.Any])
  }
  
}

