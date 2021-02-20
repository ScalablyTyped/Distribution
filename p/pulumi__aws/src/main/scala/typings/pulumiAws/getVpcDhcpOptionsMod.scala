package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcDhcpOptionsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcDhcpOptionsMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcDhcpOptions", "getVpcDhcpOptions")
  @js.native
  def getVpcDhcpOptions(): js.Promise[GetVpcDhcpOptionsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcDhcpOptions", "getVpcDhcpOptions")
  @js.native
  def getVpcDhcpOptions(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcDhcpOptions", "getVpcDhcpOptions")
  @js.native
  def getVpcDhcpOptions(args: GetVpcDhcpOptionsArgs): js.Promise[GetVpcDhcpOptionsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcDhcpOptions", "getVpcDhcpOptions")
  @js.native
  def getVpcDhcpOptions(args: GetVpcDhcpOptionsArgs, opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] = js.native
  
  @js.native
  trait GetVpcDhcpOptionsArgs extends StObject {
    
    /**
      * The EC2 DHCP Options ID.
      */
    val dhcpOptionsId: js.UndefOr[String] = js.native
    
    /**
      * List of custom filters as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
    
    /**
      * A map of tags assigned to the resource.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcDhcpOptionsArgs {
    
    @scala.inline
    def apply(): GetVpcDhcpOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcDhcpOptionsArgs]
    }
    
    @scala.inline
    implicit class GetVpcDhcpOptionsArgsMutableBuilder[Self <: GetVpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDhcpOptionsId(value: String): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhcpOptionsIdUndefined: Self = StObject.set(x, "dhcpOptionsId", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcDhcpOptionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcDhcpOptionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcDhcpOptionsResult extends StObject {
    
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
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcDhcpOptionsFilter]] = js.native
    
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
    implicit class GetVpcDhcpOptionsResultMutableBuilder[Self <: GetVpcDhcpOptionsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhcpOptionsId(value: String): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServers(value: js.Array[String]): Self = StObject.set(x, "domainNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServersVarargs(value: String*): Self = StObject.set(x, "domainNameServers", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcDhcpOptionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcDhcpOptionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNameServers(value: js.Array[String]): Self = StObject.set(x, "netbiosNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNameServersVarargs(value: String*): Self = StObject.set(x, "netbiosNameServers", js.Array(value :_*))
      
      @scala.inline
      def setNetbiosNodeType(value: String): Self = StObject.set(x, "netbiosNodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNtpServers(value: js.Array[String]): Self = StObject.set(x, "ntpServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNtpServersVarargs(value: String*): Self = StObject.set(x, "ntpServers", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
