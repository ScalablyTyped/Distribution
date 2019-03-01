package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshHints extends js.Object {
  var ignoreDiffsAfter: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDiffsBefore: js.UndefOr[scala.Boolean] = js.undefined
  var isFilterExpanding: js.UndefOr[scala.Boolean] = js.undefined
  var isFilterNarrowing: js.UndefOr[scala.Boolean] = js.undefined
  var isFilterUnchanged: js.UndefOr[scala.Boolean] = js.undefined
}

object RefreshHints {
  @scala.inline
  def apply(
    ignoreDiffsAfter: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDiffsBefore: js.UndefOr[scala.Boolean] = js.undefined,
    isFilterExpanding: js.UndefOr[scala.Boolean] = js.undefined,
    isFilterNarrowing: js.UndefOr[scala.Boolean] = js.undefined,
    isFilterUnchanged: js.UndefOr[scala.Boolean] = js.undefined
  ): RefreshHints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreDiffsAfter)) __obj.updateDynamic("ignoreDiffsAfter")(ignoreDiffsAfter)
    if (!js.isUndefined(ignoreDiffsBefore)) __obj.updateDynamic("ignoreDiffsBefore")(ignoreDiffsBefore)
    if (!js.isUndefined(isFilterExpanding)) __obj.updateDynamic("isFilterExpanding")(isFilterExpanding)
    if (!js.isUndefined(isFilterNarrowing)) __obj.updateDynamic("isFilterNarrowing")(isFilterNarrowing)
    if (!js.isUndefined(isFilterUnchanged)) __obj.updateDynamic("isFilterUnchanged")(isFilterUnchanged)
    __obj.asInstanceOf[RefreshHints]
  }
}

