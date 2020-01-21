package typings.router5.routerMod

import typings.routeNode.mod.QueryParamsMode
import typings.routeNode.mod.TrailingSlashMode
import typings.router5.baseMod.Params
import typings.searchParams.encodeMod.IOptions
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
    val __obj = js.Dynamic.literal(allowNotFound = allowNotFound.asInstanceOf[js.Any], autoCleanUp = autoCleanUp.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], queryParamsMode = queryParamsMode.asInstanceOf[js.Any], rewritePathOnMatch = rewritePathOnMatch.asInstanceOf[js.Any], strictTrailingSlash = strictTrailingSlash.asInstanceOf[js.Any], strongMatching = strongMatching.asInstanceOf[js.Any], trailingSlashMode = trailingSlashMode.asInstanceOf[js.Any])
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams.asInstanceOf[js.Any])
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(defaultRoute.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

