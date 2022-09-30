package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.reactNativeReanimated.hookCommonTypesMod.RefObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reanimated2UtilsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRelativeCoords(parentRef: RefObjectFunction[Component[js.Object, js.Object, Any]], x: Double, y: Double): ComponentCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeCoords")(parentRef.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[ComponentCoords]
  
  trait ComponentCoords extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ComponentCoords {
    
    inline def apply(x: Double, y: Double): ComponentCoords = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentCoords]
    }
    
    extension [Self <: ComponentCoords](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
