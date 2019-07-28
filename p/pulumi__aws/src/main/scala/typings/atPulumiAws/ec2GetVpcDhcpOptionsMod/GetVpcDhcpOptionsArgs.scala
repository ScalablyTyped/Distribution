package typings.atPulumiAws.ec2GetVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcDhcpOptionsArgs extends js.Object {
  /**
    * The EC2 DHCP Options ID.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.undefined
  /**
    * List of custom filters as described below.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetVpcDhcpOptionsArgs {
  @scala.inline
  def apply(
    dhcpOptionsId: String = null,
    filters: js.Array[Anon_NameValues] = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcDhcpOptionsArgs]
  }
}

