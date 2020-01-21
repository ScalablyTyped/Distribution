package typings.samchon

import typings.samchon.distributedClientArrayMod.DistributedClientArray
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedServerClientArray", JSImport.Namespace)
@js.native
object distributedServerClientArrayMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.ipushbackMod.IPushBack because Already inherited
  - typings.tstl.containerContainerMod.Container because Already inherited
  - typings.tstl.ifrontMod.IFront because Already inherited
  - typings.tstl.arrayContainerMod.ArrayContainer because Already inherited
  - typings.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typings.tstl.dequeMod.Deque because Already inherited
  - typings.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.iserverMod.IServer because Already inherited
  - typings.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.iexternalserverclientarrayMod.IExternalServerClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Reserve, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer_, matrix_, size_. Inlined connect */ @js.native
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

