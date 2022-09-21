package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandResponse extends StObject {
  
  var id: Double
  
  var result: js.Object
}
object CommandResponse {
  
  inline def apply(id: Double, result: js.Object): CommandResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandResponse]
  }
  
  extension [Self <: CommandResponse](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
