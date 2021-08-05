package typings.reactRedux

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait WrappedComponent[C /* <: ComponentType[js.Any] */] extends StObject {
    
    var WrappedComponent: C
  }
  object WrappedComponent {
    
    inline def apply[C /* <: ComponentType[js.Any] */](WrappedComponent: C): WrappedComponent[C] = {
      val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedComponent[C]]
    }
    
    extension [Self <: WrappedComponent[?], C /* <: ComponentType[js.Any] */](x: Self & WrappedComponent[C]) {
      
      inline def setWrappedComponent(value: C): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
    }
  }
}
