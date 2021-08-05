package typings.reactNativeSquareInAppPayments.mod

import typings.reactNativeSquareInAppPayments.reactNativeSquareInAppPaymentsStrings.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQIPCardEntry {
  
  @JSImport("react-native-square-in-app-payments", "SQIPCardEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called in the `onCardNonceRequestSuccess` callback. Closes the card entry form.
    * `completeCardEntry` should be called after all other callback logic is executed.
    * If callback logic makes a server call to process the supplied nonce, this method is called after getting a success response from the server.
    * If any nonce processing logic is to be executed after the card entry form is closed,
    * call completeCardEntry after getting the card nonce from the `onCardNonceRequestSuccess` cardDetails parameter.
    * @param onCardEntryComplete - The callback invoked when card entry is completed and is closed.
    */
  inline def completeCardEntry(onCardEntryComplete: CardEntryCompleteCallback): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("completeCardEntry")(onCardEntryComplete.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the customization theme for the card entry view controller in the native layer.
    * It is not necessary to call this method before starting Apple Pay. The SDK provides a default theme which can be customized to match the theme of your app.
    * @platform IOS
    * @param themeConfiguration - An object that defines the theme of an iOS card entry view controller.
    */
  inline def setIOSCardEntryTheme(themeConfiguration: ThemeIOS): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIOSCardEntryTheme")(themeConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Called in the `onCardNonceRequestSuccess` callback. Returns execution to the card entry form with an error string to be shown in the form.
    * `showCardNonceProcessingError` should be called after all other callback logic is executed.
    * If callback logic makes a server call to request a payment with the supplied nonce, this method is called after getting an error response from the server call.
    * @param errorMessage - The error message to be shown in the card entry form.
    */
  inline def showCardNonceProcessingError(errorMessage: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showCardNonceProcessingError")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def startCardEntryFlow(
    cardEntryConfig: Null,
    onCardNonceRequestSuccess: CardEntryNonceRequestSuccessCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startCardEntryFlow")(cardEntryConfig.asInstanceOf[js.Any], onCardNonceRequestSuccess.asInstanceOf[js.Any], onCardEntryCancel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  // Functions
  /**
    * Displays a full-screen card entry view.
    * The method takes one configuration object and two call back parameters which correspond to the possible results of the request.
    * @param cardEntryConfig - Configuration object for card entry behavior, pass null for default configuration
    * @param onCardNonceRequestSuccess - Invoked when card entry is completed and the SDK has processed the payment card information.
    * @param onCardEntryCancel - Invoked when card entry is canceled.
    */
  inline def startCardEntryFlow(
    cardEntryConfig: CardEntryConfig,
    onCardNonceRequestSuccess: CardEntryNonceRequestSuccessCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startCardEntryFlow")(cardEntryConfig.asInstanceOf[js.Any], onCardNonceRequestSuccess.asInstanceOf[js.Any], onCardEntryCancel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startCardEntryFlowWithBuyerVerification(
    cardEntryConfig: Null,
    onBuyerVerificationSuccess: BuyerVerificationSuccessCallback,
    onBuyerVerificationFailure: BuyerVerificationErrorCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startCardEntryFlowWithBuyerVerification")(cardEntryConfig.asInstanceOf[js.Any], onBuyerVerificationSuccess.asInstanceOf[js.Any], onBuyerVerificationFailure.asInstanceOf[js.Any], onCardEntryCancel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Displays a full-screen card entry view with buyer verification flow enabled.
    * The method takes one configuration object and three call back parameters which correspond to the possible results of the request
    * @param cardEntryConfig - Configuration object for card entry behavior, pass null for default configuration
    * @param onBuyerVerificationSuccess - Invoked when card entry with buyer verification is completed successfully.
    * @param onBuyerVerificationFailure - Invoked when card entry with buyer verification encounters errors.
    * @param onCardEntryCancel - Invoked when card entry is canceled.
    */
  inline def startCardEntryFlowWithBuyerVerification(
    cardEntryConfig: CardEntryConfig,
    onBuyerVerificationSuccess: BuyerVerificationSuccessCallback,
    onBuyerVerificationFailure: BuyerVerificationErrorCallback,
    onCardEntryCancel: CardEntryCancelCallback
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startCardEntryFlowWithBuyerVerification")(cardEntryConfig.asInstanceOf[js.Any], onBuyerVerificationSuccess.asInstanceOf[js.Any], onBuyerVerificationFailure.asInstanceOf[js.Any], onCardEntryCancel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /** Represents the result of a successful buyer verification request. */
  trait BuyerVerificationDetails extends StObject {
    
    /** Non-confidential details about the entered card, such as the brand and last four digits of the card number. */
    var card: Card
    
    /** A one-time-use payment token that can be used with the Square Connect APIs to charge the card or save the card information. */
    var nonce: String
    
    /** The token representing a verified buyer. */
    var token: String
  }
  object BuyerVerificationDetails {
    
    inline def apply(card: Card, nonce: String, token: String): BuyerVerificationDetails = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuyerVerificationDetails]
    }
    
    extension [Self <: BuyerVerificationDetails](x: Self) {
      
      inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Callback invoked when Buyer Verification flow fails.
    */
  type BuyerVerificationErrorCallback = js.Function0[Unit]
  
  /**
    * Callback invoked when Buyer Verification flow succeeds.
    * @param buyerVerificationDetails
    */
  type BuyerVerificationSuccessCallback = js.Function1[/* buyerVerificationDetails */ BuyerVerificationDetails, Unit]
  
  /**
    * Callback invoked when card entry canceled and has been closed.
    * Do not call completeCardEntry because the operation is complete and the card entry form is closed.
    */
  type CardEntryCancelCallback = js.Function0[Unit]
  
  /**
    * Callback invoked when card entry is completed and has been closed.
    */
  type CardEntryCompleteCallback = js.Function0[Unit]
  
  // Types
  trait CardEntryConfig extends StObject {
    
    /**
      * The street address lines of the contact address.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var addressLines: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Payment amount
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var amount: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates the action (Charge or Store) that will be performed onto the card after retrieving the verification token.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var buyerAction: js.UndefOr[String] = js.undefined
    
    /**
      * The city name of the contact address.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var city: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates that the customer must enter the postal code associated with their payment card. When false, the postal code field will not be displayed. Defaults to true.
      * A Postal code must be collected for processing payments for Square accounts based in the United States, Canada, and United Kingdom.
      * Disabling postal code collection in those regions will result in all credit card transactions being declined.
      */
    var collectPostalCode: Boolean
    
    /**
      * A 2-letter string containing the ISO 3166-1 country code of the contact address.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var countryCode: js.UndefOr[String] = js.undefined
    
    /**
      * ISO currency code of the payment amount.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var currencyCode: js.UndefOr[String] = js.undefined
    
    /**
      * Email address of the contact.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * Last name of the contact.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var familyName: js.UndefOr[String] = js.undefined
    
    /**
      * Given name of the contact.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var givenName: js.UndefOr[String] = js.undefined
    
    /**
      * The telephone number of the contact.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var phone: js.UndefOr[String] = js.undefined
    
    /**
      * The postal code of the contact address.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var postalCode: js.UndefOr[String] = js.undefined
    
    /**
      * The applicable administrative region (e.g., province, state) of the contact address.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * The location that is being verified against.
      * Should be specified if calling `startCardEntryFlowWithBuyerVerification` method.
      */
    var squareLocationId: js.UndefOr[String] = js.undefined
  }
  object CardEntryConfig {
    
    inline def apply(collectPostalCode: Boolean): CardEntryConfig = {
      val __obj = js.Dynamic.literal(collectPostalCode = collectPostalCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardEntryConfig]
    }
    
    extension [Self <: CardEntryConfig](x: Self) {
      
      inline def setAddressLines(value: js.Array[String]): Self = StObject.set(x, "addressLines", value.asInstanceOf[js.Any])
      
      inline def setAddressLinesUndefined: Self = StObject.set(x, "addressLines", js.undefined)
      
      inline def setAddressLinesVarargs(value: String*): Self = StObject.set(x, "addressLines", js.Array(value :_*))
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setBuyerAction(value: String): Self = StObject.set(x, "buyerAction", value.asInstanceOf[js.Any])
      
      inline def setBuyerActionUndefined: Self = StObject.set(x, "buyerAction", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCollectPostalCode(value: Boolean): Self = StObject.set(x, "collectPostalCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSquareLocationId(value: String): Self = StObject.set(x, "squareLocationId", value.asInstanceOf[js.Any])
      
      inline def setSquareLocationIdUndefined: Self = StObject.set(x, "squareLocationId", js.undefined)
    }
  }
  
  // Callbacks
  /**
    * Callback invoked when card entry is returned successfully with card details.
    * @param cardDetails - The results of a successful card entry
    */
  type CardEntryNonceRequestSuccessCallback = js.Function1[/* cardDetails */ CardDetails, Unit]
  
  trait Font extends StObject {
    
    var name: String
    
    var size: Double
  }
  object Font {
    
    inline def apply(name: String, size: Double): Font = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyboardAppearance = Light | String
  
  trait RGBAColor extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBAColor {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBAColor = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBAColor]
    }
    
    extension [Self <: RGBAColor](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /** Encapsulates options used to style the iOS native card entry view controller. */
  trait ThemeIOS extends StObject {
    
    /** The background color of the card entry view controller. */
    var backgroundColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The text color when the text is invalid. */
    var errorColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The text field font. */
    var font: js.UndefOr[Font] = js.undefined
    
    /** The fill color for text fields. */
    var foregroundColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The appearance of the keyboard. */
    var keyboardAppearance: js.UndefOr[KeyboardAppearance] = js.undefined
    
    /** The text color used to display informational messages. */
    var messageColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The text field placeholder text color. */
    var placeholderTextColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The save button font. */
    var saveButtonFont: js.UndefOr[Font] = js.undefined
    
    /** The save button text color when enabled. */
    var saveButtonTextColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The text of the entry completion button */
    var saveButtonTitle: js.UndefOr[String] = js.undefined
    
    /** The text field text color. */
    var textColor: js.UndefOr[RGBAColor] = js.undefined
    
    /** The tint color reflected in the text field cursor and submit button background color when enabled. */
    var tintColor: js.UndefOr[RGBAColor] = js.undefined
  }
  object ThemeIOS {
    
    inline def apply(): ThemeIOS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeIOS]
    }
    
    extension [Self <: ThemeIOS](x: Self) {
      
      inline def setBackgroundColor(value: RGBAColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setErrorColor(value: RGBAColor): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setForegroundColor(value: RGBAColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
      
      inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
      
      inline def setKeyboardAppearance(value: KeyboardAppearance): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
      
      inline def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
      
      inline def setMessageColor(value: RGBAColor): Self = StObject.set(x, "messageColor", value.asInstanceOf[js.Any])
      
      inline def setMessageColorUndefined: Self = StObject.set(x, "messageColor", js.undefined)
      
      inline def setPlaceholderTextColor(value: RGBAColor): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      inline def setSaveButtonFont(value: Font): Self = StObject.set(x, "saveButtonFont", value.asInstanceOf[js.Any])
      
      inline def setSaveButtonFontUndefined: Self = StObject.set(x, "saveButtonFont", js.undefined)
      
      inline def setSaveButtonTextColor(value: RGBAColor): Self = StObject.set(x, "saveButtonTextColor", value.asInstanceOf[js.Any])
      
      inline def setSaveButtonTextColorUndefined: Self = StObject.set(x, "saveButtonTextColor", js.undefined)
      
      inline def setSaveButtonTitle(value: String): Self = StObject.set(x, "saveButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setSaveButtonTitleUndefined: Self = StObject.set(x, "saveButtonTitle", js.undefined)
      
      inline def setTextColor(value: RGBAColor): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTintColor(value: RGBAColor): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
}
