package typings.atPulumiAws.typesInputMod.codepipeline

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineStage extends js.Object {
  var actions: Input[js.Array[Input[PipelineStageAction]]]
  /**
    * The name of the pipeline.
    */
  var name: Input[String]
}

object PipelineStage {
  @scala.inline
  def apply(actions: Input[js.Array[Input[PipelineStageAction]]], name: Input[String]): PipelineStage = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipelineStage]
  }
}

