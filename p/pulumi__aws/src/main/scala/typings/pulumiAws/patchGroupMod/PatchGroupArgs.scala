package typings.pulumiAws.patchGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchGroupArgs extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: Input[String] = js.native
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: Input[String] = js.native
}

object PatchGroupArgs {
  @scala.inline
  def apply(baselineId: Input[String], patchGroup: Input[String]): PatchGroupArgs = {
    val __obj = js.Dynamic.literal(baselineId = baselineId.asInstanceOf[js.Any], patchGroup = patchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchGroupArgs]
  }
  @scala.inline
  implicit class PatchGroupArgsOps[Self <: PatchGroupArgs] (val x: Self) extends AnyVal {
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
    def setBaselineId(value: Input[String]): Self = this.set("baselineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchGroup(value: Input[String]): Self = this.set("patchGroup", value.asInstanceOf[js.Any])
  }
  
}

