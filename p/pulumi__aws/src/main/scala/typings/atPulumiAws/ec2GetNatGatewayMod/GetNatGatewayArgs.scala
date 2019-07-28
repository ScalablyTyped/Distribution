package typings.atPulumiAws.ec2GetNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNatGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The id of the specific Nat Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
    */
  val state: js.UndefOr[String] = js.undefined
  /**
    * The id of subnet that the Nat Gateway resides in.
    */
  val subnetId: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Nat Gateway.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the Nat Gateway resides in.
    */
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetNatGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[Anon_NameValues] = null,
    id: String = null,
    state: String = null,
    subnetId: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetNatGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetNatGatewayArgs]
  }
}

