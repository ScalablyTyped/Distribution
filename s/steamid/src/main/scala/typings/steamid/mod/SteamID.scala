package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SteamID extends StObject {
  
  var accountid: Double
  
  /**
    * Renders the ID in 64-bit decimal format, as a BigInt (e.g. 76561198006409530n)
    */
  def getBigIntID(): js.BigInt
  
  def getSteam2RenderedID(): String
  def getSteam2RenderedID(newerFormat: Boolean): String
  @JSName("getSteam2RenderedID")
  var getSteam2RenderedID_Original: getSteam2RenderedID
  
  def getSteam3RenderedID(): String
  @JSName("getSteam3RenderedID")
  var getSteam3RenderedID_Original: getSteam3RenderedID
  
  def getSteamID64(): String
  @JSName("getSteamID64")
  var getSteamID64_Original: getSteamID64
  
  var instance: Instance
  
  /**
    * Checks whether the given ID is for a legacy group chat.
    */
  def isGroupChat(): Boolean
  
  /**
    * Check whether the SteamID is for a game lobby.
    */
  def isLobby(): Boolean
  
  /**
    * Check whether this SteamID is valid (according to Steam's rules).
    * This does not check whether the given ID belongs to a real account
    * (or if it belongs to an indiviual account in the public universe).
    */
  def isValid(): Boolean
  
  /**
    * Returns whether this SteamID is valid and belongs to an individual user in the public universe with a desktop instance.
    * Does not check whether the account actually exists.
    */
  def isValidIndividual(): Boolean
  
  def steam2(): String
  def steam2(newerFormat: Boolean): String
  @JSName("steam2")
  var steam2_Original: getSteam2RenderedID
  
  def steam3(): String
  @JSName("steam3")
  var steam3_Original: getSteam3RenderedID
  
  @JSName("toString")
  var toString_Original: getSteamID64
  
  var `type`: Type
  
  var universe: Universe
}
object SteamID {
  
  inline def apply(
    accountid: Double,
    getBigIntID: () => js.BigInt,
    getSteam2RenderedID: /* newerFormat */ js.UndefOr[Boolean] => String,
    getSteam3RenderedID: () => String,
    getSteamID64: () => String,
    instance: Instance,
    isGroupChat: () => Boolean,
    isLobby: () => Boolean,
    isValid: () => Boolean,
    isValidIndividual: () => Boolean,
    steam2: /* newerFormat */ js.UndefOr[Boolean] => String,
    steam3: () => String,
    toString_ : () => String,
    `type`: Type,
    universe: Universe
  ): SteamID = {
    val __obj = js.Dynamic.literal(accountid = accountid.asInstanceOf[js.Any], getBigIntID = js.Any.fromFunction0(getBigIntID), getSteam2RenderedID = js.Any.fromFunction1(getSteam2RenderedID), getSteam3RenderedID = js.Any.fromFunction0(getSteam3RenderedID), getSteamID64 = js.Any.fromFunction0(getSteamID64), instance = instance.asInstanceOf[js.Any], isGroupChat = js.Any.fromFunction0(isGroupChat), isLobby = js.Any.fromFunction0(isLobby), isValid = js.Any.fromFunction0(isValid), isValidIndividual = js.Any.fromFunction0(isValidIndividual), steam2 = js.Any.fromFunction1(steam2), steam3 = js.Any.fromFunction0(steam3), universe = universe.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SteamID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SteamID] (val x: Self) extends AnyVal {
    
    inline def setAccountid(value: Double): Self = StObject.set(x, "accountid", value.asInstanceOf[js.Any])
    
    inline def setGetBigIntID(value: () => js.BigInt): Self = StObject.set(x, "getBigIntID", js.Any.fromFunction0(value))
    
    inline def setGetSteam2RenderedID(value: /* newerFormat */ js.UndefOr[Boolean] => String): Self = StObject.set(x, "getSteam2RenderedID", js.Any.fromFunction1(value))
    
    inline def setGetSteam3RenderedID(value: () => String): Self = StObject.set(x, "getSteam3RenderedID", js.Any.fromFunction0(value))
    
    inline def setGetSteamID64(value: () => String): Self = StObject.set(x, "getSteamID64", js.Any.fromFunction0(value))
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIsGroupChat(value: () => Boolean): Self = StObject.set(x, "isGroupChat", js.Any.fromFunction0(value))
    
    inline def setIsLobby(value: () => Boolean): Self = StObject.set(x, "isLobby", js.Any.fromFunction0(value))
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setIsValidIndividual(value: () => Boolean): Self = StObject.set(x, "isValidIndividual", js.Any.fromFunction0(value))
    
    inline def setSteam2(value: /* newerFormat */ js.UndefOr[Boolean] => String): Self = StObject.set(x, "steam2", js.Any.fromFunction1(value))
    
    inline def setSteam3(value: () => String): Self = StObject.set(x, "steam3", js.Any.fromFunction0(value))
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniverse(value: Universe): Self = StObject.set(x, "universe", value.asInstanceOf[js.Any])
  }
}
