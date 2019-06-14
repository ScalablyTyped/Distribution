package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait moves extends js.Object

@JSImport("react-touch", "moves")
@js.native
object moves extends js.Object {
  @js.native
  sealed trait DOWN
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait DOWNLEFT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait DOWNRIGHT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait LEFT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait RIGHT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait UP
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait UPLEFT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  @js.native
  sealed trait UPRIGHT
    extends reactDashTouchLib.reactDashTouchMod.moves
  
  /* 6 */ val DOWN: DOWN with scala.Double = js.native
  /* 7 */ val DOWNLEFT: DOWNLEFT with scala.Double = js.native
  /* 5 */ val DOWNRIGHT: DOWNRIGHT with scala.Double = js.native
  /* 3 */ val LEFT: LEFT with scala.Double = js.native
  /* 4 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 1 */ val UP: UP with scala.Double = js.native
  /* 0 */ val UPLEFT: UPLEFT with scala.Double = js.native
  /* 2 */ val UPRIGHT: UPRIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[reactDashTouchLib.reactDashTouchMod.moves with scala.Double] = js.native
}

