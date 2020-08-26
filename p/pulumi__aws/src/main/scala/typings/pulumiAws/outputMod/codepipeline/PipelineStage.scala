package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineStage extends js.Object {
  /**
    * The action(s) to include in the stage. Defined as an `action` block below
    */
  var actions: js.Array[PipelineStageAction] = js.native
  /**
    * The name of the stage.
    */
  var name: String = js.native
}

object PipelineStage {
  @scala.inline
  def apply(actions: js.Array[PipelineStageAction], name: String): PipelineStage = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStage]
  }
  @scala.inline
  implicit class PipelineStageOps[Self <: PipelineStage] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: PipelineStageAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[PipelineStageAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

