package typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2transitgateway.GetTransitGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayResult extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
    */
  val amazonSideAsn: Double
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: String
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: String
  /**
    * Whether resource attachment requests are automatically accepted.
    */
  val autoAcceptSharedAttachments: String
  /**
    * Whether resource attachments are automatically associated with the default association route table.
    */
  val defaultRouteTableAssociation: String
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table.
    */
  val defaultRouteTablePropagation: String
  /**
    * Description of the EC2 Transit Gateway
    */
  val description: String
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String
  val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.undefined
  /**
    * EC2 Transit Gateway identifier
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: String
  /**
    * Identifier of the default propagation route table.
    */
  val propagationDefaultRouteTableId: String
  /**
    * Key-value tags for the EC2 Transit Gateway
    */
  val tags: StringDictionary[js.Any]
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled.
    */
  val vpnEcmpSupport: String
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
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, arn = arn, associationDefaultRouteTableId = associationDefaultRouteTableId, autoAcceptSharedAttachments = autoAcceptSharedAttachments, defaultRouteTableAssociation = defaultRouteTableAssociation, defaultRouteTablePropagation = defaultRouteTablePropagation, description = description, dnsSupport = dnsSupport, ownerId = ownerId, propagationDefaultRouteTableId = propagationDefaultRouteTableId, tags = tags, vpnEcmpSupport = vpnEcmpSupport)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetTransitGatewayResult]
  }
}

