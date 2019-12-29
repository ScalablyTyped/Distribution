package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EUniverse extends js.Object

@JSImport("steam-client", "EUniverse")
@js.native
object EUniverse extends js.Object {
  @js.native
  sealed trait Beta extends EUniverse
  
  @js.native
  sealed trait Dev extends EUniverse
  
  @js.native
  sealed trait Internal extends EUniverse
  
  @js.native
  sealed trait Invalid extends EUniverse
  
  @js.native
  sealed trait Max extends EUniverse
  
  @js.native
  sealed trait Public extends EUniverse
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUniverse with Double] = js.native
  /* 2 */ @js.native
  object Beta extends TopLevel[Beta with Double]
  
  /* 4 */ @js.native
  object Dev extends TopLevel[Dev with Double]
  
  /* 3 */ @js.native
  object Internal extends TopLevel[Internal with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 1 */ @js.native
  object Public extends TopLevel[Public with Double]
  
}

