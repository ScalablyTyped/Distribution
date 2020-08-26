package typings.pulumiAws.getTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayResult extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
    */
  val amazonSideAsn: Double = js.native
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: String = js.native
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: String = js.native
  /**
    * Whether resource attachment requests are automatically accepted.
    */
  val autoAcceptSharedAttachments: String = js.native
  /**
    * Whether resource attachments are automatically associated with the default association route table.
    */
  val defaultRouteTableAssociation: String = js.native
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table.
    */
  val defaultRouteTablePropagation: String = js.native
  /**
    * Description of the EC2 Transit Gateway
    */
  val description: String = js.native
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String = js.native
  val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.native
  /**
    * EC2 Transit Gateway identifier
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: String = js.native
  /**
    * Identifier of the default propagation route table.
    */
  val propagationDefaultRouteTableId: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway
    */
  val tags: StringDictionary[String] = js.native
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled.
    */
  val vpnEcmpSupport: String = js.native
}

object GetTransitGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: Double,
    arn: String,
    associationDefaultRouteTableId: String,
    autoAcceptSharedAttachments: String,
    defaultRouteTableAssociation: String,
    defaultRouteTablePropagation: String,
    description: String,
    dnsSupport: String,
    ownerId: String,
    propagationDefaultRouteTableId: String,
    tags: StringDictionary[String],
    vpnEcmpSupport: String
  ): GetTransitGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associationDefaultRouteTableId = associationDefaultRouteTableId.asInstanceOf[js.Any], autoAcceptSharedAttachments = autoAcceptSharedAttachments.asInstanceOf[js.Any], defaultRouteTableAssociation = defaultRouteTableAssociation.asInstanceOf[js.Any], defaultRouteTablePropagation = defaultRouteTablePropagation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], propagationDefaultRouteTableId = propagationDefaultRouteTableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpnEcmpSupport = vpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayResult]
  }
  @scala.inline
  implicit class GetTransitGatewayResultOps[Self <: GetTransitGatewayResult] (val x: Self) extends AnyVal {
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
    def setAmazonSideAsn(value: Double): Self = this.set("amazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociationDefaultRouteTableId(value: String): Self = this.set("associationDefaultRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoAcceptSharedAttachments(value: String): Self = this.set("autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRouteTableAssociation(value: String): Self = this.set("defaultRouteTableAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRouteTablePropagation(value: String): Self = this.set("defaultRouteTablePropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsSupport(value: String): Self = this.set("dnsSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropagationDefaultRouteTableId(value: String): Self = this.set("propagationDefaultRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpnEcmpSupport(value: String): Self = this.set("vpnEcmpSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetTransitGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetTransitGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

