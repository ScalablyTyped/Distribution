package typings.pulumiAws.getVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcDhcpOptionsResult extends js.Object {
  
  /**
    * The ARN of the DHCP Options Set.
    */
  val arn: String = js.native
  
  /**
    * EC2 DHCP Options ID
    */
  val dhcpOptionsId: String = js.native
  
  /**
    * The suffix domain name to used when resolving non Fully Qualified Domain Names. e.g. the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: String = js.native
  
  /**
    * List of name servers.
    */
  val domainNameServers: js.Array[String] = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.Array[String] = js.native
  
  /**
    * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: String = js.native
  
  /**
    * List of NTP servers.
    */
  val ntpServers: js.Array[String] = js.native
  
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: String = js.native
  
  /**
    * A map of tags assigned to the resource.
    */
  val tags: StringDictionary[String] = js.native
}
object GetVpcDhcpOptionsResult {
  
  @scala.inline
  def apply(
    arn: String,
    dhcpOptionsId: String,
    domainName: String,
    domainNameServers: js.Array[String],
    id: String,
    netbiosNameServers: js.Array[String],
    netbiosNodeType: String,
    ntpServers: js.Array[String],
    ownerId: String,
    tags: StringDictionary[String]
  ): GetVpcDhcpOptionsResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainNameServers = domainNameServers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], netbiosNameServers = netbiosNameServers.asInstanceOf[js.Any], netbiosNodeType = netbiosNodeType.asInstanceOf[js.Any], ntpServers = ntpServers.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcDhcpOptionsResult]
  }
  
  @scala.inline
  implicit class GetVpcDhcpOptionsResultOps[Self <: GetVpcDhcpOptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsId(value: String): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameServersVarargs(value: String*): Self = this.set("domainNameServers", js.Array(value :_*))
    
    @scala.inline
    def setDomainNameServers(value: js.Array[String]): Self = this.set("domainNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetbiosNameServersVarargs(value: String*): Self = this.set("netbiosNameServers", js.Array(value :_*))
    
    @scala.inline
    def setNetbiosNameServers(value: js.Array[String]): Self = this.set("netbiosNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetbiosNodeType(value: String): Self = this.set("netbiosNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNtpServersVarargs(value: String*): Self = this.set("ntpServers", js.Array(value :_*))
    
    @scala.inline
    def setNtpServers(value: js.Array[String]): Self = this.set("ntpServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcDhcpOptionsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcDhcpOptionsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
