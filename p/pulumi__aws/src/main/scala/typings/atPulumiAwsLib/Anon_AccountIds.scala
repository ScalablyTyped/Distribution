package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIds extends js.Object {
  var accountIds: js.Array[java.lang.String]
  var allRegions: js.UndefOr[scala.Boolean] = js.undefined
  var regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AccountIds {
  @scala.inline
  def apply(
    accountIds: js.Array[java.lang.String],
    allRegions: js.UndefOr[scala.Boolean] = js.undefined,
    regions: js.Array[java.lang.String] = null
  ): Anon_AccountIds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountIds")(accountIds)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Anon_AccountIds]
  }
}

