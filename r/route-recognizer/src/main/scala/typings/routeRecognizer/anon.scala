package typings.routeRecognizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As extends StObject {
    
    var as: String
  }
  object As {
    
    inline def apply(as: String): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[As]
    }
    
    extension [Self <: As](x: Self) {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    }
  }
}
