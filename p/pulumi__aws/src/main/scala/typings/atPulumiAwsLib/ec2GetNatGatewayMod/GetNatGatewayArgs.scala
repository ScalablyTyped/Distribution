package typings
package atPulumiAwsLib.ec2GetNatGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNatGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The id of the specific Nat Gateway to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of subnet that the Nat Gateway resides in.
    */
  val subnetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Nat Gateway.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the Nat Gateway resides in.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

object GetNatGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null,
    state: java.lang.String = null,
    subnetId: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    vpcId: java.lang.String = null
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

