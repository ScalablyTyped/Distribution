package typings.storybookApi.storeMod

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.std.Error
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.layoutMod.UI
import typings.storybookApi.mod.Args
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.settingsMod.Settings
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.UnknownEntries
import typings.storybookApi.versionsMod.Versions
import typings.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/api.@storybook/api.State> */
@js.native
trait Patch extends js.Object {
  
  var customQueryParams: js.UndefOr[QueryParams] = js.native
  
  var dismissedVersionNotification: js.UndefOr[String] = js.native
  
  var globals: js.UndefOr[Args] = js.native
  
  var lastVersionCheck: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[Layout] = js.native
  
  var location: js.UndefOr[WindowLocation[LocationState]] = js.native
  
  var navigate: js.UndefOr[NavigateFn] = js.native
  
  var notifications: js.UndefOr[js.Array[Notification]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var refId: js.UndefOr[String] = js.native
  
  var refs: js.UndefOr[Refs] = js.native
  
  var releaseNotesViewed: js.UndefOr[js.Array[String]] = js.native
  
  var selectedPanel: js.UndefOr[String] = js.native
  
  var settings: js.UndefOr[Settings] = js.native
  
  var shortcuts: js.UndefOr[Shortcuts] = js.native
  
  var storiesConfigured: js.UndefOr[Boolean] = js.native
  
  var storiesFailed: js.UndefOr[Error] = js.native
  
  var storiesHash: js.UndefOr[StoriesHash] = js.native
  
  var storyId: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ] = js.native
  
  var theme: js.UndefOr[ThemeVars] = js.native
  
  var ui: js.UndefOr[UI] = js.native
  
  var versions: js.UndefOr[Versions with UnknownEntries] = js.native
  
  var viewMode: js.UndefOr[ViewMode] = js.native
}
object Patch {
  
  @scala.inline
  def apply(): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
    
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
    def deleteCustomQueryParams: Self = this.set("customQueryParams", js.undefined)
    
    @scala.inline
    def setDismissedVersionNotification(value: String): Self = this.set("dismissedVersionNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissedVersionNotification: Self = this.set("dismissedVersionNotification", js.undefined)
    
    @scala.inline
    def setGlobals(value: Args): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setLastVersionCheck(value: Double): Self = this.set("lastVersionCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastVersionCheck: Self = this.set("lastVersionCheck", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    
    @scala.inline
    def setRefs(value: Refs): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    
    @scala.inline
    def setReleaseNotesViewedVarargs(value: String*): Self = this.set("releaseNotesViewed", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotesViewed(value: js.Array[String]): Self = this.set("releaseNotesViewed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseNotesViewed: Self = this.set("releaseNotesViewed", js.undefined)
    
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedPanel: Self = this.set("selectedPanel", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setShortcuts(value: Shortcuts): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    
    @scala.inline
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesConfigured: Self = this.set("storiesConfigured", js.undefined)
    
    @scala.inline
    def setStoriesFailed(value: Error): Self = this.set("storiesFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesFailed: Self = this.set("storiesFailed", js.undefined)
    
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = this.set("storiesHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesHash: Self = this.set("storiesHash", js.undefined)
    
    @scala.inline
    def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
    ): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeVars): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUi(value: UI): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    
    @scala.inline
    def setVersions(value: Versions with UnknownEntries): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
