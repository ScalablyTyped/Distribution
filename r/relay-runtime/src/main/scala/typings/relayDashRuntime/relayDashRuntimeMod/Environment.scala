package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_CacheConfig
import typings.relayDashRuntime.Anon_Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./store/RelayStoreTypes
@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends CEnvironment[
      Environment, 
      ReaderFragment, 
      GraphQLTaggedNode, 
      ReaderSelectableNode, 
      NormalizationSelectableNode, 
      ConcreteRequest, 
      GraphQLResponse, 
      OwnedReaderSelector
    ] {
  def this(config: EnvironmentConfig) = this()
  def applyUpdate(optimisticUpdate: OptimisticUpdate): Disposable = js.native
  /* CompleteClass */
  override def check(selector: CNormalizationSelector[NormalizationSelectableNode]): Boolean = js.native
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): Unit = js.native
  def commitUpdate(updater: StoreUpdater): Unit = js.native
  /* CompleteClass */
  override def execute(config: Anon_CacheConfig[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]): RelayObservable[GraphQLResponse] = js.native
  def executeMutation(data: Anon_Operation): RelayObservable[GraphQLResponse] = js.native
  def getStore(): Store = js.native
  /* CompleteClass */
  override def lookup(selector: CReaderSelector[ReaderSelectableNode]): CSnapshot[
    ReaderSelectableNode, 
    COperationDescriptor[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
  ] = js.native
  def lookup(selector: ReaderSelector, owner: OperationDescriptor): CSnapshot[ReaderSelectableNode, OperationDescriptor] = js.native
  /* CompleteClass */
  override def retain(selector: CNormalizationSelector[NormalizationSelectableNode]): Disposable = js.native
  /* CompleteClass */
  override def subscribe(
    snapshot: CSnapshot[
      ReaderSelectableNode, 
      COperationDescriptor[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
    ],
    callback: js.Function1[
      /* snapshot */ CSnapshot[
        ReaderSelectableNode, 
        COperationDescriptor[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
      ], 
      Unit
    ]
  ): Disposable = js.native
}

