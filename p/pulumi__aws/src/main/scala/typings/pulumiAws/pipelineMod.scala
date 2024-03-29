package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codepipeline.PipelineArtifactStore
import typings.pulumiAws.outputMod.codepipeline.PipelineStage
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelineMod {
  
  @JSImport("@pulumi/aws/codepipeline/pipeline", "Pipeline")
  @js.native
  class Pipeline protected () extends CustomResource {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: PipelineArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The codepipeline ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * One or more artifactStore blocks. Artifact stores are documented below.
      */
    val artifactStore: Output_[PipelineArtifactStore] = js.native
    
    /**
      * The name of the pipeline.
      */
    val name: Output_[String] = js.native
    
    /**
      * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * A stage block. Stages are documented below.
      */
    val stages: Output_[js.Array[PipelineStage]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Pipeline {
    
    @JSImport("@pulumi/aws/codepipeline/pipeline", "Pipeline")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    inline def get(name: String, id: Input[ID], state: PipelineState): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    inline def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): Pipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Pipeline]
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ Boolean]
  }
  
  trait PipelineArgs extends StObject {
    
    /**
      * One or more artifactStore blocks. Artifact stores are documented below.
      */
    val artifactStore: Input[typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore]
    
    /**
      * The name of the pipeline.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
      */
    val roleArn: Input[String]
    
    /**
      * A stage block. Stages are documented below.
      */
    val stages: Input[js.Array[Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]]]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PipelineArgs {
    
    inline def apply(
      artifactStore: Input[typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore],
      roleArn: Input[String],
      stages: Input[js.Array[Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]]]
    ): PipelineArgs = {
      val __obj = js.Dynamic.literal(artifactStore = artifactStore.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineArgs]
    }
    
    extension [Self <: PipelineArgs](x: Self) {
      
      inline def setArtifactStore(value: Input[typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore]): Self = StObject.set(x, "artifactStore", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setStages(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
      
      inline def setStagesVarargs(value: Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]*): Self = StObject.set(x, "stages", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait PipelineState extends StObject {
    
    /**
      * The codepipeline ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * One or more artifactStore blocks. Artifact stores are documented below.
      */
    val artifactStore: js.UndefOr[Input[typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore]] = js.undefined
    
    /**
      * The name of the pipeline.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A stage block. Stages are documented below.
      */
    val stages: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object PipelineState {
    
    inline def apply(): PipelineState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineState]
    }
    
    extension [Self <: PipelineState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setArtifactStore(value: Input[typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore]): Self = StObject.set(x, "artifactStore", value.asInstanceOf[js.Any])
      
      inline def setArtifactStoreUndefined: Self = StObject.set(x, "artifactStore", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setStages(value: Input[js.Array[Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
      
      inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
      
      inline def setStagesVarargs(value: Input[typings.pulumiAws.inputMod.codepipeline.PipelineStage]*): Self = StObject.set(x, "stages", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
