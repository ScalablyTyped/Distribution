package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseOptionalParams extends js.Object {
  var createFromLocation: js.UndefOr[Double | String] = js.undefined
  // Database encryption pass phrase
  var key: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
}

object DatabaseOptionalParams {
  @scala.inline
  def apply(
    createFromLocation: Double | String = null,
    key: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): DatabaseOptionalParams = {
    val __obj = js.Dynamic.literal()
    if (createFromLocation != null) __obj.updateDynamic("createFromLocation")(createFromLocation.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[DatabaseOptionalParams]
  }
}

