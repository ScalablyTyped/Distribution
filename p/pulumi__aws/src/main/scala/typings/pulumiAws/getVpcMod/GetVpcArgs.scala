package typings.pulumiAws.getVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcArgs extends js.Object {
  /**
    * The cidr block of the desired VPC.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Boolean constraint on whether the desired VPC is
    * the default VPC for the region.
    */
  val default: js.UndefOr[Boolean] = js.native
  /**
    * The DHCP options id of the desired VPC.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  /**
    * The id of the specific VPC to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
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
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcArgs]
  }
}

