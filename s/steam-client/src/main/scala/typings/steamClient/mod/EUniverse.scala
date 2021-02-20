package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUniverse extends StObject
@JSImport("steam-client", "EUniverse")
@js.native
object EUniverse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUniverse with Double] = js.native
  
  @js.native
  sealed trait Beta extends EUniverse
  /* 2 */ val Beta: typings.steamClient.mod.EUniverse.Beta with Double = js.native
  
  @js.native
  sealed trait Dev extends EUniverse
  /* 4 */ val Dev: typings.steamClient.mod.EUniverse.Dev with Double = js.native
  
  @js.native
  sealed trait Internal extends EUniverse
  /* 3 */ val Internal: typings.steamClient.mod.EUniverse.Internal with Double = js.native
  
  @js.native
  sealed trait Invalid extends EUniverse
  /* 0 */ val Invalid: typings.steamClient.mod.EUniverse.Invalid with Double = js.native
  
  @js.native
  sealed trait Max extends EUniverse
  /* 5 */ val Max: typings.steamClient.mod.EUniverse.Max with Double = js.native
  
  @js.native
  sealed trait Public extends EUniverse
  /* 1 */ val Public: typings.steamClient.mod.EUniverse.Public with Double = js.native
}
