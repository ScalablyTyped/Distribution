package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnIdName extends js.Object {
  var arn: js.UndefOr[Input[String]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
  var policyTypes: js.UndefOr[Input[js.Array[Input[Anon_StatusType]]]] = js.undefined
}

object Anon_ArnIdName {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    id: Input[String] = null,
    name: Input[String] = null,
    policyTypes: Input[js.Array[Input[Anon_StatusType]]] = null
  ): Anon_ArnIdName = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyTypes != null) __obj.updateDynamic("policyTypes")(policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArnIdName]
  }
}

