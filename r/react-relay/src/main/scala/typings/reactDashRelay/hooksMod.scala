package typings.reactDashRelay

import typings.react.reactMod.ClassicElement
import typings.react.reactMod.ElementType
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointComponent
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadableConcreteRequest
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedEntryPoint
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedQuery
import typings.reactDashRelay.libRelayDashExperimentalLazyLoadEntryPointContainerMod.EntryPointContainerProps
import typings.reactDashRelay.libRelayDashExperimentalRelayEnvironmentProviderMod.Props
import typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.$Call
import typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.KeyReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.KeyType
import typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod.ReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.ArrayKeyReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.ArrayKeyType
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: EntryPointComponent[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps] */](hasEntryPointReferenceProps: Anon_EntryPointReference[TEntryPointComponent, TRuntimeProps]): ClassicElement[ElementType[_]] = js.native
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
    options: Anon_NetworkCacheConfig
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
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnType[TQuery, TKey | Null, $Call[KeyReturnType[TKey]] | Null] = js.native
  def useFragment[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): (js.Array[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ]) | Null = js.native
  def useFragment[TKey /* <: typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Array[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayKeyType_Union[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (js.Array[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[ArrayKeyReturnType[TKey]]
  ]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType[TKey /* <: typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): (typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ]) | Null = js.native
  @JSName("useFragment")
  def useFragment_TKey_KeyType_Union[TKey /* <: typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call[
    typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.KeyReturnType[TKey]
  ]) | Null = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    (typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.$Call[
      typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyReturnType[TKey]
    ]) | Null
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyType */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.ReturnType[
    TQuery, 
    TKey | Null, 
    (typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.$Call[
      typings.reactDashRelay.libRelayDashExperimentalUseLegacyPaginationFragmentMod.KeyReturnType[TKey]
    ]) | Null
  ] = js.native
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.ReturnType[TQuery, TKey] = js.native
  def useRelayEnvironment(): typings.relayDashRuntime.relayDashRuntimeMod.Environment = js.native
}

