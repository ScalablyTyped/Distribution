package typings.routeDashNode.routeDashNodeMod

import typings.searchDashParams.typingsEncodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var queryParams: js.UndefOr[IOptions] = js.undefined
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
  var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var strongMatching: js.UndefOr[Boolean] = js.undefined
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
}

object MatchOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    queryParams: IOptions = null,
    queryParamsMode: QueryParamsMode = null,
    strictTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    strongMatching: js.UndefOr[Boolean] = js.undefined,
    trailingSlashMode: TrailingSlashMode = null
  ): MatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (queryParamsMode != null) __obj.updateDynamic("queryParamsMode")(queryParamsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(strictTrailingSlash)) __obj.updateDynamic("strictTrailingSlash")(strictTrailingSlash.asInstanceOf[js.Any])
    if (!js.isUndefined(strongMatching)) __obj.updateDynamic("strongMatching")(strongMatching.asInstanceOf[js.Any])
    if (trailingSlashMode != null) __obj.updateDynamic("trailingSlashMode")(trailingSlashMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchOptions]
  }
}

