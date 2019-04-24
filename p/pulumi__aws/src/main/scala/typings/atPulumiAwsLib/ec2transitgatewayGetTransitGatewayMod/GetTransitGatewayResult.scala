package typings
package atPulumiAwsLib.ec2transitgatewayGetTransitGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayResult extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
    */
  val amazonSideAsn: scala.Double
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: java.lang.String
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: java.lang.String
  /**
    * Whether resource attachment requests are automatically accepted.
    */
  val autoAcceptSharedAttachments: java.lang.String
  /**
    * Whether resource attachments are automatically associated with the default association route table.
    */
  val defaultRouteTableAssociation: java.lang.String
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table.
    */
  val defaultRouteTablePropagation: java.lang.String
  /**
    * Description of the EC2 Transit Gateway
    */
  val description: java.lang.String
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: java.lang.String
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * EC2 Transit Gateway identifier
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: java.lang.String
  /**
    * Identifier of the default propagation route table.
    */
  val propagationDefaultRouteTableId: java.lang.String
  /**
    * Key-value tags for the EC2 Transit Gateway
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled.
    */
  val vpnEcmpSupport: java.lang.String
}

object GetTransitGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: scala.Double,
    arn: java.lang.String,
    associationDefaultRouteTableId: java.lang.String,
    autoAcceptSharedAttachments: java.lang.String,
    defaultRouteTableAssociation: java.lang.String,
    defaultRouteTablePropagation: java.lang.String,
    description: java.lang.String,
    dnsSupport: java.lang.String,
    ownerId: java.lang.String,
    propagationDefaultRouteTableId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpnEcmpSupport: java.lang.String,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null
  ): GetTransitGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, arn = arn, associationDefaultRouteTableId = associationDefaultRouteTableId, autoAcceptSharedAttachments = autoAcceptSharedAttachments, defaultRouteTableAssociation = defaultRouteTableAssociation, defaultRouteTablePropagation = defaultRouteTablePropagation, description = description, dnsSupport = dnsSupport, ownerId = ownerId, propagationDefaultRouteTableId = propagationDefaultRouteTableId, tags = tags, vpnEcmpSupport = vpnEcmpSupport)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetTransitGatewayResult]
  }
}

