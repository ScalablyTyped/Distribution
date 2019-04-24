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
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * EC2 Transit Gateway Route Table identifier
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
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
    transitGatewayId: java.lang.String,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(defaultAssociationRouteTable = defaultAssociationRouteTable, defaultPropagationRouteTable = defaultPropagationRouteTable, tags = tags, transitGatewayId = transitGatewayId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

