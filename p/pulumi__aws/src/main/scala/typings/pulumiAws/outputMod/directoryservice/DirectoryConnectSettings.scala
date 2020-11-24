package typings.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryConnectSettings extends js.Object {
  
  var availabilityZones: js.Array[String] = js.native
  
  /**
    * The IP addresses of the AD Connector servers.
    */
  var connectIps: js.Array[String] = js.native
  
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: js.Array[String] = js.native
  
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: String = js.native
  
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String = js.native
}
object DirectoryConnectSettings {
  
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    connectIps: js.Array[String],
    customerDnsIps: js.Array[String],
    customerUsername: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], connectIps = connectIps.asInstanceOf[js.Any], customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
  
  @scala.inline
  implicit class DirectoryConnectSettingsOps[Self <: DirectoryConnectSettings] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectIpsVarargs(value: String*): Self = this.set("connectIps", js.Array(value :_*))
    
    @scala.inline
    def setConnectIps(value: js.Array[String]): Self = this.set("connectIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerDnsIpsVarargs(value: String*): Self = this.set("customerDnsIps", js.Array(value :_*))
    
    @scala.inline
    def setCustomerDnsIps(value: js.Array[String]): Self = this.set("customerDnsIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUsername(value: String): Self = this.set("customerUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
}
