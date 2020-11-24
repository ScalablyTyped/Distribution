package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.Claimant
import typings.stellarBase.mod.OperationType.CreateClaimableBalance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalance_ extends BaseOperation[CreateClaimableBalance] {
  
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
  implicit class CreateClaimableBalance_Ops[Self <: CreateClaimableBalance_] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantsVarargs(value: Claimant*): Self = this.set("claimants", js.Array(value :_*))
    
    @scala.inline
    def setClaimants(value: js.Array[Claimant]): Self = this.set("claimants", value.asInstanceOf[js.Any])
  }
}
