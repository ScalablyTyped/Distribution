package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmountBought extends js.Object {
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
  implicit class AmountBoughtOps[Self <: AmountBought] (val x: Self) extends AnyVal {
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
    def setAmountBought(value: Int64): Self = this.set("amountBought", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmountSold(value: Int64): Self = this.set("amountSold", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetBought(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("assetBought", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetSold(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("assetSold", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfferId(value: Int64): Self = this.set("offerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSellerId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("sellerId", value.asInstanceOf[js.Any])
  }
  
}

