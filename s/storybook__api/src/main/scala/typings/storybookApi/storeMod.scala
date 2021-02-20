package typings.storybookApi

import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.std.Error
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.layoutMod.UI
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.State
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.settingsMod.Settings
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storybookApiStrings.none
import typings.storybookApi.storybookApiStrings.session
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.UnknownEntries
import typings.storybookApi.versionsMod.Versions
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("@storybook/api/dist/store", JSImport.Default)
  @js.native
  class default protected () extends Store {
    def this(hasSetStateGetState: Upstream) = this()
  }
  
  @JSImport("@storybook/api/dist/store", "STORAGE_KEY")
  @js.native
  val STORAGE_KEY: /* "@storybook/ui/store" */ String = js.native
  
  type CallBack = js.Function1[/* s */ State, Unit]
  
  type GetState = js.Function0[State]
  
  type InputFnPatch = js.Function1[/* s */ State, Patch]
  
  type InputPatch = Patch | InputFnPatch
  
  @js.native
  trait Options extends StObject {
    
    var persistence: none | session | String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(persistence: none | session | String): Options = {
      val __obj = js.Dynamic.literal(persistence = persistence.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistence(value: none | session | String): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@storybook/api.@storybook/api.State> */
  @js.native
  trait Patch extends StObject {
    
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
    implicit class PatchMutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
      
      @scala.inline
      def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissedVersionNotificationUndefined: Self = StObject.set(x, "dismissedVersionNotification", js.undefined)
      
      @scala.inline
      def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVersionCheckUndefined: Self = StObject.set(x, "lastVersionCheck", js.undefined)
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      @scala.inline
      def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNotesViewedUndefined: Self = StObject.set(x, "releaseNotesViewed", js.undefined)
      
      @scala.inline
      def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value :_*))
      
      @scala.inline
      def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
      
      @scala.inline
      def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesConfiguredUndefined: Self = StObject.set(x, "storiesConfigured", js.undefined)
      
      @scala.inline
      def setStoriesFailed(value: Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      @scala.inline
      def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesHashUndefined: Self = StObject.set(x, "storiesHash", js.undefined)
      
      @scala.inline
      def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
      ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      @scala.inline
      def setVersions(value: Versions with UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
      
      @scala.inline
      def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
  
  @js.native
  trait Store extends StObject {
    
    def getInitialState(base: State): js.Any = js.native
    
    def getState(): State = js.native
    
    def setState(inputPatch: InputPatch): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: js.UndefOr[scala.Nothing], options: Options): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: CallBack): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: CallBack, options: Options): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, options: Options): js.Promise[State] = js.native
    
    var upstreamGetState: GetState = js.native
    
    var upstreamSetState: SetState = js.native
  }
  
  @js.native
  trait Upstream extends StObject {
    
    var getState: GetState = js.native
    
    var setState: SetState = js.native
  }
  object Upstream {
    
    @scala.inline
    def apply(getState: () => State, setState: (/* a */ js.Any, /* b */ js.Any) => js.Any): Upstream = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState))
      __obj.asInstanceOf[Upstream]
    }
    
    @scala.inline
    implicit class UpstreamMutableBuilder[Self <: Upstream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: (/* a */ js.Any, /* b */ js.Any) => js.Any): Self = StObject.set(x, "setState", js.Any.fromFunction2(value))
    }
  }
}
