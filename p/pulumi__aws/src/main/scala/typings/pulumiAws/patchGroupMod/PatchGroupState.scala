package typings.pulumiAws.patchGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchGroupState extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: js.UndefOr[Input[String]] = js.native
}

object PatchGroupState {
  @scala.inline
  def apply(baselineId: Input[String] = null, patchGroup: Input[String] = null): PatchGroupState = {
    val __obj = js.Dynamic.literal()
    if (baselineId != null) __obj.updateDynamic("baselineId")(baselineId.asInstanceOf[js.Any])
    if (patchGroup != null) __obj.updateDynamic("patchGroup")(patchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchGroupState]
  }
}

