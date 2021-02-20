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
import typings.storybookApi.layoutMod.SubState
import typings.storybookApi.storeMod.Options
import typings.storybookApi.storeMod.default
import typings.storybookApi.storiesMod.Item
import typings.storybookApi.storybookApiStrings.addons
import typings.storybookApi.storybookApiStrings.canvas
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import typings.storybookApi.storybookApiStrings.sidebar
import typings.storybookChannels.mod.Listener
import typings.storybookRouter.routerMod.RenderData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("@storybook/api", "Consumer")
  @js.native
  def Consumer[P](hasFilterChildren: ManagerConsumerProps[P]): ReactElement = js.native
  
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
  
  @JSImport("@storybook/api", "combineParameters")
  @js.native
  def combineParameters(parameterSets: Parameters*): js.Any = js.native
  
  @JSImport("@storybook/api", "isGroup")
  @js.native
  def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean = js.native
  
  @JSImport("@storybook/api", "isRoot")
  @js.native
  def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean = js.native
  
  @JSImport("@storybook/api", "isStory")
  @js.native
  def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean = js.native
  
  @JSImport("@storybook/api", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
  @JSImport("@storybook/api", "useAddonState")
  @js.native
  def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
  
  @JSImport("@storybook/api", "useArgTypes")
  @js.native
  def useArgTypes(): ArgTypes = js.native
  
  @JSImport("@storybook/api", "useArgs")
  @js.native
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  @JSImport("@storybook/api", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap): js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = js.native
  @JSImport("@storybook/api", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Function2[/* type */ String, /* repeated */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/api", "useGlobalTypes")
  @js.native
  def useGlobalTypes(): ArgTypes = js.native
  
  @JSImport("@storybook/api", "useGlobals")
  @js.native
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
  @JSImport("@storybook/api", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String): S = js.native
  @JSImport("@storybook/api", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String, defaultValue: S): S = js.native
  
  @JSImport("@storybook/api", "useSharedState")
  @js.native
  def useSharedState[S](stateId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
  @JSImport("@storybook/api", "useSharedState")
  @js.native
  def useSharedState[S](stateId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = js.native
  
  @JSImport("@storybook/api", "useStorybookApi")
  @js.native
  def useStorybookApi(): API = js.native
  
  @JSImport("@storybook/api", "useStorybookState")
  @js.native
  def useStorybookState(): State = js.native
  
  type API = SubAPI with typings.storybookApi.channelMod.SubAPI with typings.storybookApi.providerMod.SubAPI with typings.storybookApi.modulesStoriesMod.SubAPI with typings.storybookApi.refsMod.SubAPI with typings.storybookApi.globalsMod.SubAPI with typings.storybookApi.layoutMod.SubAPI with typings.storybookApi.notificationsMod.SubAPI with typings.storybookApi.shortcutsMod.SubAPI with typings.storybookApi.releaseNotesMod.SubAPI with typings.storybookApi.settingsMod.SubAPI with typings.storybookApi.versionsMod.SubAPI with typings.storybookApi.urlMod.SubAPI with Other
  
  @js.native
  trait ArgType
    extends /* key */ StringDictionary[js.Any] {
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
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
  
  @js.native
  trait Combo extends StObject {
    
    var api: API = js.native
    
    var state: State = js.native
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
  
  @js.native
  trait ManagerConsumerProps[P] extends StObject {
    
    var children: FunctionComponent[P] | ReactNode = js.native
    
    var filter: js.UndefOr[js.Function1[/* combo */ Combo, P]] = js.native
  }
  object ManagerConsumerProps {
    
    @scala.inline
    def apply[P](): ManagerConsumerProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagerConsumerProps[P]]
    }
    
    @scala.inline
    implicit class ManagerConsumerPropsMutableBuilder[Self <: ManagerConsumerProps[_], P] (val x: Self with ManagerConsumerProps[P]) extends AnyVal {
      
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
  
  /* Inlined @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  docsMode :boolean,   children :react.react.ReactNode | (props : @storybook/api.@storybook/api.Combo): react.react.ReactNode} */
  @js.native
  trait ManagerProviderProps extends StObject {
    
    var children: ReactNode | (js.Function1[/* props */ Combo, ReactNode]) = js.native
    
    var docsMode: Boolean = js.native
    
    var location: WindowLocation[LocationState] = js.native
    
    var navigate: js.UndefOr[NavigateFn] = js.native
    
    var path: String = js.native
    
    var provider: typings.storybookApi.providerMod.Provider = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var storyId: js.UndefOr[String] = js.native
    
    var viewMode: js.UndefOr[String] = js.native
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
      
      @scala.inline
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: typings.storybookApi.providerMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      @scala.inline
      def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  @js.native
  trait Module extends StObject {
    
    var api: js.UndefOr[js.Any] = js.native
    
    var init: js.UndefOr[js.Function0[Unit]] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
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
  
  /* Inlined @storybook/router.@storybook/router.RenderData & @storybook/api.@storybook/api.ProviderData & {  mode :'production' | 'development' | undefined,   state :@storybook/api.@storybook/api.State,   fullAPI :@storybook/api.@storybook/api.API,   store :@storybook/api.@storybook/api/dist/store.default} */
  @js.native
  trait ModuleArgs extends StObject {
    
    var fullAPI: API = js.native
    
    var location: WindowLocation[LocationState] = js.native
    
    var mode: js.UndefOr[production | development] = js.native
    
    var navigate: js.UndefOr[NavigateFn] = js.native
    
    var path: String = js.native
    
    var provider: typings.storybookApi.providerMod.Provider = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var state: State = js.native
    
    var store: default = js.native
    
    var storyId: js.UndefOr[String] = js.native
    
    var viewMode: js.UndefOr[String] = js.native
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
      def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: typings.storybookApi.providerMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: default): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      @scala.inline
      def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  type ModuleFn = js.Function1[/* m */ ModuleArgs, Module]
  
  type Other = StringDictionary[js.Any]
  
  type Parameters = StringDictionary[js.Any]
  
  @js.native
  trait ProviderData extends StObject {
    
    var provider: typings.storybookApi.providerMod.Provider = js.native
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
  
  type State = SubState with typings.storybookApi.modulesStoriesMod.SubState with typings.storybookApi.refsMod.SubState with typings.storybookApi.notificationsMod.SubState with typings.storybookApi.versionsMod.SubState with typings.storybookApi.urlMod.SubState with typings.storybookApi.shortcutsMod.SubState with typings.storybookApi.releaseNotesMod.SubState with typings.storybookApi.settingsMod.SubState with typings.storybookApi.globalsMod.SubState with RenderData with Other
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type StoryId = String
  
  type StoryKind = String
}
