package typings
package atPulumiAwsLib.ec2GetVpcDhcpOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcDhcpOptionsResult extends js.Object {
  /**
    * EC2 DHCP Options ID
    */
  val dhcpOptionsId: java.lang.String
  /**
    * The suffix domain name to used when resolving non Fully Qualified Domain Names. e.g. the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: java.lang.String
  /**
    * List of name servers.
    */
  val domainNameServers: js.Array[java.lang.String]
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.Array[java.lang.String]
  /**
    * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: java.lang.String
  /**
    * List of NTP servers.
    */
  val ntpServers: js.Array[java.lang.String]
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: java.lang.String
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetVpcDhcpOptionsResult {
  @scala.inline
  def apply(
    dhcpOptionsId: java.lang.String,
    domainName: java.lang.String,
    domainNameServers: js.Array[java.lang.String],
    id: java.lang.String,
    netbiosNameServers: js.Array[java.lang.String],
    netbiosNodeType: java.lang.String,
    ntpServers: js.Array[java.lang.String],
    ownerId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetVpcDhcpOptionsResult = {
    val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId, domainName = domainName, domainNameServers = domainNameServers, id = id, netbiosNameServers = netbiosNameServers, netbiosNodeType = netbiosNodeType, ntpServers = ntpServers, ownerId = ownerId, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpcDhcpOptionsResult]
  }
}

