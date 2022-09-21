package typings.steamUser.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.steamUser.anon.Adress
import typings.steamUser.anon.Append
import typings.steamUser.anon.Appids
import typings.steamUser.anon.Apps
import typings.steamUser.anon.Balance
import typings.steamUser.anon.Classid
import typings.steamUser.anon.Descriptions
import typings.steamUser.anon.DeviceToken
import typings.steamUser.anon.Devices
import typings.steamUser.anon.Emoticons
import typings.steamUser.anon.EncryptedAppTicket
import typings.steamUser.anon.ErroreresultEResult
import typings.steamUser.anon.Flags
import typings.steamUser.anon.FoilBadgeLavel
import typings.steamUser.anon.Friends
import typings.steamUser.anon.GrantedAppIds
import typings.steamUser.anon.GroupID
import typings.steamUser.anon.IncludeCanceled
import typings.steamUser.anon.IncludeCancelled
import typings.steamUser.anon.Language
import typings.steamUser.anon.Members
import typings.steamUser.anon.Name
import typings.steamUser.anon.Nicknames
import typings.steamUser.anon.PackageList
import typings.steamUser.anon.PersonaName
import typings.steamUser.anon.Personas
import typings.steamUser.anon.PlayerCount
import typings.steamUser.anon.PlayingApp
import typings.steamUser.anon.Servers
import typings.steamUser.anon.ServersRecord
import typings.steamUser.anon.Tags
import typings.steamUser.anon.Tokens
import typings.steamUser.anon.Users
import typings.steamUser.steamUserStrings.`steam-user`
import typings.steamUser.steamUserStrings.accountInfo
import typings.steamUser.steamUserStrings.accountLimitations
import typings.steamUser.steamUserStrings.additionalHeaders
import typings.steamUser.steamUserStrings.appLaunched
import typings.steamUser.steamUserStrings.appOwnershipCached
import typings.steamUser.steamUserStrings.appQuit
import typings.steamUser.steamUserStrings.appUpdate
import typings.steamUser.steamUserStrings.autoRelogin
import typings.steamUser.steamUserStrings.changelist
import typings.steamUser.steamUserStrings.changelistUpdateInterval
import typings.steamUser.steamUserStrings.communityMessages
import typings.steamUser.steamUserStrings.dataDirectory
import typings.steamUser.steamUserStrings.disconnected
import typings.steamUser.steamUserStrings.emailInfo
import typings.steamUser.steamUserStrings.enablePicsCache
import typings.steamUser.steamUserStrings.error
import typings.steamUser.steamUserStrings.friendPersonasLoad
import typings.steamUser.steamUserStrings.friendRelationship
import typings.steamUser.steamUserStrings.friendsGroupList
import typings.steamUser.steamUserStrings.friendsList
import typings.steamUser.steamUserStrings.gifts
import typings.steamUser.steamUserStrings.group
import typings.steamUser.steamUserStrings.groupAnnouncement
import typings.steamUser.steamUserStrings.groupEvent
import typings.steamUser.steamUserStrings.groupList
import typings.steamUser.steamUserStrings.groupRelationship
import typings.steamUser.steamUserStrings.httpProxy
import typings.steamUser.steamUserStrings.language
import typings.steamUser.steamUserStrings.licenses
import typings.steamUser.steamUserStrings.lobbyInvite
import typings.steamUser.steamUserStrings.localAddress
import typings.steamUser.steamUserStrings.localPort
import typings.steamUser.steamUserStrings.loggedOn
import typings.steamUser.steamUserStrings.loginKey
import typings.steamUser.steamUserStrings.machineIdFormat
import typings.steamUser.steamUserStrings.machineIdType
import typings.steamUser.steamUserStrings.marketingMessages
import typings.steamUser.steamUserStrings.newComments
import typings.steamUser.steamUserStrings.newItems
import typings.steamUser.steamUserStrings.nickname
import typings.steamUser.steamUserStrings.nicknameList
import typings.steamUser.steamUserStrings.offlineMessages
import typings.steamUser.steamUserStrings.ownershipCached
import typings.steamUser.steamUserStrings.ownershipFilter
import typings.steamUser.steamUserStrings.packageUpdate
import typings.steamUser.steamUserStrings.picsCacheAll
import typings.steamUser.steamUserStrings.playingState
import typings.steamUser.steamUserStrings.protocol
import typings.steamUser.steamUserStrings.receivedFromGC
import typings.steamUser.steamUserStrings.saveAppTickets
import typings.steamUser.steamUserStrings.sentry
import typings.steamUser.steamUserStrings.singleSentryfile
import typings.steamUser.steamUserStrings.steamGuard
import typings.steamUser.steamUserStrings.tradeOffers
import typings.steamUser.steamUserStrings.tradeRequest
import typings.steamUser.steamUserStrings.tradeResponse
import typings.steamUser.steamUserStrings.tradeStarted
import typings.steamUser.steamUserStrings.user
import typings.steamUser.steamUserStrings.vacBans
import typings.steamUser.steamUserStrings.vanityURL
import typings.steamUser.steamUserStrings.wallet
import typings.steamUser.steamUserStrings.webCompatibilityMode
import typings.steamUser.steamUserStrings.webSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SteamUser
  extends typings.node.eventsMod.^ {
  
  var CurrencyData: Record[ECurrencyCode, Append] = js.native
  
  /**
    * An object containing information about your account. `null` until `accountInfo` is emitted.
    */
  var accountInfo: AccountInfo | Null = js.native
  
  def activateSharingAuthorization(ownerSteamID: String, deviceToken: String): Unit = js.native
  def activateSharingAuthorization(ownerSteamID: String, deviceToken: DeviceToken): Unit = js.native
  /**
    * Use local device authorizations to allow usage of shared licenses.
    * If successful, `licenses` will be emitted with the newly-acquired licenses.
    * @param ownerSteamID
    * @param deviceToken
    */
  def activateSharingAuthorization(ownerSteamID: typings.steamid.mod.^, deviceToken: String): Unit = js.native
  def activateSharingAuthorization(ownerSteamID: typings.steamid.mod.^, deviceToken: DeviceToken): Unit = js.native
  
  def addAuthorizedBorrowers(borrowersSteamID: String): js.Promise[Unit] = js.native
  def addAuthorizedBorrowers(borrowersSteamID: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  //#endregion "GC INTERACTION"
  //#region "FAMILY SHARING"
  // https://github.com/DoctorMcKay/node-steam-user/wiki/Family-Sharing
  /**
    * Add new borrowers.
    * @param borrowersSteamID
    * @param  [callback]
    */
  def addAuthorizedBorrowers(borrowersSteamID: js.Array[typings.steamid.mod.^ | String]): js.Promise[Unit] = js.native
  def addAuthorizedBorrowers(
    borrowersSteamID: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def addAuthorizedBorrowers(borrowersSteamID: typings.steamid.mod.^): js.Promise[Unit] = js.native
  def addAuthorizedBorrowers(borrowersSteamID: typings.steamid.mod.^, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def addFriend(steamID: String): js.Promise[PersonaName] = js.native
  def addFriend(steamID: String, callback: js.Function2[/* err */ js.Error | Null, /* personaName */ String, Unit]): js.Promise[PersonaName] = js.native
  /**
    * Send (or accept) a friend invitiation.
    * @param steamID - Either a SteamID object of the user to add, or a string which can parse into one.
    * @param [callback] - Optional. Called with `err` and `name` parameters on completion.
    */
  def addFriend(steamID: typings.steamid.mod.^): js.Promise[PersonaName] = js.native
  def addFriend(
    steamID: typings.steamid.mod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* personaName */ String, Unit]
  ): js.Promise[PersonaName] = js.native
  
  def addFriendToGroup(groupID: Double, userSteamID: String): js.Promise[Unit] = js.native
  def addFriendToGroup(groupID: Double, userSteamID: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Add an user to friends group (tag)
    * @param groupID - The friends group
    * @param userSteamID - The user to invite to the friends group with, as a SteamID object or a string which can parse into one
    * @param [callback]
    */
  def addFriendToGroup(groupID: Double, userSteamID: typings.steamid.mod.^): js.Promise[Unit] = js.native
  def addFriendToGroup(
    groupID: Double,
    userSteamID: typings.steamid.mod.^,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  /**
    * Authorize local device for library sharing.
    * @param deviceName
    * @param [callback]
    */
  def authorizeLocalSharingDevice(deviceName: String): js.Promise[DeviceToken] = js.native
  def authorizeLocalSharingDevice(
    deviceName: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ DeviceToken, Unit]
  ): js.Promise[DeviceToken] = js.native
  
  def blockUser(steamID: String): js.Promise[Unit] = js.native
  def blockUser(steamID: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Block all communication with a user.
    * @param steamID - Either a SteamID object of the user to block, or a string which can parse into one.
    * @param [callback] - Optional. Called with an `err` parameter on completion.
    */
  def blockUser(steamID: typings.steamid.mod.^): js.Promise[Unit] = js.native
  def blockUser(steamID: typings.steamid.mod.^, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def cancelTradeRequest(steamID: String): Unit = js.native
  def cancelTradeRequest(steamID: typings.steamid.mod.^): Unit = js.native
  
  /**
    * Only defined if you're currently logged on. This is your cell (region ID) on the Steam network.
    */
  var cellID: Double = js.native
  
  /**
    * Makes a new trade URL for your account.
    * @param [callback]
    */
  def changeTradeURL(): js.Promise[TradeURL] = js.native
  def changeTradeURL(callback: js.Function2[/* err */ js.Error | Null, /* response */ TradeURL, Unit]): js.Promise[TradeURL] = js.native
  
  // PROPERTIES
  /**
    * Use this object to chat with friends and chat rooms.
    */
  var chat: typings.steamUser.chatroomMod.^ = js.native
  
  /**
    * An object containing information about all legacy chat rooms we're in. Keys are 64-bit SteamIDs.
    */
  var chats: Record[String, Chat] = js.native
  
  /**
    * Check whether a given quick-invite link is valid.
    * @param link
    * @param [callback]
    */
  def checkQuickInviteLinkValidity(link: String): js.Promise[QuickInviteLinkValidity] = js.native
  def checkQuickInviteLinkValidity(
    link: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ QuickInviteLinkValidity, Unit]
  ): js.Promise[QuickInviteLinkValidity] = js.native
  
  /**
    * Creates a friends group (or tag)
    * @param groupName - The name to create the friends group with
    * @param [callback]
    */
  def createFriendsGroup(groupName: String): js.Promise[GroupID] = js.native
  def createFriendsGroup(groupName: String, callback: js.Function2[/* err */ js.Error | Null, /* groupID */ Double, Unit]): js.Promise[GroupID] = js.native
  
  /**
    * Create a new quick-invite link that can be used by any Steam user to directly add you as a friend.
    * @param [options]
    * @param [callback]
    */
  def createQuickInviteLink(): js.Promise[QuickInviteLink] = js.native
  def createQuickInviteLink(
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ QuickInviteLink, Unit]
  ): js.Promise[QuickInviteLink] = js.native
  def createQuickInviteLink(options: CreateQuickInviteLinkOptions): js.Promise[QuickInviteLink] = js.native
  def createQuickInviteLink(
    options: CreateQuickInviteLinkOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ QuickInviteLink, Unit]
  ): js.Promise[QuickInviteLink] = js.native
  
  /**
    * Deactivate family sharing authorizations. Removes shared licenses.
    */
  def deactivateSharingAuthorization(): Unit = js.native
  
  /**
    * Deauthorize a device from family sharing.
    * @param deviceToken
    * @param [callback]
    */
  def deauthorizeSharingDevice(deviceToken: String): js.Promise[Unit] = js.native
  def deauthorizeSharingDevice(deviceToken: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  def deauthorizeSharingDevice(deviceToken: DeviceToken): js.Promise[Unit] = js.native
  def deauthorizeSharingDevice(deviceToken: DeviceToken, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Deletes a friends group (or tag)
    * @param groupID - The friends group id
    * @param [callback]
    */
  def deleteFriendsGroup(groupID: Double): js.Promise[Unit] = js.native
  def deleteFriendsGroup(groupID: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * An object containing information about your account's email address. `null` until `emailInfo` is emitted.
    */
  var emailInfo: Adress | Null = js.native
  
  /**
    * Start the process to enable TOTP two-factor authentication for your account
    * @param [callback] - Called when an activation SMS has been sent.
    */
  def enableTwoFactor(): js.Promise[Record[String, Any]] = js.native
  def enableTwoFactor(callback: js.Function2[/* err */ js.Error | Null, /* response */ Record[String, Any], Unit]): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Finalize the process of enabling TOTP two-factor authentication
    * @param secret - Your shared secret
    * @param activationCode - The activation code you got in your email
    * @param [callback] - Called with a single Error argument, or null on success
    */
  def finalizeTwoFactor(secret: Buffer, activationCode: String): js.Promise[Unit] = js.native
  def finalizeTwoFactor(secret: Buffer, activationCode: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def gamesPlayed(apps: String): Unit = js.native
  def gamesPlayed(apps: String, force: Boolean): Unit = js.native
  def gamesPlayed(apps: js.Array[Double | String | PlayedGame]): Unit = js.native
  def gamesPlayed(apps: js.Array[Double | String | PlayedGame], force: Boolean): Unit = js.native
  /**
    * Tell Steam that you're "playing" zero or more games.
    * @param apps - Array of integers (AppIDs) or strings (non-Steam game names) for the games you're playing. Empty to play nothing.
    * @param [force=false] If true, kick any other sessions logged into this account and playing games from Steam
    */
  def gamesPlayed(apps: Double): Unit = js.native
  def gamesPlayed(apps: Double, force: Boolean): Unit = js.native
  def gamesPlayed(apps: PlayedGame): Unit = js.native
  def gamesPlayed(apps: PlayedGame, force: Boolean): Unit = js.native
  
  /**
    * Get persona name history for one or more users.
    * @param userSteamIDs - SteamIDs of users to request aliases for
    * @param [callback]
    */
  def getAliases(userSteamIDs: js.Array[typings.steamid.mod.^ | String]): js.Promise[Record[String, Name]] = js.native
  def getAliases(
    userSteamIDs: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function2[/* err */ js.Error | Null, /* users */ Record[String, Name], Unit]
  ): js.Promise[Record[String, Name]] = js.native
  
  /**
    * Get the localization keys for rich presence for an app on Steam.
    * @param appID - The app you want rich presence localizations for
    * @param [language] - The full name of the language you want localizations for (e.g. "english" or "spanish"); defaults to language passed to constructor
    * @param [callback]
    */
  def getAppRichPresenceLocalization(appID: Double, language: String): js.Promise[Tokens] = js.native
  def getAppRichPresenceLocalization(
    appID: Double,
    language: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Tokens, Unit]
  ): js.Promise[Tokens] = js.native
  
  /**
    * Get the list of currently-available content servers.
    * @param language
    * @param appid
    * @param classes
    * @param [callback]
    */
  def getAssetClassInfo(language: String, appid: Double, classes: js.Array[Classid]): js.Promise[Descriptions] = js.native
  def getAssetClassInfo(
    language: String,
    appid: Double,
    classes: js.Array[Classid],
    callback: js.Function2[/* err */ js.Error | Null, /* descriptions */ js.Array[Record[String, Any]], Unit]
  ): js.Promise[Descriptions] = js.native
  
  def getAuthSecret(): js.Promise[AuthSecret] = js.native
  def getAuthSecret(callback: js.Function3[/* err */ js.Error | Null, /* secretID */ Double, /* key */ Buffer, Unit]): js.Promise[AuthSecret] = js.native
  
  /**
    * Retrieve a list of Steam accounts authorized to borrow your library.
    * @param [options]
    * @param [callback]
    */
  def getAuthorizedBorrowers(): js.Promise[typings.steamUser.anon.Borrowers] = js.native
  def getAuthorizedBorrowers(
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ typings.steamUser.anon.Borrowers, Unit]
  ): js.Promise[typings.steamUser.anon.Borrowers] = js.native
  def getAuthorizedBorrowers(options: IncludeCanceled): js.Promise[typings.steamUser.anon.Borrowers] = js.native
  def getAuthorizedBorrowers(
    options: IncludeCanceled,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ typings.steamUser.anon.Borrowers, Unit]
  ): js.Promise[typings.steamUser.anon.Borrowers] = js.native
  
  /**
    * Get a list of devices we have authorized.
    * @param [options]
    * @param [callback]
    */
  def getAuthorizedSharingDevices(): js.Promise[Devices] = js.native
  def getAuthorizedSharingDevices(options: Unit, callback: js.Function2[/* err */ js.Error | Null, /* response */ Devices, Unit]): js.Promise[Devices] = js.native
  def getAuthorizedSharingDevices(options: IncludeCancelled): js.Promise[Devices] = js.native
  def getAuthorizedSharingDevices(
    options: IncludeCancelled,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Devices, Unit]
  ): js.Promise[Devices] = js.native
  
  def getCredentialChangeTimes(): js.Promise[CredentialChangeTimes] = js.native
  def getCredentialChangeTimes(
    callback: js.Function4[
      /* err */ js.Error | Null, 
      /* timestampLastPasswordChange */ js.Date | Null, 
      /* timestampLastPasswordReset */ js.Date | Null, 
      /* timestampLastEmailChange */ js.Date | Null, 
      Unit
    ]
  ): js.Promise[CredentialChangeTimes] = js.native
  
  /**
    * Gets the list of emoticons your account can use.
    * @param [callback]
    */
  def getEmoticonList(): js.Promise[Emoticons] = js.native
  def getEmoticonList(callback: js.Function2[/* err */ js.Error | Null, /* response */ Emoticons, Unit]): js.Promise[Emoticons] = js.native
  
  /**
    * Request an encrypted appticket for a particular app. The app must be set up on the Steam backend for encrypted apptickets.
    * @param appid - The Steam AppID of the app you want a ticket for
    * @param [userData] - If the app expects some "user data", provide it here
    * @param [callback] - First argument is "err", second is the ticket as a Buffer (on success)
    */
  def getEncryptedAppTicket(appid: Double): js.Promise[EncryptedAppTicket] = js.native
  def getEncryptedAppTicket(
    appid: Double,
    userData: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* encryptedAppTicket */ Buffer, Unit]
  ): js.Promise[EncryptedAppTicket] = js.native
  def getEncryptedAppTicket(appid: Double, userData: Buffer): js.Promise[EncryptedAppTicket] = js.native
  def getEncryptedAppTicket(
    appid: Double,
    userData: Buffer,
    callback: js.Function2[/* err */ js.Error | Null, /* encryptedAppTicket */ Buffer, Unit]
  ): js.Promise[EncryptedAppTicket] = js.native
  
  def getEquippedProfileItems(steamID: String): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(
    steamID: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(steamID: String, options: Language): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(
    steamID: String,
    options: Language,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  /**
    * Get a user's equipped profile items.
    * @param steamID - Either a SteamID object or a string that can parse into one
    * @param [options]
    * @param [callback]
    */
  def getEquippedProfileItems(steamID: typings.steamid.mod.^): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(
    steamID: typings.steamid.mod.^,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(steamID: typings.steamid.mod.^, options: Language): js.Promise[ProfileItems] = js.native
  def getEquippedProfileItems(
    steamID: typings.steamid.mod.^,
    options: Language,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  
  /**
    * Retrieves a list of friends that have played or used an app.
    * @param appID - The ID of the app you want to check
    * @param [callback]
    * @since 4.20.0
    */
  def getFriendsThatPlay(appID: Double): js.Promise[Friends] = js.native
  def getFriendsThatPlay(appID: Double, callback: js.Function2[/* err */ js.Error | Null, /* response */ Friends, Unit]): js.Promise[Friends] = js.native
  
  /**
    * Get the level of your game badge (and also your Steam level).
    * @param appid - AppID of game in question
    * @param [callback]
    */
  def getGameBadgeLevel(appid: Double): js.Promise[FoilBadgeLavel] = js.native
  def getGameBadgeLevel(
    appid: Double,
    callback: js.Function4[
      /* err */ js.Error | Null, 
      /* steamLevel */ js.UndefOr[Double], 
      /* regularBadgeLevel */ js.UndefOr[Double], 
      /* foilBadgeLavel */ js.UndefOr[Double], 
      Unit
    ]
  ): js.Promise[FoilBadgeLavel] = js.native
  
  /**
    * Get the list of nicknames you've given to other users.
    * @param [callback]
    */
  def getNicknames(): js.Promise[Nicknames] = js.native
  def getNicknames(callback: js.Function2[/* err */ js.Error | Null, /* nicknames */ Record[String, String], Unit]): js.Promise[Nicknames] = js.native
  
  /**
    * Get list of appids this account owns. Only works if enablePicsCache option is enabled and appOwnershipCached event
    * has been emitted.
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def getOwnedApps(): js.Array[Double] = js.native
  def getOwnedApps(filter: OwnsFilterFunction): js.Array[Double] = js.native
  def getOwnedApps(filter: OwnsFilterObject): js.Array[Double] = js.native
  
  /**
    * has been emitted.
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def getOwnedDepots(): js.Array[Double] = js.native
  def getOwnedDepots(filter: OwnsFilterFunction): js.Array[Double] = js.native
  def getOwnedDepots(filter: OwnsFilterObject): js.Array[Double] = js.native
  
  /**
    * Returns an array of package IDs this account owns (different from owned licenses). The filter only
    * works, if enablePicsCache option is enabled and appOwnershipCached event has been emitted.
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def getOwnedPackages(): js.Array[Double] = js.native
  def getOwnedPackages(filter: OwnsFilterFunction): js.Array[Double] = js.native
  def getOwnedPackages(filter: OwnsFilterObject): js.Array[Double] = js.native
  
  /**
    * Get a listing of profile items you own.
    * @param [options]
    * @param [callback]
    */
  def getOwnedProfileItems(): js.Promise[ProfileItems] = js.native
  def getOwnedProfileItems(
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  def getOwnedProfileItems(options: Language): js.Promise[ProfileItems] = js.native
  def getOwnedProfileItems(
    options: Language,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ProfileItems, Unit]
  ): js.Promise[ProfileItems] = js.native
  
  /**
    * Requests information about one or more user profiles.
    * @param steamids - An array of SteamID objects or strings which can parse into them.
    * @param [callback] - Optional. Called with `err`, and an object whose keys are 64-bit SteamIDs as strings, and whose values are persona objects.
    */
  def getPersonas(steamids: js.Array[typings.steamid.mod.^ | String]): js.Promise[Personas] = js.native
  def getPersonas(
    steamids: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function2[/* err */ js.Error | Null, /* personas */ Record[String, Any], Unit]
  ): js.Promise[Personas] = js.native
  
  /**
    * Get count of people playing a Steam app. Use appid 0 to get number of people connected to Steam.
    * @param appid
    * @param [callback] - Args (eresult, player count)
    */
  def getPlayerCount(appid: Double): js.Promise[PlayerCount] = js.native
  def getPlayerCount(appid: Double, callback: js.Function2[/* err */ js.Error | Null, /* playerCount */ Double, Unit]): js.Promise[PlayerCount] = js.native
  
  /**
    * Get your account's profile privacy settings.
    * @param [callback]
    */
  def getPrivacySettings(): js.Promise[PrivacySettings] = js.native
  def getPrivacySettings(callback: js.Function2[/* err */ js.Error | Null, /* response */ PrivacySettings, Unit]): js.Promise[PrivacySettings] = js.native
  
  /**
    * Get access tokens for some apps and/or packages
    * @param apps - Array of appids
    * @param packages - Array of packageids
    * @param [callback] - First arg is an object of (appid => access token), second is the same for packages, third is array of appids for which tokens are denied, fourth is the same for packages
    */
  def getProductAccessToken(apps: js.Array[Double], packages: js.Array[Double]): js.Promise[ProductAccessTokens] = js.native
  def getProductAccessToken(
    apps: js.Array[Double],
    packages: js.Array[Double],
    callback: js.Function5[
      /* err */ js.Error | Null, 
      /* appTokens */ Record[String, String], 
      /* packageTokens */ Record[String, String], 
      /* appDeniedTokens */ js.Array[Double], 
      /* packageDeniedTokens */ js.Array[Double], 
      Unit
    ]
  ): js.Promise[ProductAccessTokens] = js.native
  
  /**
    * Get a list of apps or packages which have changed since a particular changenumber.
    * @param sinceChangenumber - Changenumber to get changes since. Use 0 to get the latest changenumber, but nothing else
    * @param [callback] - Args (current changenumber, array of appids that changed, array of packageids that changed)
    */
  def getProductChanges(sinceChangenumber: Double): js.Promise[ProductChanges] = js.native
  def getProductChanges(
    sinceChangenumber: Double,
    callback: js.Function4[
      /* err */ js.Error | Null, 
      /* currentChangenumber */ Double, 
      /* appChanges */ AppChanges, 
      /* packageChanges */ PackageChanges, 
      Unit
    ]
  ): js.Promise[ProductChanges] = js.native
  
  /**
    * Get info about some apps and/or packages from Steam.
    * @param apps - Array of AppIDs. May be empty. May also contain objects with keys {appid, access_token}
    * @param packages - Array of package IDs. May be empty. May also contain objects with keys {packageid, access_token}
    * @param [inclTokens=false] - If true, automatically retrieve access tokens if needed
    * @param [callback] - Args (array of app data, array of package data, array of appids that don't exist, array of packageids that don't exist)
    * @param [requestType] - Don't touch
    */
  def getProductInfo(apps: js.Array[Double | App], packages: js.Array[Double | Package]): js.Promise[ProductInfo] = js.native
  def getProductInfo(apps: js.Array[Double | App], packages: js.Array[Double | Package], inclTokens: Boolean): js.Promise[ProductInfo] = js.native
  def getProductInfo(
    apps: js.Array[Double | App],
    packages: js.Array[Double | Package],
    inclTokens: Boolean,
    callback: js.Function5[
      /* err */ js.Error | Null, 
      /* apps */ Record[Double, AppInfo], 
      /* packages */ Record[Double, PackageInfo], 
      /* unknownApps */ js.Array[Double], 
      /* unknownPackages */ js.Array[Double], 
      Unit
    ]
  ): js.Promise[ProductInfo] = js.native
  def getProductInfo(
    apps: js.Array[Double | App],
    packages: js.Array[Double | Package],
    inclTokens: Unit,
    callback: js.Function5[
      /* err */ js.Error | Null, 
      /* apps */ Record[Double, AppInfo], 
      /* packages */ Record[Double, PackageInfo], 
      /* unknownApps */ js.Array[Double], 
      /* unknownPackages */ js.Array[Double], 
      Unit
    ]
  ): js.Promise[ProductInfo] = js.native
  
  def getPublishedFileDetails(ids: js.Array[Double]): js.Promise[PublishedFileDetails] = js.native
  def getPublishedFileDetails(
    ids: js.Array[Double],
    callback: js.Function2[/* err */ js.Error | Null, /* files */ PublishedFileDetails, Unit]
  ): js.Promise[PublishedFileDetails] = js.native
  /**
    * Get details for some UGC files.
    * @param ids
    * @param [callback]
    */
  def getPublishedFileDetails(ids: Double): js.Promise[PublishedFileDetails] = js.native
  def getPublishedFileDetails(
    ids: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* files */ PublishedFileDetails, Unit]
  ): js.Promise[PublishedFileDetails] = js.native
  
  /**
    * Get the SteamID to whom a quick-invite link belongs.
    * @param link
    */
  def getQuickInviteLinkSteamID(link: String): typings.steamid.mod.^ | Null = js.native
  
  /**
    * Get the associated IPs for given server SteamIDs.
    * @param steamids
    * @param [callback]
    */
  def getServerIPsBySteamID(steamids: js.Array[typings.steamid.mod.^ | String]): js.Promise[ServersRecord] = js.native
  def getServerIPsBySteamID(
    steamids: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ Record[String, String], Unit]
  ): js.Promise[ServersRecord] = js.native
  
  /**
    * Get a list of servers including game data.
    * @param filter - A filter string (https://mckay.media/hEW8A)
    * @param [callback]
    */
  def getServerList(filter: String): js.Promise[Server] = js.native
  def getServerList(filter: String, limit: Double): js.Promise[Server] = js.native
  def getServerList(
    filter: String,
    limit: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ Server, Unit]
  ): js.Promise[Server] = js.native
  def getServerList(
    filter: String,
    limit: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ Server, Unit]
  ): js.Promise[Server] = js.native
  
  /**
    * Get the associated SteamIDs for given server IPs.
    * @param ips
    * @param [callback]
    */
  def getServerSteamIDsByIP(ips: js.Array[String]): js.Promise[Servers] = js.native
  def getServerSteamIDsByIP(
    ips: js.Array[String],
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ Record[String, typings.steamid.mod.^], Unit]
  ): js.Promise[Servers] = js.native
  
  def getSteamGuardDetails(): js.Promise[SteamGuardDetails] = js.native
  def getSteamGuardDetails(
    callback: js.Function8[
      /* err */ js.Error | Null, 
      /* canTrade */ Boolean, 
      /* isSteamGuardEnabled */ Boolean, 
      /* timestampSteamGuardEnabled */ js.Date | Null, 
      /* timestampMachineSteamGuardEnabled */ js.Date | Null, 
      /* isTwoFactorEnabled */ Boolean, 
      /* timestampTwoFactorEnabled */ js.Date | Null, 
      /* isPhoneVerified */ Boolean, 
      Unit
    ]
  ): js.Promise[SteamGuardDetails] = js.native
  
  /**
    * Gets the Steam Level of one or more Steam users.
    * @param steamids - An array of SteamID objects, or strings which can parse into one.
    * @param [callback] - Called on completion with `err`, and an object whose keys are 64-bit SteamIDs as strings, and whose values are Steam Level numbers.
    */
  def getSteamLevels(steamids: js.Array[typings.steamid.mod.^ | String]): js.Promise[Record[String, Double]] = js.native
  def getSteamLevels(
    steamids: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function2[/* err */ js.Error | Null, /* users */ Record[String, Double], Unit]
  ): js.Promise[Record[String, Double]] = js.native
  
  /**
    * Get the localized names for given store tags.
    * @param language - The full name of the language you're interested in, e.g. "english" or "spanish"
    * @param tagIDs - The IDs of the tags you're interested in
    * @param [callback]
    */
  def getStoreTagNames(language: String, tagIDs: js.Array[Double]): js.Promise[Tags] = js.native
  def getStoreTagNames(
    language: String,
    tagIDs: js.Array[Double],
    callback: js.Function2[/* err */ js.Error | Null, /* tags */ StoreTagNames, Unit]
  ): js.Promise[Tags] = js.native
  
  /**
    * Gets your account's trade URL.
    * @param [callback]
    */
  def getTradeURL(): js.Promise[TradeURL] = js.native
  def getTradeURL(callback: js.Function2[/* err */ js.Error | Null, /* response */ TradeURL, Unit]): js.Promise[TradeURL] = js.native
  
  def getUserOwnedApps(steamID: String): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(
    steamID: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ UserOwnedApps, Unit]
  ): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(steamID: String, options: GetUserOwnedAppsOptions): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(
    steamID: String,
    options: GetUserOwnedAppsOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ UserOwnedApps, Unit]
  ): js.Promise[UserOwnedApps] = js.native
  /**
    * Get the list of a user's owned apps.
    * @param steamID - Either a SteamID object or a string that can parse into one
    * @param [options]
    * @param [callback]
    */
  def getUserOwnedApps(steamID: typings.steamid.mod.^): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(
    steamID: typings.steamid.mod.^,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ UserOwnedApps, Unit]
  ): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(steamID: typings.steamid.mod.^, options: GetUserOwnedAppsOptions): js.Promise[UserOwnedApps] = js.native
  def getUserOwnedApps(
    steamID: typings.steamid.mod.^,
    options: GetUserOwnedAppsOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ UserOwnedApps, Unit]
  ): js.Promise[UserOwnedApps] = js.native
  
  /**
    * An array containing gifts and guest passes you've received but haven't accepted (to your library or to your inventory) or declined. `null` until `gifts` is emitted.
    */
  var gifts: js.Array[Gift] = js.native
  
  /**
    * An object containing information about all Steam groups we've encountered.
    * Keys are 64-bit SteamIDs, and values are identical to those received in the group event.
    * This property may not be updated unless you set your instance to online.
    */
  var groups: Record[String, Any] = js.native
  
  def inviteToGroup(usersteamID: String, groupsteamID: String): Unit = js.native
  def inviteToGroup(usersteamID: String, groupsteamID: typings.steamid.mod.^): Unit = js.native
  def inviteToGroup(usersteamID: typings.steamid.mod.^, groupsteamID: String): Unit = js.native
  /**
    * Invites a user to a Steam group. Only send group invites in response to a user's request; sending automated group
    * invites is a violation of the Steam Subscriber Agreement and can get you banned.
    * @param userSteamID - The SteamID of the user you're inviting as a SteamID object, or a string that can parse into one
    * @param groupSteamID - The SteamID of the group you're inviting the user to as a SteamID object, or a string that can parse into one
    */
  def inviteToGroup(usersteamID: typings.steamid.mod.^, groupsteamID: typings.steamid.mod.^): Unit = js.native
  
  /**
    * Kick any other session logged into your account which is playing a game from Steam.
    * @param [callback] - err and response object (response object since v4.22)
    */
  def kickPlayingSession(): js.Promise[PlayingApp] = js.native
  def kickPlayingSession(callback: js.Function2[/* err */ js.Error | Null, /* response */ PlayingApp, Unit]): js.Promise[PlayingApp] = js.native
  
  /**
    * An array containing license data for the packages which your Steam account owns. `null` until `licenses` is emitted.
    */
  var licenses: js.Array[Record[String, Any]] = js.native
  
  /**
    * An object containing information about your account's limitations. `null` until `accountLimitations` is emitted.
    */
  var limitations: AccountLimitations | Null = js.native
  
  /**
    * Get a list of friend quick-invite links for your account.
    * @param [callback]
    */
  def listQuickInviteLinks(): js.Promise[js.Array[QuickInviteLink]] = js.native
  def listQuickInviteLinks(callback: js.Function2[/* err */ js.Error | Null, /* response */ js.Array[QuickInviteLink], Unit]): js.Promise[js.Array[QuickInviteLink]] = js.native
  
  /**
    * Log off of Steam gracefully.
    */
  def logOff(): Unit = js.native
  
  def logOn(): Unit = js.native
  def logOn(details: LogOnDetailsAnon): Unit = js.native
  def logOn(details: LogOnDetailsNameKey): Unit = js.native
  def logOn(details: LogOnDetailsNamePass): Unit = js.native
  def logOn(details: LogOnDetailsNameToken): Unit = js.native
  
  /**
    * An object containing your friend groups (in the official client, these are called tags). Keys are numeric group IDs.
    */
  var myFriendGroups: Record[String, Members] = js.native
  
  /**
    * An object whose keys are 64-bit SteamIDs, and whose values are values from the `EFriendRelationship` enum.
    * When we get unfriended, instead of setting the value to `EFriendRelationship.None`, the key is deleted from the object entirely.
    * This isn't populated after logon until `friendsList` is emitted.
    */
  var myFriends: Record[String, EFriendRelationship] = js.native
  
  /**
    * An object whose keys are 64-bit SteamIDs, and whose values are from the `EClanRelationship` enum.
    * When we leave a group, instead of setting the value to `EClanRelationship.None`, the key is deleted from the object entirely.
    * This isn't populated after logon until `groupList` is emitted.
    */
  var myGroups: Record[String, EClanRelationship] = js.native
  
  /**
    * An object containing the nicknames you have assigned to other users.
    * Keys are numeric 64-bit SteamIDs, properties are strings containing that user's nickname.
    * This is empty until `nicknameList` is emitted.
    */
  var myNicknames: Record[String, String] = js.native
  
  @JSName("off")
  def off_accountInfo(
    event: accountInfo,
    listener: js.Function1[
      /* args */ js.Tuple6[
        /* name */ String, 
        /* country */ String, 
        /* authedMachines */ Double, 
        /* flags */ EAccountFlags, 
        /* facebookID */ String, 
        /* facebookName */ String
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_accountLimitations(
    event: accountLimitations,
    listener: js.Function1[
      /* args */ js.Tuple4[
        /* limited */ Boolean, 
        /* communityBanned */ Boolean, 
        /* locked */ Boolean, 
        /* canInviteFriends */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_appLaunched(event: appLaunched, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("off")
  def off_appQuit(event: appQuit, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("off")
  def off_appUpdate(
    event: appUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_changelist(
    event: changelist,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* changenumber */ Double, 
        /* apps */ js.Array[Double], 
        /* packages */ js.Array[Double]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_communityMessages(event: communityMessages, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("off")
  def off_disconnected(
    event: disconnected,
    listener: js.Function1[/* args */ js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_emailInfo(
    event: emailInfo,
    listener: js.Function1[/* args */ js.Tuple2[/* adress */ String, /* validated */ Boolean], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* args */ js.Array[/* err */ ErroreresultEResult], Unit]): this.type = js.native
  @JSName("off")
  def off_friendPersonasLoad(event: friendPersonasLoad, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_friendRelationship(
    event: friendRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_friendsGroupList(
    event: friendsGroupList,
    listener: js.Function1[/* args */ js.Array[/* groups */ Record[String, Members]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendsList(event: friendsList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_gifts(event: gifts, listener: js.Function1[/* args */ js.Array[/* gifts */ js.Array[Gift]], Unit]): this.type = js.native
  @JSName("off")
  def off_group(
    event: group,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_groupAnnouncement(
    event: groupAnnouncement,
    listener: js.Function1[
      /* args */ js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_groupEvent(
    event: groupEvent,
    listener: js.Function1[
      /* args */ js.Tuple5[
        /* sid */ typings.steamid.mod.^, 
        /* headline */ String, 
        /* date */ js.Date, 
        /* gid */ Double | String, 
        /* gameID */ Double
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_groupList(event: groupList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_groupRelationship(
    event: groupRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_licenses(
    event: licenses,
    listener: js.Function1[/* args */ js.Array[/* licenses */ js.Array[Record[String, Any]]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_lobbyInvite(
    event: lobbyInvite,
    listener: js.Function1[
      /* args */ js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_loggedOn(
    event: loggedOn,
    listener: js.Function1[
      /* args */ js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_loginKey(event: loginKey, listener: js.Function1[/* args */ js.Array[/* key */ String], Unit]): this.type = js.native
  @JSName("off")
  def off_marketingMessages(
    event: marketingMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_newComments(
    event: newComments,
    listener: js.Function1[
      /* args */ js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_newItems(event: newItems, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("off")
  def off_nickname(
    event: nickname,
    listener: js.Function1[
      /* args */ js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_nicknameList(event: nicknameList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_offlineMessages(
    event: offlineMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_ownershipCached(event: ownershipCached, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_packageUpdate(
    event: packageUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_playingState(
    event: playingState,
    listener: js.Function1[/* args */ js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_receivedFromGC(
    event: receivedFromGC,
    listener: js.Function1[
      /* args */ js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_sentry(event: sentry, listener: js.Function1[/* args */ js.Array[/* sentry */ Buffer], Unit]): this.type = js.native
  @JSName("off")
  def off_steamGuard(
    event: steamGuard,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* domain */ String | Null, 
        /* callback */ js.Function1[/* code */ String, Unit], 
        /* lastCodeWrong */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tradeOffers(event: tradeOffers, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("off")
  def off_tradeRequest(
    event: tradeRequest,
    listener: js.Function1[
      /* args */ js.Tuple2[
        /* steamID */ typings.steamid.mod.^, 
        /* respond */ js.Function1[/* accept */ Boolean, Unit]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tradeResponse(
    event: tradeResponse,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* steamID */ typings.steamid.mod.^, 
        /* response */ EEconTradeResponse, 
        /* restrictions */ TradeRestrictions
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tradeStarted(
    event: tradeStarted,
    listener: js.Function1[/* args */ js.Array[/* steamID */ typings.steamid.mod.^], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_user(
    event: user,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_vacBans(
    event: vacBans,
    listener: js.Function1[/* args */ js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_vanityURL(event: vanityURL, listener: js.Function1[/* args */ js.Array[/* url */ String], Unit]): this.type = js.native
  @JSName("off")
  def off_wallet(
    event: wallet,
    listener: js.Function1[
      /* args */ js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_webSession(
    event: webSession,
    listener: js.Function1[/* args */ js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_accountInfo(
    event: accountInfo,
    listener: js.Function1[
      /* args */ js.Tuple6[
        /* name */ String, 
        /* country */ String, 
        /* authedMachines */ Double, 
        /* flags */ EAccountFlags, 
        /* facebookID */ String, 
        /* facebookName */ String
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_accountLimitations(
    event: accountLimitations,
    listener: js.Function1[
      /* args */ js.Tuple4[
        /* limited */ Boolean, 
        /* communityBanned */ Boolean, 
        /* locked */ Boolean, 
        /* canInviteFriends */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  // EVENTS
  @JSName("on")
  def on_appLaunched(event: appLaunched, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  /**
    * Please use 'ownershipCached'
    * @deprecated since v4.22.1
    */
  @JSName("on")
  def on_appOwnershipCached(event: appOwnershipCached, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_appQuit(event: appQuit, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("on")
  def on_appUpdate(
    event: appUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_changelist(
    event: changelist,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* changenumber */ Double, 
        /* apps */ js.Array[Double], 
        /* packages */ js.Array[Double]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_communityMessages(event: communityMessages, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(
    event: disconnected,
    listener: js.Function1[/* args */ js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_emailInfo(
    event: emailInfo,
    listener: js.Function1[/* args */ js.Tuple2[/* adress */ String, /* validated */ Boolean], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* args */ js.Array[/* err */ ErroreresultEResult], Unit]): this.type = js.native
  @JSName("on")
  def on_friendPersonasLoad(event: friendPersonasLoad, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_friendRelationship(
    event: friendRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_friendsGroupList(
    event: friendsGroupList,
    listener: js.Function1[/* args */ js.Array[/* groups */ Record[String, Members]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendsList(event: friendsList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_gifts(event: gifts, listener: js.Function1[/* args */ js.Array[/* gifts */ js.Array[Gift]], Unit]): this.type = js.native
  @JSName("on")
  def on_group(
    event: group,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_groupAnnouncement(
    event: groupAnnouncement,
    listener: js.Function1[
      /* args */ js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_groupEvent(
    event: groupEvent,
    listener: js.Function1[
      /* args */ js.Tuple5[
        /* sid */ typings.steamid.mod.^, 
        /* headline */ String, 
        /* date */ js.Date, 
        /* gid */ Double | String, 
        /* gameID */ Double
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_groupList(event: groupList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_groupRelationship(
    event: groupRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_licenses(
    event: licenses,
    listener: js.Function1[/* args */ js.Array[/* licenses */ js.Array[Record[String, Any]]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_lobbyInvite(
    event: lobbyInvite,
    listener: js.Function1[
      /* args */ js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_loggedOn(
    event: loggedOn,
    listener: js.Function1[
      /* args */ js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_loginKey(event: loginKey, listener: js.Function1[/* args */ js.Array[/* key */ String], Unit]): this.type = js.native
  @JSName("on")
  def on_marketingMessages(
    event: marketingMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_newComments(
    event: newComments,
    listener: js.Function1[
      /* args */ js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_newItems(event: newItems, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("on")
  def on_nickname(
    event: nickname,
    listener: js.Function1[
      /* args */ js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_nicknameList(event: nicknameList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_offlineMessages(
    event: offlineMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ownershipCached(event: ownershipCached, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_packageUpdate(
    event: packageUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_playingState(
    event: playingState,
    listener: js.Function1[/* args */ js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_receivedFromGC(
    event: receivedFromGC,
    listener: js.Function1[
      /* args */ js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_sentry(event: sentry, listener: js.Function1[/* args */ js.Array[/* sentry */ Buffer], Unit]): this.type = js.native
  @JSName("on")
  def on_steamGuard(
    event: steamGuard,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* domain */ String | Null, 
        /* callback */ js.Function1[/* code */ String, Unit], 
        /* lastCodeWrong */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tradeOffers(event: tradeOffers, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("on")
  def on_tradeRequest(
    event: tradeRequest,
    listener: js.Function1[
      /* args */ js.Tuple2[
        /* steamID */ typings.steamid.mod.^, 
        /* respond */ js.Function1[/* accept */ Boolean, Unit]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tradeResponse(
    event: tradeResponse,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* steamID */ typings.steamid.mod.^, 
        /* response */ EEconTradeResponse, 
        /* restrictions */ TradeRestrictions
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tradeStarted(
    event: tradeStarted,
    listener: js.Function1[/* args */ js.Array[/* steamID */ typings.steamid.mod.^], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_user(
    event: user,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_vacBans(
    event: vacBans,
    listener: js.Function1[/* args */ js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_vanityURL(event: vanityURL, listener: js.Function1[/* args */ js.Array[/* url */ String], Unit]): this.type = js.native
  @JSName("on")
  def on_wallet(
    event: wallet,
    listener: js.Function1[
      /* args */ js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_webSession(
    event: webSession,
    listener: js.Function1[/* args */ js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_accountInfo(
    event: accountInfo,
    listener: js.Function1[
      /* args */ js.Tuple6[
        /* name */ String, 
        /* country */ String, 
        /* authedMachines */ Double, 
        /* flags */ EAccountFlags, 
        /* facebookID */ String, 
        /* facebookName */ String
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_accountLimitations(
    event: accountLimitations,
    listener: js.Function1[
      /* args */ js.Tuple4[
        /* limited */ Boolean, 
        /* communityBanned */ Boolean, 
        /* locked */ Boolean, 
        /* canInviteFriends */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_appLaunched(event: appLaunched, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("once")
  def once_appQuit(event: appQuit, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("once")
  def once_appUpdate(
    event: appUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_changelist(
    event: changelist,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* changenumber */ Double, 
        /* apps */ js.Array[Double], 
        /* packages */ js.Array[Double]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_communityMessages(event: communityMessages, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("once")
  def once_disconnected(
    event: disconnected,
    listener: js.Function1[/* args */ js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_emailInfo(
    event: emailInfo,
    listener: js.Function1[/* args */ js.Tuple2[/* adress */ String, /* validated */ Boolean], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* args */ js.Array[/* err */ ErroreresultEResult], Unit]): this.type = js.native
  @JSName("once")
  def once_friendPersonasLoad(event: friendPersonasLoad, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_friendRelationship(
    event: friendRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_friendsGroupList(
    event: friendsGroupList,
    listener: js.Function1[/* args */ js.Array[/* groups */ Record[String, Members]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendsList(event: friendsList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_gifts(event: gifts, listener: js.Function1[/* args */ js.Array[/* gifts */ js.Array[Gift]], Unit]): this.type = js.native
  @JSName("once")
  def once_group(
    event: group,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_groupAnnouncement(
    event: groupAnnouncement,
    listener: js.Function1[
      /* args */ js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_groupEvent(
    event: groupEvent,
    listener: js.Function1[
      /* args */ js.Tuple5[
        /* sid */ typings.steamid.mod.^, 
        /* headline */ String, 
        /* date */ js.Date, 
        /* gid */ Double | String, 
        /* gameID */ Double
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_groupList(event: groupList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_groupRelationship(
    event: groupRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_licenses(
    event: licenses,
    listener: js.Function1[/* args */ js.Array[/* licenses */ js.Array[Record[String, Any]]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_lobbyInvite(
    event: lobbyInvite,
    listener: js.Function1[
      /* args */ js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_loggedOn(
    event: loggedOn,
    listener: js.Function1[
      /* args */ js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_loginKey(event: loginKey, listener: js.Function1[/* args */ js.Array[/* key */ String], Unit]): this.type = js.native
  @JSName("once")
  def once_marketingMessages(
    event: marketingMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_newComments(
    event: newComments,
    listener: js.Function1[
      /* args */ js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_newItems(event: newItems, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("once")
  def once_nickname(
    event: nickname,
    listener: js.Function1[
      /* args */ js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_nicknameList(event: nicknameList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_offlineMessages(
    event: offlineMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_ownershipCached(event: ownershipCached, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_packageUpdate(
    event: packageUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_playingState(
    event: playingState,
    listener: js.Function1[/* args */ js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_receivedFromGC(
    event: receivedFromGC,
    listener: js.Function1[
      /* args */ js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_sentry(event: sentry, listener: js.Function1[/* args */ js.Array[/* sentry */ Buffer], Unit]): this.type = js.native
  @JSName("once")
  def once_steamGuard(
    event: steamGuard,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* domain */ String | Null, 
        /* callback */ js.Function1[/* code */ String, Unit], 
        /* lastCodeWrong */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tradeOffers(event: tradeOffers, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("once")
  def once_tradeRequest(
    event: tradeRequest,
    listener: js.Function1[
      /* args */ js.Tuple2[
        /* steamID */ typings.steamid.mod.^, 
        /* respond */ js.Function1[/* accept */ Boolean, Unit]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tradeResponse(
    event: tradeResponse,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* steamID */ typings.steamid.mod.^, 
        /* response */ EEconTradeResponse, 
        /* restrictions */ TradeRestrictions
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tradeStarted(
    event: tradeStarted,
    listener: js.Function1[/* args */ js.Array[/* steamID */ typings.steamid.mod.^], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_user(
    event: user,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_vacBans(
    event: vacBans,
    listener: js.Function1[/* args */ js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_vanityURL(event: vanityURL, listener: js.Function1[/* args */ js.Array[/* url */ String], Unit]): this.type = js.native
  @JSName("once")
  def once_wallet(
    event: wallet,
    listener: js.Function1[
      /* args */ js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_webSession(
    event: webSession,
    listener: js.Function1[/* args */ js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]], Unit]
  ): this.type = js.native
  
  /**
    * An object containing options for this `SteamUser`. Read-only; use `setOption` or `setOptions` to change an option.
    */
  val options: Options = js.native
  
  /**
    * Check if this account owns an app. Only works if enablePicsCache option is enabled and appOwnershipCached event
    * has been emitted.
    * @param appid
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def ownsApp(appid: Double): Boolean = js.native
  def ownsApp(appid: Double, filter: OwnsFilterFunction): Boolean = js.native
  def ownsApp(appid: Double, filter: OwnsFilterObject): Boolean = js.native
  
  /**
    * Check if this account owns a depot. Only works if enablePicsCache option is enabled and appOwnershipCached event
    * has been emitted.
    * @param depotid
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def ownsDepot(depotid: Double): Boolean = js.native
  def ownsDepot(depotid: Double, filter: OwnsFilterFunction): Boolean = js.native
  def ownsDepot(depotid: Double, filter: OwnsFilterObject): Boolean = js.native
  
  /**
    * Check if this account owns a package. Only works if enablePicsCache option is enabled and appOwnershipCached event
    * has been emitted.
    * @param packageid
    * @param [filter] - Options for what counts for ownership, or a custom filter function
    */
  def ownsPackage(packageid: Double): Boolean = js.native
  def ownsPackage(packageid: Double, filter: OwnsFilterFunction): Boolean = js.native
  def ownsPackage(packageid: Double, filter: OwnsFilterObject): Boolean = js.native
  
  /**
    * Contains the name of this package. This allows other modules to verify interoperability.
    */
  var packageName: `steam-user` = js.native
  
  /**
    * Contains the version of this package. For example, "4.2.0". This allows other modules to verify interoperability.
    */
  var packageVersion: String = js.native
  
  /**
    * An object containing cached data about known apps and packages. Only useful if the `enablePicsCache` option is `true`.
    */
  var picsCache: Apps = js.native
  
  /**
    * Only defined if you're currently logged on. This is your public IP as reported by Steam, in "x.x.x.x" format.
    */
  var publicIP: String = js.native
  
  /**
    * Redeem a product code on this account.
    * @param key
    * @param [callback] - Args (eresult value, SteamUser.EPurchaseResult value, object of (packageid => package names)
    */
  def redeemKey(key: String): js.Promise[PackageList] = js.native
  def redeemKey(
    key: String,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* purchaseResultDetails */ EPurchaseResult, 
      /* packageList */ Record[String, String], 
      Unit
    ]
  ): js.Promise[PackageList] = js.native
  
  /**
    * Redeem a quick-invite link and add the sender to your friends list.
    * @param link
    * @param [callback]
    */
  def redeemQuickInviteLink(link: String): js.Promise[Any] = js.native
  def redeemQuickInviteLink(link: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Any] = js.native
  
  def relog(): Unit = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(
    event: appLaunched | appQuit | receivedFromGC | loggedOn | steamGuard | error | disconnected | sentry | webSession | loginKey | newItems | newComments | tradeOffers | communityMessages | offlineMessages | vanityURL | accountInfo | emailInfo | accountLimitations | vacBans | wallet | licenses | gifts | ownershipCached | changelist | appUpdate | packageUpdate | marketingMessages | tradeRequest | tradeResponse | tradeStarted | playingState | user | group | groupEvent | groupAnnouncement | friendRelationship | groupRelationship | friendsList | friendPersonasLoad | groupList | friendsGroupList | nicknameList | nickname | lobbyInvite
  ): this.type = js.native
  
  /**
    * Remove borrowers.
    * @param borrowersSteamID
    * @param [callback]
    */
  def removeAuthorizedBorrowers(borrowerssteamID: js.Array[typings.steamid.mod.^ | String]): js.Promise[Unit] = js.native
  def removeAuthorizedBorrowers(
    borrowerssteamID: js.Array[typings.steamid.mod.^ | String],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  def removeFriend(steamID: String): Unit = js.native
  /**
    * Remove a friend from your friends list (or decline an invitiation)
    * @param steamID - Either a SteamID object of the user to remove, or a string which can parse into one.
    */
  def removeFriend(steamID: typings.steamid.mod.^): Unit = js.native
  
  def removeFriendFromGroup(groupID: Any, usersteamID: String): js.Promise[Unit] = js.native
  def removeFriendFromGroup(groupID: Any, usersteamID: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Remove an user to friends group (tag)
    * @param groupID - The friends group
    * @param userSteamID - The user to remove from the friends group with, as a SteamID object or a string which can parse into one
    * @param [callback]
    */
  def removeFriendFromGroup(groupID: Any, usersteamID: typings.steamid.mod.^): js.Promise[Unit] = js.native
  def removeFriendFromGroup(
    groupID: Any,
    usersteamID: typings.steamid.mod.^,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  @JSName("removeListener")
  def removeListener_accountInfo(
    event: accountInfo,
    listener: js.Function1[
      /* args */ js.Tuple6[
        /* name */ String, 
        /* country */ String, 
        /* authedMachines */ Double, 
        /* flags */ EAccountFlags, 
        /* facebookID */ String, 
        /* facebookName */ String
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_accountLimitations(
    event: accountLimitations,
    listener: js.Function1[
      /* args */ js.Tuple4[
        /* limited */ Boolean, 
        /* communityBanned */ Boolean, 
        /* locked */ Boolean, 
        /* canInviteFriends */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_appLaunched(event: appLaunched, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_appQuit(event: appQuit, listener: js.Function1[/* args */ js.Array[/* appid */ Double], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_appUpdate(
    event: appUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_changelist(
    event: changelist,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* changenumber */ Double, 
        /* apps */ js.Array[Double], 
        /* packages */ js.Array[Double]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_communityMessages(event: communityMessages, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_disconnected(
    event: disconnected,
    listener: js.Function1[/* args */ js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_emailInfo(
    event: emailInfo,
    listener: js.Function1[/* args */ js.Tuple2[/* adress */ String, /* validated */ Boolean], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* args */ js.Array[/* err */ ErroreresultEResult], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendPersonasLoad(event: friendPersonasLoad, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendRelationship(
    event: friendRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendsGroupList(
    event: friendsGroupList,
    listener: js.Function1[/* args */ js.Array[/* groups */ Record[String, Members]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendsList(event: friendsList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_gifts(event: gifts, listener: js.Function1[/* args */ js.Array[/* gifts */ js.Array[Gift]], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_group(
    event: group,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_groupAnnouncement(
    event: groupAnnouncement,
    listener: js.Function1[
      /* args */ js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_groupEvent(
    event: groupEvent,
    listener: js.Function1[
      /* args */ js.Tuple5[
        /* sid */ typings.steamid.mod.^, 
        /* headline */ String, 
        /* date */ js.Date, 
        /* gid */ Double | String, 
        /* gameID */ Double
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_groupList(event: groupList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_groupRelationship(
    event: groupRelationship,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_licenses(
    event: licenses,
    listener: js.Function1[/* args */ js.Array[/* licenses */ js.Array[Record[String, Any]]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_lobbyInvite(
    event: lobbyInvite,
    listener: js.Function1[
      /* args */ js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_loggedOn(
    event: loggedOn,
    listener: js.Function1[
      /* args */ js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_loginKey(event: loginKey, listener: js.Function1[/* args */ js.Array[/* key */ String], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_marketingMessages(
    event: marketingMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_newComments(
    event: newComments,
    listener: js.Function1[
      /* args */ js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_newItems(event: newItems, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_nickname(
    event: nickname,
    listener: js.Function1[
      /* args */ js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_nicknameList(event: nicknameList, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_offlineMessages(
    event: offlineMessages,
    listener: js.Function1[
      /* args */ js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_ownershipCached(event: ownershipCached, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_packageUpdate(
    event: packageUpdate,
    listener: js.Function1[/* args */ js.Tuple2[/* appid */ Double, /* data */ ProductInfo], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_playingState(
    event: playingState,
    listener: js.Function1[/* args */ js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_receivedFromGC(
    event: receivedFromGC,
    listener: js.Function1[
      /* args */ js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_sentry(event: sentry, listener: js.Function1[/* args */ js.Array[/* sentry */ Buffer], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_steamGuard(
    event: steamGuard,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* domain */ String | Null, 
        /* callback */ js.Function1[/* code */ String, Unit], 
        /* lastCodeWrong */ Boolean
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_tradeOffers(event: tradeOffers, listener: js.Function1[/* args */ js.Array[/* count */ Double], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_tradeRequest(
    event: tradeRequest,
    listener: js.Function1[
      /* args */ js.Tuple2[
        /* steamID */ typings.steamid.mod.^, 
        /* respond */ js.Function1[/* accept */ Boolean, Unit]
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_tradeResponse(
    event: tradeResponse,
    listener: js.Function1[
      /* args */ js.Tuple3[
        /* steamID */ typings.steamid.mod.^, 
        /* response */ EEconTradeResponse, 
        /* restrictions */ TradeRestrictions
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_tradeStarted(
    event: tradeStarted,
    listener: js.Function1[/* args */ js.Array[/* steamID */ typings.steamid.mod.^], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_user(
    event: user,
    listener: js.Function1[
      /* args */ js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_vacBans(
    event: vacBans,
    listener: js.Function1[/* args */ js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_vanityURL(event: vanityURL, listener: js.Function1[/* args */ js.Array[/* url */ String], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_wallet(
    event: wallet,
    listener: js.Function1[
      /* args */ js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_webSession(
    event: webSession,
    listener: js.Function1[/* args */ js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]], Unit]
  ): this.type = js.native
  
  /**
    * Rename a friends group (tag)
    * @param groupID - The friends group id
    * @param newName - The new name to update the friends group with
    * @param [callback]
    */
  def renameFriendsGroup(groupID: Double, newName: String): js.Promise[Unit] = js.native
  def renameFriendsGroup(groupID: Double, newName: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Request licenses for one or more free-on-demand apps.
    * @param appIDs
    * @param [callback] - Args (err, array of granted packageids, array of granted appids)
    */
  def requestFreeLicense(appIDs: js.Array[Double]): js.Promise[GrantedAppIds] = js.native
  def requestFreeLicense(
    appIDs: js.Array[Double],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* grantedPackageIds */ js.Array[Double], 
      /* grantedAppIds */ js.Array[Double], 
      Unit
    ]
  ): js.Promise[GrantedAppIds] = js.native
  
  /**
    * Request rich presence data of one or more users for an appid.
    * @param appid - The appid to get rich presence data for
    * @param steamIDs - SteamIDs of users to request rich presence data for
    * @param [language] - Language to get localized strings in. Defaults to language passed to constructor.
    * @param [callback] - Called or resolved with 'users' property with each key being a SteamID and value being the rich presence response if received
    */
  def requestRichPresence(appid: Double, steamIDs: js.Array[typings.steamid.mod.^ | String], language: String): js.Promise[Users] = js.native
  def requestRichPresence(
    appid: Double,
    steamIDs: js.Array[typings.steamid.mod.^ | String],
    language: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Users, Unit]
  ): js.Promise[Users] = js.native
  
  def requestValidationEmail(): js.Promise[Unit] = js.native
  def requestValidationEmail(callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def respondToGroupInvite(groupsteamID: String, accept: Boolean): Unit = js.native
  /**
    * Respond to an incoming group invite.
    * @param groupSteamID - The group you were invited to, as a SteamID object or a string which can parse into one
    * @param accept - true to join the group, false to ignore invitation
    */
  def respondToGroupInvite(groupsteamID: typings.steamid.mod.^, accept: Boolean): Unit = js.native
  
  /**
    * Revoke an active quick-invite link.
    * @param linkOrToken - Either the full link, or just the token from the link
    * @param [callback]
    */
  def revokeQuickInviteLink(linkOrToken: String): js.Promise[Unit] = js.native
  def revokeQuickInviteLink(linkOrToken: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def sendToGC(appid: Double, msgType: Double, protoBufHeader: Null, payload: typings.bytebuffer.mod.^): Unit = js.native
  def sendToGC(
    appid: Double,
    msgType: Double,
    protoBufHeader: Null,
    payload: typings.bytebuffer.mod.^,
    callback: js.Function3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer, Unit]
  ): Unit = js.native
  def sendToGC(appid: Double, msgType: Double, protoBufHeader: Null, payload: Buffer): Unit = js.native
  def sendToGC(
    appid: Double,
    msgType: Double,
    protoBufHeader: Null,
    payload: Buffer,
    callback: js.Function3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer, Unit]
  ): Unit = js.native
  def sendToGC(
    appid: Double,
    msgType: Double,
    protoBufHeader: Record[String, Any],
    payload: typings.bytebuffer.mod.^
  ): Unit = js.native
  def sendToGC(
    appid: Double,
    msgType: Double,
    protoBufHeader: Record[String, Any],
    payload: typings.bytebuffer.mod.^,
    callback: js.Function3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer, Unit]
  ): Unit = js.native
  //#region "GC INTERACTION"
  // https://github.com/DoctorMcKay/node-steam-user/wiki/Game-Coordinator
  /**
    * Send a message to a GC. You should be currently "in-game" for the specified app for the message to make it.
    * @param appid - The ID of the app you want to send a GC message to
    * @param msgType - The GC-specific msg ID for this message
    * @param protoBufHeader - An object (can be empty) containing the protobuf header for this message, or null if this is not a protobuf message.
    * @param payload
    * @param [callback] - If this is a job-based message, pass a function here to get the response
    */
  def sendToGC(appid: Double, msgType: Double, protoBufHeader: Record[String, Any], payload: Buffer): Unit = js.native
  def sendToGC(
    appid: Double,
    msgType: Double,
    protoBufHeader: Record[String, Any],
    payload: Buffer,
    callback: js.Function3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer, Unit]
  ): Unit = js.native
  
  def serverQuery(conditions: String): js.Promise[ServerQueryResponse] = js.native
  def serverQuery(
    conditions: String,
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ ServerQueryResponse, Unit]
  ): js.Promise[ServerQueryResponse] = js.native
  /**
    * Query the GMS for a list of game server IPs, and their current player counts.
    * @param conditions - A filter string (https://mckay.media/hEW8A) or object
    * @param [callback]
    */
  def serverQuery(conditions: ServerQueryConditions): js.Promise[ServerQueryResponse] = js.native
  def serverQuery(
    conditions: ServerQueryConditions,
    callback: js.Function2[/* err */ js.Error | Null, /* servers */ ServerQueryResponse, Unit]
  ): js.Promise[ServerQueryResponse] = js.native
  
  def setNickname(steamID: String, nickname: String): js.Promise[Unit] = js.native
  def setNickname(steamID: String, nickname: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Set a friend's private nickname.
    * @param steamID
    * @param nickname
    * @param [callback]
    */
  def setNickname(steamID: typings.steamid.mod.^, nickname: String): js.Promise[Unit] = js.native
  def setNickname(
    steamID: typings.steamid.mod.^,
    nickname: String,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  @JSName("setOption")
  def setOption_additionalHeaders(option: additionalHeaders): Unit = js.native
  @JSName("setOption")
  def setOption_additionalHeaders(option: additionalHeaders, value: Record[String, String]): Unit = js.native
  @JSName("setOption")
  def setOption_autoRelogin(option: autoRelogin): Unit = js.native
  @JSName("setOption")
  def setOption_autoRelogin(option: autoRelogin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_changelistUpdateInterval(option: changelistUpdateInterval): Unit = js.native
  @JSName("setOption")
  def setOption_changelistUpdateInterval(option: changelistUpdateInterval, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_dataDirectory(option: dataDirectory): Unit = js.native
  @JSName("setOption")
  def setOption_dataDirectory(option: dataDirectory, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_enablePicsCache(option: enablePicsCache): Unit = js.native
  @JSName("setOption")
  def setOption_enablePicsCache(option: enablePicsCache, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_httpProxy(option: httpProxy): Unit = js.native
  @JSName("setOption")
  def setOption_httpProxy(option: httpProxy, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_language(option: language): Unit = js.native
  @JSName("setOption")
  def setOption_language(option: language, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_localAddress(option: localAddress): Unit = js.native
  @JSName("setOption")
  def setOption_localAddress(option: localAddress, value: String): Unit = js.native
  /**
    * Set a configuration option.
    * @param option
    * @param value
    */
  @JSName("setOption")
  def setOption_localPort(option: localPort): Unit = js.native
  @JSName("setOption")
  def setOption_localPort(option: localPort, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_machineIdFormat(option: machineIdFormat): Unit = js.native
  @JSName("setOption")
  def setOption_machineIdFormat(option: machineIdFormat, value: js.Tuple3[String, String, String]): Unit = js.native
  @JSName("setOption")
  def setOption_machineIdType(option: machineIdType): Unit = js.native
  @JSName("setOption")
  def setOption_machineIdType(option: machineIdType, value: EMachineIDType): Unit = js.native
  @JSName("setOption")
  def setOption_ownershipFilter(option: ownershipFilter): Unit = js.native
  @JSName("setOption")
  def setOption_ownershipFilter(option: ownershipFilter, value: OwnsFilterFunction): Unit = js.native
  @JSName("setOption")
  def setOption_ownershipFilter(option: ownershipFilter, value: OwnsFilterObject): Unit = js.native
  @JSName("setOption")
  def setOption_picsCacheAll(option: picsCacheAll): Unit = js.native
  @JSName("setOption")
  def setOption_picsCacheAll(option: picsCacheAll, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_protocol(option: protocol): Unit = js.native
  @JSName("setOption")
  def setOption_protocol(option: protocol, value: EConnectionProtocol): Unit = js.native
  @JSName("setOption")
  def setOption_saveAppTickets(option: saveAppTickets): Unit = js.native
  @JSName("setOption")
  def setOption_saveAppTickets(option: saveAppTickets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_singleSentryfile(option: singleSentryfile): Unit = js.native
  @JSName("setOption")
  def setOption_singleSentryfile(option: singleSentryfile, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_webCompatibilityMode(option: webCompatibilityMode): Unit = js.native
  @JSName("setOption")
  def setOption_webCompatibilityMode(option: webCompatibilityMode, value: Boolean): Unit = js.native
  
  /**
    * Set one or more configuration options
    * @param options
    */
  def setOptions(options: Options): Unit = js.native
  
  /**
    * Set your persona online state and optionally name.
    * @param state - Your new online state
    * @param [name] - Optional. Set a new profile name.
    */
  def setPersona(state: EPersonaState): Unit = js.native
  def setPersona(state: EPersonaState, name: String): Unit = js.native
  
  /**
    * Change your current profile background.
    * @param backgroundAssetID
    * @param [callback]
    */
  def setProfileBackground(backgroundAssetID: Double): js.Promise[Unit] = js.native
  def setProfileBackground(backgroundAssetID: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Set a sentry file
    * @param sentry Binary Sentry File
    */
  def setSentry(): Unit = js.native
  def setSentry(sentry: Buffer): Unit = js.native
  
  /**
    * Set your current UI mode (displays next to your Steam online status in friends)
    * @param mode - Your new UI mode
    */
  def setUIMode(mode: EClientUIMode): Unit = js.native
  
  /**
    * `null` if not connected, a `SteamID` containing your SteamID otherwise.
    */
  var steamID: typings.steamid.mod.^ | Null = js.native
  
  /**
    * The FileManager instance used by the SteamUser.
    */
  var storage: typings.fileManager.mod.^ = js.native
  
  def trade(steamID: String): Unit = js.native
  def trade(steamID: typings.steamid.mod.^): Unit = js.native
  
  def unblockUser(steamID: String): js.Promise[Unit] = js.native
  def unblockUser(steamID: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Unblock all communication with a user.
    * @param steamID - Either a SteamID object of the user to unblock, or a string which can parse into one.
    * @param [callback] - Optional. Called with an `err` parameter on completion.
    */
  def unblockUser(steamID: typings.steamid.mod.^): js.Promise[Unit] = js.native
  def unblockUser(steamID: typings.steamid.mod.^, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  // maybe specify the response further?
  /**
    * Upload some rich presence data to Steam.
    * @param appid
    * @param richPresence
    */
  def uploadRichPresence(appid: Double, richPresence: Record[String, String]): Unit = js.native
  
  /**
    * An object containing persona data about all Steam users we've encountered or requested data for.
    * Key are 64-bit SteamIDs, and values are identical to the objects received in the user event.
    * This property may not be updated unless you set your instance to online.
    */
  var users: Record[String, Any] = js.native
  
  /**
    * An object containing information about your account's VAC bans. `null` until `vacBans` is emitted.
    */
  var vac: Appids | Null = js.native
  
  /**
    * Only defined if you're currently logged on. This is your vanity URL (the part that goes after `/id/` in your profile URL). Falsy if you don't have one.
    */
  var vanityURL: String | Null = js.native
  
  /**
    * An object containing information about your Steam Wallet. `null` until `wallet` is emitted.
    */
  var wallet: Balance | Null = js.native
  
  def webLogOn(): Unit = js.native
}
