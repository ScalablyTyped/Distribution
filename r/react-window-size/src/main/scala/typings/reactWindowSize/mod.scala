package typings.reactWindowSize

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-window-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](ComposedComponent: ComponentType[T & WindowSizeProps]): ComponentType[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[T]]
  
  trait WindowSizeProps extends StObject {
    
    var windowHeight: Double
    
    var windowWidth: Double
  }
  object WindowSizeProps {
    
    inline def apply(windowHeight: Double, windowWidth: Double): WindowSizeProps = {
      val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowSizeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowSizeProps] (val x: Self) extends AnyVal {
      
      inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    }
  }
}
