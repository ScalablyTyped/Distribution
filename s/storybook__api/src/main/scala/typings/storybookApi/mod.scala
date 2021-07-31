package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.LocationState
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.storybookApi.addonsMod.SubAPI
import typings.storybookApi.anon.CustomQueryParams
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.layoutMod.SubState
import typings.storybookApi.layoutMod.UI
import typings.storybookApi.notificationsMod.Notification
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.settingsMod.Settings
import typings.storybookApi.shortcutsMod.Shortcuts
import typings.storybookApi.storeMod.Options
import typings.storybookApi.storeMod.default
import typings.storybookApi.storiesMod.Item
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storybookApiStrings.addons
import typings.storybookApi.storybookApiStrings.canvas
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import typings.storybookApi.storybookApiStrings.sidebar
import typings.storybookApi.urlMod.QueryParams
import typings.storybookApi.versionsMod.UnknownEntries
import typings.storybookApi.versionsMod.Versions
import typings.storybookChannels.mod.Listener
import typings.storybookRouter.routerMod.RenderData
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ActiveTabs {
    
    @JSImport("@storybook/api", "ActiveTabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/api", "ActiveTabs.ADDONS")
    @js.native
    def ADDONS: addons = js.native
    @scala.inline
    def ADDONS_=(x: addons): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api", "ActiveTabs.CANVAS")
    @js.native
    def CANVAS: canvas = js.native
    @scala.inline
    def CANVAS_=(x: canvas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANVAS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api", "ActiveTabs.SIDEBAR")
    @js.native
    def SIDEBAR: sidebar = js.native
    @scala.inline
    def SIDEBAR_=(x: sidebar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDEBAR")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Consumer[P](hasFilterChildren: ManagerConsumerProps[P]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Consumer")(hasFilterChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@storybook/api", "Provider")
  @js.native
  class Provider protected () extends ManagerProvider {
    def this(props: ManagerProviderProps) = this()
  }
  object Provider {
    
    @JSImport("@storybook/api", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@storybook/api", "Provider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@storybook/api", "Provider.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.Function2[/* props */ ManagerProviderProps, /* state */ State, CustomQueryParams] = js.native
    @scala.inline
    def getDerivedStateFromProps_=(x: js.Function2[/* props */ ManagerProviderProps, /* state */ State, CustomQueryParams]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def combineParameters(parameterSets: Parameters*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroup")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean]
  
  @scala.inline
  def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean]
  
  @scala.inline
  def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStory")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean]
  
  @scala.inline
  def useAddonState[S](addonId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  @scala.inline
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  
  @scala.inline
  def useArgTypes(): ArgTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgTypes")().asInstanceOf[ArgTypes]
  
  @scala.inline
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  @scala.inline
  def useChannel(eventMap: EventMap): js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* type */ String, /* repeated */ js.Any, Unit]]
  @scala.inline
  def useChannel(eventMap: EventMap, deps: js.Array[js.Any]): js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* type */ String, /* repeated */ js.Any, Unit]]
  
  @scala.inline
  def useGlobalTypes(): ArgTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalTypes")().asInstanceOf[ArgTypes]
  
  @scala.inline
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]]]
  
  @scala.inline
  def useParameter[S](parameterKey: String): S = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[S]
  @scala.inline
  def useParameter[S](parameterKey: String, defaultValue: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[S]
  
  @scala.inline
  def useSharedState[S](stateId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(stateId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  @scala.inline
  def useSharedState[S](stateId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(stateId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  
  @scala.inline
  def useStorybookApi(): API = ^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookApi")().asInstanceOf[API]
  
  @scala.inline
  def useStorybookState(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookState")().asInstanceOf[State]
  
  @js.native
  trait API
    extends StObject
       with SubAPI
       with typings.storybookApi.channelMod.SubAPI
       with typings.storybookApi.providerMod.SubAPI
       with typings.storybookApi.modulesStoriesMod.SubAPI
       with typings.storybookApi.refsMod.SubAPI
       with typings.storybookApi.globalsMod.SubAPI
       with typings.storybookApi.layoutMod.SubAPI
       with typings.storybookApi.notificationsMod.SubAPI
       with typings.storybookApi.shortcutsMod.SubAPI
       with typings.storybookApi.releaseNotesMod.SubAPI
       with typings.storybookApi.settingsMod.SubAPI
       with typings.storybookApi.versionsMod.SubAPI
       with typings.storybookApi.urlMod.SubAPI
       with Other
  
  trait ArgType
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ArgType {
    
    @scala.inline
    def apply(): ArgType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgType]
    }
    
    @scala.inline
    implicit class ArgTypeMutableBuilder[Self <: ArgType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ArgTypes = StringDictionary[ArgType]
  
  type Args = StringDictionary[js.Any]
  
  trait Combo extends StObject {
    
    var api: API
    
    var state: State
  }
  object Combo {
    
    @scala.inline
    def apply(api: API, state: State): Combo = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Combo]
    }
    
    @scala.inline
    implicit class ComboMutableBuilder[Self <: Combo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type EventMap = StringDictionary[Listener]
  
  trait ManagerConsumerProps[P] extends StObject {
    
    var children: FunctionComponent[P] | ReactNode
    
    var filter: js.UndefOr[js.Function1[/* combo */ Combo, P]] = js.undefined
  }
  object ManagerConsumerProps {
    
    @scala.inline
    def apply[P](): ManagerConsumerProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagerConsumerProps[P]]
    }
    
    @scala.inline
    implicit class ManagerConsumerPropsMutableBuilder[Self <: ManagerConsumerProps[?], P] (val x: Self & ManagerConsumerProps[P]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: FunctionComponent[P] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFilter(value: /* combo */ Combo => P): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  @js.native
  trait ManagerProvider
    extends Component[ManagerProviderProps, State, js.Any] {
    
    var api: API = js.native
    
    def initModules(): Unit = js.native
    
    var modules: js.Array[Module] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MManagerProvider(nextProps: ManagerProviderProps, nextState: State): Boolean = js.native
  }
  
  trait ManagerProviderProps
    extends StObject
       with RenderData
       with ProviderData {
    
    var children: ReactNode | (js.Function1[/* props */ Combo, ReactNode])
    
    var docsMode: Boolean
  }
  object ManagerProviderProps {
    
    @scala.inline
    def apply(
      docsMode: Boolean,
      location: WindowLocation[LocationState],
      path: String,
      provider: typings.storybookApi.providerMod.Provider
    ): ManagerProviderProps = {
      val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagerProviderProps]
    }
    
    @scala.inline
    implicit class ManagerProviderPropsMutableBuilder[Self <: ManagerProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode | (js.Function1[/* props */ Combo, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ Combo => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var api: js.UndefOr[js.Any] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
  }
  object Module {
    
    @scala.inline
    def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ModuleArgs
    extends StObject
       with RenderData
       with ProviderData {
    
    var fullAPI: API
    
    var mode: js.UndefOr[production | development] = js.undefined
    
    var state: State
    
    var store: default
  }
  object ModuleArgs {
    
    @scala.inline
    def apply(
      fullAPI: API,
      location: WindowLocation[LocationState],
      path: String,
      provider: typings.storybookApi.providerMod.Provider,
      state: State,
      store: default
    ): ModuleArgs = {
      val __obj = js.Dynamic.literal(fullAPI = fullAPI.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleArgs]
    }
    
    @scala.inline
    implicit class ModuleArgsMutableBuilder[Self <: ModuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullAPI(value: API): Self = StObject.set(x, "fullAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: default): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleFn = js.Function1[/* m */ ModuleArgs, Module]
  
  type Other = StringDictionary[js.Any]
  
  type Parameters = StringDictionary[js.Any]
  
  trait ProviderData extends StObject {
    
    var provider: typings.storybookApi.providerMod.Provider
  }
  object ProviderData {
    
    @scala.inline
    def apply(provider: typings.storybookApi.providerMod.Provider): ProviderData = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderData]
    }
    
    @scala.inline
    implicit class ProviderDataMutableBuilder[Self <: ProviderData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: typings.storybookApi.providerMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.storybookRouter.routerMod.RenderData because var conflicts: storyId, viewMode. Inlined navigate, refId, location, path */ trait State
    extends StObject
       with SubState
       with typings.storybookApi.modulesStoriesMod.SubState
       with typings.storybookApi.refsMod.SubState
       with typings.storybookApi.notificationsMod.SubState
       with typings.storybookApi.versionsMod.SubState
       with typings.storybookApi.urlMod.SubState
       with typings.storybookApi.shortcutsMod.SubState
       with typings.storybookApi.releaseNotesMod.SubState
       with typings.storybookApi.settingsMod.SubState
       with typings.storybookApi.globalsMod.SubState
       with Other {
    
    var location: WindowLocation[LocationState]
    
    var navigate: js.UndefOr[NavigateFn] = js.undefined
    
    var path: String
    
    var refId: js.UndefOr[String] = js.undefined
  }
  object State {
    
    @scala.inline
    def apply(
      customQueryParams: QueryParams,
      globals: Args,
      lastVersionCheck: Double,
      layout: Layout,
      location: WindowLocation[LocationState],
      notifications: js.Array[Notification],
      path: String,
      refs: Refs,
      releaseNotesViewed: js.Array[String],
      settings: Settings,
      shortcuts: Shortcuts,
      storiesConfigured: Boolean,
      storiesHash: StoriesHash,
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
      theme: ThemeVars,
      ui: UI,
      versions: Versions & UnknownEntries
    ): State = {
      val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type StoryId = String
  
  type StoryKind = String
}
