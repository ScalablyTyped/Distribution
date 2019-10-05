package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineApprovalRulePatchFilter extends js.Object {
  var key: Input[String]
  var values: Input[js.Array[Input[String]]]
}

object PatchBaselineApprovalRulePatchFilter {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): PatchBaselineApprovalRulePatchFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchBaselineApprovalRulePatchFilter]
  }
}

