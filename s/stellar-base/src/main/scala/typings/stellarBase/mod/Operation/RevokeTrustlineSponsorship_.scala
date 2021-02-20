package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeTrustlineSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
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
  implicit class RevokeTrustlineSponsorship_MutableBuilder[Self <: RevokeTrustlineSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
  }
}
