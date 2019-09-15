package typings.atStorybookApi

import typings.atReachRouter.atReachRouterMod.NavigateFn
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.atStorybookApi.distModulesLayoutMod.Layout
import typings.atStorybookApi.distModulesLayoutMod.UI
import typings.atStorybookApi.distModulesNotificationsMod.Notification
import typings.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typings.atStorybookApi.distModulesStoriesMod.StoriesHash
import typings.atStorybookApi.distModulesUrlMod.QueryParams
import typings.atStorybookApi.distModulesVersionsMod.UnknownEntries
import typings.atStorybookApi.distModulesVersionsMod.Versions
import typings.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParams extends js.Object {
  var customQueryParams: QueryParams
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var layout: Layout
  var location: WindowLocation
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var notifications: js.Array[Notification]
  var path: String
  var selectedPanel: String
  var shortcuts: Shortcuts
  var storiesConfigured: Boolean
  var storiesHash: StoriesHash
  var storyId: String
  var theme: ThemeVars
  var ui: UI
  var uri: js.UndefOr[String] = js.undefined
  var versions: Versions with UnknownEntries
  var viewMode: String
}

object Anon_CustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    lastVersionCheck: Double,
    layout: Layout,
    location: WindowLocation,
    notifications: js.Array[Notification],
    path: String,
    selectedPanel: String,
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: String,
    theme: ThemeVars,
    ui: UI,
    versions: Versions with UnknownEntries,
    viewMode: String,
    default: js.UndefOr[Boolean] = js.undefined,
    navigate: NavigateFn = null,
    uri: String = null
  ): Anon_CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams, dismissedVersionNotification = dismissedVersionNotification, lastVersionCheck = lastVersionCheck, layout = layout, location = location, notifications = notifications, path = path, selectedPanel = selectedPanel, shortcuts = shortcuts, storiesConfigured = storiesConfigured, storiesHash = storiesHash, storyId = storyId, theme = theme, ui = ui, versions = versions, viewMode = viewMode)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_CustomQueryParams]
  }
}

