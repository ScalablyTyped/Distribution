package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Result extends StObject {
    
    var result: String | Double | Boolean | Null
  }
  object Result {
    
    inline def apply(): Result = {
      val __obj = js.Dynamic.literal(result = null)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setResult(value: String | Double | Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultNull: Self = StObject.set(x, "result", null)
    }
  }
}
