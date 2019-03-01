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

object ConfigObject {
  @scala.inline
  def apply(
    aliases: scala.Boolean | js.Object = null,
    filters: scala.Boolean | Callback | js.Array[Callback] = null,
    maxItems: scala.Int | scala.Double = null,
    parsedErrorFilters: scala.Boolean | Callback | js.Array[Callback] = null,
    skip: scala.Boolean | Callback | js.Array[Callback] = null,
    skipNodeFiles: scala.Boolean | js.Any = null,
    skipPackages: scala.Boolean | js.Array[java.lang.String] = null,
    skipPaths: scala.Boolean | js.Array[java.lang.String] = null
  ): ConfigObject = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (parsedErrorFilters != null) __obj.updateDynamic("parsedErrorFilters")(parsedErrorFilters.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (skipNodeFiles != null) __obj.updateDynamic("skipNodeFiles")(skipNodeFiles.asInstanceOf[js.Any])
    if (skipPackages != null) __obj.updateDynamic("skipPackages")(skipPackages.asInstanceOf[js.Any])
    if (skipPaths != null) __obj.updateDynamic("skipPaths")(skipPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigObject]
  }
}

