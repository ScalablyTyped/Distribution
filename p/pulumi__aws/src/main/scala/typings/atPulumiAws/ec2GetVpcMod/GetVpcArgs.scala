package typings.atPulumiAws.ec2GetVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcArgs extends js.Object {
  /**
    * The cidr block of the desired VPC.
    */
  val cidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Boolean constraint on whether the desired VPC is
    * the default VPC for the region.
    */
  val default: js.UndefOr[Boolean] = js.undefined
  /**
    * The DHCP options id of the desired VPC.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.undefined
  /**
    * The id of the specific VPC to retrieve.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetVpcArgs {
  @scala.inline
  def apply(
    cidrBlock: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    dhcpOptionsId: String = null,
    filters: js.Array[GetVpcFilter] = null,
    id: String = null,
    state: String = null,
    tags: StringDictionary[js.Any] = null
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

