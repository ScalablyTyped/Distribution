package typings.pulumiAws.firewallMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallArgs extends js.Object {
  
  /**
    * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
    */
  val deleteProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A friendly description of the firewall.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the VPC Firewall policy.
    */
  val firewallPolicyArn: Input[String] = js.native
  
  /**
    * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
    */
  val firewallPolicyChangeProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A friendly name of the firewall.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
    */
  val subnetChangeProtection: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
    */
  val subnetMappings: Input[js.Array[Input[FirewallSubnetMapping]]] = js.native
  
  /**
    * The key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
    */
  val vpcId: Input[String] = js.native
}
object FirewallArgs {
  
  @scala.inline
  def apply(
    firewallPolicyArn: Input[String],
    subnetMappings: Input[js.Array[Input[FirewallSubnetMapping]]],
    vpcId: Input[String]
  ): FirewallArgs = {
    val __obj = js.Dynamic.literal(firewallPolicyArn = firewallPolicyArn.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallArgs]
  }
  
  @scala.inline
  implicit class FirewallArgsOps[Self <: FirewallArgs] (val x: Self) extends AnyVal {
    
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
    def setFirewallPolicyArn(value: Input[String]): Self = this.set("firewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMappingsVarargs(value: Input[FirewallSubnetMapping]*): Self = this.set("subnetMappings", js.Array(value :_*))
    
    @scala.inline
    def setSubnetMappings(value: Input[js.Array[Input[FirewallSubnetMapping]]]): Self = this.set("subnetMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtection(value: Input[Boolean]): Self = this.set("deleteProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteProtection: Self = this.set("deleteProtection", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFirewallPolicyChangeProtection(value: Input[Boolean]): Self = this.set("firewallPolicyChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallPolicyChangeProtection: Self = this.set("firewallPolicyChangeProtection", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubnetChangeProtection(value: Input[Boolean]): Self = this.set("subnetChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetChangeProtection: Self = this.set("subnetChangeProtection", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
