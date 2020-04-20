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
}

