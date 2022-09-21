package typings.storybookApi

import typings.std.ReturnType
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.layoutMod.UI
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
import typings.storybookRouter.anon.PartialLocationAncestorOrigins
import typings.storybookTheming.mod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("@storybook/api/dist/ts3.9/store", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Store {
    def this(hasSetStateGetState: Upstream) = this()
  }
  
  @JSImport("@storybook/api/dist/ts3.9/store", "STORAGE_KEY")
  @js.native
  val STORAGE_KEY: /* "@storybook/ui/store" */ String = js.native
  
  type CallBack = js.Function1[/* s */ State, Unit]
  
  type GetState = js.Function0[State]
  
  type InputFnPatch = js.Function1[/* s */ State, Patch]
  
  type InputPatch = Patch | InputFnPatch
  
  trait Options extends StObject {
    
    var persistence: none | session | String
  }
  object Options {
    
    inline def apply(persistence: none | session | String): Options = {
      val __obj = js.Dynamic.literal(persistence = persistence.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPersistence(value: none | session | String): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@storybook/api.@storybook/api.State> */
  trait Patch extends StObject {
    
    var customQueryParams: js.UndefOr[QueryParams] = js.undefined
    
    var dismissedVersionNotification: js.UndefOr[String] = js.undefined
    
    var globalTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ] = js.undefined
    
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
    
    var lastVersionCheck: js.UndefOr[Double] = js.undefined
    
    var layout: js.UndefOr[Layout] = js.undefined
    
    var location: js.UndefOr[PartialLocationAncestorOrigins] = js.undefined
    
    var navigate: js.UndefOr[
        ReturnType[
          js.Function0[
            js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
          ]
        ]
      ] = js.undefined
    
    var notifications: js.UndefOr[js.Array[Notification]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var refs: js.UndefOr[Refs] = js.undefined
    
    var releaseNotesViewed: js.UndefOr[js.Array[String]] = js.undefined
    
    var selectedPanel: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[Settings] = js.undefined
    
    var shortcuts: js.UndefOr[Shortcuts] = js.undefined
    
    var singleStory: js.UndefOr[Boolean] = js.undefined
    
    var storiesConfigured: js.UndefOr[Boolean] = js.undefined
    
    var storiesFailed: js.UndefOr[js.Error] = js.undefined
    
    var storiesHash: js.UndefOr[StoriesHash] = js.undefined
    
    var storyId: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ] = js.undefined
    
    var theme: js.UndefOr[ThemeVars] = js.undefined
    
    var ui: js.UndefOr[UI] = js.undefined
    
    var versions: js.UndefOr[Versions & UnknownEntries] = js.undefined
    
    var viewMode: js.UndefOr[ViewMode] = js.undefined
  }
  object Patch {
    
    inline def apply(): Patch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Patch]
    }
    
    extension [Self <: Patch](x: Self) {
      
      inline def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
      
      inline def setCustomQueryParamsUndefined: Self = StObject.set(x, "customQueryParams", js.undefined)
      
      inline def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
      
      inline def setDismissedVersionNotificationUndefined: Self = StObject.set(x, "dismissedVersionNotification", js.undefined)
      
      inline def setGlobalTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
      
      inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
      
      inline def setLastVersionCheckUndefined: Self = StObject.set(x, "lastVersionCheck", js.undefined)
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLocation(value: PartialLocationAncestorOrigins): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setNavigate(
        value: ReturnType[
              js.Function0[
                js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
              ]
            ]
      ): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesViewedUndefined: Self = StObject.set(x, "releaseNotesViewed", js.undefined)
      
      inline def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value*))
      
      inline def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
      
      inline def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
      
      inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
      
      inline def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      inline def setStoriesConfiguredUndefined: Self = StObject.set(x, "storiesConfigured", js.undefined)
      
      inline def setStoriesFailed(value: js.Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      inline def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
      
      inline def setStoriesHashUndefined: Self = StObject.set(x, "storiesHash", js.undefined)
      
      inline def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      inline def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      inline def setVersions(value: Versions & UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type SetState = js.Function2[/* a */ Any, /* b */ Any, Any]
  
  @js.native
  trait Store extends StObject {
    
    def getInitialState(base: State): Any = js.native
    
    def getState(): State = js.native
    
    def setState(inputPatch: InputPatch): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: Unit, options: Options): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: CallBack): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, callback: CallBack, options: Options): js.Promise[State] = js.native
    def setState(inputPatch: InputPatch, options: Options): js.Promise[State] = js.native
    
    var upstreamGetState: GetState = js.native
    
    var upstreamSetState: SetState = js.native
  }
  
  trait Upstream extends StObject {
    
    var getState: GetState
    
    var setState: SetState
  }
  object Upstream {
    
    inline def apply(getState: () => State, setState: (/* a */ Any, /* b */ Any) => Any): Upstream = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState))
      __obj.asInstanceOf[Upstream]
    }
    
    extension [Self <: Upstream](x: Self) {
      
      inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setSetState(value: (/* a */ Any, /* b */ Any) => Any): Self = StObject.set(x, "setState", js.Any.fromFunction2(value))
    }
  }
}
