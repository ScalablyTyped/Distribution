package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regexPatternSetMod {
  
  @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet")
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
    
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
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID]): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): RegexPatternSet = js.native
    @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @js.native
  trait RegexPatternSetArgs extends StObject {
    
    /**
      * The name or description of the Regex Pattern Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
      */
    val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object RegexPatternSetArgs {
    
    @scala.inline
    def apply(): RegexPatternSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetArgs]
    }
    
    @scala.inline
    implicit class RegexPatternSetArgsMutableBuilder[Self <: RegexPatternSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regexPatternStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexPatternStringsUndefined: Self = StObject.set(x, "regexPatternStrings", js.undefined)
      
      @scala.inline
      def setRegexPatternStringsVarargs(value: Input[String]*): Self = StObject.set(x, "regexPatternStrings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RegexPatternSetState extends StObject {
    
    /**
      * The name or description of the Regex Pattern Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
      */
    val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object RegexPatternSetState {
    
    @scala.inline
    def apply(): RegexPatternSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexPatternSetState]
    }
    
    @scala.inline
    implicit class RegexPatternSetStateMutableBuilder[Self <: RegexPatternSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regexPatternStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexPatternStringsUndefined: Self = StObject.set(x, "regexPatternStrings", js.undefined)
      
      @scala.inline
      def setRegexPatternStringsVarargs(value: Input[String]*): Self = StObject.set(x, "regexPatternStrings", js.Array(value :_*))
    }
  }
}
