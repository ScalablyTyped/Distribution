package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Instance extends js.Object

// Instance constants
@JSImport("steamid", "Instance")
@js.native
object Instance extends js.Object {
  @js.native
  sealed trait ALL extends Instance
  
  @js.native
  sealed trait CONSOLE extends Instance
  
  @js.native
  sealed trait DESKTOP extends Instance
  
  @js.native
  sealed trait WEB extends Instance
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Instance with Double] = js.native
  /* 0 */ @js.native
  object ALL extends TopLevel[ALL with Double]
  
  /* 2 */ @js.native
  object CONSOLE extends TopLevel[CONSOLE with Double]
  
  /* 1 */ @js.native
  object DESKTOP extends TopLevel[DESKTOP with Double]
  
  /* 4 */ @js.native
  object WEB extends TopLevel[WEB with Double]
  
}

