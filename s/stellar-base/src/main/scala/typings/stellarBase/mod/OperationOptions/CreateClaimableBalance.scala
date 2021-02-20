package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.Claimant
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalance
  extends BaseOptions
     with _OperationOptions {
  
  var amount: String = js.native
  
  var asset: Asset = js.native
  
  var claimants: js.Array[Claimant] = js.native
}
object CreateClaimableBalance {
  
  @scala.inline
  def apply(amount: String, asset: Asset, claimants: js.Array[Claimant]): CreateClaimableBalance = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClaimableBalance]
  }
  
  @scala.inline
  implicit class CreateClaimableBalanceMutableBuilder[Self <: CreateClaimableBalance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimants(value: js.Array[Claimant]): Self = StObject.set(x, "claimants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantsVarargs(value: Claimant*): Self = StObject.set(x, "claimants", js.Array(value :_*))
  }
}
