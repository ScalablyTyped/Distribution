package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimOfferAtom
import typings.stellarBase.xdrMod.xdr.ManageOfferSuccessResultOffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offer extends StObject {
  
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
  implicit class OfferMutableBuilder[Self <: Offer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffer(value: ManageOfferSuccessResultOffer): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersClaimed(value: js.Array[ClaimOfferAtom]): Self = StObject.set(x, "offersClaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersClaimedVarargs(value: ClaimOfferAtom*): Self = StObject.set(x, "offersClaimed", js.Array(value :_*))
  }
}
