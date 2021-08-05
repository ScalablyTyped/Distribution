package typings.relayRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  val count: String
  
  val cursor: String
}
object Count {
  
  inline def apply(count: String, cursor: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
  }
}
