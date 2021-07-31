package typings.reactRelay

import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.anon.FetchKey
import typings.reactRelay.anon.FetchPolicy
import typings.reactRelay.anon.FnCall
import typings.reactRelay.anon.UNSTABLErenderPolicy
import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.LoadQueryOptions
import typings.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.entryPointTypesMod.PreloadedQuery
import typings.reactRelay.helpersMod.ArrayKeyType
import typings.reactRelay.helpersMod.ArrayKeyTypeData
import typings.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.reactRelay.matchContainerMod.MatchContainerProps
import typings.reactRelay.profilerContextMod.ProfilerContextType
import typings.reactRelay.relayEnvironmentProviderMod.Props
import typings.reactRelay.useBlockingPaginationFragmentMod.ReturnTypeNode
import typings.reactRelay.useEntryPointLoaderMod.UseEntryPointLoaderHookType
import typings.reactRelay.useMutationMod.UseMutationConfig
import typings.reactRelay.usePaginationFragmentMod.ReturnType
import typings.reactRelay.useQueryLoaderMod.useQueryLoaderHookType
import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksMod {
  
  @JSImport("react-relay/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[js.Any] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("EntryPointContainer")(hasEntryPointReferenceProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def MatchContainer[TProps, TFallback](props: MatchContainerProps[TProps, TFallback]): ElementType[TProps] | TFallback | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MatchContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ElementType[TProps] | TFallback | Null]
  
  @JSImport("react-relay/lib/hooks", "ProfilerContext")
  @js.native
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  @scala.inline
  def RelayEnvironmentProvider(props: Props): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def fetchQuery[TQuery /* <: OperationType */](environment: Environment, query: GraphQLTaggedNode, variables: VariablesOf[TQuery]): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], query.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ]]
  @scala.inline
  def fetchQuery[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: FetchPolicy
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], query.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ]]
  
  @scala.inline
  def graphql(strings: js.Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  @scala.inline
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, js.Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
  
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](environment: Environment, preloadableRequest: GraphQLTaggedNode, variables: VariablesOf[TQuery]): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: Unit,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  @scala.inline
  def loadQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, js.Any]] */](
    environment: Environment,
    preloadableRequest: GraphQLTaggedNode,
    variables: VariablesOf[TQuery],
    options: LoadQueryOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadQuery")(environment.asInstanceOf[js.Any], preloadableRequest.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any], environmentProviderOptions.asInstanceOf[js.Any])).asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  
  @scala.inline
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  
  @scala.inline
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, js.Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  @scala.inline
  def useFragment[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, js.Any]) | Null]
  @scala.inline
  def useFragment[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, js.Any]]
  
  @scala.inline
  def useFragment_TKey_ArrayKeyTypeAny[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): (ArrayKeyTypeData[TKey, js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(ArrayKeyTypeData[TKey, js.Any]) | Null]
  
  @scala.inline
  def useFragment_TKey_ArrayKeyTypeAny_Union[TKey /* <: ArrayKeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (ArrayKeyTypeData[TKey, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(ArrayKeyTypeData[TKey, js.Any]) | Null]
  
  @scala.inline
  def useFragment_TKey_KeyTypeAny_KeyTypeData[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, js.Any]]
  
  @scala.inline
  def useFragment_TKey_KeyTypeAny_Union[TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, js.Any]) | Null]
  
  @scala.inline
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useLazyLoadQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: VariablesOf[TQuery], options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useLazyLoadQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  @scala.inline
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  @scala.inline
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any], commitMutationFn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  
  @scala.inline
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, js.Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, (KeyTypeData[TKey, js.Any]) | Null]]
  
  @scala.inline
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, js.Any]]]
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def usePreloadedQuery[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, js.Any]]],
    options: UNSTABLErenderPolicy
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("usePreloadedQuery")(gqlQuery.asInstanceOf[js.Any], preloadedQuery.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  @scala.inline
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  @scala.inline
  def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  @scala.inline
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  
  @scala.inline
  def useRelayEnvironment(): typings.relayRuntime.mod.Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("useRelayEnvironment")().asInstanceOf[typings.relayRuntime.mod.Environment]
  
  @scala.inline
  def useSubscribeToInvalidationState(dataIDs: js.Array[DataID], callback: js.Function0[Unit]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscribeToInvalidationState")(dataIDs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any], requestSubscriptionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
