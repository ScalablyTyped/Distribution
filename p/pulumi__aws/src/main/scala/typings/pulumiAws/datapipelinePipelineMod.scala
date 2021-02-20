package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datapipelinePipelineMod {
  
  @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline")
  @js.native
  class Pipeline protected () extends CustomResource {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PipelineArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of Pipeline.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of Pipeline.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Pipeline {
    
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID]): Pipeline = js.native
    @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Pipeline = js.native
    @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState): Pipeline = js.native
    @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): Pipeline = js.native
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/datapipeline/pipeline", "Pipeline.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datapipeline/pipeline.Pipeline */ Boolean = js.native
  }
  
  @js.native
  trait PipelineArgs extends StObject {
    
    /**
      * The description of Pipeline.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of Pipeline.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PipelineArgs {
    
    @scala.inline
    def apply(): PipelineArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineArgs]
    }
    
    @scala.inline
    implicit class PipelineArgsMutableBuilder[Self <: PipelineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait PipelineState extends StObject {
    
    /**
      * The description of Pipeline.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of Pipeline.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PipelineState {
    
    @scala.inline
    def apply(): PipelineState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineState]
    }
    
    @scala.inline
    implicit class PipelineStateMutableBuilder[Self <: PipelineState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
