package typings.pulumiAws.getRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2transitgateway.GetRouteTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableResult extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway
    */
  val defaultAssociationRouteTable: Boolean = js.native
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway
    */
  val defaultPropagationRouteTable: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  /**
    * EC2 Transit Gateway Route Table identifier
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String = js.native
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
    val __obj = js.Dynamic.literal(defaultAssociationRouteTable = defaultAssociationRouteTable.asInstanceOf[js.Any], defaultPropagationRouteTable = defaultPropagationRouteTable.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableResult]
  }
}

