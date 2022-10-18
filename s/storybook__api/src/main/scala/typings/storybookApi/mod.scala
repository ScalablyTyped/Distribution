package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.ReturnType
import typings.storybookApi.anon.CustomQueryParams
import typings.storybookApi.distTs3Dot9LibStoriesMod.Item
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoriesHash
import typings.storybookApi.distTs3Dot9ModulesAddonsMod.SubAPI
import typings.storybookApi.distTs3Dot9ModulesLayoutMod.Layout
import typings.storybookApi.distTs3Dot9ModulesLayoutMod.SubState
import typings.storybookApi.distTs3Dot9ModulesLayoutMod.UI
import typings.storybookApi.distTs3Dot9ModulesNotificationsMod.Notification
import typings.storybookApi.distTs3Dot9ModulesRefsMod.Refs
import typings.storybookApi.distTs3Dot9ModulesSettingsMod.Settings
import typings.storybookApi.distTs3Dot9ModulesShortcutsMod.Shortcuts
import typings.storybookApi.distTs3Dot9ModulesUrlMod.QueryParams
import typings.storybookApi.distTs3Dot9ModulesVersionsMod.UnknownEntries
import typings.storybookApi.distTs3Dot9ModulesVersionsMod.Versions
import typings.storybookApi.distTs3Dot9StoreMod.Options
import typings.storybookApi.distTs3Dot9StoreMod.default
import typings.storybookApi.storybookApiStrings.addons
import typings.storybookApi.storybookApiStrings.canvas
import typings.storybookApi.storybookApiStrings.development
import typings.storybookApi.storybookApiStrings.production
import typings.storybookApi.storybookApiStrings.sidebar
import typings.storybookChannels.mod.Listener
import typings.storybookRouter.anon.PartialLocationAncestorOrigins
import typings.storybookRouter.mod.RouterData
import typings.storybookTheming.mod.ThemeVars
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
    inline def ADDONS_=(x: addons): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api", "ActiveTabs.CANVAS")
    @js.native
    def CANVAS: canvas = js.native
    inline def CANVAS_=(x: canvas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANVAS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api", "ActiveTabs.SIDEBAR")
    @js.native
    def SIDEBAR: sidebar = js.native
    inline def SIDEBAR_=(x: sidebar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDEBAR")(x.asInstanceOf[js.Any])
  }
  
  inline def Consumer[P](hasFilterChildren: ManagerConsumerProps[P]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Consumer")(hasFilterChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@storybook/api", "Provider")
  @js.native
  open class Provider protected () extends ManagerProvider {
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
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps(props: ManagerProviderProps, state: State): CustomQueryParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CustomQueryParams]
  }
  
  inline def combineParameters(parameterSets: Parameters*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroup")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Group */ Boolean]
  
  inline def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Root */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Root */ Boolean]
  
  inline def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Story */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStory")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @storybook/api.@storybook/api/dist/ts3.9/lib/stories.Story */ Boolean]
  
  inline def merge(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useAddonState[S](addonId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  inline def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  
  inline def useArgTypes(): ArgTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgTypes")().asInstanceOf[ArgTypes]
  
  inline def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  inline def useChannel(eventMap: EventMap): js.Function2[/* type */ String, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* type */ String, /* repeated */ Any, Unit]]
  inline def useChannel(eventMap: EventMap, deps: js.Array[Any]): js.Function2[/* type */ String, /* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* type */ String, /* repeated */ Any, Unit]]
  
  inline def useGlobalTypes(): ArgTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalTypes")().asInstanceOf[ArgTypes]
  
  inline def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]]]
  
  inline def useParameter[S](parameterKey: String): S = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[S]
  inline def useParameter[S](parameterKey: String, defaultValue: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[S]
  
  inline def useSharedState[S](stateId: String): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(stateId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  inline def useSharedState[S](stateId: String, defaultState: S): js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(stateId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    S, 
    js.Function2[/* newStateOrMerger */ S | StateMerger[S], /* options */ js.UndefOr[Options], Unit]
  ]]
  
  inline def useStoryPrepared(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryPrepared")().asInstanceOf[Boolean]
  inline def useStoryPrepared(storyId: StoryId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryPrepared")(storyId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useStorybookApi(): API = ^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookApi")().asInstanceOf[API]
  
  inline def useStorybookState(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("useStorybookState")().asInstanceOf[State]
  
  @js.native
  trait API
    extends StObject
       with SubAPI
       with typings.storybookApi.distTs3Dot9ModulesChannelMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesProviderMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesStoriesMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesRefsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesGlobalsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesLayoutMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesNotificationsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesShortcutsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesReleaseNotesMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesSettingsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesVersionsMod.SubAPI
       with typings.storybookApi.distTs3Dot9ModulesUrlMod.SubAPI
       with Other
  
  trait ArgType
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `if`: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Conditional */ Any
      ] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ArgType {
    
    inline def apply(): ArgType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgType]
    }
    
    extension [Self <: ArgType](x: Self) {
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIf(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Conditional */ Any
      ): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ArgTypes = StringDictionary[ArgType]
  
  type Args = StringDictionary[Any]
  
  trait Combo extends StObject {
    
    var api: API
    
    var state: State
  }
  object Combo {
    
    inline def apply(api: API, state: State): Combo = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Combo]
    }
    
    extension [Self <: Combo](x: Self) {
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type EventMap = StringDictionary[Listener]
  
  trait ManagerConsumerProps[P] extends StObject {
    
    var children: FunctionComponent[P] | ReactNode
    
    var filter: js.UndefOr[js.Function1[/* combo */ Combo, P]] = js.undefined
  }
  object ManagerConsumerProps {
    
    inline def apply[P](): ManagerConsumerProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagerConsumerProps[P]]
    }
    
    extension [Self <: ManagerConsumerProps[?], P](x: Self & ManagerConsumerProps[P]) {
      
      inline def setChildren(value: FunctionComponent[P] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFilter(value: /* combo */ Combo => P): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  @js.native
  trait ManagerProvider extends Component[ManagerProviderProps, State, Any] {
    
    var api: API = js.native
    
    def initModules(): Unit = js.native
    
    var modules: js.Array[Module] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MManagerProvider(nextProps: ManagerProviderProps, nextState: State): Boolean = js.native
  }
  
  trait ManagerProviderProps
    extends StObject
       with RouterData
       with ProviderData {
    
    var children: ReactNode | (js.Function1[/* props */ Combo, ReactNode])
    
    var docsMode: Boolean
  }
  object ManagerProviderProps {
    
    inline def apply(
      docsMode: Boolean,
      location: PartialLocationAncestorOrigins,
      navigate: ReturnType[
          js.Function0[
            js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
          ]
        ],
      path: String,
      provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider
    ): ManagerProviderProps = {
      val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagerProviderProps]
    }
    
    extension [Self <: ManagerProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ Combo, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ Combo => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var api: js.UndefOr[Any] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object Module {
    
    inline def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ModuleArgs
    extends StObject
       with RouterData
       with ProviderData {
    
    var fullAPI: API
    
    var mode: js.UndefOr[production | development] = js.undefined
    
    var state: State
    
    var store: default
  }
  object ModuleArgs {
    
    inline def apply(
      fullAPI: API,
      location: PartialLocationAncestorOrigins,
      navigate: ReturnType[
          js.Function0[
            js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
          ]
        ],
      path: String,
      provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider,
      state: State,
      store: default
    ): ModuleArgs = {
      val __obj = js.Dynamic.literal(fullAPI = fullAPI.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleArgs]
    }
    
    extension [Self <: ModuleArgs](x: Self) {
      
      inline def setFullAPI(value: API): Self = StObject.set(x, "fullAPI", value.asInstanceOf[js.Any])
      
      inline def setMode(value: production | development): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStore(value: default): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleFn = js.Function1[/* m */ ModuleArgs, Module]
  
  type Other = StringDictionary[Any]
  
  type Parameters = StringDictionary[Any]
  
  trait ProviderData extends StObject {
    
    var provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider
  }
  object ProviderData {
    
    inline def apply(provider: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): ProviderData = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderData]
    }
    
    extension [Self <: ProviderData](x: Self) {
      
      inline def setProvider(value: typings.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.storybookRouter.mod.StoryData because var conflicts: storyId, viewMode. Inlined refId
  - typings.storybookRouter.mod.Other because var conflicts: storyId, viewMode. Inlined path, singleStory
  - typings.storybookRouter.mod.RouterData because var conflicts: storyId, viewMode. Inlined location, navigate */ trait State
    extends StObject
       with SubState
       with typings.storybookApi.distTs3Dot9ModulesStoriesMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesRefsMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesNotificationsMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesVersionsMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesUrlMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesShortcutsMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesReleaseNotesMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesSettingsMod.SubState
       with typings.storybookApi.distTs3Dot9ModulesGlobalsMod.SubState
       with Other {
    
    var location: PartialLocationAncestorOrigins
    
    var navigate: ReturnType[
        js.Function0[
          js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
        ]
      ]
    
    var path: String
    
    var refId: js.UndefOr[String] = js.undefined
    
    var singleStory: js.UndefOr[Boolean] = js.undefined
  }
  object State {
    
    inline def apply(
      customQueryParams: QueryParams,
      lastVersionCheck: Double,
      layout: Layout,
      location: PartialLocationAncestorOrigins,
      navigate: ReturnType[
          js.Function0[
            js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
          ]
        ],
      notifications: js.Array[Notification],
      path: String,
      refs: Refs,
      releaseNotesViewed: js.Array[String],
      settings: Settings,
      shortcuts: Shortcuts,
      storiesConfigured: Boolean,
      storiesHash: StoriesHash,
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      theme: ThemeVars,
      ui: UI,
      versions: Versions & UnknownEntries
    ): State = {
      val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setLocation(value: PartialLocationAncestorOrigins): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigate(
        value: ReturnType[
              js.Function0[
                js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
              ]
            ]
      ): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
      
      inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
    }
  }
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type StoryId = String
  
  type StoryKind = String
}
