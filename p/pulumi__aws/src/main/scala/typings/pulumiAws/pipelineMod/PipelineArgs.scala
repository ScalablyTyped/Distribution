package typings.pulumiAws.pipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore
import typings.pulumiAws.inputMod.codepipeline.PipelineStage
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineArgs extends js.Object {
  /**
    * One or more artifactStore blocks. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: Input[PipelineArtifactStore] = js.native
  /**
    * The name of the pipeline.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: Input[String] = js.native
  val stages: Input[js.Array[Input[PipelineStage]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PipelineArgs {
  @scala.inline
  def apply(
    artifactStore: Input[PipelineArtifactStore],
    roleArn: Input[String],
    stages: Input[js.Array[Input[PipelineStage]]],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): PipelineArgs = {
    val __obj = js.Dynamic.literal(artifactStore = artifactStore.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArgs]
  }
}

