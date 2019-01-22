package typings
package samchonLib.templatesParallelDerivedParallelServerArrayMediatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.templatesExternalInterfacesIExternalServerArrayMod.IExternalServerArray because var conflicts: _Compute_col_size, _Fetch_index, _Handle_system_erase, _Insert_to_end, _Insert_to_middle, _Notify_erase, _Notify_insert, _Try_add_row_at_back, _Try_add_row_at_front, _Try_expand_capacity, `capacity_`, `dispatcher_`, iterator, iterator_IContainer, `matrix_`, `size_`. Inlined connect */ @JSImport("samchon/templates/parallel/derived/ParallelServerArrayMediator", "ParallelServerArrayMediator")
@js.native
/**
  * Default Constructor.
  */
abstract class ParallelServerArrayMediator[System /* <: samchonLib.templatesParallelInterfacesIParallelServerMod.IParallelServer */] ()
  extends samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[System] {
  /**
    * @inheritdoc
    */
  /**
    * Connect to {@link IExternalServer external servers}.
    *
    * This method calls children elements' method {@link IExternalServer.connect} gradually.
    */
  def connect(): scala.Unit = js.native
}

