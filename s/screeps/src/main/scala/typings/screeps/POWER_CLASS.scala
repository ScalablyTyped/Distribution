package typings.screeps

import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POWER_CLASS extends StObject {
  
  var OPERATOR: operator
}
object POWER_CLASS {
  
  inline def apply(): POWER_CLASS = {
    val __obj = js.Dynamic.literal(OPERATOR = "operator")
    __obj.asInstanceOf[POWER_CLASS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POWER_CLASS] (val x: Self) extends AnyVal {
    
    inline def setOPERATOR(value: operator): Self = StObject.set(x, "OPERATOR", value.asInstanceOf[js.Any])
  }
}
