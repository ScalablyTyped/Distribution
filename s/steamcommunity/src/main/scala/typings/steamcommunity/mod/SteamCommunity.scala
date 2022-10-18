package typings.steamcommunity.mod

import typings.steamcommunity.anon.Appid
import typings.steamcommunity.componentsChatMod.Chat
import typings.steamcommunity.componentsConfirmationsMod.Confirmations
import typings.steamcommunity.componentsGroupsMod.Groups
import typings.steamcommunity.componentsHelpMod.Help
import typings.steamcommunity.componentsHelpersMod.Helpers
import typings.steamcommunity.componentsHttpMod.Http
import typings.steamcommunity.componentsInventoryhistoryMod.InventoryHistory
import typings.steamcommunity.componentsMarketMod.Market
import typings.steamcommunity.componentsProfileMod.Profile
import typings.steamcommunity.componentsTwofactorMod.TwoFactor
import typings.steamcommunity.componentsUsersMod.Users
import typings.steamcommunity.componentsWebapiMod.WebApi
import typings.steamcommunity.steamcommunityStrings.chatLogOnFailed
import typings.steamcommunity.steamcommunityStrings.chatLoggedOff
import typings.steamcommunity.steamcommunityStrings.chatLoggedOn
import typings.steamcommunity.steamcommunityStrings.chatMessage
import typings.steamcommunity.steamcommunityStrings.chatPersonaState
import typings.steamcommunity.steamcommunityStrings.chatTyping
import typings.steamcommunity.steamcommunityStrings.confKeyNeeded
import typings.steamcommunity.steamcommunityStrings.confirmationAccepted
import typings.steamcommunity.steamcommunityStrings.debug
import typings.steamcommunity.steamcommunityStrings.newConfirmation
import typings.steamcommunity.steamcommunityStrings.sessionExpired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SteamCommunity
  extends typings.node.eventsMod.^
     with Chat
     with Confirmations
     with Groups
     with Help
     with Helpers
     with Http
     with InventoryHistory
     with Market
     with Profile
     with TwoFactor
     with Users
     with WebApi {
  
  /**
    * Invalidates your account's existing trade URL and generates a new token, which is returned in the callback.
    *
    * @param callback
    */
  def changeTradeURL(callback: js.Function3[/* err */ CallbackError, /* url */ String, /* token */ String, Any]): Unit = js.native
  
  /**
    * Clears your Steam profile name history (aliases).
    * @param callback
    */
  def clearPersonaNameHistory(callback: Callback): Any = js.native
  
  /**
    * Retrieves a token that can be used to log on via node-steam-user.
    *
    * @param callback
    */
  def getClientLogonToken(callback: js.Function2[/* err */ CallbackError, /* details */ TokenDetails, Any]): Unit = js.native
  
  /**
    * Retrieves a list of your friend relationships. Includes friends, invited friends, users who invited us to be friends, and blocked users.
    *
    * @param callback A function to be called when the request completes
    */
  def getFriendsList(callback: js.Function2[/* err */ CallbackError, /* users */ Any, Any]): Unit = js.native
  
  /**
    * Creates and returns a CMarketItem object for a particular item.
    *
    * @param appid The ID of the app to which this item belongs.
    * @param hashName The item's market_hash_name.
    * @param currency
    * @param callback Called when the item data is loaded and ready.
    */
  def getMarketItem(
    appid: Any,
    hashName: Any,
    currency: Any,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* item */ typings.steamcommunity.classesCmarketitemMod.^, 
      Any
    ]
  ): Unit = js.native
  
  /**
    * Gets your account's notifications (the things under the green envelope button on the top-right.
    *
    * @param callback Fired when the requested data is available.
    */
  def getNotifications(callback: js.Function2[/* err */ CallbackError, /* notifications */ Notifications, Any]): Unit = js.native
  
  /**
    * Returns the session ID of your current session, or generates a new one if you don't have a session yet. You probably won't need to use this.
    *
    * @param host
    */
  def getSessionID(host: Any): Any = js.native
  
  def getSteamGroup(
    id: String,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* group */ typings.steamcommunity.classesCsteamgroupMod.^, 
      Any
    ]
  ): Unit = js.native
  /**
    * Creates and returns a `CSteamGroup` object for a particular group.
    *
    * @param id Either a `SteamID` object or a group's URL (the part after /groups/)
    * @param callback
    */
  def getSteamGroup(
    id: SteamID,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* group */ typings.steamcommunity.classesCsteamgroupMod.^, 
      Any
    ]
  ): Unit = js.native
  
  def getSteamUser(
    id: String,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* group */ typings.steamcommunity.classesCsteamuserMod.^, 
      Any
    ]
  ): Unit = js.native
  /**
    * Creates and returns a CSteamUser object for a particular user.
    *
    * @param id Either a SteamID object or a user's URL (the part after /id/).
    * @param callback
    */
  def getSteamUser(
    id: SteamID,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* group */ typings.steamcommunity.classesCsteamuserMod.^, 
      Any
    ]
  ): Unit = js.native
  
  /**
    * Gets your account's trade URL, which can be used by people who aren't your friends on Steam to send you trade offers.
    *
    * @param callback A callback to be invoked on completion.
    */
  def getTradeURL(callback: js.Function3[/* err */ CallbackError, /* url */ String, /* token */ String, Any]): Unit = js.native
  
  /**
    * Use this method to check whether or not you're currently logged into Steam and what your Family View status is.
    *
    * @param callback Called when the result is available.
    */
  def loggedIn(
    callback: js.Function3[/* err */ CallbackError, /* loggedIn */ Boolean, /* familyView */ Boolean, Any]
  ): Unit = js.native
  
  /**
    * @param details An object containing our login details.
    * @param callback A function which will be called once we're logged in.
    */
  def login(
    details: LoginOptions,
    callback: js.Function5[
      /* err */ CallbackError, 
      /* sessionID */ String, 
      /* cookies */ js.Array[Any], 
      /* steamguard */ String, 
      /* oAuthToken */ String, 
      Any
    ]
  ): Any = js.native
  
  /**
    * Searches the market for a particular query. If you provide an appid to options, you can also search for tags.
    * Simply add your search tags with the tag's name being the key and the tag's internal value being the value.
    *
    * @param options Provide a string to just search for that string, otherwise an object.
    * @param callback Called when results are available.
    */
  def marketSearch(
    options: String,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* items */ js.Array[typings.steamcommunity.classesCmarketsearchresultMod.^], 
      Any
    ]
  ): Unit = js.native
  def marketSearch(
    options: Appid,
    callback: js.Function2[
      /* err */ CallbackError, 
      /* items */ js.Array[typings.steamcommunity.classesCmarketsearchresultMod.^], 
      Any
    ]
  ): Unit = js.native
  
  /**
    * Facilitates passwordless login using details received from a previous login request.
    *
    * @param steamguard The steamguard value from the callback of login.
    * @param token The oAuthToken value from the callback of login.
    * @param callback Called when the login request completes
    */
  def oAuthLogin(
    steamguard: String,
    token: String,
    callback: js.Function3[/* err */ CallbackError, /* loggedIn */ Boolean, /* familyView */ Boolean, Any]
  ): Unit = js.native
  
  /**
    * Emitted in response to a {@link SteamCommunity.chatLogoff|chatLogoff()} or {@link SteamCommunity.chatLogon|chatLogon()} call respectively when we successfully logged off/on.
    *
    * @param event "chatLoggedOff" | "chatLoggenOn"
    * @param listener Emitted in response to a {@link SteamCommunity.chatLogoff|chatLogoff()} or {@link SteamCommunity.chatLogon|chatLogon()} call respectively when we successfully logged off/on.
    */
  def on(event: chatLoggedOff | chatLoggedOn, listener: js.Function0[Unit]): this.type = js.native
  def on(`type`: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(`type`: Double, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Emitted when there's a problem while logging into webchat.
    *
    * @param event "chatLogOnFailed"
    * @param listener Emitted when there's a problem while logging into webchat.
    */
  @JSName("on")
  def on_chatLogOnFailed(event: chatLogOnFailed, listener: typings.steamcommunity.mod.Events.chatLogOnFailed): this.type = js.native
  /**
    * Emitted when we receive a new chat message.
    *
    * @param event "chatMessage"
    * @param listener Emitted when we receive a new chat message.
    */
  @JSName("on")
  def on_chatMessage(event: chatMessage, listener: typings.steamcommunity.mod.Events.chatMessage): this.type = js.native
  /**
    * Emitted when we receive new persona state data for a friend.
    *
    * @param event "chatPersonaState"
    * @param listener Emitted when we receive new persona state data for a friend.
    */
  @JSName("on")
  def on_chatPersonaState(event: chatPersonaState, listener: typings.steamcommunity.mod.Events.chatPersonaState): this.type = js.native
  /**
    * Emitted when we receive a notification that someone is typing a message.
    *
    * @param event "chatTyping"
    * @param listener Emitted when we receive a notification that someone is typing a message.
    */
  @JSName("on")
  def on_chatTyping(event: chatTyping, listener: typings.steamcommunity.mod.Events.chatTyping): this.type = js.native
  /**
    * This event will be emitted when the confirmation checker needs a new confirmation key to continue. Keys that can be reused will be saved for up to five minutes before they are requested again.
    *
    * @param event "confKeyNeeded"
    * @param listener This event will be emitted when the confirmation checker needs a new confirmation key to continue.
    * @example
    * community.on('confKeyNeeded', function(tag, callback) {
    *     const time = Math.floor(Date.now() / 1000);
    *     callback(null, time, SteamTotp.getConfirmationKey(identitySecret, time, tag));
    * });
    */
  @JSName("on")
  def on_confKeyNeeded(event: confKeyNeeded, listener: typings.steamcommunity.mod.Events.confKeyNeeded): this.type = js.native
  /**
    * Emitted when the automatic confirmation checker auto-accepts a confirmation with success.
    *
    * @param event "confirmationAccepted"
    * @param listener Emitted when the automatic confirmation checker auto-accepts a confirmation with success.
    */
  @JSName("on")
  def on_confirmationAccepted(event: confirmationAccepted, listener: typings.steamcommunity.mod.Events.confirmationAccepted): this.type = js.native
  @JSName("on")
  def on_debug(`type`: debug, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Emitted when a new confirmation is received. This will be emitted once per confirmation.
    *
    * A special property `offerID` will be defined which is the ID of the trade offer that the confirmation is confirming.
    * If this confirmation isn't for an offer, this will be `undefined`. Adding this property requires one request per confirmation to find the offer ID.
    * If you don't need these IDs and you want to save requests, always return an error in the `confKeyNeeded` event when the tag is "details".
    *
    * This event will be emitted at most once per second. This is to ensure that you don't accidentally generate the same key twice for two confirmations.
    *
    * @param event "newConfirmation"
    * @param listener Emitted when a new confirmation is received. This will be emitted once per confirmation.
    */
  @JSName("on")
  def on_newConfirmation(event: newConfirmation, listener: typings.steamcommunity.mod.Events.newConfirmation): this.type = js.native
  /**
    * Emitted when an HTTP request is made which requires a login, and Steam redirects us to the login page (i.e. we aren't logged in). You should re-login when you get this event.
    * Note that this will be emitted continuously until you log back in. This event being emitted doesn't stop the
    * module from attempting further requests (as a result of method calls, timers, etc) so you should ensure that you limit your logins.
    *
    * @param event "sessionExpired"
    * @param listener Emitted when an HTTP request is made which requires a login, and Steam redirects us to the login page (i.e. we aren't logged in).
    */
  @JSName("on")
  def on_sessionExpired(event: sessionExpired, listener: typings.steamcommunity.mod.Events.sessionExpired): this.type = js.native
  
  /**
    * If your account has Family View enabled, calling this will disable it for your current session.
    *
    * @param pin Your 4-digit Family View PIN.
    * @param callback An optional callback to be invoked on completion.
    */
  def parentalUnlock(pin: Double, callback: Callback): Unit = js.native
  
  /**
    * Loads your inventory page, which resets your new items notification to 0.
    *
    * @param callback An optional callback to be invoked on completion.
    */
  def resetItemNotifications(): Unit = js.native
  def resetItemNotifications(callback: Callback): Unit = js.native
  
  /**
    * Use this to resume a previous session or to use a session that was negotiated elsewhere (using node-steam-user, for instance).
    *
    * @param cookies An array of cookies (as name=value pair strings).
    */
  def setCookies(cookies: js.Array[String]): Unit = js.native
  
  var steamID: SteamID = js.native
}
