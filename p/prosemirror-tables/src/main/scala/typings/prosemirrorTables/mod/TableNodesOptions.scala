package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait TableNodesOptions extends StObject {
  
  /**
    * Additional attributes to add to cells. Maps attribute names to
    * objects with the following properties:
    */
  var cellAttributes: StringDictionary[CellAttributes]
  
  /**
    * The content expression for table cells.
    */
  var cellContent: String
  
  /**
    * A group name (something like `"block"`) to add to the table
    * node type.
    */
  var tableGroup: js.UndefOr[String] = js.undefined
}
object TableNodesOptions {
  
  inline def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String): TableNodesOptions = {
    val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableNodesOptions] (val x: Self) extends AnyVal {
    
    inline def setCellAttributes(value: StringDictionary[CellAttributes]): Self = StObject.set(x, "cellAttributes", value.asInstanceOf[js.Any])
    
    inline def setCellContent(value: String): Self = StObject.set(x, "cellContent", value.asInstanceOf[js.Any])
    
    inline def setTableGroup(value: String): Self = StObject.set(x, "tableGroup", value.asInstanceOf[js.Any])
    
    inline def setTableGroupUndefined: Self = StObject.set(x, "tableGroup", js.undefined)
  }
}
