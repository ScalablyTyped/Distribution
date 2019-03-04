package typings
package atPulumiAwsLib.ec2transitgatewayGetRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableResult extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway
    */
  val defaultAssociationRouteTable: scala.Boolean
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
    */
  val defaultPropagationRouteTable: scala.Boolean
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: java.lang.String
}

object GetRouteTableResult {
  @scala.inline
  def apply(
    defaultAssociationRouteTable: scala.Boolean,
    defaultPropagationRouteTable: scala.Boolean,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    transitGatewayId: java.lang.String
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(defaultAssociationRouteTable = defaultAssociationRouteTable, defaultPropagationRouteTable = defaultPropagationRouteTable, tags = tags, transitGatewayId = transitGatewayId)
  
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

