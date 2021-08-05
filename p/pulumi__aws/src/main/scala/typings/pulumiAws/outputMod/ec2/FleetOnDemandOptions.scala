package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetOnDemandOptions extends StObject {
  
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[String] = js.undefined
}
object FleetOnDemandOptions {
  
  inline def apply(): FleetOnDemandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetOnDemandOptions]
  }
  
  extension [Self <: FleetOnDemandOptions](x: Self) {
    
    inline def setAllocationStrategy(value: String): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
  }
}
