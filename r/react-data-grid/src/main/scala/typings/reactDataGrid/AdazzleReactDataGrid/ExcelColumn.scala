package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelColumn extends StObject {
  
  var editable: Boolean
  
  var filterable: Boolean
  
  var key: String
  
  var name: Any
  
  var resizeable: Boolean
  
  var width: Double
}
object ExcelColumn {
  
  inline def apply(editable: Boolean, filterable: Boolean, key: String, name: Any, resizeable: Boolean, width: Double): ExcelColumn = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizeable = resizeable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelColumn]
  }
  
  extension [Self <: ExcelColumn](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
