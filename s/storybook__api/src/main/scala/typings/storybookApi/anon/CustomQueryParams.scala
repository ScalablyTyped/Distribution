package typings.storybookApi.anon

import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.std.Record
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.layoutMod.UI
import typings.storybookApi.mod.Args
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.settingsMod.Settings
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.UnknownEntries
import typings.storybookApi.versionsMod.Versions
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryParams extends StObject {
  
  var customQueryParams: QueryParams = js.native
  
  var dismissedVersionNotification: String = js.native
  
  var globals: Args = js.native
  
  var lastVersionCheck: Double = js.native
  
  var layout: Layout = js.native
  
  var location: WindowLocation[js.Object] = js.native
  
  var navigate: js.UndefOr[NavigateFn] = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  var path: String = js.native
  
  var refId: String = js.native
  
  var refs: Record[String, ComposedRef] = js.native
  
  var releaseNotesViewed: js.Array[String] = js.native
  
  var selectedPanel: String = js.native
  
  var settings: Settings = js.native
  
  var shortcuts: Shortcuts = js.native
  
  var storiesConfigured: Boolean = js.native
  
  var storiesFailed: js.UndefOr[typings.std.Error] = js.native
  
  var storiesHash: StoriesHash = js.native
  
  var storyId: String = js.native
  
  var theme: ThemeVars = js.native
  
  var ui: UI = js.native
  
  var versions: Versions with UnknownEntries = js.native
  
  var viewMode: String = js.native
}
object CustomQueryParams {
  
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    globals: Args,
    lastVersionCheck: Double,
    layout: Layout,
    location: WindowLocation[js.Object],
    notifications: js.Array[Notification],
    path: String,
    refId: String,
    refs: Record[String, ComposedRef],
    releaseNotesViewed: js.Array[String],
    selectedPanel: String,
    settings: Settings,
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: String,
    theme: ThemeVars,
    ui: UI,
    versions: Versions with UnknownEntries,
    viewMode: String
  ): CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomQueryParams]
  }
  
  @scala.inline
  implicit class CustomQueryParamsMutableBuilder[Self <: CustomQueryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WindowLocation[js.Object]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: Record[String, ComposedRef]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value :_*))
    
    @scala.inline
    def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesFailed(value: typings.std.Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
    
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: Versions with UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
