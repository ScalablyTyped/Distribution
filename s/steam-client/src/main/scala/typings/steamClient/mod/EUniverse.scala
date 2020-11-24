package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUniverse extends js.Object
@JSImport("steam-client", "EUniverse")
@js.native
object EUniverse extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUniverse with Double] = js.native
  
  @js.native
  sealed trait Beta extends EUniverse
  /* 2 */ @js.native
  object Beta extends TopLevel[Beta with Double]
  
  @js.native
  sealed trait Dev extends EUniverse
  /* 4 */ @js.native
  object Dev extends TopLevel[Dev with Double]
  
  @js.native
  sealed trait Internal extends EUniverse
  /* 3 */ @js.native
  object Internal extends TopLevel[Internal with Double]
  
  @js.native
  sealed trait Invalid extends EUniverse
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Max extends EUniverse
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Public extends EUniverse
  /* 1 */ @js.native
  object Public extends TopLevel[Public with Double]
}
