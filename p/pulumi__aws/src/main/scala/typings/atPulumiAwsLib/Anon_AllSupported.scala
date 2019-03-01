package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllSupported extends js.Object {
  var allSupported: js.UndefOr[scala.Boolean] = js.undefined
  var includeGlobalResourceTypes: js.UndefOr[scala.Boolean] = js.undefined
  var resourceTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AllSupported {
  @scala.inline
  def apply(
    allSupported: js.UndefOr[scala.Boolean] = js.undefined,
    includeGlobalResourceTypes: js.UndefOr[scala.Boolean] = js.undefined,
    resourceTypes: js.Array[java.lang.String] = null
  ): Anon_AllSupported = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSupported)) __obj.updateDynamic("allSupported")(allSupported)
    if (!js.isUndefined(includeGlobalResourceTypes)) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes)
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes)
    __obj.asInstanceOf[Anon_AllSupported]
  }
}

