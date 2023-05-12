package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait CellAttrs extends StObject {
  
  var colspan: Double
  
  var colwidth: js.Array[Double] | Null
  
  var rowspan: Double
}
object CellAttrs {
  
  inline def apply(colspan: Double, rowspan: Double): CellAttrs = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], colwidth = null)
    __obj.asInstanceOf[CellAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellAttrs] (val x: Self) extends AnyVal {
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColwidth(value: js.Array[Double]): Self = StObject.set(x, "colwidth", value.asInstanceOf[js.Any])
    
    inline def setColwidthNull: Self = StObject.set(x, "colwidth", null)
    
    inline def setColwidthVarargs(value: Double*): Self = StObject.set(x, "colwidth", js.Array(value*))
    
    inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
  }
}
