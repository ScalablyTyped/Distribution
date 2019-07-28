package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConditionsLogical extends js.Object {
  var conditions: Input[js.Array[Input[Anon_JobNameLogicalOperator]]]
  var logical: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ConditionsLogical {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[Anon_JobNameLogicalOperator]]], logical: Input[String] = null): Anon_ConditionsLogical = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    if (logical != null) __obj.updateDynamic("logical")(logical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConditionsLogical]
  }
}

