package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.relayRuntime.anon.CLIENTMUTATIONID
import typings.relayRuntime.anon.GcReleaseBufferSize
import typings.relayRuntime.anon.Size
import typings.relayRuntime.anon.Stop
import typings.relayRuntime.applyOptimisticMutationMod.OptimisticMutationConfig
import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.getRequestIdentifierMod.RequestIdentifier
import typings.relayRuntime.normalizationNodeMod.NormalizationField
import typings.relayRuntime.normalizationNodeMod.NormalizationHandle
import typings.relayRuntime.normalizationNodeMod.NormalizationSelectableNode
import typings.relayRuntime.readerNodeMod.ReaderField
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderInlineDataFragment
import typings.relayRuntime.readerNodeMod.ReaderPaginationFragment
import typings.relayRuntime.readerNodeMod.ReaderRefetchableFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayFeatureFlagsMod.FeatureFlags
import typings.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typings.relayRuntime.relayModernEnvironmentMod.default
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayModernRecordMod.RelayModernRecord
import typings.relayRuntime.relayNetworkTypesMod.FetchFunction
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import typings.relayRuntime.relayObservableMod.ObservableFromValue
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayObservableMod.Source
import typings.relayRuntime.relayProfilerMod.ProfileHandler
import typings.relayRuntime.relayRecordSourceMod.RelayRecordSource
import typings.relayRuntime.relayRuntimeStrings.ClientExtension
import typings.relayRuntime.relayRuntimeStrings.Condition
import typings.relayRuntime.relayRuntimeStrings.Connection
import typings.relayRuntime.relayRuntimeStrings.Defer
import typings.relayRuntime.relayRuntimeStrings.Fragment
import typings.relayRuntime.relayRuntimeStrings.FragmentSpread
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragment
import typings.relayRuntime.relayRuntimeStrings.InlineDataFragmentSpread
import typings.relayRuntime.relayRuntimeStrings.InlineFragment
import typings.relayRuntime.relayRuntimeStrings.LinkedField
import typings.relayRuntime.relayRuntimeStrings.LinkedHandle
import typings.relayRuntime.relayRuntimeStrings.ListValue
import typings.relayRuntime.relayRuntimeStrings.Literal
import typings.relayRuntime.relayRuntimeStrings.LocalArgument
import typings.relayRuntime.relayRuntimeStrings.ModuleImport
import typings.relayRuntime.relayRuntimeStrings.ObjectValue
import typings.relayRuntime.relayRuntimeStrings.Operation
import typings.relayRuntime.relayRuntimeStrings.Request
import typings.relayRuntime.relayRuntimeStrings.RootArgument
import typings.relayRuntime.relayRuntimeStrings.ScalarField
import typings.relayRuntime.relayRuntimeStrings.ScalarHandle
import typings.relayRuntime.relayRuntimeStrings.SplitOperation
import typings.relayRuntime.relayRuntimeStrings.Stream
import typings.relayRuntime.relayRuntimeStrings.TypeDiscriminator
import typings.relayRuntime.relayRuntimeStrings.Variable
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.FragmentMap
import typings.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typings.relayRuntime.relayStoreTypesMod.HandleFieldPayload
import typings.relayRuntime.relayStoreTypesMod.Handler
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.PluralReaderSelector
import typings.relayRuntime.relayStoreTypesMod.Props
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordProxy
import typings.relayRuntime.relayStoreTypesMod.ReaderSelector
import typings.relayRuntime.relayStoreTypesMod.RecordMap
import typings.relayRuntime.relayStoreTypesMod.RecordProxy
import typings.relayRuntime.relayStoreTypesMod.RecordSourceProxy
import typings.relayRuntime.relayStoreTypesMod.RelayContext
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import typings.relayRuntime.relayStoreTypesMod.SingularReaderSelector
import typings.relayRuntime.relayStoreTypesMod.StoreUpdater
import typings.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ConnectionHandler {
    
    @JSImport("relay-runtime", "ConnectionHandler.buildConnectionEdge")
    @js.native
    def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
    @JSImport("relay-runtime", "ConnectionHandler.buildConnectionEdge")
    @js.native
    def buildConnectionEdge(store: RecordSourceProxy, connection: RecordProxy[js.Object], edge: RecordProxy[js.Object]): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.createEdge")
    @js.native
    def createEdge(
      store: RecordSourceProxy,
      record: RecordProxy[js.Object],
      node: RecordProxy[js.Object],
      edgeType: String
    ): RecordProxy[js.Object] = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.deleteNode")
    @js.native
    def deleteNode(record: RecordProxy[js.Object], nodeID: DataID): Unit = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.getConnection")
    @js.native
    def getConnection(record: ReadOnlyRecordProxy, key: String): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
    @JSImport("relay-runtime", "ConnectionHandler.getConnection")
    @js.native
    def getConnection(record: ReadOnlyRecordProxy, key: String, filters: Variables): js.UndefOr[RecordProxy[js.Object] | Null] = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.insertEdgeAfter")
    @js.native
    def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
    @JSImport("relay-runtime", "ConnectionHandler.insertEdgeAfter")
    @js.native
    def insertEdgeAfter(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.insertEdgeBefore")
    @js.native
    def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object]): Unit = js.native
    @JSImport("relay-runtime", "ConnectionHandler.insertEdgeBefore")
    @js.native
    def insertEdgeBefore(record: RecordProxy[js.Object], newEdge: RecordProxy[js.Object], cursor: String): Unit = js.native
    
    @JSImport("relay-runtime", "ConnectionHandler.update")
    @js.native
    def update(store: RecordSourceProxy, payload: HandleFieldPayload): Unit = js.native
  }
  
  object ConnectionInterface {
    
    @JSImport("relay-runtime", "ConnectionInterface.get")
    @js.native
    def get(): CLIENTMUTATIONID = js.native
  }
  
  @JSImport("relay-runtime", "DefaultHandlerProvider")
  @js.native
  def DefaultHandlerProvider(handle: String): Handler = js.native
  
  @JSImport("relay-runtime", "Environment")
  @js.native
  class Environment protected () extends default {
    def this(config: EnvironmentConfig) = this()
  }
  
  @JSImport("relay-runtime", "FRAGMENTS_KEY")
  @js.native
  val FRAGMENTS_KEY: String = js.native
  
  @JSImport("relay-runtime", "FRAGMENT_OWNER_KEY")
  @js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  
  @JSImport("relay-runtime", "ID_KEY")
  @js.native
  val ID_KEY: String = js.native
  
  object Network {
    
    @JSImport("relay-runtime", "Network.create")
    @js.native
    def create(fetchFn: FetchFunction): typings.relayRuntime.relayNetworkTypesMod.Network = js.native
    @JSImport("relay-runtime", "Network.create")
    @js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typings.relayRuntime.relayNetworkTypesMod.Network = js.native
  }
  
  @JSImport("relay-runtime", "Observable")
  @js.native
  class Observable[T] protected () extends RelayObservable[T] {
    // Use RelayObservable.create(source);
    protected def this(source: scala.Nothing) = this()
  }
  /* static members */
  object Observable {
    
    @JSImport("relay-runtime", "Observable.create")
    @js.native
    def create[V](source: Source[V]): RelayObservable[V] = js.native
    
    /**
      * Accepts various kinds of data sources, and always returns a RelayObservable
      * useful for accepting the result of a user-provided FetchFunction.
      */
    @JSImport("relay-runtime", "Observable.from")
    @js.native
    def from[V](obj: ObservableFromValue[V]): RelayObservable[V] = js.native
    
    /**
      * When an emitted error event is not handled by an Observer, it is reported
      * to the host environment (what the ESObservable spec refers to as
      * "HostReportErrors()").
      *
      * The default implementation in development rethrows thrown errors, and
      * logs emitted error events to the console, while in production does nothing
      * (swallowing unhandled errors).
      *
      * Called during application initialization, this method allows
      * application-specific handling of unhandled errors. Allowing, for example,
      * integration with error logging or developer tools.
      *
      * A second parameter `isUncaughtThrownError` is true when the unhandled error
      * was thrown within an Observer handler, and false when the unhandled error
      * was an unhandled emitted event.
      *
      *  - Uncaught thrown errors typically represent avoidable errors thrown from
      *    application code, which should be handled with a try/catch block, and
      *    usually have useful stack traces.
      *
      *  - Unhandled emitted event errors typically represent unavoidable events in
      *    application flow such as network failure, and may not have useful
      *    stack traces.
      */
    @JSImport("relay-runtime", "Observable.onUnhandledError")
    @js.native
    def onUnhandledError(callback: js.Function2[/* error */ Error, /* isUncaughtThrownError */ Boolean, Unit]): Unit = js.native
  }
  
  @JSImport("relay-runtime", "QueryResponseCache")
  @js.native
  class QueryResponseCache protected ()
    extends typings.relayRuntime.relayQueryResponseCacheMod.default {
    def this(config: Size) = this()
  }
  
  @JSImport("relay-runtime", "REFS_KEY")
  @js.native
  val REFS_KEY: String = js.native
  
  @JSImport("relay-runtime", "REF_KEY")
  @js.native
  val REF_KEY: String = js.native
  
  @JSImport("relay-runtime", "ROOT_ID")
  @js.native
  val ROOT_ID: String = js.native
  
  @JSImport("relay-runtime", "ROOT_TYPE")
  @js.native
  val ROOT_TYPE: String = js.native
  
  @JSImport("relay-runtime", "Record")
  @js.native
  class Record () extends RelayModernRecord
  
  @JSImport("relay-runtime", "RecordSource")
  @js.native
  class RecordSource () extends RelayRecordSource {
    def this(records: RecordMap) = this()
  }
  /* static members */
  object RecordSource {
    
    @JSImport("relay-runtime", "RecordSource.create")
    @js.native
    def create(): MutableRecordSource = js.native
    @JSImport("relay-runtime", "RecordSource.create")
    @js.native
    def create(records: RecordMap): MutableRecordSource = js.native
  }
  
  object RelayConcreteNode {
    
    @JSImport("relay-runtime", "RelayConcreteNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("relay-runtime", "RelayConcreteNode.CLIENT_EXTENSION")
    @js.native
    def CLIENT_EXTENSION: ClientExtension = js.native
    @scala.inline
    def CLIENT_EXTENSION_=(x: ClientExtension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CONDITION")
    @js.native
    def CONDITION: Condition = js.native
    @scala.inline
    def CONDITION_=(x: Condition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.CONNECTION")
    @js.native
    def CONNECTION: Connection = js.native
    @scala.inline
    def CONNECTION_=(x: Connection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.DEFER")
    @js.native
    def DEFER: Defer = js.native
    @scala.inline
    def DEFER_=(x: Defer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFER")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.FRAGMENT")
    @js.native
    def FRAGMENT: Fragment = js.native
    @scala.inline
    def FRAGMENT_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.FRAGMENT_SPREAD")
    @js.native
    def FRAGMENT_SPREAD: FragmentSpread = js.native
    @scala.inline
    def FRAGMENT_SPREAD_=(x: FragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_DATA_FRAGMENT")
    @js.native
    def INLINE_DATA_FRAGMENT: InlineDataFragment = js.native
    @scala.inline
    def INLINE_DATA_FRAGMENT_=(x: InlineDataFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_DATA_FRAGMENT_SPREAD")
    @js.native
    def INLINE_DATA_FRAGMENT_SPREAD: InlineDataFragmentSpread = js.native
    @scala.inline
    def INLINE_DATA_FRAGMENT_SPREAD_=(x: InlineDataFragmentSpread): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_DATA_FRAGMENT_SPREAD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.INLINE_FRAGMENT")
    @js.native
    def INLINE_FRAGMENT: InlineFragment = js.native
    @scala.inline
    def INLINE_FRAGMENT_=(x: InlineFragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INLINE_FRAGMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LINKED_FIELD")
    @js.native
    def LINKED_FIELD: LinkedField = js.native
    @scala.inline
    def LINKED_FIELD_=(x: LinkedField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LINKED_HANDLE")
    @js.native
    def LINKED_HANDLE: LinkedHandle = js.native
    @scala.inline
    def LINKED_HANDLE_=(x: LinkedHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LIST_VALUE")
    @js.native
    def LIST_VALUE: ListValue = js.native
    @scala.inline
    def LIST_VALUE_=(x: ListValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LITERAL")
    @js.native
    def LITERAL: Literal = js.native
    @scala.inline
    def LITERAL_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.LOCAL_ARGUMENT")
    @js.native
    def LOCAL_ARGUMENT: LocalArgument = js.native
    @scala.inline
    def LOCAL_ARGUMENT_=(x: LocalArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.MODULE_IMPORT")
    @js.native
    def MODULE_IMPORT: ModuleImport = js.native
    @scala.inline
    def MODULE_IMPORT_=(x: ModuleImport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODULE_IMPORT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.OBJECT_VALUE")
    @js.native
    def OBJECT_VALUE: ObjectValue = js.native
    @scala.inline
    def OBJECT_VALUE_=(x: ObjectValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.OPERATION")
    @js.native
    def OPERATION: Operation = js.native
    @scala.inline
    def OPERATION_=(x: Operation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.REQUEST")
    @js.native
    def REQUEST: Request = js.native
    @scala.inline
    def REQUEST_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.ROOT_ARGUMENT")
    @js.native
    def ROOT_ARGUMENT: RootArgument = js.native
    @scala.inline
    def ROOT_ARGUMENT_=(x: RootArgument): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_ARGUMENT")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SCALAR_FIELD")
    @js.native
    def SCALAR_FIELD: ScalarField = js.native
    @scala.inline
    def SCALAR_FIELD_=(x: ScalarField): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_FIELD")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SCALAR_HANDLE")
    @js.native
    def SCALAR_HANDLE: ScalarHandle = js.native
    @scala.inline
    def SCALAR_HANDLE_=(x: ScalarHandle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALAR_HANDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.SPLIT_OPERATION")
    @js.native
    def SPLIT_OPERATION: SplitOperation = js.native
    @scala.inline
    def SPLIT_OPERATION_=(x: SplitOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPLIT_OPERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.STREAM")
    @js.native
    def STREAM: Stream = js.native
    @scala.inline
    def STREAM_=(x: Stream): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.TYPE_DISCRIMINATOR")
    @js.native
    def TYPE_DISCRIMINATOR: TypeDiscriminator = js.native
    @scala.inline
    def TYPE_DISCRIMINATOR_=(x: TypeDiscriminator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DISCRIMINATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("relay-runtime", "RelayConcreteNode.VARIABLE")
    @js.native
    def VARIABLE: Variable = js.native
    @scala.inline
    def VARIABLE_=(x: Variable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VARIABLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("relay-runtime", "RelayFeatureFlags")
  @js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  
  object RelayProfiler {
    
    /**
      * Attaches a handler to all methods instrumented with the supplied name.
      *
      *   function createRenderer() {
      *     return RelayProfiler.instrument('render', function() {...});
      *   }
      *   const renderA = createRenderer();
      *   const renderB = createRenderer();
      *
      *   // Only profiles `renderA`.
      *   renderA.attachHandler(...);
      *
      *   // Profiles both `renderA` and `renderB`.
      *   RelayProfiler.attachAggregateHandler('render', ...);
      *
      */
    @JSImport("relay-runtime", "RelayProfiler.attachAggregateHandler")
    @js.native
    def attachAggregateHandler(name: String, handler: typings.relayRuntime.relayProfilerMod.Handler): Unit = js.native
    
    /**
      * Attaches a handler to profiles with the supplied name. You can also
      * attach to the special name '*' which is a catch all.
      */
    @JSImport("relay-runtime", "RelayProfiler.attachProfileHandler")
    @js.native
    def attachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
    
    /**
      * Detaches a handler attached via `attachAggregateHandler`.
      */
    @JSImport("relay-runtime", "RelayProfiler.detachAggregateHandler")
    @js.native
    def detachAggregateHandler(name: String, handler: typings.relayRuntime.relayProfilerMod.Handler): Unit = js.native
    
    /**
      * Detaches a handler attached via `attachProfileHandler`.
      */
    @JSImport("relay-runtime", "RelayProfiler.detachProfileHandler")
    @js.native
    def detachProfileHandler(name: String, handler: ProfileHandler): Unit = js.native
    
    /**
      * Wraps the supplied function with one that provides the `attachHandler` and
      * `detachHandler` methods. Example usage:
      *
      *   const printRelayQuery =
      *     RelayProfiler.instrument('printRelayQuery', printRelayQuery);
      *
      *   printRelayQuery.attachHandler(...);
      *
      * NOTE: The instrumentation assumes that no handlers are attached or detached
      * in the course of executing another handler.
      */
    @JSImport("relay-runtime", "RelayProfiler.instrument")
    @js.native
    def instrument[T /* <: js.Function0[Unit] */](name: String, originalFunction: T): T = js.native
    
    /**
      * Instruments methods on a class or object. This re-assigns the method in
      * order to preserve function names in stack traces (which are detected by
      * modern debuggers via heuristics). Example usage:
      *
      *   const RelayStore = { primeCache: function() {...} };
      *   RelayProfiler.instrumentMethods(RelayStore, {
      *     primeCache: 'RelayStore.primeCache'
      *   });
      *
      *   RelayStore.primeCache.attachHandler(...);
      *
      * As a result, the methods will be replaced by wrappers that provide the
      * `attachHandler` and `detachHandler` methods.
      */
    @JSImport("relay-runtime", "RelayProfiler.instrumentMethods")
    @js.native
    def instrumentMethods(`object`: js.Function0[Unit | js.Object], names: StringDictionary[String]): Unit = js.native
    
    /**
      * Instruments profiling for arbitrarily asynchronous code by a name.
      *
      *   const timerProfiler = RelayProfiler.profile('timeout');
      *   setTimeout(function() {
      *     timerProfiler.stop();
      *   }, 1000);
      *
      *   RelayProfiler.attachProfileHandler('timeout', ...);
      *
      * Arbitrary state can also be passed into `profile` as a second argument. The
      * attached profile handlers will receive this as the second argument.
      */
    @JSImport("relay-runtime", "RelayProfiler.profile")
    @js.native
    def profile(name: String): Stop = js.native
    @JSImport("relay-runtime", "RelayProfiler.profile")
    @js.native
    def profile(name: String, state: js.Any): Stop = js.native
  }
  
  @JSImport("relay-runtime", "Store")
  @js.native
  class Store protected ()
    extends typings.relayRuntime.relayModernStoreMod.default {
    def this(source: MutableRecordSource) = this()
    def this(source: MutableRecordSource, options: GcReleaseBufferSize) = this()
  }
  
  @JSImport("relay-runtime", "TYPENAME_KEY")
  @js.native
  val TYPENAME_KEY: String = js.native
  
  @JSImport("relay-runtime", "__internal")
  @js.native
  val _Internal: Internal = js.native
  
  @JSImport("relay-runtime", "applyOptimisticMutation")
  @js.native
  def applyOptimisticMutation(environment: typings.relayRuntime.relayStoreTypesMod.Environment, config: OptimisticMutationConfig): Disposable = js.native
  
  @JSImport("relay-runtime", "areEqualSelectors")
  @js.native
  def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = js.native
  
  @JSImport("relay-runtime", "commitLocalUpdate")
  @js.native
  def commitLocalUpdate(environment: typings.relayRuntime.relayStoreTypesMod.Environment, updater: StoreUpdater): Unit = js.native
  
  @JSImport("relay-runtime", "commitMutation")
  @js.native
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
  
  @JSImport("relay-runtime", "createFragmentSpecResolver")
  @js.native
  def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  @JSImport("relay-runtime", "createFragmentSpecResolver")
  @js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
  
  @JSImport("relay-runtime", "createNormalizationSelector")
  @js.native
  def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
  
  @JSImport("relay-runtime", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  @JSImport("relay-runtime", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(
    request: ConcreteRequest,
    variables: Variables,
    cacheConfig: js.UndefOr[scala.Nothing],
    dataID: DataID
  ): OperationDescriptor = js.native
  @JSImport("relay-runtime", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = js.native
  @JSImport("relay-runtime", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = js.native
  @JSImport("relay-runtime", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = js.native
  
  @JSImport("relay-runtime", "createReaderSelector")
  @js.native
  def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
  @JSImport("relay-runtime", "createReaderSelector")
  @js.native
  def createReaderSelector(
    fragment: ReaderFragment,
    dataID: DataID,
    variables: Variables,
    request: RequestDescriptor,
    isWithinUnmatchedTypeRefinement: Boolean
  ): SingularReaderSelector = js.native
  
  @JSImport("relay-runtime", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
  @JSImport("relay-runtime", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): RequestDescriptor = js.native
  
  @JSImport("relay-runtime", "deepFreeze")
  @js.native
  def deepFreeze[T /* <: js.Object */](value: T): T = js.native
  
  @JSImport("relay-runtime", "fetchQuery")
  @js.native
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSImport("relay-runtime", "fetchQuery")
  @js.native
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  
  @JSImport("relay-runtime", "generateClientID")
  @js.native
  def generateClientID(id: DataID, storageKey: String): DataID = js.native
  @JSImport("relay-runtime", "generateClientID")
  @js.native
  def generateClientID(id: DataID, storageKey: String, index: Double): DataID = js.native
  
  @JSImport("relay-runtime", "generateUniqueClientID")
  @js.native
  def generateUniqueClientID(): DataID = js.native
  
  @JSImport("relay-runtime", "getDataIDsFromFragment")
  @js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = js.native
  @JSImport("relay-runtime", "getDataIDsFromFragment")
  @js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[_]): DataID | js.Array[DataID] = js.native
  
  @JSImport("relay-runtime", "getDataIDsFromObject")
  @js.native
  def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
  
  @JSImport("relay-runtime", "getDefaultMissingFieldHandlers")
  @js.native
  def getDefaultMissingFieldHandlers(): js.Array[MissingFieldHandler] = js.native
  
  @JSImport("relay-runtime", "getFragment")
  @js.native
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  
  @JSImport("relay-runtime", "getFragmentIdentifier")
  @js.native
  def getFragmentIdentifier(fragmentNode: ReaderFragment, fragmentRef: js.Any): String = js.native
  
  @JSImport("relay-runtime", "getInlineDataFragment")
  @js.native
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  
  @JSImport("relay-runtime", "getModuleComponentKey")
  @js.native
  def getModuleComponentKey(documentName: String): String = js.native
  
  @JSImport("relay-runtime", "getModuleOperationKey")
  @js.native
  def getModuleOperationKey(documentName: String): String = js.native
  
  @JSImport("relay-runtime", "getPaginationFragment")
  @js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  
  @JSImport("relay-runtime", "getPluralSelector")
  @js.native
  def getPluralSelector(fragment: ReaderFragment, items: js.Array[_]): PluralReaderSelector = js.native
  
  @JSImport("relay-runtime", "getRefetchableFragment")
  @js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  
  @JSImport("relay-runtime", "getRelayHandleKey")
  @js.native
  def getRelayHandleKey(handleName: String): String = js.native
  @JSImport("relay-runtime", "getRelayHandleKey")
  @js.native
  def getRelayHandleKey(handleName: String, key: js.UndefOr[scala.Nothing], fieldName: String): String = js.native
  @JSImport("relay-runtime", "getRelayHandleKey")
  @js.native
  def getRelayHandleKey(handleName: String, key: String): String = js.native
  @JSImport("relay-runtime", "getRelayHandleKey")
  @js.native
  def getRelayHandleKey(handleName: String, key: String, fieldName: String): String = js.native
  @JSImport("relay-runtime", "getRelayHandleKey")
  @js.native
  def getRelayHandleKey(handleName: String, key: Null, fieldName: String): String = js.native
  
  @JSImport("relay-runtime", "getRequest")
  @js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  
  @JSImport("relay-runtime", "getRequestIdentifier")
  @js.native
  def getRequestIdentifier(parameters: RequestParameters, variables: Variables): RequestIdentifier = js.native
  
  @JSImport("relay-runtime", "getSelector")
  @js.native
  def getSelector(fragment: ReaderFragment, item: js.Any): ReaderSelector = js.native
  @JSImport("relay-runtime", "getSelector")
  @js.native
  def getSelector(fragment: ReaderFragment, item: js.Array[_]): ReaderSelector = js.native
  
  @JSImport("relay-runtime", "getSelectorsFromObject")
  @js.native
  def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
  
  @JSImport("relay-runtime", "getSingularSelector")
  @js.native
  def getSingularSelector(fragment: ReaderFragment, item: js.Any): SingularReaderSelector = js.native
  
  @JSImport("relay-runtime", "getStorageKey")
  @js.native
  def getStorageKey(field: NormalizationField, variables: Variables): String = js.native
  @JSImport("relay-runtime", "getStorageKey")
  @js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): String = js.native
  @JSImport("relay-runtime", "getStorageKey")
  @js.native
  def getStorageKey(field: ReaderField, variables: Variables): String = js.native
  
  @JSImport("relay-runtime", "getVariablesFromFragment")
  @js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  @JSImport("relay-runtime", "getVariablesFromFragment")
  @js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[_]): Variables = js.native
  
  @JSImport("relay-runtime", "getVariablesFromObject")
  @js.native
  def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = js.native
  
  @JSImport("relay-runtime", "getVariablesFromPluralFragment")
  @js.native
  def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[_]): Variables = js.native
  
  @JSImport("relay-runtime", "getVariablesFromSingularFragment")
  @js.native
  def getVariablesFromSingularFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  
  @JSImport("relay-runtime", "graphql")
  @js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  
  @JSImport("relay-runtime", "isClientID")
  @js.native
  def isClientID(id: DataID): Boolean = js.native
  
  @JSImport("relay-runtime", "isPromise")
  @js.native
  def isPromise(p: js.Any): /* is std.Promise<any> */ Boolean = js.native
  
  @JSImport("relay-runtime", "isRelayModernEnvironment")
  @js.native
  def isRelayModernEnvironment(environment: js.Any): Boolean = js.native
  
  @JSImport("relay-runtime", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  @JSImport("relay-runtime", "readInlineData")
  @js.native
  def readInlineData[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
  @JSImport("relay-runtime", "readInlineData")
  @js.native
  def readInlineData_T_RefTypeWildcard_T[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
  
  @JSImport("relay-runtime", "requestSubscription")
  @js.native
  def requestSubscription[TSubscription /* <: OperationType */](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
  
  type FragmentRef[Fragment] = _FragmentRefs[js.Any]
  
  type FragmentRefs[Refs /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ref in Refs ]: true}
    */ typings.relayRuntime.relayRuntimeStrings.FragmentRefs with TopLevel[js.Any]
  
  @js.native
  trait Internal extends StObject {
    
    def fetchQuery(environment: typings.relayRuntime.relayStoreTypesMod.Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = js.native
    
    def fetchQueryDeduped(
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      request: RequestDescriptor,
      fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
    ): RelayObservable[GraphQLResponse] = js.native
    @JSName("fetchQueryDeduped")
    var fetchQueryDeduped_Original: js.Function3[
        /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]], 
        RelayObservable[GraphQLResponse]
      ] = js.native
    
    @JSName("fetchQuery")
    var fetchQuery_Original: js.Function2[
        /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
        /* operation */ OperationDescriptor, 
        RelayObservable[GraphQLResponse]
      ] = js.native
    
    def getObservableForActiveRequest(environment: typings.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
    @JSName("getObservableForActiveRequest")
    var getObservableForActiveRequest_Original: js.Function2[
        /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        RelayObservable[Unit] | Null
      ] = js.native
    
    def getPromiseForActiveRequest(environment: typings.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
    @JSName("getPromiseForActiveRequest")
    var getPromiseForActiveRequest_Original: js.Function2[
        /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
        /* request */ RequestDescriptor, 
        js.Promise[Unit] | Null
      ] = js.native
  }
  
  @js.native
  trait RefType[Ref /* <: String */] extends StObject {
    
    @JSName(" $refType")
    var Space$refType: Ref = js.native
  }
  object RefType {
    
    @scala.inline
    def apply[Ref /* <: String */](Space$refType: Ref): RefType[Ref] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $refType")(Space$refType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefType[Ref]]
    }
    
    @scala.inline
    implicit class RefTypeMutableBuilder[Self <: RefType[_], Ref /* <: String */] (val x: Self with RefType[Ref]) extends AnyVal {
      
      @scala.inline
      def setSpace$refType(value: Ref): Self = StObject.set(x, " $refType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _FragmentRefs[Refs /* <: String */] extends StObject {
    
    @JSName(" $fragmentRefs")
    var Space$fragmentRefs: FragmentRefs[Refs] = js.native
  }
  object _FragmentRefs {
    
    @scala.inline
    def apply[Refs /* <: String */](Space$fragmentRefs: FragmentRefs[Refs]): _FragmentRefs[Refs] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[_FragmentRefs[Refs]]
    }
    
    @scala.inline
    implicit class _FragmentRefsMutableBuilder[Self <: _FragmentRefs[_], Refs /* <: String */] (val x: Self with _FragmentRefs[Refs]) extends AnyVal {
      
      @scala.inline
      def setSpace$fragmentRefs(value: FragmentRefs[Refs]): Self = StObject.set(x, " $fragmentRefs", value.asInstanceOf[js.Any])
    }
  }
}
