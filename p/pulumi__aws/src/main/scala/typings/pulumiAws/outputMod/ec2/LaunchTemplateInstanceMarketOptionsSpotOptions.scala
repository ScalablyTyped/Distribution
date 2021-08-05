package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMarketOptionsSpotOptions extends StObject {
  
  /**
    * The required duration in minutes. This value must be a multiple of 60.
    */
  var blockDurationMinutes: js.UndefOr[Double] = js.undefined
  
  /**
    * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
    * `stop`, or `terminate`. (Default: `terminate`).
    */
  var instanceInterruptionBehavior: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var maxPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The Spot Instance request type. Can be `one-time`, or `persistent`.
    */
  var spotInstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The end date of the request.
    */
  var validUntil: String
}
object LaunchTemplateInstanceMarketOptionsSpotOptions {
  
  inline def apply(validUntil: String): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal(validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
  
  extension [Self <: LaunchTemplateInstanceMarketOptionsSpotOptions](x: Self) {
    
    inline def setBlockDurationMinutes(value: Double): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "blockDurationMinutes", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: String): Self = StObject.set(x, "instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "instanceInterruptionBehavior", js.undefined)
    
    inline def setMaxPrice(value: String): Self = StObject.set(x, "maxPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceUndefined: Self = StObject.set(x, "maxPrice", js.undefined)
    
    inline def setSpotInstanceType(value: String): Self = StObject.set(x, "spotInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceTypeUndefined: Self = StObject.set(x, "spotInstanceType", js.undefined)
    
    inline def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
  }
}
