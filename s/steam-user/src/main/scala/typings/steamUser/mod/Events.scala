package typings.steamUser.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.steamUser.anon.ErroreresultEResult
import typings.steamUser.anon.Flags
import typings.steamUser.anon.Members
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "Events"
trait Events extends StObject {
  
  var accountInfo: js.Tuple6[
    /* name */ String, 
    /* country */ String, 
    /* authedMachines */ Double, 
    /* flags */ EAccountFlags, 
    /* facebookID */ String, 
    /* facebookName */ String
  ]
  
  var accountLimitations: js.Tuple4[
    /* limited */ Boolean, 
    /* communityBanned */ Boolean, 
    /* locked */ Boolean, 
    /* canInviteFriends */ Boolean
  ]
  
  var appLaunched: js.Array[/* appid */ Double]
  
  var appQuit: js.Array[/* appid */ Double]
  
  var appUpdate: js.Tuple2[/* appid */ Double, /* data */ ProductInfo]
  
  var changelist: js.Tuple3[
    /* changenumber */ Double, 
    /* apps */ js.Array[Double], 
    /* packages */ js.Array[Double]
  ]
  
  var communityMessages: js.Array[/* count */ Double]
  
  var disconnected: js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]]
  
  var emailInfo: js.Tuple2[/* adress */ String, /* validated */ Boolean]
  
  var error: js.Array[/* err */ ErroreresultEResult]
  
  var friendPersonasLoad: js.Array[Any]
  
  // not sure
  var friendRelationship: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship]
  
  var friendsGroupList: js.Array[/* groups */ Record[String, Members]]
  
  var friendsList: js.Array[Any]
  
  var gifts: js.Array[/* gifts */ js.Array[Gift]]
  
  var group: js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]]
  
  // not sure
  var groupAnnouncement: js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String]
  
  var groupEvent: js.Tuple5[
    /* sid */ typings.steamid.mod.^, 
    /* headline */ String, 
    /* date */ js.Date, 
    /* gid */ Double | String, 
    /* gameID */ Double
  ]
  
  var groupList: js.Array[Any]
  
  var groupRelationship: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship]
  
  var licenses: js.Array[/* licenses */ js.Array[Record[String, Any]]]
  
  var lobbyInvite: js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^]
  
  var loggedOn: js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]]
  
  var loginKey: js.Array[/* key */ String]
  
  var marketingMessages: js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]]
  
  var newComments: js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double]
  
  var newItems: js.Array[/* count */ Double]
  
  var nickname: js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null]
  
  var nicknameList: js.Array[Any]
  
  var offlineMessages: js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]]
  
  var ownershipCached: js.Array[Any]
  
  var packageUpdate: js.Tuple2[/* appid */ Double, /* data */ ProductInfo]
  
  var playingState: js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double]
  
  var receivedFromGC: js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer]
  
  var sentry: js.Array[/* sentry */ Buffer]
  
  var steamGuard: js.Tuple3[
    /* domain */ String | Null, 
    /* callback */ js.Function1[/* code */ String, Unit], 
    /* lastCodeWrong */ Boolean
  ]
  
  var tradeOffers: js.Array[/* count */ Double]
  
  var tradeRequest: js.Tuple2[
    /* steamID */ typings.steamid.mod.^, 
    /* respond */ js.Function1[/* accept */ Boolean, Unit]
  ]
  
  var tradeResponse: js.Tuple3[
    /* steamID */ typings.steamid.mod.^, 
    /* response */ EEconTradeResponse, 
    /* restrictions */ TradeRestrictions
  ]
  
  var tradeStarted: js.Array[/* steamID */ typings.steamid.mod.^]
  
  var user: js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]]
  
  var vacBans: js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]]
  
  var vanityURL: js.Array[/* url */ String]
  
  var wallet: js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double]
  
  var webSession: js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]]
}
object Events {
  
