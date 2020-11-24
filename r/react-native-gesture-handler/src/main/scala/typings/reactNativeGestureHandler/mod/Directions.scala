package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends js.Object
@JSImport("react-native-gesture-handler", "Directions")
@js.native
object Directions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Directions with Double] = js.native
  
  @js.native
  sealed trait DOWN extends Directions
  /* 8 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  @js.native
  sealed trait LEFT extends Directions
  /* 2 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait RIGHT extends Directions
  /* 1 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  @js.native
  sealed trait UP extends Directions
  /* 4 */ @js.native
  object UP extends TopLevel[UP with Double]
}
