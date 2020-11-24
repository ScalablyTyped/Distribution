package typings.pulumiAws.transitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayArgs extends js.Object {
  
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
    */
  val amazonSideAsn: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val autoAcceptSharedAttachments: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTableAssociation: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTablePropagation: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the EC2 Transit Gateway.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val vpnEcmpSupport: js.UndefOr[Input[String]] = js.native
}
object TransitGatewayArgs {
  
  @scala.inline
  def apply(): TransitGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayArgs]
  }
  
  @scala.inline
  implicit class TransitGatewayArgsOps[Self <: TransitGatewayArgs] (val x: Self) extends AnyVal {
    
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
    def setAmazonSideAsn(value: Input[Double]): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("amazonSideAsn", js.undefined)
    
    @scala.inline
    def setAutoAcceptSharedAttachments(value: Input[String]): Self = this.set("autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAcceptSharedAttachments: Self = this.set("autoAcceptSharedAttachments", js.undefined)
    
    @scala.inline
    def setDefaultRouteTableAssociation(value: Input[String]): Self = this.set("defaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteTableAssociation: Self = this.set("defaultRouteTableAssociation", js.undefined)
    
    @scala.inline
    def setDefaultRouteTablePropagation(value: Input[String]): Self = this.set("defaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteTablePropagation: Self = this.set("defaultRouteTablePropagation", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDnsSupport(value: Input[String]): Self = this.set("dnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSupport: Self = this.set("dnsSupport", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpnEcmpSupport(value: Input[String]): Self = this.set("vpnEcmpSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnEcmpSupport: Self = this.set("vpnEcmpSupport", js.undefined)
  }
}
