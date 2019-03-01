package typings
package atPulumiAwsLib.ec2DefaultVpcDhcpOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVpcDhcpOptionsArgs extends js.Object {
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object DefaultVpcDhcpOptionsArgs {
  @scala.inline
  def apply(
    netbiosNameServers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    netbiosNodeType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DefaultVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (netbiosNameServers != null) __obj.updateDynamic("netbiosNameServers")(netbiosNameServers.asInstanceOf[js.Any])
    if (netbiosNodeType != null) __obj.updateDynamic("netbiosNodeType")(netbiosNodeType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVpcDhcpOptionsArgs]
  }
}

