package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimOfferAtom
import typings.stellarBase.xdrMod.xdr.SimplePaymentResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Last extends StObject {
  
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
  implicit class LastMutableBuilder[Self <: Last] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast(value: SimplePaymentResult): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffers(value: js.Array[ClaimOfferAtom]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersVarargs(value: ClaimOfferAtom*): Self = StObject.set(x, "offers", js.Array(value :_*))
  }
}
