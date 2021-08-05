package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafv2.WebAclDefaultAction
import typings.pulumiAws.outputMod.wafv2.WebAclRule
import typings.pulumiAws.outputMod.wafv2.WebAclVisibilityConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2WebAclMod {
  
  @JSImport("@pulumi/aws/wafv2/webAcl", "WebAcl")
  @js.native
  class WebAcl protected () extends CustomResource {
    /**
      * Create a WebAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclArgs) = this()
    def this(name: String, args: WebAclArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the IP Set that this statement references.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The web ACL capacity units (WCUs) currently being used by this web ACL.
      */
    val capacity: Output_[Double] = js.native
    
    /**
      * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
      */
    val defaultAction: Output_[WebAclDefaultAction] = js.native
    
    /**
      * A friendly description of the WebACL.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    val lockToken: Output_[String] = js.native
    
    /**
      * A friendly name of the WebACL.
      */
    val name: Output_[String] = js.native
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: Output_[js.UndefOr[js.Array[WebAclRule]]] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: Output_[WebAclVisibilityConfig] = js.native
  }
  /* static members */
  object WebAcl {
    
    @JSImport("@pulumi/aws/wafv2/webAcl", "WebAcl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[WebAcl]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebAcl]
    inline def get(name: String, id: Input[ID], state: WebAclState): WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[WebAcl]
    inline def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebAcl]
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAcl.WebAcl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/webAcl.WebAcl */ Boolean]
  }
  
  trait WebAclArgs extends StObject {
    
    /**
      * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
      */
    val defaultAction: Input[typings.pulumiAws.inputMod.wafv2.WebAclDefaultAction]
    
    /**
      * A friendly description of the WebACL.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the WebACL.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]]]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Input[String]
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: Input[typings.pulumiAws.inputMod.wafv2.WebAclVisibilityConfig]
  }
  object WebAclArgs {
    
    inline def apply(
      defaultAction: Input[typings.pulumiAws.inputMod.wafv2.WebAclDefaultAction],
      scope: Input[String],
      visibilityConfig: Input[typings.pulumiAws.inputMod.wafv2.WebAclVisibilityConfig]
    ): WebAclArgs = {
      val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAclArgs]
    }
    
    extension [Self <: WebAclArgs](x: Self) {
      
      inline def setDefaultAction(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclDefaultAction]): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVisibilityConfig(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclVisibilityConfig]): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAclState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the IP Set that this statement references.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The web ACL capacity units (WCUs) currently being used by this web ACL.
      */
    val capacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
      */
    val defaultAction: js.UndefOr[Input[typings.pulumiAws.inputMod.wafv2.WebAclDefaultAction]] = js.undefined
    
    /**
      * A friendly description of the WebACL.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    val lockToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the WebACL.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]]]] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
      */
    val visibilityConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.wafv2.WebAclVisibilityConfig]] = js.undefined
  }
  object WebAclState {
    
    inline def apply(): WebAclState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebAclState]
    }
    
    extension [Self <: WebAclState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCapacity(value: Input[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setDefaultAction(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclDefaultAction]): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
      
      inline def setDefaultActionUndefined: Self = StObject.set(x, "defaultAction", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLockToken(value: Input[String]): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
      
      inline def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVisibilityConfig(value: Input[typings.pulumiAws.inputMod.wafv2.WebAclVisibilityConfig]): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
      
      inline def setVisibilityConfigUndefined: Self = StObject.set(x, "visibilityConfig", js.undefined)
    }
  }
}
