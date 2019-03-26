package typings
package qlikDashEngineapiLib.EngineAPINs

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
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.V
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.E
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.G
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.T
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.P
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.R
  - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.U
*/
trait NxTreeNodeType extends js.Object

