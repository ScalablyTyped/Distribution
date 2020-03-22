package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Universe extends js.Object

// Universe constants
@JSImport("steamid", "Universe")
@js.native
object Universe extends js.Object {
  @js.native
  sealed trait BETA extends Universe
  
  @js.native
  sealed trait DEV extends Universe
  
  @js.native
  sealed trait INTERNAL extends Universe
  
  @js.native
  sealed trait INVALID extends Universe
  
  @js.native
  sealed trait PUBLIC extends Universe
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Universe with Double] = js.native
  /* 2 */ @js.native
  object BETA extends TopLevel[BETA with Double]
  
  /* 4 */ @js.native
  object DEV extends TopLevel[DEV with Double]
  
  /* 3 */ @js.native
  object INTERNAL extends TopLevel[INTERNAL with Double]
  
  /* 0 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  /* 1 */ @js.native
  object PUBLIC extends TopLevel[PUBLIC with Double]
  
}

