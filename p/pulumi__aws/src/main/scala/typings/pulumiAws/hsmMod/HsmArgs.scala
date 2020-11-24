package typings.pulumiAws.hsmMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HsmArgs extends js.Object {
  
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: Input[String] = js.native
  
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}
object HsmArgs {
  
  @scala.inline
  def apply(clusterId: Input[String]): HsmArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsmArgs]
  }
  
  @scala.inline
  implicit class HsmArgsOps[Self <: HsmArgs] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: Input[String]): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
}
