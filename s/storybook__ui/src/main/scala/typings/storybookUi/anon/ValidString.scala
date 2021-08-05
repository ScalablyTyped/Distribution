package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidString extends StObject {
  
  var valid: String
}
object ValidString {
  
  inline def apply(valid: String): ValidString = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidString]
  }
  
  extension [Self <: ValidString](x: Self) {
    
    inline def setValid(value: String): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
