package typings.reactRelay

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.anon.FetchKey
import typings.reactRelay.anon.FnCall
import typings.reactRelay.anon.UNSTABLErenderPolicy
import typings.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.relayHooksEntryPointTypesMod.LoadQueryOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedQuery
import typings.reactRelay.relayHooksHelpersMod.ArrayKeyType
import typings.reactRelay.relayHooksHelpersMod.ArrayKeyTypeData
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typings.reactRelay.relayHooksProfilerContextMod.ProfilerContextType
import typings.reactRelay.relayHooksRelayEnvironmentProviderDotreactMod.Props
import typings.reactRelay.relayHooksUseEntryPointLoaderMod.UseEntryPointLoaderHookType
import typings.reactRelay.relayHooksUseMutationMod.UseMutationConfig
import typings.reactRelay.relayHooksUsePaginationFragmentMod.usePaginationFragmentHookType
import typings.reactRelay.relayHooksUseQueryLoaderMod.useQueryLoaderHookType
import typings.reactRelay.relayHooksUseRefetchableFragmentMod.useRefetchableFragmentHookType
import typings.relayRuntime.anon.FetchPolicy
import typings.relayRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typings.relayRuntime.libMutationsCommitMutationMod.MutationConfig
import typings.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreReadInlineDataMod.KeyType
import typings.relayRuntime.libStoreReadInlineDataMod.KeyTypeData
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.HandleFieldPayload
import typings.relayRuntime.libStoreRelayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typings.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-relay/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ConnectionHandler {
    
    @JSImport("react-relay/hooks", "ConnectionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConnectionEdge")(store.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    inline def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConnectionEdge")(store.asInstanceOf[js.Any], connection.asInstanceOf[js.Any], edge.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    
    inline def createEdge(
      store: RecordSourceProxy,
      record: RecordProxy[js.Object],
      node: RecordProxy[js.Object],
      edgeType: String
    ): RecordProxy[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEdge")(store.asInstanceOf[js.Any], record.asInstanceOf[js.Any], node.asInstanceOf[js.Any], edgeType.asInstanceOf[js.Any])).asInstanceOf[RecordProxy[js.Object]]
    
    inline def deleteNode(record: RecordProxy[js.Object], nodeID: DataID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteNode")(record.asInstanceOf[js.Any], nodeID.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    inline def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")(record.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RecordProxy[js.Object] | Null]]
    
    inline def getConnectionID(recordID: DataID, key: String): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionID")(recordID.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[DataID]
    inline def getConnectionID(recordID: DataID, key: String, filters: Variables): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionID")(recordID.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[DataID]
    
    inline def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeAfter")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeAfter")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeBefore")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertEdgeBefore")(record.asInstanceOf[js.Any], newEdge.asInstanceOf[js.Any], cursor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(store.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("EntryPointContainer")(hasEntryPointReferenceProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-relay/hooks", "ProfilerContext")
  @js.native
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  inline def RelayEnvironmentProvider(props: Props): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def commitMutation[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  inline def fetchQuery_variables[T /* <: OperationType */](
    environment: Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: FetchPolicy
  ): RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  inline def graphql(strings: Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  inline def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
  
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  inline def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readInlineData_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def useClientQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: UNSTABLErenderPolicy): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useClientQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  inline def useFragment[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(ArrayKeyTypeData[TKey, Any]) | Null]
  inline def useFragment[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, Any]]
  
  inline def useFragment_TKey_KeyTypeData[TKey /* <: typings.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]]
  
  inline def useFragment_TKey_Union[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(ArrayKeyTypeData[TKey, Any]) | Null]
  
  inline def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  inline def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any], commitMutationFn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  
  inline def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  inline def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  usePaginationFragmentHookType[
    TQuery, 
    TKey | Null, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  
  inline def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  inline def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: GraphQLTaggedNode,
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  inline def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.relayHooksHelpersMod.KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  useRefetchableFragmentHookType[
    TQuery, 
    TKey, 
    (typings.reactRelay.relayHooksHelpersMod.KeyTypeData[TKey, Any]) | Null
  ]]
  
  inline def useRelayEnvironment(): typings.relayRuntime.mod.Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("useRelayEnvironment")().asInstanceOf[typings.relayRuntime.mod.Environment]
  
  inline def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribeToInvalidationState")(dataIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any], requestSubscriptionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
