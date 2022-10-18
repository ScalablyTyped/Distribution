package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.RefObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2UtilsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRelativeCoords(
    parentRef: RefObjectFunction[Component[js.Object, js.Object, Any]],
    absoluteX: Double,
    absoluteY: Double
  ): ComponentCoords | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeCoords")(parentRef.asInstanceOf[js.Any], absoluteX.asInstanceOf[js.Any], absoluteY.asInstanceOf[js.Any])).asInstanceOf[ComponentCoords | Null]
  
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
