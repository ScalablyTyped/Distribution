package typings
package prettyDashErrorLib.prettyDashErrorMod.PrettyErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigObject extends js.Object {
  var aliases: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  // assuming this is optional
  var filters: js.UndefOr[scala.Boolean | Callback | js.Array[Callback]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var parsedErrorFilters: js.UndefOr[scala.Boolean | Callback | js.Array[Callback]] = js.undefined
  var skip: js.UndefOr[scala.Boolean | Callback | js.Array[Callback]] = js.undefined
  var skipNodeFiles: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var skipPackages: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var skipPaths: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

