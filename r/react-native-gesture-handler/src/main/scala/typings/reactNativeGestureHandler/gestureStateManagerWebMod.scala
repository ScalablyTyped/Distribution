package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.gestureStateManagerMod.GestureStateManagerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureStateManagerWebMod {
  
  object GestureStateManager {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureStateManager.web", "GestureStateManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(handlerTag: Double): GestureStateManagerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[GestureStateManagerType]
  }
}
