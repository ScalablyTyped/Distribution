package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait TableRect
  extends StObject
     with Rect {
  
  var map: TableMap
  
  var table: Node
  
  var tableStart: Double
}
object TableRect {
  
  inline def apply(
    bottom: Double,
    left: Double,
    map: TableMap,
    right: Double,
    table: Node,
    tableStart: Double,
    top: Double
  ): TableRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableStart = tableStart.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRect] (val x: Self) extends AnyVal {
    
    inline def setMap(value: TableMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setTable(value: Node): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableStart(value: Double): Self = StObject.set(x, "tableStart", value.asInstanceOf[js.Any])
  }
}
