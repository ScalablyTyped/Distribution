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

object wafv2IpSetMod {
  
  @JSImport("@pulumi/aws/wafv2/ipSet", "IpSet")
  @js.native
  class IpSet protected () extends CustomResource {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
      */
    val addresses: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly description of the IP set.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
      */
    val ipAddressVersion: Output_[String] = js.native
    
    val lockToken: Output_[String] = js.native
    
    /**
      * A friendly name of the IP set.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
      */
    val scope: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object IpSet {
    
    @JSImport("@pulumi/aws/wafv2/ipSet", "IpSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpSetState): IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IpSet]
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean]
  }
  
  trait IpSetArgs extends StObject {
    
    /**
      * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
      */
    val addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A friendly description of the IP set.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
      */
    val ipAddressVersion: Input[String]
    
    /**
      * A friendly name of the IP set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
      */
    val scope: Input[String]
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object IpSetArgs {
    
    @scala.inline
    def apply(ipAddressVersion: Input[String], scope: Input[String]): IpSetArgs = {
      val __obj = js.Dynamic.literal(ipAddressVersion = ipAddressVersion.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpSetArgs]
    }
    
    @scala.inline
    implicit class IpSetArgsMutableBuilder[Self <: IpSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      @scala.inline
      def setAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIpAddressVersion(value: Input[String]): Self = StObject.set(x, "ipAddressVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait IpSetState extends StObject {
    
    /**
      * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
      */
    val addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly description of the IP set.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
      */
    val ipAddressVersion: js.UndefOr[Input[String]] = js.undefined
    
    val lockToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the IP set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
      */
    val scope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object IpSetState {
    
    @scala.inline
    def apply(): IpSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpSetState]
    }
    
    @scala.inline
    implicit class IpSetStateMutableBuilder[Self <: IpSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      @scala.inline
      def setAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIpAddressVersion(value: Input[String]): Self = StObject.set(x, "ipAddressVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressVersionUndefined: Self = StObject.set(x, "ipAddressVersion", js.undefined)
      
      @scala.inline
      def setLockToken(value: Input[String]): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
