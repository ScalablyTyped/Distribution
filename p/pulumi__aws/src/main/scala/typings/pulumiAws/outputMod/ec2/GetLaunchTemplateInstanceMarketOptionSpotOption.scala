package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateInstanceMarketOptionSpotOption extends StObject {
  
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
  implicit class GetLaunchTemplateInstanceMarketOptionSpotOptionMutableBuilder[Self <: GetLaunchTemplateInstanceMarketOptionSpotOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDurationMinutes(value: Double): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: String): Self = StObject.set(x, "instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPrice(value: String): Self = StObject.set(x, "maxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceType(value: String): Self = StObject.set(x, "spotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
  }
}
