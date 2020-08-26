package typings.pulumiAws.pipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codepipeline.PipelineArtifactStore
import typings.pulumiAws.outputMod.codepipeline.PipelineStage
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("@pulumi/aws/codepipeline/pipeline", "Pipeline")
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
  def get(name: String, id: Input[ID]): Pipeline = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Pipeline = js.native
  def get(name: String, id: Input[ID], state: PipelineState): Pipeline = js.native
  def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): Pipeline = js.native
  /**
    * Returns true if the given object is an instance of Pipeline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ Boolean = js.native
}

