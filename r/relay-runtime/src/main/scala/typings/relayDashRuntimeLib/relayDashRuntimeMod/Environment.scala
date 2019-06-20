package typings
package relayDashRuntimeLib.relayDashRuntimeMod

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
  override def check(selector: CNormalizationSelector[NormalizationSelectableNode]): scala.Boolean = js.native
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): scala.Unit = js.native
  def commitUpdate(updater: StoreUpdater): scala.Unit = js.native
  /* CompleteClass */
  override def execute(
    config: relayDashRuntimeLib.Anon_CacheConfig[ReaderSelectableNode, NormalizationSelectableNode, ConcreteRequest]
  ): RelayObservable[GraphQLResponse] = js.native
  def executeMutation(data: relayDashRuntimeLib.Anon_Operation): RelayObservable[GraphQLResponse] = js.native
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
      scala.Unit
    ]
  ): Disposable = js.native
}

