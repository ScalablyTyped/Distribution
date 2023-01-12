package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the row toggler
  */
trait OnRowExpandToggle extends StObject {
  
  /**
    * The name of the column group the row is in
    */
  var columnGroupName: String
  
  /**
    * The name of the expanded row
    */
  var name: String
  
  /**
    * If it should expand or not
    */
  var shouldExpand: Boolean
}
object OnRowExpandToggle {
  
  inline def apply(columnGroupName: String, name: String, shouldExpand: Boolean): OnRowExpandToggle = {
    val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowExpandToggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnRowExpandToggle] (val x: Self) extends AnyVal {
    
    inline def setColumnGroupName(value: String): Self = StObject.set(x, "columnGroupName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShouldExpand(value: Boolean): Self = StObject.set(x, "shouldExpand", value.asInstanceOf[js.Any])
  }
}
