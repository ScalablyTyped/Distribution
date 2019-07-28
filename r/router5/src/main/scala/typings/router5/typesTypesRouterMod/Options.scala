package typings.router5.typesTypesRouterMod

import typings.routeDashNode.routeDashNodeMod.QueryParamsMode
import typings.routeDashNode.routeDashNodeMod.TrailingSlashMode
import typings.router5.typesTypesBaseMod.Params
import typings.searchDashParams.typingsEncodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNotFound: Boolean
  var autoCleanUp: Boolean
  var caseSensitive: Boolean
  var defaultParams: js.UndefOr[Params] = js.undefined
  var defaultRoute: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[IOptions] = js.undefined
  var queryParamsMode: QueryParamsMode
  var rewritePathOnMatch: Boolean
  var strictTrailingSlash: Boolean
  var strongMatching: Boolean
  var trailingSlashMode: TrailingSlashMode
}

object Options {
  @scala.inline
  def apply(
    allowNotFound: Boolean,
    autoCleanUp: Boolean,
    caseSensitive: Boolean,
    queryParamsMode: QueryParamsMode,
    rewritePathOnMatch: Boolean,
    strictTrailingSlash: Boolean,
    strongMatching: Boolean,
    trailingSlashMode: TrailingSlashMode,
    defaultParams: Params = null,
    defaultRoute: String = null,
    queryParams: IOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(allowNotFound = allowNotFound, autoCleanUp = autoCleanUp, caseSensitive = caseSensitive, queryParamsMode = queryParamsMode, rewritePathOnMatch = rewritePathOnMatch, strictTrailingSlash = strictTrailingSlash, strongMatching = strongMatching, trailingSlashMode = trailingSlashMode)
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams)
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(defaultRoute)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Options]
  }
}

