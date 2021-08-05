package typings.storybookUi.anon

import typings.storybookUi.shortcutsMod.ValidationStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valid extends StObject {
  
  var valid: ValidationStates
}
object Valid {
  
  inline def apply(valid: ValidationStates): Valid = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
  
  extension [Self <: Valid](x: Self) {
    
    inline def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
