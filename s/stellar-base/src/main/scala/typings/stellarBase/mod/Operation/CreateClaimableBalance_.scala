package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.Claimant
import typings.stellarBase.mod.OperationType.CreateClaimableBalance
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalance_
  extends BaseOperation[CreateClaimableBalance]
     with _Operation {
  
  var amount: String = js.native
  
  var asset: Asset = js.native
  
  var claimants: js.Array[Claimant] = js.native
}
object CreateClaimableBalance_ {
  
  @scala.inline
  def apply(amount: String, asset: Asset, claimants: js.Array[Claimant], `type`: CreateClaimableBalance): CreateClaimableBalance_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClaimableBalance_]
  }
  
  @scala.inline
  implicit class CreateClaimableBalance_MutableBuilder[Self <: CreateClaimableBalance_] (val x: Self) extends AnyVal {
    
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
