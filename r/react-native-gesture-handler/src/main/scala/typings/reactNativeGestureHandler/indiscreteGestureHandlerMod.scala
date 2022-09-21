package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.MaxPointers
import typings.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indiscreteGestureHandlerMod {
  
  /**
    * The base class for **Rotation** and **Pinch** gesture handlers.
    */
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/IndiscreteGestureHandler", JSImport.Default)
  @js.native
  abstract class default () extends IndiscreteGestureHandler
  
  /**
    * The base class for **Rotation** and **Pinch** gesture handlers.
    */
  @js.native
  trait IndiscreteGestureHandler
    extends typings.reactNativeGestureHandler.webHammerGestureHandlerMod.default {
    
    def updateGestureConfig(hasMinPointersMaxPointersProps: MaxPointers): PartialenabledbooleanminP = js.native
  }
}
