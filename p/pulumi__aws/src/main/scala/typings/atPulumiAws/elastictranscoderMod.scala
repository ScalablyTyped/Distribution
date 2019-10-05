package typings.atPulumiAws

import typings.atPulumiAws.elastictranscoderPipelineMod.PipelineArgs
import typings.atPulumiAws.elastictranscoderPipelineMod.PipelineState
import typings.atPulumiAws.elastictranscoderPresetMod.PresetArgs
import typings.atPulumiAws.elastictranscoderPresetMod.PresetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder", JSImport.Namespace)
@js.native
object elastictranscoderMod extends js.Object {
  @js.native
  class Pipeline protected ()
    extends typings.atPulumiAws.elastictranscoderPipelineMod.Pipeline {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: PipelineArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Preset protected ()
    extends typings.atPulumiAws.elastictranscoderPresetMod.Preset {
    /**
      * Create a Preset resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PresetArgs) = this()
    def this(name: String, args: PresetArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Pipeline extends js.Object {
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState): typings.atPulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typings.atPulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Preset extends js.Object {
    /**
      * Get an existing Preset resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elastictranscoderPresetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState): typings.atPulumiAws.elastictranscoderPresetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): typings.atPulumiAws.elastictranscoderPresetMod.Preset = js.native
    /**
      * Returns true if the given object is an instance of Preset.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
  }
  
}

