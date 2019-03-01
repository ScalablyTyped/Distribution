package typings
package atStorybookAddonDashOptionsLib.atStorybookAddonDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // deprecated; use addonPanelInRight
  var addonPanelInRight: js.UndefOr[scala.Boolean] = js.undefined
  var downPanelInRight: js.UndefOr[scala.Boolean] = js.undefined
  var enableShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  var goFullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var hierarchyRootSeparator: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  var hierarchySeparator: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var selectedAddonPanel: js.UndefOr[java.lang.String] = js.undefined
   // deprecated; use showAddonPanel
  var showAddonPanel: js.UndefOr[scala.Boolean] = js.undefined
  var showDownPanel: js.UndefOr[scala.Boolean] = js.undefined
  var showLeftPanel: js.UndefOr[scala.Boolean] = js.undefined
  var showSearchBox: js.UndefOr[scala.Boolean] = js.undefined
   // deprecated, use showStoriesPanel
  var showStoriesPanel: js.UndefOr[scala.Boolean] = js.undefined
  var sidebarAnimations: js.UndefOr[scala.Boolean] = js.undefined
  var sortStoriesByKind: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addonPanelInRight: js.UndefOr[scala.Boolean] = js.undefined,
    downPanelInRight: js.UndefOr[scala.Boolean] = js.undefined,
    enableShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    goFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    hierarchyRootSeparator: stdLib.RegExp | java.lang.String = null,
    hierarchySeparator: stdLib.RegExp | java.lang.String = null,
    name: java.lang.String = null,
    selectedAddonPanel: java.lang.String = null,
    showAddonPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showDownPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showLeftPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showSearchBox: js.UndefOr[scala.Boolean] = js.undefined,
    showStoriesPanel: js.UndefOr[scala.Boolean] = js.undefined,
    sidebarAnimations: js.UndefOr[scala.Boolean] = js.undefined,
    sortStoriesByKind: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addonPanelInRight)) __obj.updateDynamic("addonPanelInRight")(addonPanelInRight)
    if (!js.isUndefined(downPanelInRight)) __obj.updateDynamic("downPanelInRight")(downPanelInRight)
    if (!js.isUndefined(enableShortcuts)) __obj.updateDynamic("enableShortcuts")(enableShortcuts)
    if (!js.isUndefined(goFullScreen)) __obj.updateDynamic("goFullScreen")(goFullScreen)
    if (hierarchyRootSeparator != null) __obj.updateDynamic("hierarchyRootSeparator")(hierarchyRootSeparator.asInstanceOf[js.Any])
    if (hierarchySeparator != null) __obj.updateDynamic("hierarchySeparator")(hierarchySeparator.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (selectedAddonPanel != null) __obj.updateDynamic("selectedAddonPanel")(selectedAddonPanel)
    if (!js.isUndefined(showAddonPanel)) __obj.updateDynamic("showAddonPanel")(showAddonPanel)
    if (!js.isUndefined(showDownPanel)) __obj.updateDynamic("showDownPanel")(showDownPanel)
    if (!js.isUndefined(showLeftPanel)) __obj.updateDynamic("showLeftPanel")(showLeftPanel)
    if (!js.isUndefined(showSearchBox)) __obj.updateDynamic("showSearchBox")(showSearchBox)
    if (!js.isUndefined(showStoriesPanel)) __obj.updateDynamic("showStoriesPanel")(showStoriesPanel)
    if (!js.isUndefined(sidebarAnimations)) __obj.updateDynamic("sidebarAnimations")(sidebarAnimations)
    if (!js.isUndefined(sortStoriesByKind)) __obj.updateDynamic("sortStoriesByKind")(sortStoriesByKind)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Options]
  }
}

