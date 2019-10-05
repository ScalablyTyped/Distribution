package typings.atPulumiAws.codepipelinePipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.codepipeline.PipelineArtifactStore
import typings.atPulumiAws.typesOutputMod.codepipeline.PipelineStage
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val arn: Output[String] = js.native
  /**
    * An artifactStore block. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: Output[PipelineArtifactStore] = js.native
  /**
    * The name of the pipeline.
    */
  val name: Output[String] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: Output[String] = js.native
  val stages: Output[js.Array[PipelineStage]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): Pipeline = js.native
  def get(name: String, id: Input[ID], state: PipelineState): Pipeline = js.native
  def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): Pipeline = js.native
  /**
    * Returns true if the given object is an instance of Pipeline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ Boolean = js.native
}

