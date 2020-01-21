package typings.pulumiAws.defaultVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultVpcDhcpOptionsState extends js.Object {
  val domainName: js.UndefOr[Input[String]] = js.native
  val domainNameServers: js.UndefOr[Input[String]] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[Input[String]] = js.native
  val ntpServers: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultVpcDhcpOptionsState {
  @scala.inline
  def apply(
    domainName: Input[String] = null,
    domainNameServers: Input[String] = null,
    netbiosNameServers: Input[js.Array[Input[String]]] = null,
    netbiosNodeType: Input[String] = null,
    ntpServers: Input[String] = null,
    ownerId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): DefaultVpcDhcpOptionsState = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainNameServers != null) __obj.updateDynamic("domainNameServers")(domainNameServers.asInstanceOf[js.Any])
    if (netbiosNameServers != null) __obj.updateDynamic("netbiosNameServers")(netbiosNameServers.asInstanceOf[js.Any])
    if (netbiosNodeType != null) __obj.updateDynamic("netbiosNodeType")(netbiosNodeType.asInstanceOf[js.Any])
    if (ntpServers != null) __obj.updateDynamic("ntpServers")(ntpServers.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVpcDhcpOptionsState]
  }
}

