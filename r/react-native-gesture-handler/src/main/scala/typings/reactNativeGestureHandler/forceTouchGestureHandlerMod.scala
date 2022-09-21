package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.anon.ForceTouchAvailable
import typings.reactNativeGestureHandler.anon.TypeofForceTouchFallback
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.feedbackOnActivation
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxForce
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minForce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forceTouchGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/ForceTouchGestureHandler", "ForceTouchGestureHandler")
  @js.native
  val ForceTouchGestureHandler: (TypeofForceTouchFallback & Instantiable0[ForceTouchFallback]) | (ComponentType[ForceTouchGestureHandlerProps_ & RefAttributes[Any]]) = js.native
  type ForceTouchGestureHandler = ((/* import warning: importer.ImportType#apply Failed type conversion: typeof ForceTouchFallback */ js.Any) & ForceTouchAvailable) | ((ComponentType[ForceTouchGestureHandlerProps_ & RefAttributes[Any]]) & ForceTouchAvailable)
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/ForceTouchGestureHandler", "forceTouchGestureHandlerProps")
  @js.native
  val forceTouchGestureHandlerProps: js.Tuple3[minForce, maxForce, feedbackOnActivation] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/ForceTouchGestureHandler", "forceTouchHandlerName")
  @js.native
  val forceTouchHandlerName: /* "ForceTouchGestureHandler" */ String = js.native
  
  @js.native
  trait ForceTouchFallback
    extends Component[PropsWithChildren[Any], js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MForceTouchFallback(): Unit = js.native
  }
  
  trait ForceTouchGestureConfig extends StObject {
    
    /**
      * Boolean value defining if haptic feedback has to be performed on
      * activation.
      */
    var feedbackOnActivation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A maximal pressure that could be applied for handler. If the pressure is
      * greater, handler fails. Should be a value from range `[0.0, 1.0]`.
      */
    var maxForce: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * A minimal pressure that is required before handler can activate. Should be a
      * value from range `[0.0, 1.0]`. Default is `0.2`.
      */
    var minForce: js.UndefOr[Double] = js.undefined
  }
  object ForceTouchGestureConfig {
    
    inline def apply(): ForceTouchGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceTouchGestureConfig]
    }
    
    extension [Self <: ForceTouchGestureConfig](x: Self) {
      
      inline def setFeedbackOnActivation(value: Boolean): Self = StObject.set(x, "feedbackOnActivation", value.asInstanceOf[js.Any])
      
      inline def setFeedbackOnActivationUndefined: Self = StObject.set(x, "feedbackOnActivation", js.undefined)
      
      inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
      
      inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
      
      inline def setMinForce(value: Double): Self = StObject.set(x, "minForce", value.asInstanceOf[js.Any])
      
      inline def setMinForceUndefined: Self = StObject.set(x, "minForce", js.undefined)
    }
  }
  
  trait ForceTouchGestureHandlerEventPayload extends StObject {
    
    var absoluteX: Double
    
    var absoluteY: Double
    
    /**
      * The pressure of a touch.
      */
    var force: Double
    
    var x: Double
    
    var y: Double
  }
  object ForceTouchGestureHandlerEventPayload {
    
    inline def apply(absoluteX: Double, absoluteY: Double, force: Double, x: Double, y: Double): ForceTouchGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceTouchGestureHandlerEventPayload]
    }
    
    extension [Self <: ForceTouchGestureHandlerEventPayload](x: Self) {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceTouchGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[ForceTouchGestureHandlerEventPayload]
       with ForceTouchGestureConfig
  object ForceTouchGestureHandlerProps_ {
    
    inline def apply(): ForceTouchGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceTouchGestureHandlerProps_]
    }
  }
}
