package typings.smooch

import typings.smooch.smoochStrings.button
import typings.smooch.smoochStrings.localStorage
import typings.smooch.smoochStrings.sessionStorage
import typings.smooch.smoochStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  /**
    * An auth code for linking to an existing conversation
    */
  var authCode: js.UndefOr[String] = js.undefined
  
  /**
    * A background image url for the conversation. Image will be tiled to fit the window.
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Choose the storage type to use for storing user identity in the browser. Must be either localStorage or sessionStorage.
    * @default 'localStorage'
    */
  var browserStorage: js.UndefOr[localStorage | sessionStorage] = js.undefined
  
  /**
    * A custom business icon url. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
    */
  var businessIconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A custom business name.
    */
  var businessName: js.UndefOr[String] = js.undefined
  
  /**
    * When the displayStyle is button, you have the option of specifying the button height.
    * @default '58px'
    */
  var buttonHeight: js.UndefOr[String] = js.undefined
  
  /**
    * When the displayStyle is button, you have the option of selecting your own button icon. The image must be at least 200 x 200 pixels and must be in either JPG, PNG, or GIF format.
    */
  var buttonIconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * When the displayStyle is button, you have the option of specifying the button width.
    * @default '58px'
    */
  var buttonWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Allows users to view their list of conversations.
    * @default true
    */
  var canUserSeeConversationList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Colors used in the Web Messenger UI.
    */
  var customColors: js.UndefOr[CustomColors] = js.undefined
  
  /**
    * Strings used in the Web Messenger UI. You can use these to either customize the text or translate it. Note: Some strings include variables (surrounded by {}) which must remain in your
    * customized text.
    */
  var customText: js.UndefOr[CustomText] = js.undefined
  
  /**
    * Sets a delegate on the conversation.
    */
  var delegate: js.UndefOr[Delegate] = js.undefined
  
  /**
    * Choose how the messenger will appear on your website.
    * @default 'button'
    */
  var displayStyle: js.UndefOr[button | tab] = js.undefined
  
  /**
    * Tells the widget it will be embedded.
    * @default false
    */
  var embedded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User's external id, which can be passed in init() as an alternative to login()
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * When enabled, the introduction pane will be pinned at the top of the conversation instead of scrolling with it.
    * @default false
    */
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the image upload feature.
    * @deprecated use menuItems.imageUpload; if this option is false, it will disable menuItems.imageUpload and menuItems.fileUpload
    * @default true
    */
  var imageUploadEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Your integration id
    */
  var integrationId: String
  
  /**
    * Array of integration IDs. When set, only integrations from this list will be displayed. If an empty array is used, no integrations will be displayed. Note: Listing an integration in the
    * array doesn't guarantee that it will be displayed in the Web Messenger.
    */
  var integrationOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User's authentication token, which can be passed in init() as an alternative to login()
    */
  var jwt: js.UndefOr[String] = js.undefined
  
  /**
    * Locale used for date formatting using the <language>-<COUNTRY> format. Language codes can be found [here](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) and country codes
    * [here](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    * Note 1: The country part is optional, and if a country is either not recognized or supported, it will fallback to using the generic language. If the language isn't supported, it will
    * fallback to en-US.
    * Note 2: this is only used for date formatting and doesn't provide built-in translations for Web Messenger. Refer to the
    * [documentation](https://docs.smooch.io/guide/web-messenger/#strings-customization) for how to handle translations.
    * @default 'en-US'
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Choose menu items.
    */
  var menuItems: js.UndefOr[MenuItems] = js.undefined
  
  /**
    * Enables displaying a prompt to new users after their first message to suggest linking their chat instance with their other 3rd-party apps.
    * @default true
    */
  var notificationChannelPromptEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables automatically capturing a user's name and email via a form before the start of a conversation. Disables the chat input until the form has been submitted.
    */
  var prechatCapture: js.UndefOr[PrechatCapture] = js.undefined
  
  /**
    * Enables the sound notification for new messages
    * @default true
    */
  var soundNotificationEnabled: js.UndefOr[Boolean] = js.undefined
}
object InitOptions {
  
