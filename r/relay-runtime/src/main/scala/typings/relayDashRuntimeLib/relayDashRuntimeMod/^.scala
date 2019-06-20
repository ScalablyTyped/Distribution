package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ConnectionHandler: RelayConnectionHandler = js.native
  val FRAGMENTS_KEY: java.lang.String = js.native
  val FRAGMENT_OWNER_KEY: java.lang.String = js.native
  val ID_KEY: java.lang.String = js.native
  val REFS_KEY: java.lang.String = js.native
  val REF_KEY: java.lang.String = js.native
  val ROOT_ID: java.lang.String = js.native
  val ROOT_TYPE: java.lang.String = js.native
  val RelayDefaultMissingFieldHandlers: js.Array[MissingFieldHandler] = js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  val RelayProfiler: relayDashRuntimeLib.relayDashRuntimeMod.RelayProfiler = js.native
  val TYPENAME_KEY: java.lang.String = js.native
  val ViewerHandler: RelayViewerHandler = js.native
  // Extensions
  // ./handlers/RelayDefaultHandlerProvider
  def DefaultHandlerProvider(handle: java.lang.String): Handler = js.native
  // Helpers (can be implemented via the above API)
  // ./mutations/applyRelayModernOptimisticMutation
  def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = js.native
  def areEqualSelectors(thisSelector: OwnedReaderSelector, thatSelector: OwnedReaderSelector): scala.Boolean = js.native
  def commitLocalUpdate(environment: Environment, updater: StoreUpdater): scala.Unit = js.native
  // ./mutations/commitRelayModernMutation
  def commitMutation[TOperation /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = js.native
  def createFragmentSpecResolver(context: RelayContext, containerName: java.lang.String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: java.lang.String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[scala.Unit]
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
  def getDataIDsFromObject(
    fragments: org.scalablytyped.runtime.StringDictionary[ReaderFragment],
    `object`: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.UndefOr[DataID | js.Array[DataID] | scala.Null]] = js.native
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment): OperationDescriptor | scala.Null = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment, fragmentRef: js.Array[js.UndefOr[FragmentPointer | scala.Null]]): OperationDescriptor | scala.Null = js.native
  def getFragmentOwner(fragmentNode: ReaderFragment, fragmentRef: FragmentPointer): OperationDescriptor | scala.Null = js.native
  def getFragmentOwners(
    fragmentNodes: org.scalablytyped.runtime.StringDictionary[ReaderFragment],
    fragmentRefs: org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        FragmentPointer | (js.Array[js.UndefOr[FragmentPointer | scala.Null]]) | scala.Null
      ]
    ]
  ): org.scalablytyped.runtime.StringDictionary[OperationDescriptor | scala.Null] = js.native
  def getModuleComponentKey(documentName: java.lang.String): java.lang.String = js.native
  def getModuleOperationKey(documentName: java.lang.String): java.lang.String = js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | scala.Null = js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | scala.Null = js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  def getSelector(operationVariables: Variables, fragment: ReaderFragment, item: js.Any): js.UndefOr[OwnedReaderSelector | scala.Null] = js.native
  def getSelectorList(operationVariables: Variables, fragment: ReaderFragment, items: js.Array[_]): js.UndefOr[js.Array[OwnedReaderSelector] | scala.Null] = js.native
  def getSelectorsFromObject(
    operationVariables: Variables,
    fragments: org.scalablytyped.runtime.StringDictionary[ReaderFragment],
    `object`: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.UndefOr[OwnedReaderSelector | js.Array[OwnedReaderSelector] | scala.Null]] = js.native
  def getStorageKey(field: NormalizationField, variables: Variables): java.lang.String = js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): java.lang.String = js.native
  def getStorageKey(field: ReaderField, variables: Variables): java.lang.String = js.native
  def getVariablesFromObject(
    operationVariables: Variables,
    fragments: org.scalablytyped.runtime.StringDictionary[ReaderFragment],
    `object`: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Variables = js.native
  def graphql(strings: js.Array[java.lang.String]): GraphQLTaggedNode = js.native
  def isRelayModernEnvironment(environment: js.Any): /* is relay-runtime.relay-runtime.RelayModernEnvironment */ scala.Boolean = js.native
  // ./subscription/requestRelaySubscription
  def requestSubscription(environment: Environment, config: GraphQLSubscriptionConfig[js.Object]): Disposable = js.native
}

