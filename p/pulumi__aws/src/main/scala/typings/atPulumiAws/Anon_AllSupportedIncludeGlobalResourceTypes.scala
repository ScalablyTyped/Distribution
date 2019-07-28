package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSupportedIncludeGlobalResourceTypes extends js.Object {
  var allSupported: js.UndefOr[Input[Boolean]] = js.undefined
  var includeGlobalResourceTypes: js.UndefOr[Input[Boolean]] = js.undefined
  var resourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_AllSupportedIncludeGlobalResourceTypes {
  @scala.inline
  def apply(
    allSupported: Input[Boolean] = null,
    includeGlobalResourceTypes: Input[Boolean] = null,
    resourceTypes: Input[js.Array[Input[String]]] = null
  ): Anon_AllSupportedIncludeGlobalResourceTypes = {
    val __obj = js.Dynamic.literal()
    if (allSupported != null) __obj.updateDynamic("allSupported")(allSupported.asInstanceOf[js.Any])
    if (includeGlobalResourceTypes != null) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes.asInstanceOf[js.Any])
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllSupportedIncludeGlobalResourceTypes]
  }
}

