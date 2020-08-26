package typings.pulumiAws

import typings.pulumiAws.elastictranscoderPipelineMod.PipelineArgs
import typings.pulumiAws.elastictranscoderPipelineMod.PipelineState
import typings.pulumiAws.presetMod.PresetArgs
import typings.pulumiAws.presetMod.PresetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder", JSImport.Namespace)
@js.native
object elastictranscoderMod extends js.Object {
  @js.native
  class Pipeline protected ()
    extends typings.pulumiAws.elastictranscoderPipelineMod.Pipeline {
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
    extends typings.pulumiAws.presetMod.Preset {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState): typings.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typings.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState): typings.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): typings.pulumiAws.presetMod.Preset = js.native
    /**
      * Returns true if the given object is an instance of Preset.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
  }
  
}

