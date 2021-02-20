package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SteamID extends StObject {
  
  var accountid: Double = js.native
  
  def getSteam2RenderedID(): String = js.native
  def getSteam2RenderedID(newerFormat: Boolean): String = js.native
  @JSName("getSteam2RenderedID")
  var getSteam2RenderedID_Original: getSteam2RenderedID = js.native
  
  def getSteam3RenderedID(): String = js.native
  @JSName("getSteam3RenderedID")
  var getSteam3RenderedID_Original: getSteam3RenderedID = js.native
  
  def getSteamID64(): String = js.native
  @JSName("getSteamID64")
  var getSteamID64_Original: getSteamID64 = js.native
  
  var instance: Instance = js.native
  
  /**
    * Check whether this chat SteamID is tied to a Steam group.
    */
  def isGroupChat(): Boolean = js.native
  
  /**
    * Check whether this chat SteamID is a Steam lobby.
    */
  def isLobby(): Boolean = js.native
  
  /**
    * Check whether this SteamID is valid (according to Steam's rules)
    */
  def isValid(): Boolean = js.native
  
  def steam2(): String = js.native
  def steam2(newerFormat: Boolean): String = js.native
  @JSName("steam2")
  var steam2_Original: getSteam2RenderedID = js.native
  
  def steam3(): String = js.native
  @JSName("steam3")
  var steam3_Original: getSteam3RenderedID = js.native
  
  @JSName("toString")
  var toString_Original: getSteamID64 = js.native
  
  var `type`: Type = js.native
  
  var universe: Universe = js.native
}
