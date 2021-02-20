package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainClusterConfigZoneAwarenessConfig extends StObject {
  
  /**
    * Number of availability zones used.
    */
  var availabilityZoneCount: Double = js.native
}
object GetDomainClusterConfigZoneAwarenessConfig {
  
  @scala.inline
  def apply(availabilityZoneCount: Double): GetDomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal(availabilityZoneCount = availabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainClusterConfigZoneAwarenessConfig]
  }
  
  @scala.inline
  implicit class GetDomainClusterConfigZoneAwarenessConfigMutableBuilder[Self <: GetDomainClusterConfigZoneAwarenessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZoneCount(value: Double): Self = StObject.set(x, "availabilityZoneCount", value.asInstanceOf[js.Any])
  }
}
