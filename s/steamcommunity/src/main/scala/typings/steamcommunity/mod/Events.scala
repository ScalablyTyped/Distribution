package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  /**
    * @param err An `Error` object.
    * @param fatal `true` if this is a fatal error, `false` if not (will keep trying to connect if not fatal).
    */
  type chatLogOnFailed = js.Function2[/* err */ CallbackError, /* fatal */ Boolean, Unit]
  
  /**
    * @param steamID The sender's SteamID, as a `SteamID` object.
    * @param text The message text.
    */
  type chatMessage = js.Function2[/* sender */ SteamID, /* text */ String, Unit]
  
  /**
    * @param steamID The SteamID of the user for whom we just got persona data, as a `SteamID` object.
    * @param persona The user's persona data.
    */
  type chatPersonaState = js.Function2[/* steamID */ SteamID, /* persona */ PersonaState, Unit]
  
  /**
    * @param steamID The sender's SteamID, as a `SteamID` object.
    */
  type chatTyping = js.Function1[/* sender */ SteamID, Unit]
  
  /**
    * @param tag If an error occurred when you were getting the key, pass an `Error` object here and no further arguments. If successful, pass `null` here.
    * @param callback The Unix timestamp that you used to generate this key.
    */
  type confKeyNeeded = js.Function2[/* tag */ String, /* callback */ confKeyNeededCallback, Unit]
  
  /**
    * You should call this function when you have the key ready.
    *
    * @param err If an error occurred when you were getting the key, pass an `Error` object here and no further arguments. If successful, pass `null` here.
    * @param time The Unix timestamp that you used to generate this key.
    * @param key The base64 string key.
    */
  type confKeyNeededCallback = js.Function3[/* err */ CallbackError, /* time */ Double, /* key */ String, Unit]
  
  /**
    * @param confirmation A `CConfirmation` object.
    */
  type confirmationAccepted = js.Function1[/* confirmation */ typings.steamcommunity.cconfirmationMod.^, Unit]
  
  /**
    * @param confirmation A `CConfirmation` object.
    */
  type newConfirmation = js.Function1[/* confirmation */ typings.steamcommunity.cconfirmationMod.^, Unit]
  
  /**
    * @param err An `Error` object.
    */
  type sessionExpired = js.Function1[/* err */ CallbackError, Unit]
}
