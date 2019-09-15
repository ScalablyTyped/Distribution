package typings.atStorybookComponents.distBlocksPreviewMod

import typings.atStorybookComponents.distBlocksSourceMod.SourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewProps extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var isColumn: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var withSource: js.UndefOr[SourceProps] = js.undefined
  var withToolbar: js.UndefOr[Boolean] = js.undefined
}

object PreviewProps {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    isColumn: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    withSource: SourceProps = null,
    withToolbar: js.UndefOr[Boolean] = js.undefined
  ): PreviewProps = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (withSource != null) __obj.updateDynamic("withSource")(withSource)
    if (!js.isUndefined(withToolbar)) __obj.updateDynamic("withToolbar")(withToolbar)
    __obj.asInstanceOf[PreviewProps]
  }
}

