package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimOfferAtom
import typings.stellarBase.xdrMod.xdr.SimplePaymentResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Last extends js.Object {
  
  var last: SimplePaymentResult = js.native
  
  var offers: js.Array[ClaimOfferAtom] = js.native
}
object Last {
  
  @scala.inline
  def apply(last: SimplePaymentResult, offers: js.Array[ClaimOfferAtom]): Last = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], offers = offers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Last]
  }
  
  @scala.inline
  implicit class LastOps[Self <: Last] (val x: Self) extends AnyVal {
    
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
    def setLast(value: SimplePaymentResult): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersVarargs(value: ClaimOfferAtom*): Self = this.set("offers", js.Array(value :_*))
    
    @scala.inline
    def setOffers(value: js.Array[ClaimOfferAtom]): Self = this.set("offers", value.asInstanceOf[js.Any])
  }
}
