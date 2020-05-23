package typings.reactRelay

import typings.react.mod.ClassicElement
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.anon.FetchKey
import typings.reactRelay.anon.FnCall
import typings.reactRelay.anon.NetworkCacheConfig
import typings.reactRelay.entryPointTypesMod.EntryPoint
import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.PreloadOptions
import typings.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.entryPointTypesMod.PreloadedQuery
import typings.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import typings.reactRelay.relayEnvironmentProviderMod.Props
import typings.reactRelay.useBlockingPaginationFragmentMod.Call
import typings.reactRelay.useBlockingPaginationFragmentMod.KeyReturnType
import typings.reactRelay.useBlockingPaginationFragmentMod.KeyType
import typings.reactRelay.useBlockingPaginationFragmentMod.ReturnType
import typings.reactRelay.useFragmentMod.ArrayKeyReturnType
import typings.reactRelay.useFragmentMod.ArrayKeyType
import typings.reactRelay.useMutationMod.UseMutationConfig
import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */](
    hasEntryPointReferenceProps: EntryPointReference[
      TEntryPointComponent, 
      TRuntimeProps, 
      TPreloadedQueries, 
      TPreloadedNestedEntryPoints, 
      TExtraProps
    ]
  ): ClassicElement[ElementType[_]] = js.native
  def LazyLoadEntryPointContainer[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps](
    hasEntryPointEntryPointParamsPropsEnvironmentProvider: EntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ): Element = js.native
  def RelayEnvironmentProvider(props: Props): Element = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: NetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Null,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  def prepareEntryPoint[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: EntryPointComponent[
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
    // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
    // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
  ] */, // tslint:disable-next-line no-unnecessary-generics
  TEntryPoint /* <: EntryPoint[TEntryPointParams, TEntryPointComponent] */](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions],
    // tslint:disable-next-line no-unnecessary-generics
  entryPoint: TEntryPoint,
    entryPointParams: TEntryPointParams
  ): PreloadedEntryPoint[TEntryPointComponent] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, Call[KeyReturnType[TKey]] | Null] = js.native
  def useFragment[TKey /* <: typings.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): typings.reactRelay.useFragmentMod.Call[typings.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  def useFragment[TKey /* <: typings.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typings.reactRelay.useFragmentMod.Call[typings.reactRelay.useFragmentMod.KeyReturnType[TKey]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): js.Array[typings.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typings.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Array[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[typings.reactRelay.useFragmentMod.Call[ArrayKeyReturnType[TKey]]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType_Call[TKey /* <: typings.reactRelay.useFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typings.reactRelay.useFragmentMod.Call[typings.reactRelay.useFragmentMod.KeyReturnType[TKey]] = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typings.reactRelay.useLegacyPaginationFragmentMod.Call[typings.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.useLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typings.reactRelay.useLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    typings.reactRelay.useLegacyPaginationFragmentMod.Call[typings.reactRelay.useLegacyPaginationFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.useRefetchableFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line:no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnType[
    TQuery, 
    TKey, 
    typings.reactRelay.useRefetchableFragmentMod.Call[typings.reactRelay.useRefetchableFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactRelay.useRefetchableFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line:no-unnecessary-generics
  typings.reactRelay.useRefetchableFragmentMod.ReturnType[
    TQuery, 
    TKey, 
    typings.reactRelay.useRefetchableFragmentMod.Call[typings.reactRelay.useRefetchableFragmentMod.KeyReturnType[TKey]] | Null
  ] = js.native
  def useRelayEnvironment(): typings.relayRuntime.mod.Environment = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = js.native
  def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inferrence inside GraphQLSubscriptionConfig.
  // tslint:disable-next-line:no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = js.native
}

