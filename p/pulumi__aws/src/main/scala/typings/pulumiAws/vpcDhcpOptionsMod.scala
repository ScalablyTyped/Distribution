package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcDhcpOptionsMod {
  
  @JSImport("@pulumi/aws/ec2/vpcDhcpOptions", "VpcDhcpOptions")
  @js.native
  class VpcDhcpOptions protected () extends CustomResource {
    /**
      * Create a VpcDhcpOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VpcDhcpOptionsArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VpcDhcpOptionsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the DHCP Options Set.
      */
    val arn: Output_[String] = js.native
    
    /**
      * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
      */
    val domainName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
      */
    val domainNameServers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of NTP servers to configure.
      */
    val ntpServers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The ID of the AWS account that owns the DHCP options set.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object VpcDhcpOptions {
    
    @JSImport("@pulumi/aws/ec2/vpcDhcpOptions", "VpcDhcpOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcDhcpOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptions]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptions]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcDhcpOptionsState): VpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptions]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcDhcpOptionsState, opts: CustomResourceOptions): VpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptions]
    
    /**
      * Returns true if the given object is an instance of VpcDhcpOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptions.VpcDhcpOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptions.VpcDhcpOptions */ Boolean]
  }
  
  trait VpcDhcpOptionsArgs extends StObject {
    
    /**
      * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
      */
    val domainNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of NTP servers to configure.
      */
    val ntpServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VpcDhcpOptionsArgs {
    
    @scala.inline
    def apply(): VpcDhcpOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcDhcpOptionsArgs]
    }
    
    @scala.inline
    implicit class VpcDhcpOptionsArgsMutableBuilder[Self <: VpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "domainNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServersUndefined: Self = StObject.set(x, "domainNameServers", js.undefined)
      
      @scala.inline
      def setDomainNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "domainNameServers", js.Array(value :_*))
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "netbiosNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNameServersUndefined: Self = StObject.set(x, "netbiosNameServers", js.undefined)
      
      @scala.inline
      def setNetbiosNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "netbiosNameServers", js.Array(value :_*))
      
      @scala.inline
      def setNetbiosNodeType(value: Input[String]): Self = StObject.set(x, "netbiosNodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNodeTypeUndefined: Self = StObject.set(x, "netbiosNodeType", js.undefined)
      
      @scala.inline
      def setNtpServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ntpServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNtpServersUndefined: Self = StObject.set(x, "ntpServers", js.undefined)
      
      @scala.inline
      def setNtpServersVarargs(value: Input[String]*): Self = StObject.set(x, "ntpServers", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VpcDhcpOptionsState extends StObject {
    
    /**
      * The ARN of the DHCP Options Set.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
      */
    val domainNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of NTP servers to configure.
      */
    val ntpServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the DHCP options set.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VpcDhcpOptionsState {
    
    @scala.inline
    def apply(): VpcDhcpOptionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcDhcpOptionsState]
    }
    
    @scala.inline
    implicit class VpcDhcpOptionsStateMutableBuilder[Self <: VpcDhcpOptionsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "domainNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameServersUndefined: Self = StObject.set(x, "domainNameServers", js.undefined)
      
      @scala.inline
      def setDomainNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "domainNameServers", js.Array(value :_*))
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "netbiosNameServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNameServersUndefined: Self = StObject.set(x, "netbiosNameServers", js.undefined)
      
      @scala.inline
      def setNetbiosNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "netbiosNameServers", js.Array(value :_*))
      
      @scala.inline
      def setNetbiosNodeType(value: Input[String]): Self = StObject.set(x, "netbiosNodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetbiosNodeTypeUndefined: Self = StObject.set(x, "netbiosNodeType", js.undefined)
      
      @scala.inline
      def setNtpServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ntpServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNtpServersUndefined: Self = StObject.set(x, "ntpServers", js.undefined)
      
      @scala.inline
      def setNtpServersVarargs(value: Input[String]*): Self = StObject.set(x, "ntpServers", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
