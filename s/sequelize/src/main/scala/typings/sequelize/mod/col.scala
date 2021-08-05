package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait col extends StObject {
  
  var col: String
}
object col {
  
  inline def apply(col: String): col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[col]
  }
  
  extension [Self <: col](x: Self) {
    
    inline def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
  }
}
