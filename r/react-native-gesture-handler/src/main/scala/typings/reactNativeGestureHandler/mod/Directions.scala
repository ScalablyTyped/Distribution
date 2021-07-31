package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends StObject
@JSImport("react-native-gesture-handler", "Directions")
@js.native
object Directions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Directions & Double] = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with Directions
  /* 8 */ val DOWN: typings.reactNativeGestureHandler.mod.Directions.DOWN & Double = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with Directions
  /* 2 */ val LEFT: typings.reactNativeGestureHandler.mod.Directions.LEFT & Double = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with Directions
  /* 1 */ val RIGHT: typings.reactNativeGestureHandler.mod.Directions.RIGHT & Double = js.native
  
  @js.native
  sealed trait UP
    extends StObject
       with Directions
  /* 4 */ val UP: typings.reactNativeGestureHandler.mod.Directions.UP & Double = js.native
}
