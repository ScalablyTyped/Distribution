package typings.reactNativeChannelPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ACCESS_DENIED
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NETWORK_TIMEOUT
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_AVAILABLE_VERSION
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_INITIALIZED
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.REQUIRE_PAYMENT
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SERVICE_UNDER_CONSTRUCTION
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SUCCESS
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.UNKNOWN_ERROR
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.bottom
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.left
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.right
import typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.top
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-channel-plugin", "ChannelIO")
  @js.native
  val ChannelIO: RNChannelIO = js.native
  
  trait BootConfig extends StObject {
    
    /**
      * An option for popups for bubble type of marketing messages, and in-app notifications. The unit of margin is pt (point.)
      *
      * @see https://developers.channel.io/docs/react-native-models#bubbleoption
      */
    var bubbleOption: js.UndefOr[BubbleOption] = js.undefined
    
    /**
      * An option for Channel button.
      * You can set the position and margin of the Channel button. The unit of margin is pt (point).
      *
      * @see https://developers.channel.io/docs/react-native-models#channelbuttonoption
      */
    var channelButtonOption: js.UndefOr[ChannelButtonOption] = js.undefined
    
    /**
      * Sets whether hide popups such as marketing popup and in-app notifications.
      */
    var hidePopup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A user’s language.
      * It is valid when creating a new user. The language of the user that already exists will not change.
      *
      * @see https://developers.channel.io/docs/react-native-models#language
      */
    var language: js.UndefOr[Language] = js.undefined
    
    /**
      * A HMAC-SHA256 value of memberId.
      */
    var memberHash: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier to distinguish each member user.
      */
    var memberId: js.UndefOr[String] = js.undefined
    
    /**
      * Plugin Key of Channel.
      */
    var pluginKey: String
    
    /**
      * A user’s Profile.
      *
      * @see https://developers.channel.io/docs/react-native-models#profile
      */
    var profile: js.UndefOr[Profile] = js.undefined
    
    /**
      * Sets whether to track the default event such as PageView.
      */
    var trackDefaultEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets whether to receive marketing messages via email.
      */
    var unsubscribeEmail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets whether to receive marketing messages via texting (SMS, LMS)
      */
    var unsubscribeTexting: js.UndefOr[Boolean] = js.undefined
  }
  object BootConfig {
    
    inline def apply(pluginKey: String): BootConfig = {
      val __obj = js.Dynamic.literal(pluginKey = pluginKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootConfig] (val x: Self) extends AnyVal {
      
      inline def setBubbleOption(value: BubbleOption): Self = StObject.set(x, "bubbleOption", value.asInstanceOf[js.Any])
      
      inline def setBubbleOptionUndefined: Self = StObject.set(x, "bubbleOption", js.undefined)
      
      inline def setChannelButtonOption(value: ChannelButtonOption): Self = StObject.set(x, "channelButtonOption", value.asInstanceOf[js.Any])
      
      inline def setChannelButtonOptionUndefined: Self = StObject.set(x, "channelButtonOption", js.undefined)
      
      inline def setHidePopup(value: Boolean): Self = StObject.set(x, "hidePopup", value.asInstanceOf[js.Any])
      
      inline def setHidePopupUndefined: Self = StObject.set(x, "hidePopup", js.undefined)
      
      inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMemberHash(value: String): Self = StObject.set(x, "memberHash", value.asInstanceOf[js.Any])
      
      inline def setMemberHashUndefined: Self = StObject.set(x, "memberHash", js.undefined)
      
      inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
      
      inline def setMemberIdUndefined: Self = StObject.set(x, "memberId", js.undefined)
      
      inline def setPluginKey(value: String): Self = StObject.set(x, "pluginKey", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTrackDefaultEvent(value: Boolean): Self = StObject.set(x, "trackDefaultEvent", value.asInstanceOf[js.Any])
      
      inline def setTrackDefaultEventUndefined: Self = StObject.set(x, "trackDefaultEvent", js.undefined)
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeEmailUndefined: Self = StObject.set(x, "unsubscribeEmail", js.undefined)
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTextingUndefined: Self = StObject.set(x, "unsubscribeTexting", js.undefined)
    }
  }
  
  trait BootError extends StObject {
    
    var status: NOT_INITIALIZED | NETWORK_TIMEOUT | NOT_AVAILABLE_VERSION | SERVICE_UNDER_CONSTRUCTION | REQUIRE_PAYMENT | ACCESS_DENIED | UNKNOWN_ERROR
    
    var user: Unit
  }
  object BootError {
    
    inline def apply(
      status: NOT_INITIALIZED | NETWORK_TIMEOUT | NOT_AVAILABLE_VERSION | SERVICE_UNDER_CONSTRUCTION | REQUIRE_PAYMENT | ACCESS_DENIED | UNKNOWN_ERROR,
      user: Unit
    ): BootError = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootError] (val x: Self) extends AnyVal {
      
      inline def setStatus(
        value: NOT_INITIALIZED | NETWORK_TIMEOUT | NOT_AVAILABLE_VERSION | SERVICE_UNDER_CONSTRUCTION | REQUIRE_PAYMENT | ACCESS_DENIED | UNKNOWN_ERROR
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Unit): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SUCCESS
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_INITIALIZED
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NETWORK_TIMEOUT
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_AVAILABLE_VERSION
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SERVICE_UNDER_CONSTRUCTION
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.REQUIRE_PAYMENT
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ACCESS_DENIED
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.UNKNOWN_ERROR
  */
  trait BootStatus extends StObject
  object BootStatus {
    
    inline def ACCESS_DENIED: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ACCESS_DENIED]
    
    inline def NETWORK_TIMEOUT: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NETWORK_TIMEOUT]
    
    inline def NOT_AVAILABLE_VERSION: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_AVAILABLE_VERSION = "NOT_AVAILABLE_VERSION".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_AVAILABLE_VERSION]
    
    inline def NOT_INITIALIZED: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_INITIALIZED = "NOT_INITIALIZED".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.NOT_INITIALIZED]
    
    inline def REQUIRE_PAYMENT: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.REQUIRE_PAYMENT = "REQUIRE_PAYMENT".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.REQUIRE_PAYMENT]
    
    inline def SERVICE_UNDER_CONSTRUCTION: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SERVICE_UNDER_CONSTRUCTION = "SERVICE_UNDER_CONSTRUCTION".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SERVICE_UNDER_CONSTRUCTION]
    
    inline def SUCCESS: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.SUCCESS]
    
    inline def UNKNOWN_ERROR: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.UNKNOWN_ERROR]
  }
  
  trait BootSuccess extends StObject {
    
    /**
      * The boot was successful.
      */
    var status: SUCCESS
    
    var user: User
  }
  object BootSuccess {
    
    inline def apply(user: User): BootSuccess = {
      val __obj = js.Dynamic.literal(status = "SUCCESS", user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootSuccess]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootSuccess] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: SUCCESS): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait BubbleOption extends StObject {
    
    /**
      * @default 'top'
      */
    var position: js.UndefOr[top | bottom] = js.undefined
    
    /**
      * @default 20
      */
    var yMargin: js.UndefOr[Double] = js.undefined
  }
  object BubbleOption {
    
    inline def apply(): BubbleOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BubbleOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BubbleOption] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      inline def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    }
  }
  
  trait ChannelButtonOption extends StObject {
    
    /**
      * @default 'right'
      */
    var position: js.UndefOr[right | left] = js.undefined
    
    /**
      * @default 20
      */
    var xMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 20
      */
    var yMargin: js.UndefOr[Double] = js.undefined
  }
  object ChannelButtonOption {
    
    inline def apply(): ChannelButtonOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelButtonOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelButtonOption] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: right | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
      
      inline def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
      
      inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      inline def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ko
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.jp
    - typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.en
  */
  trait Language extends StObject
  object Language {
    
    inline def en: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.en = "en".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.en]
    
    inline def jp: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.jp = "jp".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.jp]
    
    inline def ko: typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ko = "ko".asInstanceOf[typings.reactNativeChannelPlugin.reactNativeChannelPluginStrings.ko]
  }
  
  trait PopupData extends StObject {
    
    /**
      * A avatar URL of the popup.
      */
    var avatarUrl: String
    
    /**
      * A chat Id of the popup.
      */
    var chatId: String
    
    /**
      * A message which displayed on the popup.
      */
    var message: String
    
    /**
      * A name which displayed on the popup.
      */
    var name: String
  }
  object PopupData {
    
    inline def apply(avatarUrl: String, chatId: String, message: String, name: String): PopupData = {
      val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], chatId = chatId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupData] (val x: Self) extends AnyVal {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setChatId(value: String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profile
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null]] {
    
    /**
      * An avatar URL of a user.
      */
    var avatarUrl: js.UndefOr[String] = js.undefined
    
    /**
      * A email of a user.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * A mobile number of a user
      */
    var mobileNumber: js.UndefOr[String] = js.undefined
    
    /**
      * A name of a user.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Profile {
    
    inline def apply(): Profile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMobileNumber(value: String): Self = StObject.set(x, "mobileNumber", value.asInstanceOf[js.Any])
      
      inline def setMobileNumberUndefined: Self = StObject.set(x, "mobileNumber", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait RNChannelIO extends StObject {
    
    /**
      * Add tags to the user.
      *
      * @param tags Tags to add.
      *     - The maximum length is 10.
      *     - Tag cannot be duplicated.
      *     - Tag is case-insensitive (Tags are renamed to the lower-case.)
      *     - nil, list including nil, empty list, and an empty string is not allowed.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#addtags
      */
    def addTags(tags: js.Array[String]): js.Promise[UpdateUserResult] = js.native
    
    /**
      * Loads the information needed to use the SDK. After a successful boot, you are ready to use the features of SDK.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#boot
      */
    def boot(options: BootConfig): js.Promise[BootSuccess | BootError] = js.native
    
    /**
      * **Android only**
      *
      * Checks if the plugin has unhandled push notification. See push notifications for details.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#hasstoredpushnotification
      */
    def hasStoredPushNotification(): js.Promise[Boolean] = js.native
    
    /**
      * Hide Channel button on the global screen.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#hidechannelbutton
      */
    def hideChannelButton(): Unit = js.native
    
    /**
      * Hides the messenger.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#hidemessenger
      */
    def hideMessenger(): Unit = js.native
    
    /**
      * Notifies the change of the device token to Channel.
      *
      * @param token Push token
      *
      * @see https://developers.channel.io/docs/react-native-channelio#initpushtoken
      */
    def initPushToken(token: String): Unit = js.native
    
    /**
      * Checks that the SDK is in the `boot` status.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#isbooted
      */
    def isBooted(): js.Promise[Boolean] = js.native
    
    /**
      * Checks if the push payload is targeting on Channel SDK.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#ischannelpushnotification
      */
    def isChannelPushNotification(payload: Record[String, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Invoked when the count of the user’s badge is changed. Examples are the following:
      * - `boot`
      * - When the user received the messages or marketing message
      *
      * @see  https://developers.channel.io/docs/react-native-callbacks#onbadgechanged
      */
    def onBadgeChanged(): Unit = js.native
    def onBadgeChanged(callback: js.Function1[/* count */ Double, Unit]): Unit = js.native
    
    /**
      * Invoked when SDK completes creating a new chat. Examples are the following:
      * - Explicit creating chat by the user such as by click a [new Chat button]
      * - calls `openChat` with `chatId = nil`
      *
      * @see https://developers.channel.io/docs/react-native-callbacks#onchatcreated
      */
    def onChatCreated(): Unit = js.native
    def onChatCreated(callback: js.Function1[/* chatId */ String, Unit]): Unit = js.native
    
    /**
      * Invoked when Followup information is changed by the user.
      * It is not called by `ChannelIO.updateUser`. Values in dictionaries are nullable.
      *
      * @see  https://developers.channel.io/docs/react-native-callbacks#onfollowupchanged
      */
    def onFollowUpChanged(): Unit = js.native
    def onFollowUpChanged(callback: js.Function1[/* data */ Record[String, Any], Unit]): Unit = js.native
    
    /**
      * Invoked when the messenger is hidden. Examples are the following:
      * - calls `hideMessenger`
      * - calls `sleep`
      * - calls `shutdown`
      * - When the user closes messenger explicitly, such as by clicking the X button.
      *
      * @see https://developers.channel.io/docs/react-native-callbacks#onhidemessenger
      */
    def onHideMessenger(): Unit = js.native
    def onHideMessenger(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Invoked when receiving In-app message popup. Examples are the following:
      * - receive the message from the manager
      * - receive marketing message
      *
      * @see  https://developers.channel.io/docs/react-native-callbacks#onpopupdatareceived
      */
    def onPopupDataReceived(): Unit = js.native
    def onPopupDataReceived(callback: js.Function1[/* popupData */ PopupData, Unit]): Unit = js.native
    
    /**
      * Invoked when a system push notification is clicked. Call next function to use default behavior.
      * The onPushNotificationClicked callback only works for Android. A call to this function on iOS will be silently ignored.
      *
      * @see  https://developers.channel.io/docs/react-native-callbacks#onpushnotificationclicked
      */
    def onPushNotificationClicked(): Unit = js.native
    def onPushNotificationClicked(callback: js.Function2[/* chatId */ String, /* next */ js.Function0[Unit], Unit]): Unit = js.native
    
    /**
      * Invoked when the messenger is shown. Examples are the following:
      * - calls `showMessenger`
      * - calls `openChat`
      * - When the user opens messenger through Channel button
      *
      * @see https://developers.channel.io/docs/react-native-callbacks#onshowmessenger
      */
    def onShowMessenger(): Unit = js.native
    def onShowMessenger(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Invoked when the user clicks a link in the chat or clicks the link button.
      *
      * @see https://developers.channel.io/docs/react-native-callbacks#onurlclicked
      */
    def onUrlClicked(): Unit = js.native
    def onUrlClicked(callback: js.Function2[/* url */ String, /* next */ js.Function0[Unit], Unit]): Unit = js.native
    
    /**
      * Opens a Chat. You can open a new one or open an existing chat.
      *
      * @param chatId The id of chat. If chatId is invalid or nil, it will open a newly created chat.
      * @param message A filled message on the message input box. It will be valid when chatId is nil.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#openchat
      */
    def openChat(): Unit = js.native
    def openChat(chatId: String): Unit = js.native
    def openChat(chatId: String, message: String): Unit = js.native
    def openChat(chatId: Null, message: String): Unit = js.native
    def openChat(chatId: Unit, message: String): Unit = js.native
    
    /**
      * **Android only**
      *
      * Open chat according to the push data stored by receivePushNotification .
      *
      * @see https://developers.channel.io/docs/react-native-channelio#openstoredpushnotification
      */
    def openStoredPushNotification(): Unit = js.native
    
    /**
      * **Android only**
      *
      * Show push notification
      * Notifies an event that the user has received the push notification.
      *
      * @param payload
      *
      * @see https://developers.channel.io/docs/react-native-channelio#receivepushnotification
      */
    def receivePushNotification(payload: js.Object): js.Promise[Boolean] = js.native
    
    /**
      * Remove tags from the user. It Ignores if tags do not exist.
      *
      * @param tags Tags to be deleted. nil or empty strings or lists containing them are not allowed.
      * @see https://developers.channel.io/docs/react-native-channelio#removetags
      */
    def removeTags(tags: js.Array[String]): js.Promise[UpdateUserResult] = js.native
    
    /**
      * Resets the name of the screen when `track` is called.
      * The default value is the name of the ViewController or Activity calling the track.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#resetpage
      */
    def resetPage(): Unit = js.native
    
    /**
      * Sets SDK’s debug mode. If it sets true, SDK prints log messages in the console.
      *
      * @param flag Debug mode flag
      *
      * @see https://developers.channel.io/docs/react-native-channelio#setdebugmode
      */
    def setDebugMode(flag: Boolean): Unit = js.native
    
    /**
      * Sets the name of the screen when `track` is calling.
      * If you call track before setPage, it will not be reflected in the event.
      *
      * @param page The screen name when the track is called. A setPage(nil) call will literally set the page name as nil.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#setpage
      */
    def setPage(): Unit = js.native
    def setPage(page: String): Unit = js.native
    
    /**
      * Displays Channel button on the global screen.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#showchannelbutton
      */
    def showChannelButton(): Unit = js.native
    
    /**
      * Shows the messenger.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#showmessenger
      */
    def showMessenger(): Unit = js.native
    
    /**
      * Terminate connection between SDK and Channel. `shutdown` will discontinue features of the SDK will be discontinued.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#shutdown
      */
    def shutdown(): Unit = js.native
    
    /**
      * Disable all functions except receiving system push notifications and track.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#sleep
      */
    def sleep(): Unit = js.native
    
    /**
      * Track the user’s event. See event tracking for more details.
      *
      * @param eventName Event name. max length is 30
      * @param eventProperty  Event properties.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#track
      */
    def track(eventName: String): Unit = js.native
    def track(eventName: String, eventProperty: Record[String, Any]): Unit = js.native
    
    /**
      * Updates user information.
      *
      * @param data Information of the user to be updated.
      *
      * @see https://developers.channel.io/docs/react-native-channelio#updateuser
      */
    def updateUser(data: UserData): js.Promise[UpdateUserResult] = js.native
  }
  
  trait UpdateUserError
    extends StObject
       with UpdateUserResult {
    
    var error: String
    
    var user: Unit
  }
  object UpdateUserError {
    
    inline def apply(error: String, user: Unit): UpdateUserError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateUserError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateUserError] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Unit): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeChannelPlugin.mod.UpdateUserSuccess
    - typings.reactNativeChannelPlugin.mod.UpdateUserError
  */
  trait UpdateUserResult extends StObject
  object UpdateUserResult {
    
    inline def UpdateUserError(error: String, user: Unit): typings.reactNativeChannelPlugin.mod.UpdateUserError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeChannelPlugin.mod.UpdateUserError]
    }
    
    inline def UpdateUserSuccess(error: Unit, user: User): typings.reactNativeChannelPlugin.mod.UpdateUserSuccess = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeChannelPlugin.mod.UpdateUserSuccess]
    }
  }
  
  trait UpdateUserSuccess
    extends StObject
       with UpdateUserResult {
    
    var error: Unit
    
    var user: User
  }
  object UpdateUserSuccess {
    
    inline def apply(error: Unit, user: User): UpdateUserSuccess = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateUserSuccess]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateUserSuccess] (val x: Self) extends AnyVal {
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait User extends StObject {
    
    /**
      * An unread message count of the user.
      */
    var alert: Double
    
    /**
      * An avatar URL of the user.
      */
    var avatarUrl: js.UndefOr[String] = js.undefined
    
    /**
      * An identifier that Channel uses.
      */
    var id: String
    
    /**
      * A language of the user.
      *
      * @see https://developers.channel.io/docs/react-native-models#language
      */
    var language: Language
    
    /**
      * An identifier to distinguish member users. Anonymous user is null.
      */
    var memberId: js.UndefOr[String] = js.undefined
    
    /**
      * A name of the user.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * An object that contains the user’s profile.
      *
      * @see https://developers.channel.io/docs/react-native-models#profile
      */
    var profile: js.UndefOr[Profile] = js.undefined
    
    /**
      * A tag list of the user.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to receive marketing messages via texting (SMS, LMS)
      */
    var unsubscribeEmail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to receive marketing messages via email.
      */
    var unsubscribeTexting: js.UndefOr[Boolean] = js.undefined
  }
  object User {
    
    inline def apply(alert: Double, id: String, language: Language): User = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
      
      inline def setMemberIdUndefined: Self = StObject.set(x, "memberId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeEmailUndefined: Self = StObject.set(x, "unsubscribeEmail", js.undefined)
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTextingUndefined: Self = StObject.set(x, "unsubscribeTexting", js.undefined)
    }
  }
  
  trait UserData extends StObject {
    
    /**
      * A user’s language.
      *
      * @see https://developers.channel.io/docs/react-native-models#language
      */
    var language: Language
    
    /**
      * A user’s profile.
      *
      * Overwrite with profile data you add. Initialize if you set the profile value to nil.
      * @see https://developers.channel.io/docs/react-native-models#profile
      */
    var profile: js.UndefOr[Profile | Null] = js.undefined
    
    /**
      * A profile to add to the user.
      *
      * Add a new profile value it it does not exist.
      */
    var profileOnce: js.UndefOr[Profile] = js.undefined
    
    /**
      * A user’s tag list.
      *
      * Overwrite with tag data you add.
      * The maximum number is ten and is not case-sensitive.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether to receive marketing messages via email.
      */
    var unsubscribeEmail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to receive marketing messages via email.
      */
    var unsubscribeTexting: js.UndefOr[Boolean] = js.undefined
  }
  object UserData {
    
    inline def apply(language: Language): UserData = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileNull: Self = StObject.set(x, "profile", null)
      
      inline def setProfileOnce(value: Profile): Self = StObject.set(x, "profileOnce", value.asInstanceOf[js.Any])
      
      inline def setProfileOnceUndefined: Self = StObject.set(x, "profileOnce", js.undefined)
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeEmailUndefined: Self = StObject.set(x, "unsubscribeEmail", js.undefined)
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTextingUndefined: Self = StObject.set(x, "unsubscribeTexting", js.undefined)
    }
  }
}
