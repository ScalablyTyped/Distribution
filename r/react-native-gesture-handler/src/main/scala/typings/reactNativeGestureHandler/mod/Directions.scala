package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends StObject
@JSImport("react-native-gesture-handler", "Directions")
@js.native
object Directions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Directions with Double] = js.native
  
  @js.native
  sealed trait DOWN extends Directions
  /* 8 */ val DOWN: typings.reactNativeGestureHandler.mod.Directions.DOWN with Double = js.native
  
  @js.native
  sealed trait LEFT extends Directions
  /* 2 */ val LEFT: typings.reactNativeGestureHandler.mod.Directions.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends Directions
  /* 1 */ val RIGHT: typings.reactNativeGestureHandler.mod.Directions.RIGHT with Double = js.native
  
  @js.native
  sealed trait UP extends Directions
  /* 4 */ val UP: typings.reactNativeGestureHandler.mod.Directions.UP with Double = js.native
}
