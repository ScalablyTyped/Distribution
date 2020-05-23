package typings.storybookApi.anon

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.layoutMod.UI
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.UnknownEntries
import typings.storybookApi.versionsMod.Versions
import typings.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomQueryParams extends js.Object {
  var customQueryParams: QueryParams
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var layout: typings.storybookApi.layoutMod.Layout
  var location: WindowLocation[LocationState]
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

object CustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    lastVersionCheck: Double,
    layout: typings.storybookApi.layoutMod.Layout,
    location: WindowLocation[LocationState],
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
  ): CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomQueryParams]
  }
}

