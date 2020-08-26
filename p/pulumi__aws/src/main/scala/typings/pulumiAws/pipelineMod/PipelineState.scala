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
  /**
    * A stage block. Stages are documented below.
    */
  val stages: js.UndefOr[Input[js.Array[Input[PipelineStage]]]] = js.native
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
  implicit class PipelineStateOps[Self <: PipelineState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setArtifactStore(value: Input[PipelineArtifactStore]): Self = this.set("artifactStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactStore: Self = this.set("artifactStore", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setStagesVarargs(value: Input[PipelineStage]*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: Input[js.Array[Input[PipelineStage]]]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

