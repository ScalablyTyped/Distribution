package typings.samchon.templatesDistributedDerivedDistributedServerClientArrayMod

import typings.samchon.templatesDistributedDerivedDistributedClientArrayMod.DistributedClientArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesExternalInterfacesIExternalServerClientArrayMod.IExternalServerClientArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServerClientArray", "DistributedServerClientArray")
@js.native
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

