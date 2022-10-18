package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.direction
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.numberOfPointers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersFlingGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/FlingGestureHandler", "FlingGestureHandler")
  @js.native
  val FlingGestureHandler: ComponentType[FlingGestureHandlerProps_ & RefAttributes[Any]] = js.native
  type FlingGestureHandler = ComponentType[FlingGestureHandlerProps_ & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/FlingGestureHandler", "flingGestureHandlerProps")
  @js.native
  val flingGestureHandlerProps: js.Tuple2[numberOfPointers, direction] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/FlingGestureHandler", "flingHandlerName")
  @js.native
  val flingHandlerName: /* "FlingGestureHandler" */ String = js.native
  
  trait FlingGestureConfig extends StObject {
    
    /**
      * Expressed allowed direction of movement. It's possible to pass one or many
      * directions in one parameter:
      *
      * ```js
      * direction={Directions.RIGHT | Directions.LEFT}
      * ```
      *
      * or
      *
      * ```js
      * direction={Directions.DOWN}
      * ```
      */
    var direction: js.UndefOr[Double] = js.undefined
    
    /**
      * Determine exact number of points required to handle the fling gesture.
      */
    var numberOfPointers: js.UndefOr[Double] = js.undefined
  }
  object FlingGestureConfig {
    
    inline def apply(): FlingGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlingGestureConfig]
    }
    
    extension [Self <: FlingGestureConfig](x: Self) {
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
      
      inline def setNumberOfPointersUndefined: Self = StObject.set(x, "numberOfPointers", js.undefined)
    }
  }
  
  trait FlingGestureHandlerEventPayload extends StObject {
    
    var absoluteX: Double
    
    var absoluteY: Double
    
    var x: Double
    
    var y: Double
  }
  object FlingGestureHandlerEventPayload {
    
    inline def apply(absoluteX: Double, absoluteY: Double, x: Double, y: Double): FlingGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlingGestureHandlerEventPayload]
    }
    
    extension [Self <: FlingGestureHandlerEventPayload](x: Self) {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlingGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[FlingGestureHandlerEventPayload]
       with FlingGestureConfig
  object FlingGestureHandlerProps_ {
    
    inline def apply(): FlingGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlingGestureHandlerProps_]
    }
  }
}
