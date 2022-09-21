package typings.reactResolver

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[P] extends StObject {
    
    var Resolved: FunctionComponent[P]
    
    var data: Any
  }
  object Data {
    
    inline def apply[P](Resolved: FunctionComponent[P], data: Any): Data[P] = {
      val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[P]]
    }
    
    extension [Self <: Data[?], P](x: Self & Data[P]) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: FunctionComponent[P]): Self = StObject.set(x, "Resolved", value.asInstanceOf[js.Any])
    }
  }
}
