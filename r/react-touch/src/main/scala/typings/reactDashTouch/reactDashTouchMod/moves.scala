package typings.reactDashTouch.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait moves extends js.Object

@JSImport("react-touch", "moves")
@js.native
object moves extends js.Object {
  @js.native
  sealed trait DOWN extends moves
  
  @js.native
  sealed trait DOWNLEFT extends moves
  
  @js.native
  sealed trait DOWNRIGHT extends moves
  
  @js.native
  sealed trait LEFT extends moves
  
  @js.native
  sealed trait RIGHT extends moves
  
  @js.native
  sealed trait UP extends moves
  
  @js.native
  sealed trait UPLEFT extends moves
  
  @js.native
  sealed trait UPRIGHT extends moves
  
  /* 6 */ val DOWN: typings.reactDashTouch.reactDashTouchMod.moves.DOWN with Double = js.native
  /* 7 */ val DOWNLEFT: typings.reactDashTouch.reactDashTouchMod.moves.DOWNLEFT with Double = js.native
  /* 5 */ val DOWNRIGHT: typings.reactDashTouch.reactDashTouchMod.moves.DOWNRIGHT with Double = js.native
  /* 3 */ val LEFT: typings.reactDashTouch.reactDashTouchMod.moves.LEFT with Double = js.native
  /* 4 */ val RIGHT: typings.reactDashTouch.reactDashTouchMod.moves.RIGHT with Double = js.native
  /* 1 */ val UP: typings.reactDashTouch.reactDashTouchMod.moves.UP with Double = js.native
  /* 0 */ val UPLEFT: typings.reactDashTouch.reactDashTouchMod.moves.UPLEFT with Double = js.native
  /* 2 */ val UPRIGHT: typings.reactDashTouch.reactDashTouchMod.moves.UPRIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves with Double] = js.native
}

