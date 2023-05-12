package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait Area extends StObject {
  
  var height: Double
  
  var rows: js.Array[Fragment]
  
  var width: Double
}
object Area {
  
  inline def apply(height: Double, rows: js.Array[Fragment], width: Double): Area = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Area] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Fragment]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Fragment*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
