package typings.reactTouch.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait moves extends js.Object
@JSImport("react-touch", "moves")
@js.native
object moves extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[moves with Double] = js.native
  
  @js.native
  sealed trait DOWN extends moves
  /* 6 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  @js.native
  sealed trait DOWNLEFT extends moves
  /* 7 */ @js.native
  object DOWNLEFT extends TopLevel[DOWNLEFT with Double]
  
  @js.native
  sealed trait DOWNRIGHT extends moves
  /* 5 */ @js.native
  object DOWNRIGHT extends TopLevel[DOWNRIGHT with Double]
  
  @js.native
  sealed trait LEFT extends moves
  /* 3 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait RIGHT extends moves
  /* 4 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
  @js.native
  sealed trait UP extends moves
  /* 1 */ @js.native
  object UP extends TopLevel[UP with Double]
  
  @js.native
  sealed trait UPLEFT extends moves
  /* 0 */ @js.native
  object UPLEFT extends TopLevel[UPLEFT with Double]
  
  @js.native
  sealed trait UPRIGHT extends moves
  /* 2 */ @js.native
  object UPRIGHT extends TopLevel[UPRIGHT with Double]
}
