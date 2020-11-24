package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.RevokeSponsorship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeTrustlineSponsorship_ extends BaseOperation[RevokeSponsorship] {
  
  var account: String = js.native
  
  var asset: Asset = js.native
}
object RevokeTrustlineSponsorship_ {
  
  @scala.inline
  def apply(account: String, asset: Asset, `type`: RevokeSponsorship): RevokeTrustlineSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeTrustlineSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeTrustlineSponsorship_Ops[Self <: RevokeTrustlineSponsorship_] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
  }
}
