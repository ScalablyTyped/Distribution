package typings.prettyDashError.prettyDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigObject extends js.Object {
  var aliases: js.UndefOr[Boolean | js.Object] = js.undefined
  // assuming this is optional
  var filters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var parsedErrorFilters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
  var skip: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.undefined
  var skipNodeFiles: js.UndefOr[Boolean | js.Any] = js.undefined
  var skipPackages: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var skipPaths: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object ConfigObject {
  @scala.inline
  def apply(
    aliases: Boolean | js.Object = null,
    filters: Boolean | Callback | js.Array[Callback] = null,
    maxItems: Int | Double = null,
    parsedErrorFilters: Boolean | Callback | js.Array[Callback] = null,
    skip: Boolean | Callback | js.Array[Callback] = null,
    skipNodeFiles: Boolean | js.Any = null,
    skipPackages: Boolean | js.Array[String] = null,
    skipPaths: Boolean | js.Array[String] = null
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

