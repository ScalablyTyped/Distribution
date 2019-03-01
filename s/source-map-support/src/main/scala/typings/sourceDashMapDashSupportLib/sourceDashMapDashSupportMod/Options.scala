package typings
package sourceDashMapDashSupportLib.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var emptyCacheBetweenOperations: js.UndefOr[scala.Boolean] = js.undefined
  var environment: js.UndefOr[
    sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.auto | sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.browser | sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.node
  ] = js.undefined
  var handleUncaughtExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var hookRequire: js.UndefOr[scala.Boolean] = js.undefined
  var overrideRetrieveFile: js.UndefOr[scala.Boolean] = js.undefined
  var overrideRetrieveSourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var retrieveFile: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ java.lang.String, UrlAndMap | scala.Null]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    emptyCacheBetweenOperations: js.UndefOr[scala.Boolean] = js.undefined,
    environment: sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.auto | sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.browser | sourceDashMapDashSupportLib.sourceDashMapDashSupportLibStrings.node = null,
    handleUncaughtExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    hookRequire: js.UndefOr[scala.Boolean] = js.undefined,
    overrideRetrieveFile: js.UndefOr[scala.Boolean] = js.undefined,
    overrideRetrieveSourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    retrieveFile: js.Function1[/* path */ java.lang.String, java.lang.String] = null,
    retrieveSourceMap: js.Function1[/* source */ java.lang.String, UrlAndMap | scala.Null] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyCacheBetweenOperations)) __obj.updateDynamic("emptyCacheBetweenOperations")(emptyCacheBetweenOperations)
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(handleUncaughtExceptions)) __obj.updateDynamic("handleUncaughtExceptions")(handleUncaughtExceptions)
    if (!js.isUndefined(hookRequire)) __obj.updateDynamic("hookRequire")(hookRequire)
    if (!js.isUndefined(overrideRetrieveFile)) __obj.updateDynamic("overrideRetrieveFile")(overrideRetrieveFile)
    if (!js.isUndefined(overrideRetrieveSourceMap)) __obj.updateDynamic("overrideRetrieveSourceMap")(overrideRetrieveSourceMap)
    if (retrieveFile != null) __obj.updateDynamic("retrieveFile")(retrieveFile)
    if (retrieveSourceMap != null) __obj.updateDynamic("retrieveSourceMap")(retrieveSourceMap)
    __obj.asInstanceOf[Options]
  }
}

