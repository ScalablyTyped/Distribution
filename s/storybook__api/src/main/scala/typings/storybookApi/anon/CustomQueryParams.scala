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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryParams extends js.Object {
  var customQueryParams: QueryParams = js.native
  var default: js.UndefOr[Boolean] = js.native
  var dismissedVersionNotification: String = js.native
  var lastVersionCheck: Double = js.native
  var layout: typings.storybookApi.layoutMod.Layout = js.native
  var location: WindowLocation[LocationState] = js.native
  var navigate: js.UndefOr[NavigateFn] = js.native
  var notifications: js.Array[Notification] = js.native
  var path: String = js.native
  var selectedPanel: String = js.native
  var shortcuts: Shortcuts = js.native
  var storiesConfigured: Boolean = js.native
  var storiesHash: StoriesHash = js.native
  var storyId: String = js.native
  var theme: ThemeVars = js.native
  var ui: UI = js.native
  var uri: js.UndefOr[String] = js.native
  var versions: Versions with UnknownEntries = js.native
  var viewMode: String = js.native
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
    viewMode: String
  ): CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomQueryParams]
  }
  @scala.inline
  implicit class CustomQueryParamsOps[Self <: CustomQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomQueryParams(value: QueryParams): Self = this.set("customQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setDismissedVersionNotification(value: String): Self = this.set("dismissedVersionNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastVersionCheck(value: Double): Self = this.set("lastVersionCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: typings.storybookApi.layoutMod.Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortcuts(value: Shortcuts): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = this.set("storiesHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: ThemeVars): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setUi(value: UI): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersions(value: Versions with UnknownEntries): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

