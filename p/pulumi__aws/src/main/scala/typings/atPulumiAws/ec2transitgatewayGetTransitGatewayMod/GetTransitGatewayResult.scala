package typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2transitgateway.GetTransitGatewayFilter
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
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    vpnEcmpSupport: String,
    filters: js.Array[GetTransitGatewayFilter] = null,
    id: String = null
  ): GetTransitGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associationDefaultRouteTableId = associationDefaultRouteTableId.asInstanceOf[js.Any], autoAcceptSharedAttachments = autoAcceptSharedAttachments.asInstanceOf[js.Any], defaultRouteTableAssociation = defaultRouteTableAssociation.asInstanceOf[js.Any], defaultRouteTablePropagation = defaultRouteTablePropagation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], propagationDefaultRouteTableId = propagationDefaultRouteTableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpnEcmpSupport = vpnEcmpSupport.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayResult]
  }
}

