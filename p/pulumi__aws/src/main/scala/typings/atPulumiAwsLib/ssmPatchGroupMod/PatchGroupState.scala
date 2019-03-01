package typings
package atPulumiAwsLib.ssmPatchGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupState extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PatchGroupState {
  @scala.inline
  def apply(
    baselineId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    patchGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PatchGroupState = {
    val __obj = js.Dynamic.literal()
    if (baselineId != null) __obj.updateDynamic("baselineId")(baselineId.asInstanceOf[js.Any])
    if (patchGroup != null) __obj.updateDynamic("patchGroup")(patchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchGroupState]
  }
}

