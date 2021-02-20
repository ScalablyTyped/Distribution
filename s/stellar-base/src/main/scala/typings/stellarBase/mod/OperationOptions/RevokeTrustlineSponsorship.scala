package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeTrustlineSponsorship
  extends BaseOptions
     with _OperationOptions {
  
  var account: String = js.native
  
  var asset: Asset = js.native
}
object RevokeTrustlineSponsorship {
  
  @scala.inline
  def apply(account: String, asset: Asset): RevokeTrustlineSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeTrustlineSponsorship]
  }
  
  @scala.inline
  implicit class RevokeTrustlineSponsorshipMutableBuilder[Self <: RevokeTrustlineSponsorship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
  }
}
