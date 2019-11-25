package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
  * - E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
  * - G for NX_DIM_CELL_GENERATED. Applies to generated nodes that are inserted into the returned tree when there is no actual value (qAllValues in NxPageTreeNode set to true).
  * - N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
  * - T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total.
  * - P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
  * - R for NX_DIM_CELL_ROOT. Applies to root node.
  * - U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.V
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.E
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.G
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.N
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.T
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.P
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.R
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.U
*/
trait NxTreeNodeType extends js.Object

object NxTreeNodeType {
  @scala.inline
  def E: typings.qlikDashEngineapi.qlikDashEngineapiStrings.E = this.cast("E")
  @scala.inline
  def G: typings.qlikDashEngineapi.qlikDashEngineapiStrings.G = this.cast("G")
  @scala.inline
  def N: typings.qlikDashEngineapi.qlikDashEngineapiStrings.N = this.cast("N")
  @scala.inline
  def P: typings.qlikDashEngineapi.qlikDashEngineapiStrings.P = this.cast("P")
  @scala.inline
  def R: typings.qlikDashEngineapi.qlikDashEngineapiStrings.R = this.cast("R")
  @scala.inline
  def T: typings.qlikDashEngineapi.qlikDashEngineapiStrings.T = this.cast("T")
  @scala.inline
  def U: typings.qlikDashEngineapi.qlikDashEngineapiStrings.U = this.cast("U")
  @scala.inline
  def V: typings.qlikDashEngineapi.qlikDashEngineapiStrings.V = this.cast("V")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

