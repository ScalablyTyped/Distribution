package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafv2.RegexPatternSetRegularExpression
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2RegexPatternSetMod {
  
  @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet")
  @js.native
  class RegexPatternSet protected () extends CustomResource {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    val lockToken: Output_[String] = js.native
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: Output_[String] = js.native
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: Output_[js.UndefOr[js.Array[RegexPatternSetRegularExpression]]] = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RegexPatternSet {
    
    @JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RegexPatternSet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RegexPatternSet]
    inline def get(name: String, id: Input[ID], state: RegexPatternSetState): RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RegexPatternSet]
    inline def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RegexPatternSet]
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean]
  }
  
  trait RegexPatternSetArgs extends StObject {
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
        ]
      ] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: Input[String]
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RegexPatternSetArgs {
    
    inline def apply(scope: Input[String]): RegexPatternSetArgs = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexPatternSetArgs]
    }
    
    extension [Self <: RegexPatternSetArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegularExpressions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
            ]
      ): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
      
      inline def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
      
      inline def setRegularExpressionsVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait RegexPatternSetState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly description of the regular expression pattern set.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    val lockToken: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the regular expression pattern set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
      */
    val regularExpressions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
        ]
      ] = js.undefined
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object RegexPatternSetState {
    
    inline def apply(): RegexPatternSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetState]
    }
    
    extension [Self <: RegexPatternSetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLockToken(value: Input[String]): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
      
      inline def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegularExpressions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]]
            ]
      ): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
      
      inline def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
      
      inline def setRegularExpressionsVarargs(value: Input[typings.pulumiAws.inputMod.wafv2.RegexPatternSetRegularExpression]*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
      
      inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
