package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNotFound: scala.Boolean
  var autoCleanUp: scala.Boolean
  var caseSensitive: scala.Boolean
  var defaultParams: js.UndefOr[router5Lib.typesTypesBaseMod.Params] = js.undefined
  var defaultRoute: js.UndefOr[java.lang.String] = js.undefined
  var queryParams: js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions] = js.undefined
  var queryParamsMode: routeDashNodeLib.routeDashNodeMod.QueryParamsMode
  var rewritePathOnMatch: scala.Boolean
  var strictTrailingSlash: scala.Boolean
  var strongMatching: scala.Boolean
  var trailingSlashMode: routeDashNodeLib.routeDashNodeMod.TrailingSlashMode
}

object Options {
  @scala.inline
  def apply(
    allowNotFound: scala.Boolean,
    autoCleanUp: scala.Boolean,
    caseSensitive: scala.Boolean,
    queryParamsMode: routeDashNodeLib.routeDashNodeMod.QueryParamsMode,
    rewritePathOnMatch: scala.Boolean,
    strictTrailingSlash: scala.Boolean,
    strongMatching: scala.Boolean,
    trailingSlashMode: routeDashNodeLib.routeDashNodeMod.TrailingSlashMode,
    defaultParams: router5Lib.typesTypesBaseMod.Params = null,
    defaultRoute: java.lang.String = null,
    queryParams: searchDashParamsLib.typingsEncodeMod.IOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(allowNotFound = allowNotFound, autoCleanUp = autoCleanUp, caseSensitive = caseSensitive, queryParamsMode = queryParamsMode, rewritePathOnMatch = rewritePathOnMatch, strictTrailingSlash = strictTrailingSlash, strongMatching = strongMatching, trailingSlashMode = trailingSlashMode)
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams)
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(defaultRoute)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Options]
  }
}

