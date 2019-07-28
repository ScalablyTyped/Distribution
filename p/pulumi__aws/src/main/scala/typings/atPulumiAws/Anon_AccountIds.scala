package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIds extends js.Object {
  var accountIds: js.Array[String]
  var allRegions: js.UndefOr[Boolean] = js.undefined
  var regions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_AccountIds {
  @scala.inline
  def apply(
    accountIds: js.Array[String],
    allRegions: js.UndefOr[Boolean] = js.undefined,
    regions: js.Array[String] = null
  ): Anon_AccountIds = {
    val __obj = js.Dynamic.literal(accountIds = accountIds)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Anon_AccountIds]
  }
}

