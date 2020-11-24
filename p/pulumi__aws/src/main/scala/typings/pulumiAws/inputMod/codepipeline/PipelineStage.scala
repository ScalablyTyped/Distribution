package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineStage extends js.Object {
  
  /**
    * The action(s) to include in the stage. Defined as an `action` block below
    */
  var actions: Input[js.Array[Input[PipelineStageAction]]] = js.native
  
  /**
    * The name of the stage.
    */
  var name: Input[String] = js.native
}
object PipelineStage {
  
  @scala.inline
  def apply(actions: Input[js.Array[Input[PipelineStageAction]]], name: Input[String]): PipelineStage = {
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
    def setActionsVarargs(value: Input[PipelineStageAction]*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: Input[js.Array[Input[PipelineStageAction]]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
