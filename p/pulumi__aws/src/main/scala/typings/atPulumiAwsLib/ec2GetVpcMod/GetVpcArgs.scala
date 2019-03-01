package typings
package atPulumiAwsLib.ec2GetVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcArgs extends js.Object {
  /**
    * The cidr block of the desired VPC.
    */
  val cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean constraint on whether the desired VPC is
    * the default VPC for the region.
    */
  val default: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The DHCP options id of the desired VPC.
    */
  val dhcpOptionsId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The id of the specific VPC to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetVpcArgs {
  @scala.inline
  def apply(
    cidrBlock: java.lang.String = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    dhcpOptionsId: java.lang.String = null,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null,
    state: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetVpcArgs = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcArgs]
  }
}

