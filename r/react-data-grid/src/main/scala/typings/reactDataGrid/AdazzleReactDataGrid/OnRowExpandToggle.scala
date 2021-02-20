package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the row toggler
  */
@js.native
trait OnRowExpandToggle extends StObject {
  
  /**
    * The name of the column group the row is in
    */
  var columnGroupName: String = js.native
  
  /**
    * The name of the expanded row
    */
  var name: String = js.native
  
  /**
    * If it should expand or not
    */
  var shouldExpand: Boolean = js.native
}
object OnRowExpandToggle {
  
  @scala.inline
  def apply(columnGroupName: String, name: String, shouldExpand: Boolean): OnRowExpandToggle = {
    val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowExpandToggle]
  }
  
  @scala.inline
  implicit class OnRowExpandToggleMutableBuilder[Self <: OnRowExpandToggle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGroupName(value: String): Self = StObject.set(x, "columnGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldExpand(value: Boolean): Self = StObject.set(x, "shouldExpand", value.asInstanceOf[js.Any])
  }
}
