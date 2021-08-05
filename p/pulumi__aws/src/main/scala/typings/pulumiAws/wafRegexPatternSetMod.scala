package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafRegexPatternSetMod {
  
  @JSImport("@pulumi/aws/waf/regexPatternSet", "RegexPatternSet")
  @js.native
  class RegexPatternSet protected () extends CustomResource {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name or description of the Regex Pattern Set.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
      */
    val regexPatternStrings: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object RegexPatternSet {
    
    @JSImport("@pulumi/aws/waf/regexPatternSet", "RegexPatternSet")
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
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexPatternSet.RegexPatternSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/waf/regexPatternSet.RegexPatternSet */ Boolean]
  }
  
  trait RegexPatternSetArgs extends StObject {
    
    /**
      * The name or description of the Regex Pattern Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
      */
    val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object RegexPatternSetArgs {
    
    inline def apply(): RegexPatternSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetArgs]
    }
    
    extension [Self <: RegexPatternSetArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regexPatternStrings", value.asInstanceOf[js.Any])
      
      inline def setRegexPatternStringsUndefined: Self = StObject.set(x, "regexPatternStrings", js.undefined)
      
      inline def setRegexPatternStringsVarargs(value: Input[String]*): Self = StObject.set(x, "regexPatternStrings", js.Array(value :_*))
    }
  }
  
  trait RegexPatternSetState extends StObject {
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or description of the Regex Pattern Set.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
      */
    val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object RegexPatternSetState {
    
    inline def apply(): RegexPatternSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetState]
    }
    
    extension [Self <: RegexPatternSetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regexPatternStrings", value.asInstanceOf[js.Any])
      
      inline def setRegexPatternStringsUndefined: Self = StObject.set(x, "regexPatternStrings", js.undefined)
      
      inline def setRegexPatternStringsVarargs(value: Input[String]*): Self = StObject.set(x, "regexPatternStrings", js.Array(value :_*))
    }
  }
}
