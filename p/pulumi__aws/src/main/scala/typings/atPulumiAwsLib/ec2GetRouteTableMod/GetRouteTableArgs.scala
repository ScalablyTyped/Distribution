package typings
package atPulumiAwsLib.ec2GetRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The id of the specific Route Table to retrieve.
    */
  val routeTableId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of a Subnet which is connected to the Route Table (not be exported if not given in parameter).
    */
  val subnetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Route Table.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the desired Route Table belongs to.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

object GetRouteTableArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    routeTableId: java.lang.String = null,
    subnetId: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    vpcId: java.lang.String = null
  ): GetRouteTableArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (routeTableId != null) __obj.updateDynamic("routeTableId")(routeTableId)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetRouteTableArgs]
  }
}

