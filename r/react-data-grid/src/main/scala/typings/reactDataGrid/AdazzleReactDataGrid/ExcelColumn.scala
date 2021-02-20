package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelColumn extends StObject {
  
  var editable: Boolean = js.native
  
  var filterable: Boolean = js.native
  
  var key: String = js.native
  
  var name: js.Any = js.native
  
  var resizeable: Boolean = js.native
  
  var width: Double = js.native
}
object ExcelColumn {
  
  @scala.inline
  def apply(
    editable: Boolean,
    filterable: Boolean,
    key: String,
    name: js.Any,
    resizeable: Boolean,
    width: Double
  ): ExcelColumn = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizeable = resizeable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelColumn]
  }
  
  @scala.inline
  implicit class ExcelColumnMutableBuilder[Self <: ExcelColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeable(value: Boolean): Self = StObject.set(x, "resizeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
