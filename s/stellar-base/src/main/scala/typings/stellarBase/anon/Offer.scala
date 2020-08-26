package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimOfferAtom
import typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offer extends js.Object {
  var offer: ManageOfferSuccessResultOffer = js.native
  var offersClaimed: js.Array[ClaimOfferAtom] = js.native
}

object Offer {
  @scala.inline
  def apply(offer: ManageOfferSuccessResultOffer, offersClaimed: js.Array[ClaimOfferAtom]): Offer = {
    val __obj = js.Dynamic.literal(offer = offer.asInstanceOf[js.Any], offersClaimed = offersClaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offer]
  }
  @scala.inline
  implicit class OfferOps[Self <: Offer] (val x: Self) extends AnyVal {
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
    def setOffer(value: ManageOfferSuccessResultOffer): Self = this.set("offer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffersClaimedVarargs(value: ClaimOfferAtom*): Self = this.set("offersClaimed", js.Array(value :_*))
    @scala.inline
    def setOffersClaimed(value: js.Array[ClaimOfferAtom]): Self = this.set("offersClaimed", value.asInstanceOf[js.Any])
  }
  
}

