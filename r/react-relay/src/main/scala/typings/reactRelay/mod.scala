package typings.reactRelay

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.reactRelay.anon.CacheConfig
import typings.reactRelay.anon.ComponentRef
import typings.reactRelay.anon.Count
import typings.reactRelay.anon.PartialPageInfo
import typings.reactRelay.anon.Relay
import typings.reactRelay.anon.RelayRelayPaginationProp
import typings.reactRelay.anon.RelayRelayRefetchProp
import typings.reactRelay.reactRelayStrings.`network-only`
import typings.reactRelay.reactRelayStrings.`store-or-network`
import typings.reactRelay.reactRelayStrings.backward
import typings.reactRelay.reactRelayStrings.forward
import typings.reactRelay.reactRelayStrings.relay
import typings.relayRuntime.applyOptimisticMutationMod.OptimisticMutationConfig
import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.mod.FragmentRef
import typings.relayRuntime.mod.RefType
import typings.relayRuntime.mod._FragmentRefs
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayObservableMod.Observer
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RelayContext
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-relay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-relay", "Environment")
  @js.native
  class Environment protected ()
    extends typings.relayRuntime.mod.Environment {
    def this(config: EnvironmentConfig) = this()
  }
  
  @JSImport("react-relay", "LocalQueryRenderer")
  @js.native
  class LocalQueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[QueryRendererProps[TOperation], js.Object, js.Any]
  
  @JSImport("react-relay", "QueryRenderer")
  @js.native
  class QueryRenderer[TOperation /* <: OperationType */] ()
    extends Component[CacheConfig & QueryRendererProps[TOperation], js.Object, js.Any]
  
  @JSImport("react-relay", "ReactRelayContext")
  @js.native
  val ReactRelayContext: Context[RelayContext | Null] = js.native
  
  @scala.inline
  def applyOptimisticMutation(environment: typings.relayRuntime.relayStoreTypesMod.Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def commitLocalUpdate(environment: typings.relayRuntime.relayStoreTypesMod.Environment, updater: StoreUpdater): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitLocalUpdate")(environment.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @scala.inline
  def createFragmentContainer[Props](Component: ComponentType[Props & Relay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFragmentContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any])).asInstanceOf[Container[Props]]
  
  @scala.inline
  def createPaginationContainer[Props](
    Component: ComponentType[Props & RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPaginationContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], connectionConfig.asInstanceOf[js.Any])).asInstanceOf[Container[Props]]
  
  @scala.inline
  def createRefetchContainer[Props](
    Component: ComponentType[Props & RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRefetchContainer")(Component.asInstanceOf[js.Any], fragmentSpec.asInstanceOf[js.Any], refetchQuery.asInstanceOf[js.Any])).asInstanceOf[Container[Props]]
  
  @scala.inline
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  @scala.inline
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], taggedNode.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ]]
  
  @scala.inline
  def graphql(strings: js.Any): GraphQLTaggedNode = ^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(strings.asInstanceOf[js.Any]).asInstanceOf[GraphQLTaggedNode]
  
  @scala.inline
  def readInlineData[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  @scala.inline
  def readInlineData[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T | Null]]
  
  @scala.inline
  def readInlineData_T_RefTypeAny_T[T /* <: RefType[js.Any] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragment.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def requestSubscription[TSubscription /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait ConnectionConfig[Props] extends StObject {
    
    var direction: js.UndefOr[backward | forward] = js.undefined
    
    var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.undefined
    
    var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.undefined
    
    def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables
    
    var query: GraphQLTaggedNode
  }
  object ConnectionConfig {
    
    @scala.inline
    def apply[Props](getVariables: (Props, Count, Variables) => Variables, query: GraphQLTaggedNode): ConnectionConfig[Props] = {
      val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionConfig[Props]]
    }
    
    @scala.inline
    implicit class ConnectionConfigMutableBuilder[Self <: ConnectionConfig[?], Props] (val x: Self & ConnectionConfig[Props]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: backward | forward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetConnectionFromProps(value: /* props */ Props => js.UndefOr[ConnectionData | Null]): Self = StObject.set(x, "getConnectionFromProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetConnectionFromPropsUndefined: Self = StObject.set(x, "getConnectionFromProps", js.undefined)
      
      @scala.inline
      def setGetFragmentVariables(value: (/* prevVars */ Variables, /* totalCount */ Double) => Variables): Self = StObject.set(x, "getFragmentVariables", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFragmentVariablesUndefined: Self = StObject.set(x, "getFragmentVariables", js.undefined)
      
      @scala.inline
      def setGetVariables(value: (Props, Count, Variables) => Variables): Self = StObject.set(x, "getVariables", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
    }
  }
  
  trait ConnectionData extends StObject {
    
    var edges: js.UndefOr[js.Array[js.Any] | Null] = js.undefined
    
    var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.undefined
  }
  object ConnectionData {
    
    @scala.inline
    def apply(): ConnectionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionData]
    }
    
    @scala.inline
    implicit class ConnectionDataMutableBuilder[Self <: ConnectionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[js.Any]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesNull: Self = StObject.set(x, "edges", null)
      
      @scala.inline
      def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      @scala.inline
      def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setPageInfo(value: PartialPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageInfoNull: Self = StObject.set(x, "pageInfo", null)
      
      @scala.inline
      def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    }
  }
  
  type Container[Props] = ComponentType[ContainerProps[Props] & ComponentRef]
  
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[/* keyof Props */ String, relay]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRelay.reactRelayStrings.`store-and-network`
    - typings.reactRelay.reactRelayStrings.`network-only`
  */
  trait FetchPolicy extends StObject
  object FetchPolicy {
    
    @scala.inline
    def `network-only`: typings.reactRelay.reactRelayStrings.`network-only` = "network-only".asInstanceOf[typings.reactRelay.reactRelayStrings.`network-only`]
    
    @scala.inline
    def `store-and-network`: typings.reactRelay.reactRelayStrings.`store-and-network` = "store-and-network".asInstanceOf[typings.reactRelay.reactRelayStrings.`store-and-network`]
  }
  
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typings.reactRelay.reactRelayStrings.MappedFragmentProps & TopLevel[T]
  
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[Error | Null], Unit])
  
  trait QueryRendererProps[TOperation /* <: OperationType */] extends StObject {
    
    var environment: typings.relayRuntime.relayStoreTypesMod.Environment
    
    var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
    
    def render(renderProps: typings.reactRelay.anon.Error[TOperation]): ReactNode
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  }
  object QueryRendererProps {
    
    @scala.inline
    def apply[TOperation /* <: OperationType */](
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      render: typings.reactRelay.anon.Error[TOperation] => ReactNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): QueryRendererProps[TOperation] = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRendererProps[TOperation]]
    }
    
    @scala.inline
    implicit class QueryRendererPropsMutableBuilder[Self <: QueryRendererProps[?], TOperation /* <: OperationType */] (val x: Self & QueryRendererProps[TOperation]) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: GraphQLTaggedNode): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRender(value: typings.reactRelay.anon.Error[TOperation] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactRelayLocalQueryRenderer[TOperation /* <: OperationType */] = Component[QueryRendererProps[TOperation], js.Object, js.Any]
  
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = Component[CacheConfig & QueryRendererProps[TOperation], js.Object, js.Any]
  
  trait RefetchOptions extends StObject {
    
    var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object RefetchOptions {
    
    @scala.inline
    def apply(): RefetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefetchOptions]
    }
    
    @scala.inline
    implicit class RefetchOptionsMutableBuilder[Self <: RefetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: `store-or-network` | `network-only`): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait RelayPaginationProp extends StObject {
    
    val environment: typings.relayRuntime.mod.Environment = js.native
    
    def hasMore(): Boolean = js.native
    
    def isLoading(): Boolean = js.native
    
    def loadMore(pageSize: Double): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: Null, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: Unit, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    
    var refetch: Unit = js.native
    
    def refetchConnection(totalCount: Double): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: Null, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: Unit, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
  }
  
  trait RelayProp extends StObject {
    
    var environment: typings.relayRuntime.mod.Environment
    
    // ensures no RelayRefetchProp is used with a fragment container
    var hasMore: Unit
    
    var refetch: Unit
  }
  object RelayProp {
    
    @scala.inline
    def apply(environment: typings.relayRuntime.mod.Environment, hasMore: Unit, refetch: Unit): RelayProp = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayProp]
    }
    
    @scala.inline
    implicit class RelayPropMutableBuilder[Self <: RelayProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typings.relayRuntime.mod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMore(value: Unit): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetch(value: Unit): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayRefetchProp extends StObject {
    
    var environment: typings.relayRuntime.mod.Environment = js.native
    
    var hasMore: Unit = js.native
    
    def refetch(refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables]): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Null, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Unit, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
  }
}
