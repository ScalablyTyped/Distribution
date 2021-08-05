package typings.sqlBricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Placeholder extends StObject {
    
    var placeholder: String
  }
  object Placeholder {
    
    inline def apply(placeholder: String): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    extension [Self <: Placeholder](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
