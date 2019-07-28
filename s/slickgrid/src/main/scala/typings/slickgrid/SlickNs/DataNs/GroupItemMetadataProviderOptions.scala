package typings.slickgrid.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemMetadataProviderOptions extends js.Object {
  var enableExpandCollapse: js.UndefOr[Boolean] = js.undefined
  var groupCssClass: js.UndefOr[String] = js.undefined
  var groupFocusable: js.UndefOr[Boolean] = js.undefined
  var groupTitleCssClass: js.UndefOr[String] = js.undefined
  var toggleCollapsedCssClass: js.UndefOr[String] = js.undefined
  var toggleCssClass: js.UndefOr[String] = js.undefined
  var toggleExpandedCssCass: js.UndefOr[String] = js.undefined
  var totalsCssClass: js.UndefOr[String] = js.undefined
  var totalsFocusable: js.UndefOr[Boolean] = js.undefined
}

object GroupItemMetadataProviderOptions {
  @scala.inline
  def apply(
    enableExpandCollapse: js.UndefOr[Boolean] = js.undefined,
    groupCssClass: String = null,
    groupFocusable: js.UndefOr[Boolean] = js.undefined,
    groupTitleCssClass: String = null,
    toggleCollapsedCssClass: String = null,
    toggleCssClass: String = null,
    toggleExpandedCssCass: String = null,
    totalsCssClass: String = null,
    totalsFocusable: js.UndefOr[Boolean] = js.undefined
  ): GroupItemMetadataProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableExpandCollapse)) __obj.updateDynamic("enableExpandCollapse")(enableExpandCollapse)
    if (groupCssClass != null) __obj.updateDynamic("groupCssClass")(groupCssClass)
    if (!js.isUndefined(groupFocusable)) __obj.updateDynamic("groupFocusable")(groupFocusable)
    if (groupTitleCssClass != null) __obj.updateDynamic("groupTitleCssClass")(groupTitleCssClass)
    if (toggleCollapsedCssClass != null) __obj.updateDynamic("toggleCollapsedCssClass")(toggleCollapsedCssClass)
    if (toggleCssClass != null) __obj.updateDynamic("toggleCssClass")(toggleCssClass)
    if (toggleExpandedCssCass != null) __obj.updateDynamic("toggleExpandedCssCass")(toggleExpandedCssCass)
    if (totalsCssClass != null) __obj.updateDynamic("totalsCssClass")(totalsCssClass)
    if (!js.isUndefined(totalsFocusable)) __obj.updateDynamic("totalsFocusable")(totalsFocusable)
    __obj.asInstanceOf[GroupItemMetadataProviderOptions]
  }
}

