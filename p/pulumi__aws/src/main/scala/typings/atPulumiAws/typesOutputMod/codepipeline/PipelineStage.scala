package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineStage extends js.Object {
  var actions: js.Array[PipelineStageAction]
  /**
    * The name of the pipeline.
    */
  var name: String
}

object PipelineStage {
  @scala.inline
  def apply(actions: js.Array[PipelineStageAction], name: String): PipelineStage = {
    val __obj = js.Dynamic.literal(actions = actions, name = name)
  
    __obj.asInstanceOf[PipelineStage]
  }
}

