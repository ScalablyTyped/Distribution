package typings.spreedlyIframeBrowser

import typings.spreedlyIframeBrowser.spreedly.InitOptions
import typings.spreedlyIframeBrowser.spreedly.SetRecacheOptions
import typings.spreedlyIframeBrowser.spreedly.SpreedlyConsoleError
import typings.spreedlyIframeBrowser.spreedly.SpreedlyError
import typings.spreedlyIframeBrowser.spreedly.SpreedlyField
import typings.spreedlyIframeBrowser.spreedly.SpreedlyFieldEventInputProperties
import typings.spreedlyIframeBrowser.spreedly.SpreedlyFieldEventType
import typings.spreedlyIframeBrowser.spreedly.SpreedlyFieldType
import typings.spreedlyIframeBrowser.spreedly.SpreedlyNumberFormat
import typings.spreedlyIframeBrowser.spreedly.SpreedlyPaymentMethod
import typings.spreedlyIframeBrowser.spreedly.TokenizeCreditCardAdditionalFieldsFirstLastNames
import typings.spreedlyIframeBrowser.spreedly.TokenizeCreditCardAdditionalFieldsFullName
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.consoleError
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errors
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.fieldEvent
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.paymentMethod
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.ready
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.recache
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.recacheReady
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new, independent, instance of the iFrame. It will be created alongside the default instance, already exposed as Spreedly.
  * @see https://docs.spreedly.com/reference/iframe/v1/#spreedlypaymentframe
  */
@js.native
trait SpreedlyPaymentFrame extends StObject {
  
  /**
    * Initialize the iFrame library. This must be the first call made to iFrame and will trigger the loading of the iFrame fields.
    * Triggers `ready` when the iFrame is ready for more configurartion.
    * @see https://docs.spreedly.com/reference/iframe/v1/#init
    *
    * @param environmentKey - The key of the Spreedly environment where the payment method should be tokenized.
    * @param options - Map of initialization options. HTML `id`s where iFrames should be rendered.
    */
  def init(environmentKey: String, options: InitOptions): Unit = js.native
  
  /**
    * Triggered when the iFrame is initialized and ready for configuration or is properly configured for recache.
    * @see https://docs.spreedly.com/reference/iframe/v1/#ready
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  def on(event: ready | recacheReady, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Triggered when a payment method is successfully tokenized or recached by Spreedly.
    * @see https://docs.spreedly.com/reference/iframe/v1/#paymentmethod
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  def on(
    event: paymentMethod | recache,
    callback: js.Function2[/* token */ String, /* paymentMethod */ SpreedlyPaymentMethod, Unit]
  ): Unit = js.native
  /**
    * Triggered when a javascript error occurs within the iFrame.
    * @see https://docs.spreedly.com/reference/iframe/v1/#consoleerror
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  @JSName("on")
  def on_consoleError(event: consoleError, callback: js.Function1[/* error */ SpreedlyConsoleError, Unit]): Unit = js.native
  /**
    * Triggered when a payment method is not successfully tokenized or recached.
    * @see https://docs.spreedly.com/reference/iframe/v1/#errors
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  @JSName("on")
  def on_errors(event: errors, callback: js.Function1[/* errors */ js.Array[SpreedlyError], Unit]): Unit = js.native
  /**
    * Triggered when an input event occurs in either iFrame field.
    * @see https://docs.spreedly.com/reference/iframe/v1/#fieldevent
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  @JSName("on")
  def on_fieldEvent(
    event: fieldEvent,
    callback: js.Function4[
      /* name */ SpreedlyField, 
      /* type */ SpreedlyFieldEventType, 
      /* activeEl */ SpreedlyField, 
      /* inputProperties */ SpreedlyFieldEventInputProperties, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Triggered when validation of the iFrame is requested.
    * @see https://docs.spreedly.com/reference/iframe/v1/#validation
    *
    * @param event - Event to listen on.
    * @param callback - Event callback.
    */
  @JSName("on")
  def on_validation(
    event: validation,
    callback: js.Function1[/* inputProperties */ SpreedlyFieldEventInputProperties, Unit]
  ): Unit = js.native
  
  /**
    * Trigger recache on existing payment method. Requires that setRecache has already been called.
    * On successful recache, the `recache` event will be triggered. On failure, the `errors` event will be triggered.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setrecache
    */
  def recache(): Unit = js.native
  
  /**
    * Reload the iFrame library. This resets and re-initializes all iFrame elements and state.
    * @see https://docs.spreedly.com/reference/iframe/v1/#reload
    */
  def reload(): Unit = js.native
  
  /**
    * Remove all event handlers currently registered via the on function.
    * @see https://docs.spreedly.com/reference/iframe/v1/#removehandlers
    */
  def removeHandlers(): Unit = js.native
  
  /**
    * Set the input type of the iFrame fields.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setfieldtype
    *
    * @param field - The iFrame field to set the type.
    * @param type - The input field type.
    */
  def setFieldType(field: SpreedlyField, `type`: SpreedlyFieldType): Unit = js.native
  
  /**
    * Style iFrame fields’ label. Although the label for each iFrame field is not displayed, it is still used by screen readers and other accessibility devices.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setlabel
    *
    * @param field - The iFrame field to set the label.
    * @param label - The label text value.
    */
  def setLabel(field: SpreedlyField, label: String): Unit = js.native
  
  /**
    * Set the card number format.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setnumberformat
    *
    * @param format - The field's number format.
    */
  def setNumberFormat(format: SpreedlyNumberFormat): Unit = js.native
  
  /**
    * Style iFrame fields’ placeholder text.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setplaceholder
    *
    * @param field - The iFrame field to set the placeholder.
    * @param placeholder - The placeholder text value
    */
  def setPlaceholder(field: SpreedlyField, placeholder: String): Unit = js.native
  
  /**
    * Configure the iFrame to operate in recache mode.
    * When iFrame has received and displayed the existing payment method information, the `recacheReady` event will be fired.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setrecache
    *
    * @param token - Token of existing payment method in Spreedly environment
    * @param options - Map of display options for existing payment method.
    */
  def setRecache(token: String, options: SetRecacheOptions): Unit = js.native
  
  /**
    * Style iFrame fields using CSS.
    * @see https://docs.spreedly.com/reference/iframe/v1/#setstyle
    *
    * @param field - The iFrame field to apply the CSS to. Can be one of number or cvv.
    * @param css - The CSS to apply. Should be vanilla CSS, constructed as a single string.
    */
  def setStyle(field: SpreedlyField, css: String): Unit = js.native
  
  def tokenizeCreditCard(additionalFields: TokenizeCreditCardAdditionalFieldsFirstLastNames): Unit = js.native
  /**
    * Trigger tokenization of the entered credit card.
    * On successful tokenization, the `paymentMethod` event will be triggered. On failure, the `errors` event will be triggered.
    * @see https://docs.spreedly.com/reference/iframe/v1/#tokenizecreditcard
    *
    * @param additionalFields - Map of additional payment method fields to store alongside tokenized card.
    */
  def tokenizeCreditCard(additionalFields: TokenizeCreditCardAdditionalFieldsFullName): Unit = js.native
  
  /**
    * Set the cursor focus to one of the iFrame fields.
    * @see https://docs.spreedly.com/reference/iframe/v1/#transferfocus
    *
    * @param field - The iFrame field to give focus to.
    */
  def transferFocus(field: SpreedlyField): Unit = js.native
  
  /**
    * Request iFrame fields to report their validation status.
    * Triggers `validation`.
    * @see https://docs.spreedly.com/reference/iframe/v1/#validate
    */
  def validate(): Unit = js.native
}