  inline def apply(integrationId: String): InitOptions = {
    val __obj = js.Dynamic.literal(integrationId = integrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  extension [Self <: InitOptions](x: Self) {
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
    
    inline def setBrowserStorage(value: localStorage | sessionStorage): Self = StObject.set(x, "browserStorage", value.asInstanceOf[js.Any])
    
    inline def setBrowserStorageUndefined: Self = StObject.set(x, "browserStorage", js.undefined)
    
    inline def setBusinessIconUrl(value: String): Self = StObject.set(x, "businessIconUrl", value.asInstanceOf[js.Any])
    
    inline def setBusinessIconUrlUndefined: Self = StObject.set(x, "businessIconUrl", js.undefined)
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    inline def setButtonHeight(value: String): Self = StObject.set(x, "buttonHeight", value.asInstanceOf[js.Any])
    
    inline def setButtonHeightUndefined: Self = StObject.set(x, "buttonHeight", js.undefined)
    
    inline def setButtonIconUrl(value: String): Self = StObject.set(x, "buttonIconUrl", value.asInstanceOf[js.Any])
    
    inline def setButtonIconUrlUndefined: Self = StObject.set(x, "buttonIconUrl", js.undefined)
    
    inline def setButtonWidth(value: String): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
    
    inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
    
    inline def setCanUserSeeConversationList(value: Boolean): Self = StObject.set(x, "canUserSeeConversationList", value.asInstanceOf[js.Any])
    
    inline def setCanUserSeeConversationListUndefined: Self = StObject.set(x, "canUserSeeConversationList", js.undefined)
    
    inline def setCustomColors(value: CustomColors): Self = StObject.set(x, "customColors", value.asInstanceOf[js.Any])
    
    inline def setCustomColorsUndefined: Self = StObject.set(x, "customColors", js.undefined)
    
    inline def setCustomText(value: CustomText): Self = StObject.set(x, "customText", value.asInstanceOf[js.Any])
    
    inline def setCustomTextUndefined: Self = StObject.set(x, "customText", js.undefined)
    
    inline def setDelegate(value: Delegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDisplayStyle(value: button | tab): Self = StObject.set(x, "displayStyle", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyleUndefined: Self = StObject.set(x, "displayStyle", js.undefined)
    
    inline def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedUndefined: Self = StObject.set(x, "embedded", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setImageUploadEnabled(value: Boolean): Self = StObject.set(x, "imageUploadEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageUploadEnabledUndefined: Self = StObject.set(x, "imageUploadEnabled", js.undefined)
    
    inline def setIntegrationId(value: String): Self = StObject.set(x, "integrationId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationOrder(value: js.Array[String]): Self = StObject.set(x, "integrationOrder", value.asInstanceOf[js.Any])
    
    inline def setIntegrationOrderUndefined: Self = StObject.set(x, "integrationOrder", js.undefined)
    
    inline def setIntegrationOrderVarargs(value: String*): Self = StObject.set(x, "integrationOrder", js.Array(value*))
    
    inline def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMenuItems(value: MenuItems): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    inline def setNotificationChannelPromptEnabled(value: Boolean): Self = StObject.set(x, "notificationChannelPromptEnabled", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelPromptEnabledUndefined: Self = StObject.set(x, "notificationChannelPromptEnabled", js.undefined)
    
    inline def setPrechatCapture(value: PrechatCapture): Self = StObject.set(x, "prechatCapture", value.asInstanceOf[js.Any])
    
    inline def setPrechatCaptureUndefined: Self = StObject.set(x, "prechatCapture", js.undefined)
    
    inline def setSoundNotificationEnabled(value: Boolean): Self = StObject.set(x, "soundNotificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoundNotificationEnabledUndefined: Self = StObject.set(x, "soundNotificationEnabled", js.undefined)
  }
}
