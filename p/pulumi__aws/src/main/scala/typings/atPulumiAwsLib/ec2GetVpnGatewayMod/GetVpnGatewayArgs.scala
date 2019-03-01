package typings
package atPulumiAwsLib.ec2GetVpnGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnGatewayArgs extends js.Object {
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
    */
  val amazonSideAsn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a VPC attached to the specific VPN Gateway to retrieve.
    */
  val attachedVpcId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Availability Zone of the specific VPN Gateway to retrieve.
    */
  val availabilityZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The ID of the specific VPN Gateway to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the specific VPN Gateway to retrieve.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPN Gateway.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetVpnGatewayArgs {
  @scala.inline
  def apply(
    amazonSideAsn: java.lang.String = null,
    attachedVpcId: java.lang.String = null,
    availabilityZone: java.lang.String = null,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null,
    state: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetVpnGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn)
    if (attachedVpcId != null) __obj.updateDynamic("attachedVpcId")(attachedVpcId)
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpnGatewayArgs]
  }
}

