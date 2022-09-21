package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHammerFlingGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/FlingGestureHandler", JSImport.Default)
  @js.native
  open class default () extends FlingGestureHandler
  
  @js.native
  trait FlingGestureHandler
    extends typings.reactNativeGestureHandler.draggingGestureHandlerMod.default {
    
    def getDirection(): Double = js.native
    
    def getTargetDirections(direction: Double): js.Array[Double] = js.native
    
    def updateGestureConfig(hasNumberOfPointersDirectionProps: Any): PartialenabledbooleanminP = js.native
  }
}
