package typings.samchon

import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesDistributedInterfacesIDistributedServerMod.IDistributedServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedServerArray", JSImport.Namespace)
@js.native
object templatesDistributedDerivedDistributedServerArrayMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher because Already inherited
  - typings.tstl.containerDequeMod.Deque because Already inherited
  - typings.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typings.samchon.protocolInvokeIProtocolMod.IProtocol because Already inherited
  - typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.templatesExternalInterfacesIExternalServerArrayMod.IExternalServerArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined connect */ @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArray[System /* <: IDistributedServer */] () extends DistributedSystemArray[System] {
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
  
}

