package typings.atPulumiAws.ec2DefaultVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVpcDhcpOptionsArgs extends js.Object {
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object DefaultVpcDhcpOptionsArgs {
  @scala.inline
  def apply(
    netbiosNameServers: Input[js.Array[Input[String]]] = null,
    netbiosNodeType: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): DefaultVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (netbiosNameServers != null) __obj.updateDynamic("netbiosNameServers")(netbiosNameServers.asInstanceOf[js.Any])
    if (netbiosNodeType != null) __obj.updateDynamic("netbiosNodeType")(netbiosNodeType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVpcDhcpOptionsArgs]
  }
}

