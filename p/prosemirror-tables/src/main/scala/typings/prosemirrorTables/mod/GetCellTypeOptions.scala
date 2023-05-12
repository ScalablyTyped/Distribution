package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait GetCellTypeOptions extends StObject {
  
  var col: Double
  
  var node: Node
  
  var row: Double
}
object GetCellTypeOptions {
  
  inline def apply(col: Double, node: Node, row: Double): GetCellTypeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCellTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCellTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
