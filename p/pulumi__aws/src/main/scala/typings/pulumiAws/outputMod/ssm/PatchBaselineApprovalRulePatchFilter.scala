package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineApprovalRulePatchFilter extends js.Object {
  var key: String = js.native
  var values: js.Array[String] = js.native
}

object PatchBaselineApprovalRulePatchFilter {
  @scala.inline
  def apply(key: String, values: js.Array[String]): PatchBaselineApprovalRulePatchFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRulePatchFilter]
  }
}

