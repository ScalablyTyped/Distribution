package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountBought extends StObject {
  
  var amountBought: Int64 = js.native
  
  var amountSold: Int64 = js.native
  
  var assetBought: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var assetSold: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var offerId: Int64 = js.native
  
  var sellerId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AmountBought {
  
  @scala.inline
  def apply(
    amountBought: Int64,
    amountSold: Int64,
    assetBought: typings.stellarBase.xdrMod.xdr.Asset,
    assetSold: typings.stellarBase.xdrMod.xdr.Asset,
    offerId: Int64,
    sellerId: typings.stellarBase.xdrMod.xdr.AccountId
  ): AmountBought = {
    val __obj = js.Dynamic.literal(amountBought = amountBought.asInstanceOf[js.Any], amountSold = amountSold.asInstanceOf[js.Any], assetBought = assetBought.asInstanceOf[js.Any], assetSold = assetSold.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], sellerId = sellerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountBought]
  }
  
  @scala.inline
  implicit class AmountBoughtMutableBuilder[Self <: AmountBought] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountBought(value: Int64): Self = StObject.set(x, "amountBought", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountSold(value: Int64): Self = StObject.set(x, "amountSold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetBought(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "assetBought", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetSold(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "assetSold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Int64): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "sellerId", value.asInstanceOf[js.Any])
  }
}
