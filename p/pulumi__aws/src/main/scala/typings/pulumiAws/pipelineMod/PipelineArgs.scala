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
  /**
    * A stage block. Stages are documented below.
    */
  val stages: Input[js.Array[Input[PipelineStage]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object PipelineArgs {
  @scala.inline
  def apply(
    artifactStore: Input[PipelineArtifactStore],
    roleArn: Input[String],
    stages: Input[js.Array[Input[PipelineStage]]]
  ): PipelineArgs = {
    val __obj = js.Dynamic.literal(artifactStore = artifactStore.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineArgs]
  }
  @scala.inline
  implicit class PipelineArgsOps[Self <: PipelineArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArtifactStore(value: Input[PipelineArtifactStore]): Self = this.set("artifactStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStagesVarargs(value: Input[PipelineStage]*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: Input[js.Array[Input[PipelineStage]]]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

