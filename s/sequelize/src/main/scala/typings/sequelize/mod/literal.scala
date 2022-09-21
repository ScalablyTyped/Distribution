package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait literal extends StObject {
  
  var `val`: Any
}
object literal {
  
  inline def apply(`val`: Any): literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[literal]
  }
  
  extension [Self <: literal](x: Self) {
    
    inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
