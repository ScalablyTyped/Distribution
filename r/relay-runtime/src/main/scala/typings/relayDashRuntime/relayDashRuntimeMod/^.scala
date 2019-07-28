package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ConnectionHandler: RelayConnectionHandler = js.native
  val FRAGMENTS_KEY: String = js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  val ID_KEY: String = js.native
  val REFS_KEY: String = js.native
  val REF_KEY: String = js.native
  val ROOT_ID: String = js.native
  val ROOT_TYPE: String = js.native
  val RelayDefaultMissingFieldHandlers: js.Array[MissingFieldHandler] = js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  val RelayProfiler: typings.relayDashRuntime.relayDashRuntimeMod.RelayProfiler = js.native
  val TYPENAME_KEY: String = js.native
  val ViewerHandler: RelayViewerHandler = js.native
  // Extensions
  // ./handlers/RelayDefaultHandlerProvider
  def DefaultHandlerProvider(handle: String): Handler = js.native
  // Helpers (can be implemented via the above API)
  // ./mutations/applyRelayModernOptimisticMutation
  def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = js.native
  def areEqualSelectors(thisSelector: OwnedReaderSelector, thatSelector: OwnedReaderSelector): Boolean = js.native
  def commitLocalUpdate(environment: Environment, updater: StoreUpdater): Unit = js.native
  // ./mutations/commitRelayModernMutation
  def commitMutation[TOperation /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
  def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def deepFreeze[T /* <: js.Object */](value: T): T = js.native
  // ./query/fetchRelayModernQuery
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: RelayModernEnvironment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: RelayModernEnvironment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[js.UndefOr[DataID | js.Array[DataID] | Null]] = js.native
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment): OperationDescriptor | Null = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment, fragmentRef: js.Array[js.UndefOr[FragmentPointer | Null]]): OperationDescriptor | Null = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment, fragmentRef: FragmentPointer): OperationDescriptor | Null = js.native
  def getFragmentOwners(
    fragmentNodes: StringDictionary[ReaderFragment],
    fragmentRefs: StringDictionary[
      js.UndefOr[FragmentPointer | (js.Array[js.UndefOr[FragmentPointer | Null]]) | Null]
    ]
  ): StringDictionary[OperationDescriptor | Null] = js.native
  def getModuleComponentKey(documentName: String): String = js.native
  def getModuleOperationKey(documentName: String): String = js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  def getSelector(operationVariables: Variables, fragment: ReaderFragment, item: js.Any): js.UndefOr[OwnedReaderSelector | Null] = js.native
  def getSelectorList(operationVariables: Variables, fragment: ReaderFragment, items: js.Array[_]): js.UndefOr[js.Array[OwnedReaderSelector] | Null] = js.native
  def getSelectorsFromObject(
    operationVariables: Variables,
    fragments: StringDictionary[ReaderFragment],
    `object`: StringDictionary[js.Any]
  ): StringDictionary[js.UndefOr[OwnedReaderSelector | js.Array[OwnedReaderSelector] | Null]] = js.native
  def getStorageKey(field: NormalizationField, variables: Variables): String = js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): String = js.native
  def getStorageKey(field: ReaderField, variables: Variables): String = js.native
  def getVariablesFromObject(
    operationVariables: Variables,
    fragments: StringDictionary[ReaderFragment],
    `object`: StringDictionary[js.Any]
  ): Variables = js.native
  def graphql(strings: js.Array[String]): GraphQLTaggedNode = js.native
  def isRelayModernEnvironment(environment: js.Any): /* is relay-runtime.relay-runtime.RelayModernEnvironment */ Boolean = js.native
  // ./subscription/requestRelaySubscription
  def requestSubscription(environment: Environment, config: GraphQLSubscriptionConfig[js.Object]): Disposable = js.native
}

