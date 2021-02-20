package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait moves extends StObject
@JSImport("react-touch", "moves")
@js.native
object moves extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves with Double] = js.native
  
  @js.native
  sealed trait DOWN extends moves
  /* 6 */ val DOWN: typings.reactTouch.mod.moves.DOWN with Double = js.native
  
  @js.native
  sealed trait DOWNLEFT extends moves
  /* 7 */ val DOWNLEFT: typings.reactTouch.mod.moves.DOWNLEFT with Double = js.native
  
  @js.native
  sealed trait DOWNRIGHT extends moves
  /* 5 */ val DOWNRIGHT: typings.reactTouch.mod.moves.DOWNRIGHT with Double = js.native
  
  @js.native
  sealed trait LEFT extends moves
  /* 3 */ val LEFT: typings.reactTouch.mod.moves.LEFT with Double = js.native
  
  @js.native
  sealed trait RIGHT extends moves
  /* 4 */ val RIGHT: typings.reactTouch.mod.moves.RIGHT with Double = js.native
  
  @js.native
  sealed trait UP extends moves
  /* 1 */ val UP: typings.reactTouch.mod.moves.UP with Double = js.native
  
  @js.native
  sealed trait UPLEFT extends moves
  /* 0 */ val UPLEFT: typings.reactTouch.mod.moves.UPLEFT with Double = js.native
  
  @js.native
  sealed trait UPRIGHT extends moves
  /* 2 */ val UPRIGHT: typings.reactTouch.mod.moves.UPRIGHT with Double = js.native
}
