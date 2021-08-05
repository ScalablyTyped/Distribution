package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateResults extends StObject {
  
  var msg: String
  
  var valid: Boolean
}
object ValidateResults {
  
  inline def apply(msg: String, valid: Boolean): ValidateResults = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResults]
  }
  
  extension [Self <: ValidateResults](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
