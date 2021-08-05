package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainClusterConfigZoneAwarenessConfig extends StObject {
  
  /**
    * Number of Availability Zones for the domain to use with `zoneAwarenessEnabled`. Defaults to `2`. Valid values: `2` or `3`.
    */
  var availabilityZoneCount: js.UndefOr[Double] = js.undefined
}
object DomainClusterConfigZoneAwarenessConfig {
  
  inline def apply(): DomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfigZoneAwarenessConfig]
  }
  
  extension [Self <: DomainClusterConfigZoneAwarenessConfig](x: Self) {
    
    inline def setAvailabilityZoneCount(value: Double): Self = StObject.set(x, "availabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "availabilityZoneCount", js.undefined)
  }
}
