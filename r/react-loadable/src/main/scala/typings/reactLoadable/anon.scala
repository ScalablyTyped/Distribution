package typings.reactLoadable

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default[Props] extends StObject {
    
    var default: ComponentType[Props]
  }
  object Default {
    
    inline def apply[Props](default: ComponentType[Props]): Default[Props] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[Props]]
    }
    
    extension [Self <: Default[?], Props](x: Self & Default[Props]) {
      
      inline def setDefault(value: ComponentType[Props]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
