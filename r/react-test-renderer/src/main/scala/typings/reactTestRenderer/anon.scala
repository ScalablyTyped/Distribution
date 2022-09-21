package typings.reactTestRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deep extends StObject {
    
    var deep: Boolean
  }
  object Deep {
    
    inline def apply(deep: Boolean): Deep = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deep]
    }
    
    extension [Self <: Deep](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
