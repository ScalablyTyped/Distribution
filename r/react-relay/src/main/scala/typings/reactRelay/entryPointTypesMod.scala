package typings.reactRelay

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.reactRelay.anon.Dispose
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.reactRelay.reactRelayStrings.cache
import typings.reactRelay.reactRelayStrings.network
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointTypesMod {
  
  type EntryPoint[TEntryPointComponent, TEntryPointParams /* <: js.Object */] = InternalEntryPointRepresentation[TEntryPointParams, Any, Any, Any, Any]
  
  type EntryPointComponent[TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TRuntimeProps /* <: js.Object */, TExtraProps /* <: js.Object | Null */] = ComponentType[
    EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  
  /* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoints<TPreloadedEntryPoints>,   extraProps :TExtraProps,   props :TRuntimeProps,   queries :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedQueries<TPreloadedQueries>}> */
  trait EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends StObject {
    
    val entryPoints: PreloadedEntryPoints[TPreloadedEntryPoints]
    
    val extraProps: TExtraProps
    
    val props: TRuntimeProps
    
    val queries: PreloadedQueries[TPreloadedQueries]
  }
  object EntryPointProps {
    
    inline def apply[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
      entryPoints: PreloadedEntryPoints[TPreloadedEntryPoints],
      extraProps: TExtraProps,
      props: TRuntimeProps,
      queries: PreloadedQueries[TPreloadedQueries]
    ): EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
      val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    }
    
    extension [Self <: EntryPointProps[?, ?, ?, ?], TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](x: Self & (EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) {
      
      inline def setEntryPoints(value: PreloadedEntryPoints[TPreloadedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      inline def setProps(value: TRuntimeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: PreloadedQueries[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    }
  }
  
  type EnvironmentProviderOptions[T /* <: Record[String, Any] */] = T
  
  @js.native
  trait IEnvironmentProvider[TOptions] extends StObject {
    
    def getEnvironment(): Environment = js.native
    def getEnvironment(options: TOptions): Environment = js.native
  }
  
  /**
    * The Interface of the EntryPoints .entrypoint files
    *
    * Every .entrypoint file it's an object that must have two required fields:
    * - getPreloadProps(...)  function that will return the description of preloaded
    *   queries and preloaded (nested) entry points for the current entry point
    * - root - JSResource of the module that will render those preloaded queries
    *
    * TEntryPointParams - object that contains all necessary information to execute
    * the preloaders (routeParams, query variables)
    *
    * TPreloadedQueries -  queries, defined in the root components
    *
    * TPreloadedEntryPoints - nested entry points, defined in the root components
    *
    * TRuntimeProps - the type of additional props that you may pass to the
    * component (like `onClick` handler, etc) during runtime. Values for them
    * defined during component runtime
    *
    * TExtraProps - a bag of extra props that you may define in `entrypoint` file
    * and they will be passed to the EntryPointComponent as `extraProps`
    */
  /* Inlined parent std.Readonly<{  root :react-relay.react-relay/relay-hooks/EntryPointTypes.JSResourceReference<react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>, getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps>}> */
  trait InternalEntryPointRepresentation[/**
    * object that contains all necessary information to execute the preloaders (routeParams, query variables)
    */
  TEntryPointParams /* <: js.Object */, /**
    * queries, defined in the root components
    */
  TPreloadedQueries /* <: Record[String, OperationType] */, /**
    * nested entry points, defined in the root components
    */
  TPreloadedEntryPoints /* <: js.Object */, /**
    * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
    * Values for them defined during component runtime
    */
  TRuntimeProps /* <: js.Object */, /**
    * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
    * as `extraProps`
    */
  TExtraProps /* <: js.Object | Null */] extends StObject {
    
    val getPreloadProps: js.Function1[
        /* entryPointParams */ TEntryPointParams, 
        PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
      ]
    
    val root: JSResourceReference[
        EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
      ]
  }
  object InternalEntryPointRepresentation {
    
    inline def apply[/**
      * object that contains all necessary information to execute the preloaders (routeParams, query variables)
      */
    TEntryPointParams /* <: js.Object */, /**
      * queries, defined in the root components
      */
    TPreloadedQueries /* <: Record[String, OperationType] */, /**
      * nested entry points, defined in the root components
      */
    TPreloadedEntryPoints /* <: js.Object */, /**
      * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
      * Values for them defined during component runtime
      */
    TRuntimeProps /* <: js.Object */, /**
      * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
      * as `extraProps`
      */
    TExtraProps /* <: js.Object | Null */](
      getPreloadProps: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps],
      root: JSResourceReference[
          EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
        ]
    ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
      val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
    }
    
    extension [Self <: InternalEntryPointRepresentation[?, ?, ?, ?, ?], /**
      * object that contains all necessary information to execute the preloaders (routeParams, query variables)
      */
    TEntryPointParams /* <: js.Object */, /**
      * queries, defined in the root components
      */
    TPreloadedQueries /* <: Record[String, OperationType] */, /**
      * nested entry points, defined in the root components
      */
    TPreloadedEntryPoints /* <: js.Object */, /**
      * the type of additional props that you may pass to the component (like `onClick` handler, etc) during runtime.
      * Values for them defined during component runtime
      */
    TRuntimeProps /* <: js.Object */, /**
      * a bag of extra props that you may define in `entrypoint` file and they will be passed to the EntryPointComponent
      * as `extraProps`
      */
    TExtraProps /* <: js.Object | Null */](x: Self & (InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) {
      
      inline def setGetPreloadProps(
        value: /* entryPointParams */ TEntryPointParams => PreloadProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]
      ): Self = StObject.set(x, "getPreloadProps", js.Any.fromFunction1(value))
      
      inline def setRoot(
        value: JSResourceReference[
              EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
            ]
      ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSResourceReference[TModule] extends StObject {
    
    def getModuleId(): String
    
    def getModuleIfRequired(): TModule | Null
    
    def load(): js.Promise[TModule]
  }
  object JSResourceReference {
    
    inline def apply[TModule](
      getModuleId: () => String,
      getModuleIfRequired: () => TModule | Null,
      load: () => js.Promise[TModule]
    ): JSResourceReference[TModule] = {
      val __obj = js.Dynamic.literal(getModuleId = js.Any.fromFunction0(getModuleId), getModuleIfRequired = js.Any.fromFunction0(getModuleIfRequired), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[JSResourceReference[TModule]]
    }
    
    extension [Self <: JSResourceReference[?], TModule](x: Self & JSResourceReference[TModule]) {
      
      inline def setGetModuleId(value: () => String): Self = StObject.set(x, "getModuleId", js.Any.fromFunction0(value))
      
      inline def setGetModuleIfRequired(value: () => TModule | Null): Self = StObject.set(x, "getModuleIfRequired", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => js.Promise[TModule]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<{  fetchPolicy :relay-runtime.relay-runtime.FetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   onQueryAstLoadTimeout :(): void | null | undefined}> */
  trait LoadQueryOptions extends StObject {
    
    val fetchPolicy: js.UndefOr[FetchPolicy | Null] = js.undefined
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
    
    val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  }
  object LoadQueryOptions {
    
    inline def apply(): LoadQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadQueryOptions]
    }
    
    extension [Self <: LoadQueryOptions](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
      
      inline def setOnQueryAstLoadTimeout(value: () => Unit): Self = StObject.set(x, "onQueryAstLoadTimeout", js.Any.fromFunction0(value))
      
      inline def setOnQueryAstLoadTimeoutNull: Self = StObject.set(x, "onQueryAstLoadTimeout", null)
      
      inline def setOnQueryAstLoadTimeoutUndefined: Self = StObject.set(x, "onQueryAstLoadTimeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRelay.reactRelayStrings.`store-or-network`
    - typings.reactRelay.reactRelayStrings.`store-and-network`
    - typings.reactRelay.reactRelayStrings.`network-only`
  */
  trait PreloadFetchPolicy extends StObject
  object PreloadFetchPolicy {
    
    inline def `network-only`: typings.reactRelay.reactRelayStrings.`network-only` = "network-only".asInstanceOf[typings.reactRelay.reactRelayStrings.`network-only`]
    
    inline def `store-and-network`: typings.reactRelay.reactRelayStrings.`store-and-network` = "store-and-network".asInstanceOf[typings.reactRelay.reactRelayStrings.`store-and-network`]
    
    inline def `store-or-network`: typings.reactRelay.reactRelayStrings.`store-or-network` = "store-or-network".asInstanceOf[typings.reactRelay.reactRelayStrings.`store-or-network`]
  }
  
  /* Inlined std.Readonly<{  fetchKey :string | number | undefined,   fetchPolicy :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined}> */
  trait PreloadOptions extends StObject {
    
    val fetchKey: js.UndefOr[String | Double] = js.undefined
    
    val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.undefined
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  }
  object PreloadOptions {
    
    inline def apply(): PreloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreloadOptions]
    }
    
    extension [Self <: PreloadOptions](x: Self) {
      
      inline def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
      
      inline def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
      
      inline def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    }
  }
  
  /* Inlined parent std.Readonly<{  entryPoints :react-relay.react-relay/relay-hooks/EntryPointTypes.ThinNestedEntryPointParamsObject<TPreloadedEntryPoints> | undefined,   extraProps :TExtraProps | undefined,   queries :react-relay.react-relay/relay-hooks/EntryPointTypes.ThinQueryParamsObject<TPreloadedQueries> | undefined}> */
  trait PreloadProps[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */] extends StObject {
    
    val entryPoints: js.UndefOr[ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]] = js.undefined
    
    val extraProps: js.UndefOr[TExtraProps] = js.undefined
    
    val queries: js.UndefOr[ThinQueryParamsObject[TPreloadedQueries]] = js.undefined
  }
  object PreloadProps {
    
    inline def apply[TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */](): PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]]
    }
    
    extension [Self <: PreloadProps[?, ?, ?, ?], TPreloadParams /* <: js.Object */, TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TExtraProps /* <: js.Object | Null */](x: Self & (PreloadProps[TPreloadParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps])) {
      
      inline def setEntryPoints(value: ThinNestedEntryPointParamsObject[TPreloadedEntryPoints]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
      
      inline def setExtraProps(value: TExtraProps): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
      
      inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
      
      inline def setQueries(value: ThinQueryParamsObject[TPreloadedQueries]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  cacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   source :'cache' | 'network',   fetchTime :number | null | undefined}> */
  trait PreloadQueryStatus extends StObject {
    
    val cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
    
    val fetchTime: js.UndefOr[Double | Null] = js.undefined
    
    val source: cache | network
  }
  object PreloadQueryStatus {
    
    inline def apply(source: cache | network): PreloadQueryStatus = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadQueryStatus]
    }
    
    extension [Self <: PreloadQueryStatus](x: Self) {
      
      inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      inline def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
      
      inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      inline def setFetchTime(value: Double): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
      
      inline def setFetchTimeNull: Self = StObject.set(x, "fetchTime", null)
      
      inline def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
      
      inline def setSource(value: cache | network): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreloadableConcreteRequest[TQuery /* <: OperationType */] extends StObject {
    
    var kind: typings.reactRelay.reactRelayStrings.PreloadableConcreteRequest
    
    var params: RequestParameters
  }
  object PreloadableConcreteRequest {
    
    inline def apply[TQuery /* <: OperationType */](params: RequestParameters): PreloadableConcreteRequest[TQuery] = {
      val __obj = js.Dynamic.literal(kind = "PreloadableConcreteRequest", params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadableConcreteRequest[TQuery]]
    }
    
    extension [Self <: PreloadableConcreteRequest[?], TQuery /* <: OperationType */](x: Self & PreloadableConcreteRequest[TQuery]) {
      
      inline def setKind(value: typings.reactRelay.reactRelayStrings.PreloadableConcreteRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  type PreloadedEntryPoint[TEntryPointComponent] = Dispose[TEntryPointComponent]
  
  type PreloadedEntryPoints[TPreloadedEntryPoints] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoint<react-relay.react-relay/relay-hooks/helpers.GetEntryPointComponentFromEntryPoint<TPreloadedEntryPoints[T]>>}
    */ typings.reactRelay.reactRelayStrings.PreloadedEntryPoints & TopLevel[TPreloadedEntryPoints]
  
  type PreloadedQueries[TPreloadedQueries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedQuery<TPreloadedQueries[T], react-relay.react-relay/relay-hooks/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typings.reactRelay.reactRelayStrings.PreloadedQueries & TopLevel[TPreloadedQueries]
  
  /* Inlined parent std.Readonly<{  kind :'PreloadedQuery',   environment :relay-runtime.relay-runtime.IEnvironment,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined,   fetchKey :string | number,   fetchPolicy :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadFetchPolicy,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   id :string | null | undefined,   name :string,   source :relay-runtime.relay-runtime.Observable<relay-runtime.relay-runtime.GraphQLResponse> | null | undefined,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   dispose :relay-runtime.relay-runtime.DisposeFn,   isDisposed :boolean}> */
  trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends StObject {
    
    val dispose: DisposeFn
    
    val environment: Environment
    
    val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
    
    val fetchKey: String | Double
    
    val fetchPolicy: PreloadFetchPolicy
    
    val id: js.UndefOr[String | Null] = js.undefined
    
    val isDisposed: Boolean
    
    val kind: typings.reactRelay.reactRelayStrings.PreloadedQuery
    
    val name: String
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
    
    val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.undefined
    
    val variables: VariablesOf[TQuery]
  }
  object PreloadedQuery {
    
    inline def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
      dispose: () => Unit,
      environment: Environment,
      fetchKey: String | Double,
      fetchPolicy: PreloadFetchPolicy,
      isDisposed: Boolean,
      name: String,
      variables: VariablesOf[TQuery]
    ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), environment = environment.asInstanceOf[js.Any], fetchKey = fetchKey.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kind = "PreloadedQuery", name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
    }
    
    extension [Self <: PreloadedQuery[?, ?], TQuery /* <: OperationType */, TEnvironmentProviderOptions](x: Self & (PreloadedQuery[TQuery, TEnvironmentProviderOptions])) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
      
      inline def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
      
      inline def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typings.reactRelay.reactRelayStrings.PreloadedQuery): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
      
      inline def setSource(value: Observable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Readonly<{  entryPoint :TEntryPoint,   entryPointParams :react-relay.react-relay/relay-hooks/helpers.GetEntryPointParamsFromEntryPoint<TEntryPoint>}> */
  trait ThinNestedEntryPointParams[TEntryPoint] extends StObject {
    
    val entryPoint: TEntryPoint
    
    val entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  }
  object ThinNestedEntryPointParams {
    
    inline def apply[TEntryPoint](entryPoint: TEntryPoint, entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]): ThinNestedEntryPointParams[TEntryPoint] = {
      val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThinNestedEntryPointParams[TEntryPoint]]
    }
    
    extension [Self <: ThinNestedEntryPointParams[?], TEntryPoint](x: Self & ThinNestedEntryPointParams[TEntryPoint]) {
      
      inline def setEntryPoint(value: TEntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointParams(value: GetEntryPointParamsFromEntryPoint[TEntryPoint]): Self = StObject.set(x, "entryPointParams", value.asInstanceOf[js.Any])
    }
  }
  
  type ThinNestedEntryPointParamsObject[TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedEntryPoints ]: react-relay.react-relay/relay-hooks/EntryPointTypes.ThinNestedEntryPointParams<TPreloadedEntryPoints[K]>}
    */ typings.reactRelay.reactRelayStrings.ThinNestedEntryPointParamsObject & TopLevel[TPreloadedEntryPoints]
  
  /* Inlined parent std.Readonly<{  parameters :relay-runtime.relay-runtime.ConcreteRequest | react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   options :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadOptions | null | undefined,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined}> */
  trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */] extends StObject {
    
    val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
    
    val options: js.UndefOr[PreloadOptions | Null] = js.undefined
    
    val parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery]
    
    val variables: VariablesOf[TQuery]
  }
  object ThinQueryParams {
    
    inline def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery], variables: VariablesOf[TQuery]): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
    }
    
    extension [Self <: ThinQueryParams[?, ?], TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](x: Self & (ThinQueryParams[TQuery, TEnvironmentProviderOptions])) {
      
      inline def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
      
      inline def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
      
      inline def setOptions(value: PreloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParameters(value: ConcreteRequest | PreloadableConcreteRequest[TQuery]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ThinQueryParamsObject[TPreloadedQueries /* <: Record[String, OperationType] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedQueries ]: react-relay.react-relay/relay-hooks/EntryPointTypes.ThinQueryParams<TPreloadedQueries[K], react-relay.react-relay/relay-hooks/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typings.reactRelay.reactRelayStrings.ThinQueryParamsObject & TopLevel[TPreloadedQueries]
}
