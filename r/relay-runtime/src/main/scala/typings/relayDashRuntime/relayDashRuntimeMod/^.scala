package typings.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libMutationsApplyOptimisticMutationMod.OptimisticMutationConfig
import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationConfig
import typings.relayDashRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod.NetworkLogger
import typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayModernEnvironmentMod.RelayModernEnvironment
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentMap
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentSpecResolver
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Handler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.PluralReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Props
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.ReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RelayContext
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typings.relayDashRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationField
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationHandle
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationSelectableNode
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderField
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderPaginationFragment
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderRefetchableFragment
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayDashRuntime.libUtilRelayFeatureFlagsMod.FeatureFlags
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DefaultMissingFieldHandlers: MissingFieldHandler = js.native
  val FRAGMENTS_KEY: String = js.native
  val FRAGMENT_OWNER_KEY: String = js.native
  val ID_KEY: String = js.native
  val REFS_KEY: String = js.native
  val REF_KEY: String = js.native
  val ROOT_ID: String = js.native
  val ROOT_TYPE: String = js.native
  val RelayFeatureFlags: FeatureFlags = js.native
  val TYPENAME_KEY: String = js.native
  def DefaultHandlerProvider(handle: String): Handler = js.native
  def applyOptimisticMutation(
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    config: OptimisticMutationConfig
  ): Disposable = js.native
  def areEqualSelectors(thisSelector: SingularReaderSelector, thatSelector: SingularReaderSelector): Boolean = js.native
  def commitLocalUpdate(
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    updater: StoreUpdater
  ): Unit = js.native
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: RelayModernEnvironment,
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
  def createNormalizationSelector(node: NormalizationSelectableNode, dataID: DataID, variables: Variables): NormalizationSelector = js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def createReaderSelector(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
  def createRelayNetworkLogger(
    LoggerTransaction: Instantiable1[
      /* config */ LoggerTransactionConfig, 
      typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
    ]
  ): NetworkLogger = js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
  def deepFreeze[T /* <: js.Object */](value: T): T = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[T /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    taggedNode: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: CacheConfig
  ): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
  ] = js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Any): DataID | js.Array[DataID] = js.native
  def getDataIDsFromFragment(fragment: ReaderFragment, item: js.Array[_]): DataID | js.Array[DataID] = js.native
  def getDataIDsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[DataID | js.Array[DataID]] = js.native
  def getFragment(taggedNode: GraphQLTaggedNode): ReaderFragment = js.native
  def getInlineDataFragment(taggedNode: GraphQLTaggedNode): ReaderInlineDataFragment = js.native
  def getModuleComponentKey(documentName: String): String = js.native
  def getModuleOperationKey(documentName: String): String = js.native
  def getPaginationFragment(taggedNode: GraphQLTaggedNode): ReaderPaginationFragment | Null = js.native
  def getPluralSelector(fragment: ReaderFragment, items: js.Array[_]): PluralReaderSelector = js.native
  def getRefetchableFragment(taggedNode: GraphQLTaggedNode): ReaderRefetchableFragment | Null = js.native
  def getRequest(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
  def getSelector(fragment: ReaderFragment, item: js.Any): ReaderSelector = js.native
  def getSelector(fragment: ReaderFragment, item: js.Array[_]): ReaderSelector = js.native
  def getSelectorsFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
  def getSingularSelector(fragment: ReaderFragment, item: js.Any): SingularReaderSelector = js.native
  def getStorageKey(field: NormalizationField, variables: Variables): String = js.native
  def getStorageKey(field: NormalizationHandle, variables: Variables): String = js.native
  def getStorageKey(field: ReaderField, variables: Variables): String = js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  def getVariablesFromFragment(fragment: ReaderFragment, item: js.Array[_]): Variables = js.native
  def getVariablesFromObject(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): Variables = js.native
  def getVariablesFromPluralFragment(fragment: ReaderFragment, items: js.Array[_]): Variables = js.native
  def getVariablesFromSingularFragment(fragment: ReaderFragment, item: js.Any): Variables = js.native
  def graphql(strings: js.Any): GraphQLTaggedNode = js.native
  def isRelayModernEnvironment(environment: js.Any): Boolean = js.native
  def requestSubscription[TSubscriptionPayload](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

