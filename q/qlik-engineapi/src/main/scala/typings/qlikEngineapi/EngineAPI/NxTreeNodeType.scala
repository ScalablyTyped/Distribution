package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  - typings.qlikEngineapi.qlikEngineapiStrings.V
  - typings.qlikEngineapi.qlikEngineapiStrings.E
  - typings.qlikEngineapi.qlikEngineapiStrings.G
  - typings.qlikEngineapi.qlikEngineapiStrings.N
  - typings.qlikEngineapi.qlikEngineapiStrings.T
  - typings.qlikEngineapi.qlikEngineapiStrings.P
  - typings.qlikEngineapi.qlikEngineapiStrings.R
  - typings.qlikEngineapi.qlikEngineapiStrings.U
*/
trait NxTreeNodeType extends StObject
object NxTreeNodeType {
  
  inline def E: typings.qlikEngineapi.qlikEngineapiStrings.E = "E".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.E]
  
  inline def G: typings.qlikEngineapi.qlikEngineapiStrings.G = "G".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.G]
  
  inline def N: typings.qlikEngineapi.qlikEngineapiStrings.N = "N".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.N]
  
  inline def P: typings.qlikEngineapi.qlikEngineapiStrings.P = "P".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.P]
  
  inline def R: typings.qlikEngineapi.qlikEngineapiStrings.R = "R".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.R]
  
  inline def T: typings.qlikEngineapi.qlikEngineapiStrings.T = "T".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.T]
  
  inline def U: typings.qlikEngineapi.qlikEngineapiStrings.U = "U".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.U]
  
  inline def V: typings.qlikEngineapi.qlikEngineapiStrings.V = "V".asInstanceOf[typings.qlikEngineapi.qlikEngineapiStrings.V]
}
