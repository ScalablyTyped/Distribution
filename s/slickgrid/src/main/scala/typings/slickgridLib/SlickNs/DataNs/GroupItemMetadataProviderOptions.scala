package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemMetadataProviderOptions extends js.Object {
  var enableExpandCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var groupCssClass: js.UndefOr[java.lang.String] = js.undefined
  var groupFocusable: js.UndefOr[scala.Boolean] = js.undefined
  var groupTitleCssClass: js.UndefOr[java.lang.String] = js.undefined
  var toggleCollapsedCssClass: js.UndefOr[java.lang.String] = js.undefined
  var toggleCssClass: js.UndefOr[java.lang.String] = js.undefined
  var toggleExpandedCssCass: js.UndefOr[java.lang.String] = js.undefined
  var totalsCssClass: js.UndefOr[java.lang.String] = js.undefined
  var totalsFocusable: js.UndefOr[scala.Boolean] = js.undefined
}

object GroupItemMetadataProviderOptions {
  @scala.inline
  def apply(
    enableExpandCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    groupCssClass: java.lang.String = null,
    groupFocusable: js.UndefOr[scala.Boolean] = js.undefined,
    groupTitleCssClass: java.lang.String = null,
    toggleCollapsedCssClass: java.lang.String = null,
    toggleCssClass: java.lang.String = null,
    toggleExpandedCssCass: java.lang.String = null,
    totalsCssClass: java.lang.String = null,
    totalsFocusable: js.UndefOr[scala.Boolean] = js.undefined
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

