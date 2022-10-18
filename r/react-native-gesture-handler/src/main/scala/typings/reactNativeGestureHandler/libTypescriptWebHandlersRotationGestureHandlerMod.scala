package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHandlersRotationGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/handlers/RotationGestureHandler", JSImport.Default)
  @js.native
  open class default () extends RotationGestureHandler
  
  @js.native
  trait RotationGestureHandler
    extends typings.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default {
    
    /* private */ var cachedAnchorX: Any = js.native
    
    /* private */ var cachedAnchorY: Any = js.native
    
    def getAnchorX(): Double = js.native
    
    def getAnchorY(): Double = js.native
    
    /* private */ var rotation: Any = js.native
    
    /* private */ var rotationGestureDetector: Any = js.native
    
    /* private */ var rotationGestureListener: Any = js.native
    
    /* protected */ def tryBegin(): Unit = js.native
    
    /* private */ var velocity: Any = js.native
  }
}
