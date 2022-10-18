package typings.reactNativeGestureHandler

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureCompositionMod.ComposedGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.HandlerCallbacks
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesReanimatedWrapperMod.SharedValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureDetectorMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/GestureDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GestureDetector(props: GestureDetectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureDetector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait GestureConfigReference extends StObject {
    
    var animatedEventHandler: Any
    
    var animatedHandlers: (SharedValue[(js.Array[HandlerCallbacks[Record[String, Any]]]) | Null]) | Null
    
    var config: js.Array[GestureType]
    
    var firstExecution: Boolean
    
    var useReanimatedHook: Boolean
  }
  object GestureConfigReference {
    
    inline def apply(
      animatedEventHandler: Any,
      config: js.Array[GestureType],
      firstExecution: Boolean,
      useReanimatedHook: Boolean
    ): GestureConfigReference = {
      val __obj = js.Dynamic.literal(animatedEventHandler = animatedEventHandler.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], firstExecution = firstExecution.asInstanceOf[js.Any], useReanimatedHook = useReanimatedHook.asInstanceOf[js.Any], animatedHandlers = null)
      __obj.asInstanceOf[GestureConfigReference]
    }
    
    extension [Self <: GestureConfigReference](x: Self) {
      
      inline def setAnimatedEventHandler(value: Any): Self = StObject.set(x, "animatedEventHandler", value.asInstanceOf[js.Any])
      
      inline def setAnimatedHandlers(value: SharedValue[(js.Array[HandlerCallbacks[Record[String, Any]]]) | Null]): Self = StObject.set(x, "animatedHandlers", value.asInstanceOf[js.Any])
      
      inline def setAnimatedHandlersNull: Self = StObject.set(x, "animatedHandlers", null)
      
      inline def setConfig(value: js.Array[GestureType]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: GestureType*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setFirstExecution(value: Boolean): Self = StObject.set(x, "firstExecution", value.asInstanceOf[js.Any])
      
      inline def setUseReanimatedHook(value: Boolean): Self = StObject.set(x, "useReanimatedHook", value.asInstanceOf[js.Any])
    }
  }
  
  trait GestureDetectorProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var gesture: js.UndefOr[ComposedGesture | GestureType] = js.undefined
  }
  object GestureDetectorProps {
    
    inline def apply(): GestureDetectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureDetectorProps]
    }
    
    extension [Self <: GestureDetectorProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGesture(value: ComposedGesture | GestureType): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
    }
  }
}
