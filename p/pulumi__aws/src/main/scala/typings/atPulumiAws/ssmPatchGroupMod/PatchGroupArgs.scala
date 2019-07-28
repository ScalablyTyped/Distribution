package typings.atPulumiAws.ssmPatchGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupArgs extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: Input[String]
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: Input[String]
}

object PatchGroupArgs {
  @scala.inline
  def apply(baselineId: Input[String], patchGroup: Input[String]): PatchGroupArgs = {
    val __obj = js.Dynamic.literal(baselineId = baselineId.asInstanceOf[js.Any], patchGroup = patchGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchGroupArgs]
  }
}

