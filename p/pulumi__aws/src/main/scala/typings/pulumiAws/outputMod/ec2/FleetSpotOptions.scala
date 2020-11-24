package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetSpotOptions extends js.Object {
  
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
  implicit class FleetSpotOptionsOps[Self <: FleetSpotOptions] (val x: Self) extends AnyVal {
    
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
    def setAllocationStrategy(value: String): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("allocationStrategy", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: String): Self = this.set("instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("instanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setInstancePoolsToUseCount(value: Double): Self = this.set("instancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePoolsToUseCount: Self = this.set("instancePoolsToUseCount", js.undefined)
  }
}
