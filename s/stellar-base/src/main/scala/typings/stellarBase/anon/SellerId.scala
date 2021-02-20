package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SellerId extends StObject {
  
  var offerId: Int64 = js.native
  
  var sellerId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object SellerId {
  
  @scala.inline
  def apply(offerId: Int64, sellerId: typings.stellarBase.xdrMod.xdr.AccountId): SellerId = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], sellerId = sellerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellerId]
  }
  
  @scala.inline
  implicit class SellerIdMutableBuilder[Self <: SellerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferId(value: Int64): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
  }
}
