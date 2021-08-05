package typings.reactResolver

import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[P] extends StObject {
    
    var Resolved: StatelessComponent[P]
    
    var data: js.Any
  }
  object Data {
    
    inline def apply[P](Resolved: StatelessComponent[P], data: js.Any): Data[P] = {
      val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[P]]
    }
    
    extension [Self <: Data[?], P](x: Self & Data[P]) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: StatelessComponent[P]): Self = StObject.set(x, "Resolved", value.asInstanceOf[js.Any])
    }
  }
}
