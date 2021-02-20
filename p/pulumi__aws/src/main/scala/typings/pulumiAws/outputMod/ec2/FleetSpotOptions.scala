package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetSpotOptions extends StObject {
  
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[String] = js.native
  
  /**
    * Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
    */
  var instanceInterruptionBehavior: js.UndefOr[String] = js.native
  
  /**
    * Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocationStrategy` is set to `lowestPrice`. Default: `1`.
    */
  var instancePoolsToUseCount: js.UndefOr[Double] = js.native
}
object FleetSpotOptions {
  
  @scala.inline
  def apply(): FleetSpotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotOptions]
  }
  
  @scala.inline
  implicit class FleetSpotOptionsMutableBuilder[Self <: FleetSpotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: String): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: String): Self = StObject.set(x, "instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "instanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setInstancePoolsToUseCount(value: Double): Self = StObject.set(x, "instancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "instancePoolsToUseCount", js.undefined)
  }
}
