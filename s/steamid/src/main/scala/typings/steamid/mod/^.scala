package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steamid", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with SteamID {
  /**
    * You can create a SteamID object from a Steam2 rendered ID, a Steam3 rendered ID, a SteamID64, or from the four parts that make up a SteamID.
    * @param input SteamID string BigInt
    */
  def this(input: String) = this()
  def this(input: js.BigInt) = this()
  
  /* CompleteClass */
  var accountid: Double = js.native
  
  /**
    * Renders the ID in 64-bit decimal format, as a BigInt (e.g. 76561198006409530n)
    */
  /* CompleteClass */
  override def getBigIntID(): js.BigInt = js.native
  
  /* CompleteClass */
  override def getSteam2RenderedID(): String = js.native
  /* CompleteClass */
  override def getSteam2RenderedID(newerFormat: Boolean): String = js.native
  /* CompleteClass */
  @JSName("getSteam2RenderedID")
  var getSteam2RenderedID_Original: getSteam2RenderedID = js.native
  
  /* CompleteClass */
  override def getSteam3RenderedID(): String = js.native
  /* CompleteClass */
  @JSName("getSteam3RenderedID")
  var getSteam3RenderedID_Original: getSteam3RenderedID = js.native
  
  /* CompleteClass */
  override def getSteamID64(): String = js.native
  /* CompleteClass */
  @JSName("getSteamID64")
  var getSteamID64_Original: getSteamID64 = js.native
  
  /* CompleteClass */
  var instance: Instance = js.native
  
  /**
    * Checks whether the given ID is for a legacy group chat.
    */
  /* CompleteClass */
  override def isGroupChat(): Boolean = js.native
  
  /**
    * Check whether the SteamID is for a game lobby.
    */
  /* CompleteClass */
  override def isLobby(): Boolean = js.native
  
  /**
    * Check whether this SteamID is valid (according to Steam's rules).
    * This does not check whether the given ID belongs to a real account
    * (or if it belongs to an indiviual account in the public universe).
    */
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  
  /**
    * Returns whether this SteamID is valid and belongs to an individual user in the public universe with a desktop instance.
    * Does not check whether the account actually exists.
    */
  /* CompleteClass */
  override def isValidIndividual(): Boolean = js.native
  
  /* CompleteClass */
  override def steam2(): String = js.native
  /* CompleteClass */
  override def steam2(newerFormat: Boolean): String = js.native
  /* CompleteClass */
  @JSName("steam2")
  var steam2_Original: getSteam2RenderedID = js.native
  
  /* CompleteClass */
  override def steam3(): String = js.native
  /* CompleteClass */
  @JSName("steam3")
  var steam3_Original: getSteam3RenderedID = js.native
  
  /* CompleteClass */
  @JSName("toString")
  var toString_Original: getSteamID64 = js.native
  
  /* CompleteClass */
  var `type`: Type = js.native
  
  /* CompleteClass */
  var universe: Universe = js.native
}
@JSImport("steamid", JSImport.Namespace)
@js.native
object ^ extends StObject
