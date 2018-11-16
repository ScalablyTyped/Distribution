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
  
  val DOWN: DOWN with java.lang.String = js.native
  val DOWNLEFT: DOWNLEFT with java.lang.String = js.native
  val DOWNRIGHT: DOWNRIGHT with java.lang.String = js.native
  val LEFT: LEFT with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  val UP: UP with java.lang.String = js.native
  val UPLEFT: UPLEFT with java.lang.String = js.native
  val UPRIGHT: UPRIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[reactDashTouchLib.reactDashTouchMod.moves with java.lang.String] = js.native
}

