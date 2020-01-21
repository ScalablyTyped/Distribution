package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Directions extends js.Object

@JSImport("react-native-gesture-handler", "Directions")
@js.native
object Directions extends js.Object {
  @js.native
  sealed trait DOWN extends Directions
  
  @js.native
  sealed trait LEFT extends Directions
  
  @js.native
  sealed trait RIGHT extends Directions
  
  @js.native
  sealed trait UP extends Directions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Directions with Double] = js.native
  /* 8 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  /* 2 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 1 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  /* 4 */ @js.native
  object UP extends TopLevel[UP with Double]
  
}

