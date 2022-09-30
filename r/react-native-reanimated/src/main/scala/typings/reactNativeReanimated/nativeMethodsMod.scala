package typings.reactNativeReanimated

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMethodsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeMethods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTag(): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[Null | Double]
  inline def getTag(view: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: Component[Any, Any, Any]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: ComponentClass[Any, ComponentState]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  
  inline def measure(
    animatedRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObjectFunction<Component> */ Any
  ): MeasuredDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(animatedRef.asInstanceOf[js.Any]).asInstanceOf[MeasuredDimensions]
  
  inline def scrollTo(
    animatedRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObjectFunction<Component> */ Any,
    x: Double,
    y: Double,
    animated: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(animatedRef.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setGestureState(handlerTag: Double, newState: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MeasuredDimensions extends StObject {
    
    var height: Double
    
    var pageX: Double
    
    var pageY: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object MeasuredDimensions {
    
    inline def apply(height: Double, pageX: Double, pageY: Double, width: Double, x: Double, y: Double): MeasuredDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasuredDimensions]
    }
    
    extension [Self <: MeasuredDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
