package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComplianceResourceId extends js.Object {
  var complianceResourceId: js.UndefOr[String] = js.undefined
  var complianceResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  var tagKey: js.UndefOr[String] = js.undefined
  var tagValue: js.UndefOr[String] = js.undefined
}

object Anon_ComplianceResourceId {
  @scala.inline
  def apply(
    complianceResourceId: String = null,
    complianceResourceTypes: js.Array[String] = null,
    tagKey: String = null,
    tagValue: String = null
  ): Anon_ComplianceResourceId = {
    val __obj = js.Dynamic.literal()
    if (complianceResourceId != null) __obj.updateDynamic("complianceResourceId")(complianceResourceId)
    if (complianceResourceTypes != null) __obj.updateDynamic("complianceResourceTypes")(complianceResourceTypes)
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey)
    if (tagValue != null) __obj.updateDynamic("tagValue")(tagValue)
    __obj.asInstanceOf[Anon_ComplianceResourceId]
  }
}

