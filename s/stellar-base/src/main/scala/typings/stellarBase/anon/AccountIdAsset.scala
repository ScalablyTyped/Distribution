package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountIdAsset extends js.Object {
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  var asset: typings.stellarBase.xdrMod.xdr.Asset = js.native
}

object AccountIdAsset {
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId, asset: typings.stellarBase.xdrMod.xdr.Asset): AccountIdAsset = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdAsset]
  }
  @scala.inline
  implicit class AccountIdAssetOps[Self <: AccountIdAsset] (val x: Self) extends AnyVal {
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
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
  }
  
}

