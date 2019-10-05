package typings.atPulumiAws.codepipelinePipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.codepipeline.PipelineArtifactStore
import typings.atPulumiAws.typesInputMod.codepipeline.PipelineStage
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineArgs extends js.Object {
  /**
    * An artifactStore block. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: Input[PipelineArtifactStore]
  /**
    * The name of the pipeline.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: Input[String]
  val stages: Input[js.Array[Input[PipelineStage]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
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

