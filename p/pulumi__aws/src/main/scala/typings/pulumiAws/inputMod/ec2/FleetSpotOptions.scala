package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetSpotOptions extends StObject {
  
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
    */
  var instanceInterruptionBehavior: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocationStrategy` is set to `lowestPrice`. Default: `1`.
    */
  var instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.undefined
}
object FleetSpotOptions {
  
  inline def apply(): FleetSpotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotOptions]
  }
  
  extension [Self <: FleetSpotOptions](x: Self) {
    
    inline def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: Input[String]): Self = StObject.set(x, "instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "instanceInterruptionBehavior", js.undefined)
    
    inline def setInstancePoolsToUseCount(value: Input[Double]): Self = StObject.set(x, "instancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    inline def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "instancePoolsToUseCount", js.undefined)
  }
}
