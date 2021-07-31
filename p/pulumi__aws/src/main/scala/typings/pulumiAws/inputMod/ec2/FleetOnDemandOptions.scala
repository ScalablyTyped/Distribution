package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetOnDemandOptions extends StObject {
  
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[Input[String]] = js.undefined
}
object FleetOnDemandOptions {
  
  @scala.inline
  def apply(): FleetOnDemandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetOnDemandOptions]
  }
  
  @scala.inline
  implicit class FleetOnDemandOptionsMutableBuilder[Self <: FleetOnDemandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
  }
}
