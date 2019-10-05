package typings.samchon

import typings.samchon.templatesDistributedDerivedDistributedClientArrayMod.DistributedClientArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedServerClientArray", JSImport.Namespace)
@js.native
object templatesDistributedDerivedDistributedServerClientArrayMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPushBack because Already inherited
  - typings.tstl.baseContainerContainerMod.Container because Already inherited
  - typings.tstl.baseContainerArrayContainerMod.ArrayContainer because Already inherited
  - typings.ecol.libBasicIEventDispatcherMod.IEventDispatcher because Already inherited
  - typings.tstl.containerDequeMod.Deque because Already inherited
  - typings.ecol.libLinearDequeCollectionMod.DequeCollection because Already inherited
  - typings.ecol.ecolMod.DequeCollection because Already inherited
  - typings.samchon.protocolInvokeIProtocolMod.IProtocol because Already inherited
  - typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.protocolServerIServerMod.IServer because Already inherited
  - typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.templatesExternalInterfacesIExternalClientArrayMod.IExternalClientArray because Already inherited
  - typings.samchon.templatesExternalInterfacesIExternalServerClientArrayMod.IExternalServerClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined connect */ @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerClientArray[System /* <: DistributedSystem */] () extends DistributedClientArray[System] {
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
    /**
      * Factory method creating an {@link IDistributedServer} object.
      *
      * @param xml An {@link XML} object represents child element, so that can identify the type of child to create.
      * @return A newly created {@link IDistributedServer} object.
      */
    /* protected */ def createExternalServer(xml: XML): System = js.native
  }
  
}

