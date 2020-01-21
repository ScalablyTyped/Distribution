package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRulePatchFilter extends js.Object {
  var key: Input[String] = js.native
  var values: Input[js.Array[Input[String]]] = js.native
}

object PatchBaselineApprovalRulePatchFilter {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): PatchBaselineApprovalRulePatchFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchBaselineApprovalRulePatchFilter]
  }
}

