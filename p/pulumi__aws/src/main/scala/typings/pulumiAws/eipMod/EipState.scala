package typings.pulumiAws.eipMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EipState extends js.Object {
  
  val allocationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[Input[String]] = js.native
  
  val associationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Customer owned IP.
    */
  val customerOwnedIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
    */
  val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[Input[String]] = js.native
  
  /**
    * The location from which the IP address is advertised. Use this parameter to limit the address to this location.
    */
  val networkBorderGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Private DNS associated with the Elastic IP address (if in VPC).
    */
  val privateDns: js.UndefOr[Input[String]] = js.native
  
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: js.UndefOr[Input[String]] = js.native
  
  /**
    * Contains the public IP address.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[Input[Boolean]] = js.native
}
object EipState {
  
  @scala.inline
  def apply(): EipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EipState]
  }
  
  @scala.inline
  implicit class EipStateOps[Self <: EipState] (val x: Self) extends AnyVal {
    
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
    def setAllocationId(value: Input[String]): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("allocationId", js.undefined)
    
    @scala.inline
    def setAssociateWithPrivateIp(value: Input[String]): Self = this.set("associateWithPrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociateWithPrivateIp: Self = this.set("associateWithPrivateIp", js.undefined)
    
    @scala.inline
    def setAssociationId(value: Input[String]): Self = this.set("associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIp(value: Input[String]): Self = this.set("customerOwnedIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOwnedIp: Self = this.set("customerOwnedIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: Input[String]): Self = this.set("customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOwnedIpv4Pool: Self = this.set("customerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setInstance(value: Input[String]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: Input[String]): Self = this.set("networkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("networkBorderGroup", js.undefined)
    
    @scala.inline
    def setNetworkInterface(value: Input[String]): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterface: Self = this.set("networkInterface", js.undefined)
    
    @scala.inline
    def setPrivateDns(value: Input[String]): Self = this.set("privateDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDns: Self = this.set("privateDns", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: Input[String]): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    
    @scala.inline
    def setPublicDns(value: Input[String]): Self = this.set("publicDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDns: Self = this.set("publicDns", js.undefined)
    
    @scala.inline
    def setPublicIp(value: Input[String]): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pool(value: Input[String]): Self = this.set("publicIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpv4Pool: Self = this.set("publicIpv4Pool", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpc(value: Input[Boolean]): Self = this.set("vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
}
