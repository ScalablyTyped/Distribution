package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseColumns extends StObject {
  
  var useColumns: Boolean
  
  var useLines: Boolean
}
object UseColumns {
  
  inline def apply(useColumns: Boolean, useLines: Boolean): UseColumns = {
    val __obj = js.Dynamic.literal(useColumns = useColumns.asInstanceOf[js.Any], useLines = useLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseColumns]
  }
  
  extension [Self <: UseColumns](x: Self) {
    
    inline def setUseColumns(value: Boolean): Self = StObject.set(x, "useColumns", value.asInstanceOf[js.Any])
    
    inline def setUseLines(value: Boolean): Self = StObject.set(x, "useLines", value.asInstanceOf[js.Any])
  }
}
