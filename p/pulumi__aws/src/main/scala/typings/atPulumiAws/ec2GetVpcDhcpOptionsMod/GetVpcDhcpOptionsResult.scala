package typings.atPulumiAws.ec2GetVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcDhcpOptionsResult extends js.Object {
  /**
    * EC2 DHCP Options ID
    */
  val dhcpOptionsId: String
  /**
    * The suffix domain name to used when resolving non Fully Qualified Domain Names. e.g. the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: String
  /**
    * List of name servers.
    */
  val domainNameServers: js.Array[String]
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.Array[String]
  /**
    * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: String
  /**
    * List of NTP servers.
    */
  val ntpServers: js.Array[String]
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: String
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any]
}

object GetVpcDhcpOptionsResult {
  @scala.inline
  def apply(
    dhcpOptionsId: String,
    domainName: String,
    domainNameServers: js.Array[String],
    id: String,
    netbiosNameServers: js.Array[String],
    netbiosNodeType: String,
    ntpServers: js.Array[String],
    ownerId: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetVpcDhcpOptionsFilter] = null
  ): GetVpcDhcpOptionsResult = {
    val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId, domainName = domainName, domainNameServers = domainNameServers, id = id, netbiosNameServers = netbiosNameServers, netbiosNodeType = netbiosNodeType, ntpServers = ntpServers, ownerId = ownerId, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcDhcpOptionsResult]
  }
}

