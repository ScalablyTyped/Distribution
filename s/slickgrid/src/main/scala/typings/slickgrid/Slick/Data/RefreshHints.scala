package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshHints extends js.Object {
  var ignoreDiffsAfter: js.UndefOr[Boolean] = js.undefined
  var ignoreDiffsBefore: js.UndefOr[Boolean] = js.undefined
  var isFilterExpanding: js.UndefOr[Boolean] = js.undefined
  var isFilterNarrowing: js.UndefOr[Boolean] = js.undefined
  var isFilterUnchanged: js.UndefOr[Boolean] = js.undefined
}

object RefreshHints {
  @scala.inline
  def apply(
    ignoreDiffsAfter: js.UndefOr[Boolean] = js.undefined,
    ignoreDiffsBefore: js.UndefOr[Boolean] = js.undefined,
    isFilterExpanding: js.UndefOr[Boolean] = js.undefined,
    isFilterNarrowing: js.UndefOr[Boolean] = js.undefined,
    isFilterUnchanged: js.UndefOr[Boolean] = js.undefined
  ): RefreshHints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreDiffsAfter)) __obj.updateDynamic("ignoreDiffsAfter")(ignoreDiffsAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDiffsBefore)) __obj.updateDynamic("ignoreDiffsBefore")(ignoreDiffsBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilterExpanding)) __obj.updateDynamic("isFilterExpanding")(isFilterExpanding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilterNarrowing)) __obj.updateDynamic("isFilterNarrowing")(isFilterNarrowing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilterUnchanged)) __obj.updateDynamic("isFilterUnchanged")(isFilterUnchanged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshHints]
  }
}