  inline def apply(
    accountInfo: js.Tuple6[
      /* name */ String, 
      /* country */ String, 
      /* authedMachines */ Double, 
      /* flags */ EAccountFlags, 
      /* facebookID */ String, 
      /* facebookName */ String
    ],
    accountLimitations: js.Tuple4[
      /* limited */ Boolean, 
      /* communityBanned */ Boolean, 
      /* locked */ Boolean, 
      /* canInviteFriends */ Boolean
    ],
    appLaunched: js.Array[/* appid */ Double],
    appQuit: js.Array[/* appid */ Double],
    appUpdate: js.Tuple2[/* appid */ Double, /* data */ ProductInfo],
    changelist: js.Tuple3[
      /* changenumber */ Double, 
      /* apps */ js.Array[Double], 
      /* packages */ js.Array[Double]
    ],
    communityMessages: js.Array[/* count */ Double],
    disconnected: js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]],
    emailInfo: js.Tuple2[/* adress */ String, /* validated */ Boolean],
    error: js.Array[/* err */ ErroreresultEResult],
    friendPersonasLoad: js.Array[Any],
    friendRelationship: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship],
    friendsGroupList: js.Array[/* groups */ Record[String, Members]],
    friendsList: js.Array[Any],
    gifts: js.Array[/* gifts */ js.Array[Gift]],
    group: js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]],
    groupAnnouncement: js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String],
    groupEvent: js.Tuple5[
      /* sid */ typings.steamid.mod.^, 
      /* headline */ String, 
      /* date */ js.Date, 
      /* gid */ Double | String, 
      /* gameID */ Double
    ],
    groupList: js.Array[Any],
    groupRelationship: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship],
    licenses: js.Array[/* licenses */ js.Array[Record[String, Any]]],
    lobbyInvite: js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^],
    loggedOn: js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]],
    loginKey: js.Array[/* key */ String],
    marketingMessages: js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]],
    newComments: js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double],
    newItems: js.Array[/* count */ Double],
    nickname: js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null],
    nicknameList: js.Array[Any],
    offlineMessages: js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]],
    ownershipCached: js.Array[Any],
    packageUpdate: js.Tuple2[/* appid */ Double, /* data */ ProductInfo],
    playingState: js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double],
    receivedFromGC: js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer],
    sentry: js.Array[/* sentry */ Buffer],
    steamGuard: js.Tuple3[
      /* domain */ String | Null, 
      /* callback */ js.Function1[/* code */ String, Unit], 
      /* lastCodeWrong */ Boolean
    ],
    tradeOffers: js.Array[/* count */ Double],
    tradeRequest: js.Tuple2[
      /* steamID */ typings.steamid.mod.^, 
      /* respond */ js.Function1[/* accept */ Boolean, Unit]
    ],
    tradeResponse: js.Tuple3[
      /* steamID */ typings.steamid.mod.^, 
      /* response */ EEconTradeResponse, 
      /* restrictions */ TradeRestrictions
    ],
    tradeStarted: js.Array[/* steamID */ typings.steamid.mod.^],
    user: js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]],
    vacBans: js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]],
    vanityURL: js.Array[/* url */ String],
    wallet: js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double],
    webSession: js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]]
  ): Events = {
    val __obj = js.Dynamic.literal(accountInfo = accountInfo.asInstanceOf[js.Any], accountLimitations = accountLimitations.asInstanceOf[js.Any], appLaunched = appLaunched.asInstanceOf[js.Any], appQuit = appQuit.asInstanceOf[js.Any], appUpdate = appUpdate.asInstanceOf[js.Any], changelist = changelist.asInstanceOf[js.Any], communityMessages = communityMessages.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], emailInfo = emailInfo.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], friendPersonasLoad = friendPersonasLoad.asInstanceOf[js.Any], friendRelationship = friendRelationship.asInstanceOf[js.Any], friendsGroupList = friendsGroupList.asInstanceOf[js.Any], friendsList = friendsList.asInstanceOf[js.Any], gifts = gifts.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupAnnouncement = groupAnnouncement.asInstanceOf[js.Any], groupEvent = groupEvent.asInstanceOf[js.Any], groupList = groupList.asInstanceOf[js.Any], groupRelationship = groupRelationship.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], lobbyInvite = lobbyInvite.asInstanceOf[js.Any], loggedOn = loggedOn.asInstanceOf[js.Any], loginKey = loginKey.asInstanceOf[js.Any], marketingMessages = marketingMessages.asInstanceOf[js.Any], newComments = newComments.asInstanceOf[js.Any], newItems = newItems.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], nicknameList = nicknameList.asInstanceOf[js.Any], offlineMessages = offlineMessages.asInstanceOf[js.Any], ownershipCached = ownershipCached.asInstanceOf[js.Any], packageUpdate = packageUpdate.asInstanceOf[js.Any], playingState = playingState.asInstanceOf[js.Any], receivedFromGC = receivedFromGC.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], steamGuard = steamGuard.asInstanceOf[js.Any], tradeOffers = tradeOffers.asInstanceOf[js.Any], tradeRequest = tradeRequest.asInstanceOf[js.Any], tradeResponse = tradeResponse.asInstanceOf[js.Any], tradeStarted = tradeStarted.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vacBans = vacBans.asInstanceOf[js.Any], vanityURL = vanityURL.asInstanceOf[js.Any], wallet = wallet.asInstanceOf[js.Any], webSession = webSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setAccountInfo(
      value: js.Tuple6[
          /* name */ String, 
          /* country */ String, 
          /* authedMachines */ Double, 
          /* flags */ EAccountFlags, 
          /* facebookID */ String, 
          /* facebookName */ String
        ]
    ): Self = StObject.set(x, "accountInfo", value.asInstanceOf[js.Any])
    
    inline def setAccountLimitations(
      value: js.Tuple4[
          /* limited */ Boolean, 
          /* communityBanned */ Boolean, 
          /* locked */ Boolean, 
          /* canInviteFriends */ Boolean
        ]
    ): Self = StObject.set(x, "accountLimitations", value.asInstanceOf[js.Any])
    
    inline def setAppLaunched(value: js.Array[/* appid */ Double]): Self = StObject.set(x, "appLaunched", value.asInstanceOf[js.Any])
    
    inline def setAppLaunchedVarargs(value: (/* appid */ Double)*): Self = StObject.set(x, "appLaunched", js.Array(value*))
    
    inline def setAppQuit(value: js.Array[/* appid */ Double]): Self = StObject.set(x, "appQuit", value.asInstanceOf[js.Any])
    
    inline def setAppQuitVarargs(value: (/* appid */ Double)*): Self = StObject.set(x, "appQuit", js.Array(value*))
    
    inline def setAppUpdate(value: js.Tuple2[/* appid */ Double, /* data */ ProductInfo]): Self = StObject.set(x, "appUpdate", value.asInstanceOf[js.Any])
    
    inline def setChangelist(
      value: js.Tuple3[
          /* changenumber */ Double, 
          /* apps */ js.Array[Double], 
          /* packages */ js.Array[Double]
        ]
    ): Self = StObject.set(x, "changelist", value.asInstanceOf[js.Any])
    
    inline def setCommunityMessages(value: js.Array[/* count */ Double]): Self = StObject.set(x, "communityMessages", value.asInstanceOf[js.Any])
    
    inline def setCommunityMessagesVarargs(value: (/* count */ Double)*): Self = StObject.set(x, "communityMessages", js.Array(value*))
    
    inline def setDisconnected(value: js.Tuple2[/* eresult */ EResult, /* msg */ js.UndefOr[String]]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    inline def setEmailInfo(value: js.Tuple2[/* adress */ String, /* validated */ Boolean]): Self = StObject.set(x, "emailInfo", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Array[/* err */ ErroreresultEResult]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorVarargs(value: (/* err */ ErroreresultEResult)*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setFriendPersonasLoad(value: js.Array[Any]): Self = StObject.set(x, "friendPersonasLoad", value.asInstanceOf[js.Any])
    
    inline def setFriendPersonasLoadVarargs(value: Any*): Self = StObject.set(x, "friendPersonasLoad", js.Array(value*))
    
    inline def setFriendRelationship(value: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EFriendRelationship]): Self = StObject.set(x, "friendRelationship", value.asInstanceOf[js.Any])
    
    inline def setFriendsGroupList(value: js.Array[/* groups */ Record[String, Members]]): Self = StObject.set(x, "friendsGroupList", value.asInstanceOf[js.Any])
    
    inline def setFriendsGroupListVarargs(value: (/* groups */ Record[String, Members])*): Self = StObject.set(x, "friendsGroupList", js.Array(value*))
    
    inline def setFriendsList(value: js.Array[Any]): Self = StObject.set(x, "friendsList", value.asInstanceOf[js.Any])
    
    inline def setFriendsListVarargs(value: Any*): Self = StObject.set(x, "friendsList", js.Array(value*))
    
    inline def setGifts(value: js.Array[/* gifts */ js.Array[Gift]]): Self = StObject.set(x, "gifts", value.asInstanceOf[js.Any])
    
    inline def setGiftsVarargs(value: (/* gifts */ js.Array[Gift])*): Self = StObject.set(x, "gifts", js.Array(value*))
    
    inline def setGroup(value: js.Tuple2[/* sid */ typings.steamid.mod.^, /* group */ Record[String, Any]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupAnnouncement(
      value: js.Tuple3[/* sid */ typings.steamid.mod.^, /* headline */ String, /* gid */ Double | String]
    ): Self = StObject.set(x, "groupAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setGroupEvent(
      value: js.Tuple5[
          /* sid */ typings.steamid.mod.^, 
          /* headline */ String, 
          /* date */ js.Date, 
          /* gid */ Double | String, 
          /* gameID */ Double
        ]
    ): Self = StObject.set(x, "groupEvent", value.asInstanceOf[js.Any])
    
    inline def setGroupList(value: js.Array[Any]): Self = StObject.set(x, "groupList", value.asInstanceOf[js.Any])
    
    inline def setGroupListVarargs(value: Any*): Self = StObject.set(x, "groupList", js.Array(value*))
    
    inline def setGroupRelationship(value: js.Tuple2[/* sid */ typings.steamid.mod.^, /* relationship */ EClanRelationship]): Self = StObject.set(x, "groupRelationship", value.asInstanceOf[js.Any])
    
    inline def setLicenses(value: js.Array[/* licenses */ js.Array[Record[String, Any]]]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesVarargs(value: (/* licenses */ js.Array[Record[String, Any]])*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setLobbyInvite(value: js.Tuple2[/* inviterID */ typings.steamid.mod.^, /* lobbyID */ typings.steamid.mod.^]): Self = StObject.set(x, "lobbyInvite", value.asInstanceOf[js.Any])
    
    inline def setLoggedOn(value: js.Tuple2[/* details */ Record[String, Any], /* parental */ Record[String, Any]]): Self = StObject.set(x, "loggedOn", value.asInstanceOf[js.Any])
    
    inline def setLoginKey(value: js.Array[/* key */ String]): Self = StObject.set(x, "loginKey", value.asInstanceOf[js.Any])
    
    inline def setLoginKeyVarargs(value: (/* key */ String)*): Self = StObject.set(x, "loginKey", js.Array(value*))
    
    inline def setMarketingMessages(value: js.Tuple2[/* timestamp */ js.Date, /* messages */ js.Array[Flags]]): Self = StObject.set(x, "marketingMessages", value.asInstanceOf[js.Any])
    
    inline def setNewComments(value: js.Tuple3[/* count */ Double, /* myItems */ Double, /* discussions */ Double]): Self = StObject.set(x, "newComments", value.asInstanceOf[js.Any])
    
    inline def setNewItems(value: js.Array[/* count */ Double]): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
    
    inline def setNewItemsVarargs(value: (/* count */ Double)*): Self = StObject.set(x, "newItems", js.Array(value*))
    
    inline def setNickname(value: js.Tuple2[/* steamID */ typings.steamid.mod.^, /* newNickname */ String | Null]): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameList(value: js.Array[Any]): Self = StObject.set(x, "nicknameList", value.asInstanceOf[js.Any])
    
    inline def setNicknameListVarargs(value: Any*): Self = StObject.set(x, "nicknameList", js.Array(value*))
    
    inline def setOfflineMessages(value: js.Tuple2[/* count */ Double, /* friends */ js.Array[typings.steamid.mod.^]]): Self = StObject.set(x, "offlineMessages", value.asInstanceOf[js.Any])
    
    inline def setOwnershipCached(value: js.Array[Any]): Self = StObject.set(x, "ownershipCached", value.asInstanceOf[js.Any])
    
    inline def setOwnershipCachedVarargs(value: Any*): Self = StObject.set(x, "ownershipCached", js.Array(value*))
    
    inline def setPackageUpdate(value: js.Tuple2[/* appid */ Double, /* data */ ProductInfo]): Self = StObject.set(x, "packageUpdate", value.asInstanceOf[js.Any])
    
    inline def setPlayingState(value: js.Tuple2[/* blocked */ Boolean, /* playingApp */ Double]): Self = StObject.set(x, "playingState", value.asInstanceOf[js.Any])
    
    inline def setReceivedFromGC(value: js.Tuple3[/* appid */ Double, /* msgType */ Double, /* payload */ Buffer]): Self = StObject.set(x, "receivedFromGC", value.asInstanceOf[js.Any])
    
    inline def setSentry(value: js.Array[/* sentry */ Buffer]): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
    
    inline def setSentryVarargs(value: (/* sentry */ Buffer)*): Self = StObject.set(x, "sentry", js.Array(value*))
    
    inline def setSteamGuard(
      value: js.Tuple3[
          /* domain */ String | Null, 
          /* callback */ js.Function1[/* code */ String, Unit], 
          /* lastCodeWrong */ Boolean
        ]
    ): Self = StObject.set(x, "steamGuard", value.asInstanceOf[js.Any])
    
    inline def setTradeOffers(value: js.Array[/* count */ Double]): Self = StObject.set(x, "tradeOffers", value.asInstanceOf[js.Any])
    
    inline def setTradeOffersVarargs(value: (/* count */ Double)*): Self = StObject.set(x, "tradeOffers", js.Array(value*))
    
    inline def setTradeRequest(
      value: js.Tuple2[
          /* steamID */ typings.steamid.mod.^, 
          /* respond */ js.Function1[/* accept */ Boolean, Unit]
        ]
    ): Self = StObject.set(x, "tradeRequest", value.asInstanceOf[js.Any])
    
    inline def setTradeResponse(
      value: js.Tuple3[
          /* steamID */ typings.steamid.mod.^, 
          /* response */ EEconTradeResponse, 
          /* restrictions */ TradeRestrictions
        ]
    ): Self = StObject.set(x, "tradeResponse", value.asInstanceOf[js.Any])
    
    inline def setTradeStarted(value: js.Array[/* steamID */ typings.steamid.mod.^]): Self = StObject.set(x, "tradeStarted", value.asInstanceOf[js.Any])
    
    inline def setTradeStartedVarargs(value: (/* steamID */ typings.steamid.mod.^)*): Self = StObject.set(x, "tradeStarted", js.Array(value*))
    
    inline def setUser(value: js.Tuple2[/* sid */ typings.steamid.mod.^, /* user */ Record[String, Any]]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVacBans(value: js.Tuple2[/* numBans */ Double, /* appids */ js.Array[Double]]): Self = StObject.set(x, "vacBans", value.asInstanceOf[js.Any])
    
    inline def setVanityURL(value: js.Array[/* url */ String]): Self = StObject.set(x, "vanityURL", value.asInstanceOf[js.Any])
    
    inline def setVanityURLVarargs(value: (/* url */ String)*): Self = StObject.set(x, "vanityURL", js.Array(value*))
    
    inline def setWallet(value: js.Tuple3[/* hasWallet */ Boolean, /* currency */ ECurrencyCode, /* balance */ Double]): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWebSession(value: js.Tuple2[/* sessionID */ String, /* cookies */ js.Array[String]]): Self = StObject.set(x, "webSession", value.asInstanceOf[js.Any])
  }
}
