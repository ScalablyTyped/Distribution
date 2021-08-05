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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomQueryParams extends StObject {
  
  var customQueryParams: QueryParams
  
  var dismissedVersionNotification: String
  
  var globals: Args
  
  var lastVersionCheck: Double
  
  var layout: Layout
  
  var location: WindowLocation[js.Object]
  
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  
  var notifications: js.Array[Notification]
  
  var path: String
  
  var refId: String
  
  var refs: Record[String, ComposedRef]
  
  var releaseNotesViewed: js.Array[String]
  
  var selectedPanel: String
  
  var settings: Settings
  
  var shortcuts: Shortcuts
  
  var storiesConfigured: Boolean
  
  var storiesFailed: js.UndefOr[typings.std.Error] = js.undefined
  
  var storiesHash: StoriesHash
  
  var storyId: String
  
  var theme: ThemeVars
  
  var ui: UI
  
  var versions: Versions & UnknownEntries
  
  var viewMode: String
}
object CustomQueryParams {
  
  inline def apply(
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
    versions: Versions & UnknownEntries,
    viewMode: String
  ): CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomQueryParams]
  }
  
  extension [Self <: CustomQueryParams](x: Self) {
    
    inline def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    
    inline def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
    
    inline def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WindowLocation[js.Object]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    inline def setRefs(value: Record[String, ComposedRef]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value :_*))
    
    inline def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    inline def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
    
    inline def setStoriesFailed(value: typings.std.Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
    
    inline def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
    
    inline def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
    
    inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: Versions & UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
