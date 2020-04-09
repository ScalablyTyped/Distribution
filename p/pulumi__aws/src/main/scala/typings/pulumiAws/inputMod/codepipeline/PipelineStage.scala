package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

