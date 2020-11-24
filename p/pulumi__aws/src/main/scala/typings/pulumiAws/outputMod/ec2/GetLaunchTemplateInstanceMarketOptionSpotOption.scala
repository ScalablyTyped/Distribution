package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateInstanceMarketOptionSpotOption extends js.Object {
  
  var blockDurationMinutes: Double = js.native
  
  var instanceInterruptionBehavior: String = js.native
  
  var maxPrice: String = js.native
  
  var spotInstanceType: String = js.native
  
  var validUntil: String = js.native
}
object GetLaunchTemplateInstanceMarketOptionSpotOption {
  
  @scala.inline
  def apply(
    blockDurationMinutes: Double,
    instanceInterruptionBehavior: String,
    maxPrice: String,
    spotInstanceType: String,
    validUntil: String
  ): GetLaunchTemplateInstanceMarketOptionSpotOption = {
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes.asInstanceOf[js.Any], instanceInterruptionBehavior = instanceInterruptionBehavior.asInstanceOf[js.Any], maxPrice = maxPrice.asInstanceOf[js.Any], spotInstanceType = spotInstanceType.asInstanceOf[js.Any], validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOptionSpotOption]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateInstanceMarketOptionSpotOptionOps[Self <: GetLaunchTemplateInstanceMarketOptionSpotOption] (val x: Self) extends AnyVal {
    
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
    def setBlockDurationMinutes(value: Double): Self = this.set("blockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: String): Self = this.set("instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPrice(value: String): Self = this.set("maxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceType(value: String): Self = this.set("spotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntil(value: String): Self = this.set("validUntil", value.asInstanceOf[js.Any])
  }
}
