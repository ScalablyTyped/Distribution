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

