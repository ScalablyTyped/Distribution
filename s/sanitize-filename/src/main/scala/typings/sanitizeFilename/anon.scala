package typings.sanitizeFilename

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Replacement extends StObject {
    
    var replacement: js.UndefOr[String | (js.Function1[/* substring */ String, String])] = js.undefined
  }
  object Replacement {
    
    inline def apply(): Replacement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replacement]
    }
    
    extension [Self <: Replacement](x: Self) {
      
      inline def setReplacement(value: String | (js.Function1[/* substring */ String, String])): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setReplacementFunction1(value: /* substring */ String => String): Self = StObject.set(x, "replacement", js.Any.fromFunction1(value))
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
}
