package typings.pulumiAws.pipelineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codepipeline.PipelineArtifactStore
import typings.pulumiAws.inputMod.codepipeline.PipelineStage
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineState extends js.Object {
  /**
    * The codepipeline ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * One or more artifactStore blocks. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: js.UndefOr[Input[PipelineArtifactStore]] = js.native
  /**
    * The name of the pipeline.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  val stages: js.UndefOr[Input[js.Array[Input[PipelineStage]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PipelineState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    artifactStore: Input[PipelineArtifactStore] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null,
    stages: Input[js.Array[Input[PipelineStage]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): PipelineState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (artifactStore != null) __obj.updateDynamic("artifactStore")(artifactStore.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineState]
  }
}

