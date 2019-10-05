package typings.atPulumiAws.ec2transitgatewayGetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2transitgateway.GetRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableResult extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway
    */
  val defaultAssociationRouteTable: Boolean
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
    */
  val defaultPropagationRouteTable: Boolean
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.undefined
  /**
    * EC2 Transit Gateway Route Table identifier
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table
    */
  val tags: StringDictionary[js.Any]
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String
}

object GetRouteTableResult {
  @scala.inline
  def apply(
    defaultAssociationRouteTable: Boolean,
    defaultPropagationRouteTable: Boolean,
    tags: StringDictionary[js.Any],
    transitGatewayId: String,
    filters: js.Array[GetRouteTableFilter] = null,
    id: String = null
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(defaultAssociationRouteTable = defaultAssociationRouteTable, defaultPropagationRouteTable = defaultPropagationRouteTable, tags = tags, transitGatewayId = transitGatewayId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

