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

object analyzerMod {
  
  @JSImport("@pulumi/aws/accessanalyzer/analyzer", "Analyzer")
  @js.native
  class Analyzer protected () extends CustomResource {
    /**
      * Create a Analyzer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AnalyzerArgs) = this()
    def this(name: String, args: AnalyzerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name of the Analyzer.
      */
    val analyzerName: Output_[String] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
      */
    val `type`: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Analyzer {
    
    @JSImport("@pulumi/aws/accessanalyzer/analyzer", "Analyzer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Analyzer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Analyzer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Analyzer]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Analyzer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Analyzer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AnalyzerState): Analyzer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Analyzer]
    @scala.inline
    def get(name: String, id: Input[ID], state: AnalyzerState, opts: CustomResourceOptions): Analyzer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Analyzer]
    
    /**
      * Returns true if the given object is an instance of Analyzer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/accessanalyzer/analyzer.Analyzer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/accessanalyzer/analyzer.Analyzer */ Boolean]
  }
  
  trait AnalyzerArgs extends StObject {
    
    /**
      * Name of the Analyzer.
      */
    val analyzerName: Input[String]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object AnalyzerArgs {
    
    @scala.inline
    def apply(analyzerName: Input[String]): AnalyzerArgs = {
      val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyzerArgs]
    }
    
    @scala.inline
    implicit class AnalyzerArgsMutableBuilder[Self <: AnalyzerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyzerName(value: Input[String]): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AnalyzerState extends StObject {
    
    /**
      * Name of the Analyzer.
      */
    val analyzerName: js.UndefOr[Input[String]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object AnalyzerState {
    
    @scala.inline
    def apply(): AnalyzerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyzerState]
    }
    
    @scala.inline
    implicit class AnalyzerStateMutableBuilder[Self <: AnalyzerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyzerName(value: Input[String]): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyzerNameUndefined: Self = StObject.set(x, "analyzerName", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
