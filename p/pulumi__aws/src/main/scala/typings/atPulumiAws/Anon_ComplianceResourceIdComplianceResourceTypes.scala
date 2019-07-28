package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComplianceResourceIdComplianceResourceTypes extends js.Object {
  var complianceResourceId: js.UndefOr[Input[String]] = js.undefined
  var complianceResourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var tagKey: js.UndefOr[Input[String]] = js.undefined
  var tagValue: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ComplianceResourceIdComplianceResourceTypes {
  @scala.inline
  def apply(
    complianceResourceId: Input[String] = null,
    complianceResourceTypes: Input[js.Array[Input[String]]] = null,
    tagKey: Input[String] = null,
    tagValue: Input[String] = null
  ): Anon_ComplianceResourceIdComplianceResourceTypes = {
    val __obj = js.Dynamic.literal()
    if (complianceResourceId != null) __obj.updateDynamic("complianceResourceId")(complianceResourceId.asInstanceOf[js.Any])
    if (complianceResourceTypes != null) __obj.updateDynamic("complianceResourceTypes")(complianceResourceTypes.asInstanceOf[js.Any])
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey.asInstanceOf[js.Any])
    if (tagValue != null) __obj.updateDynamic("tagValue")(tagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComplianceResourceIdComplianceResourceTypes]
  }
}

