package typings.pulumiAws.getVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcDhcpOptionsArgs extends js.Object {
  /**
    * The EC2 DHCP Options ID.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * List of custom filters as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcDhcpOptionsArgs {
  @scala.inline
  def apply(
    dhcpOptionsId: String = null,
    filters: js.Array[GetVpcDhcpOptionsFilter] = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcDhcpOptionsArgs]
  }
}

