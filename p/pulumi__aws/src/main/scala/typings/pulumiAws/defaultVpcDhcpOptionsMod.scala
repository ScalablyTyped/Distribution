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

object defaultVpcDhcpOptionsMod {
  
  @JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
  @js.native
  class DefaultVpcDhcpOptions protected () extends CustomResource {
    /**
      * Create a DefaultVpcDhcpOptions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DefaultVpcDhcpOptionsArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DefaultVpcDhcpOptionsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the DHCP Options Set.
      */
    val arn: Output_[String] = js.native
    
    val domainName: Output_[String] = js.native
    
    val domainNameServers: Output_[String] = js.native
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: Output_[js.UndefOr[String]] = js.native
    
    val ntpServers: Output_[String] = js.native
    
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
  object DefaultVpcDhcpOptions {
    
    @JSImport("@pulumi/aws/ec2/defaultVpcDhcpOptions", "DefaultVpcDhcpOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultVpcDhcpOptions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultVpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultVpcDhcpOptions]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultVpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultVpcDhcpOptions]
    inline def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState): DefaultVpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultVpcDhcpOptions]
    inline def get(name: String, id: Input[ID], state: DefaultVpcDhcpOptionsState, opts: CustomResourceOptions): DefaultVpcDhcpOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultVpcDhcpOptions]
    
    /**
      * Returns true if the given object is an instance of DefaultVpcDhcpOptions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultVpcDhcpOptions.DefaultVpcDhcpOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultVpcDhcpOptions.DefaultVpcDhcpOptions */ Boolean]
  }
  
  trait DefaultVpcDhcpOptionsArgs extends StObject {
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultVpcDhcpOptionsArgs {
    
    inline def apply(): DefaultVpcDhcpOptionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultVpcDhcpOptionsArgs]
    }
    
    extension [Self <: DefaultVpcDhcpOptionsArgs](x: Self) {
      
      inline def setNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "netbiosNameServers", value.asInstanceOf[js.Any])
      
      inline def setNetbiosNameServersUndefined: Self = StObject.set(x, "netbiosNameServers", js.undefined)
      
      inline def setNetbiosNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "netbiosNameServers", js.Array(value :_*))
      
      inline def setNetbiosNodeType(value: Input[String]): Self = StObject.set(x, "netbiosNodeType", value.asInstanceOf[js.Any])
      
      inline def setNetbiosNodeTypeUndefined: Self = StObject.set(x, "netbiosNodeType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DefaultVpcDhcpOptionsState extends StObject {
    
    /**
      * The ARN of the DHCP Options Set.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    val domainNameServers: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of NETBIOS name servers.
      */
    val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
      */
    val netbiosNodeType: js.UndefOr[Input[String]] = js.undefined
    
    val ntpServers: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the DHCP options set.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultVpcDhcpOptionsState {
    
    inline def apply(): DefaultVpcDhcpOptionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultVpcDhcpOptionsState]
    }
    
    extension [Self <: DefaultVpcDhcpOptionsState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameServers(value: Input[String]): Self = StObject.set(x, "domainNameServers", value.asInstanceOf[js.Any])
      
      inline def setDomainNameServersUndefined: Self = StObject.set(x, "domainNameServers", js.undefined)
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "netbiosNameServers", value.asInstanceOf[js.Any])
      
      inline def setNetbiosNameServersUndefined: Self = StObject.set(x, "netbiosNameServers", js.undefined)
      
      inline def setNetbiosNameServersVarargs(value: Input[String]*): Self = StObject.set(x, "netbiosNameServers", js.Array(value :_*))
      
      inline def setNetbiosNodeType(value: Input[String]): Self = StObject.set(x, "netbiosNodeType", value.asInstanceOf[js.Any])
      
      inline def setNetbiosNodeTypeUndefined: Self = StObject.set(x, "netbiosNodeType", js.undefined)
      
      inline def setNtpServers(value: Input[String]): Self = StObject.set(x, "ntpServers", value.asInstanceOf[js.Any])
      
      inline def setNtpServersUndefined: Self = StObject.set(x, "ntpServers", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
