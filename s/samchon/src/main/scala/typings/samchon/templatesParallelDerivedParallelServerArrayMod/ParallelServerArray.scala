package typings.samchon.templatesParallelDerivedParallelServerArrayMod

import typings.samchon.templatesParallelInterfacesIParallelServerMod.IParallelServer
import typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.samchon.templatesExternalInterfacesIExternalServerArrayMod.IExternalServerArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Swap, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, capacity_, dispatcher_, iterator, iterator_IContainer, matrix_, size_. Inlined connect */ @JSImport("samchon/templates/parallel/derived/ParallelServerArray", "ParallelServerArray")
@js.native
/**
  * Default Constructor.
  */
abstract class ParallelServerArray[System /* <: IParallelServer */] () extends ParallelSystemArray[System] {
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

