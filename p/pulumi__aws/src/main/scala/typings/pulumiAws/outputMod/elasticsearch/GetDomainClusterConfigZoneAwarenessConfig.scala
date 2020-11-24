package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainClusterConfigZoneAwarenessConfig extends js.Object {
  
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
  implicit class GetDomainClusterConfigZoneAwarenessConfigOps[Self <: GetDomainClusterConfigZoneAwarenessConfig] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZoneCount(value: Double): Self = this.set("availabilityZoneCount", value.asInstanceOf[js.Any])
  }
}
