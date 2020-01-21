package typings.pulumiAws.getNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNatGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNatGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.native
  /**
    * The id of the specific Nat Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The id of subnet that the Nat Gateway resides in.
    */
  val subnetId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Nat Gateway.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The id of the VPC that the Nat Gateway resides in.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetNatGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetNatGatewayFilter] = null,
    id: String = null,
    state: String = null,
    subnetId: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetNatGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNatGatewayArgs]
  }
}

