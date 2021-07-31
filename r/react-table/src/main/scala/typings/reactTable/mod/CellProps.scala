package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellProps[D /* <: js.Object */, V]
  extends StObject
     with TableInstance[D] {
  
  var cell: Cell[D, V] = js.native
  
  var column: ColumnInstance[D] = js.native
  
  var row: Row[D] = js.native
  
  var value: CellValue[V] = js.native
}
