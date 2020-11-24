package typings.pulumiAws.hostedTransitVirtualInterfaceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedTransitVirtualInterfaceState extends js.Object {
  
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.native
  
  val amazonSideAsn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether jumbo frames (8500 MTU) are supported.
    */
  val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual transit interface can be either `1500` or `8500` (jumbo frames). Default is `1500`.
    */
  val mtu: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The VLAN ID.
    */
  val vlan: js.UndefOr[Input[Double]] = js.native
}
object HostedTransitVirtualInterfaceState {
  
  @scala.inline
  def apply(): HostedTransitVirtualInterfaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedTransitVirtualInterfaceState]
  }
  
  @scala.inline
  implicit class HostedTransitVirtualInterfaceStateOps[Self <: HostedTransitVirtualInterfaceState] (val x: Self) extends AnyVal {
    
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
    def setAddressFamily(value: Input[String]): Self = this.set("addressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressFamily: Self = this.set("addressFamily", js.undefined)
    
    @scala.inline
    def setAmazonAddress(value: Input[String]): Self = this.set("amazonAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonAddress: Self = this.set("amazonAddress", js.undefined)
    
    @scala.inline
    def setAmazonSideAsn(value: Input[String]): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAwsDevice(value: Input[String]): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    
    @scala.inline
    def setBgpAsn(value: Input[Double]): Self = this.set("bgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpAsn: Self = this.set("bgpAsn", js.undefined)
    
    @scala.inline
    def setBgpAuthKey(value: Input[String]): Self = this.set("bgpAuthKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpAuthKey: Self = this.set("bgpAuthKey", js.undefined)
    
    @scala.inline
    def setConnectionId(value: Input[String]): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: Input[String]): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    
    @scala.inline
    def setJumboFrameCapable(value: Input[Boolean]): Self = this.set("jumboFrameCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumboFrameCapable: Self = this.set("jumboFrameCapable", js.undefined)
    
    @scala.inline
    def setMtu(value: Input[Double]): Self = this.set("mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtu: Self = this.set("mtu", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: Input[String]): Self = this.set("ownerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccountId: Self = this.set("ownerAccountId", js.undefined)
    
    @scala.inline
    def setVlan(value: Input[Double]): Self = this.set("vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVlan: Self = this.set("vlan", js.undefined)
  }
}
