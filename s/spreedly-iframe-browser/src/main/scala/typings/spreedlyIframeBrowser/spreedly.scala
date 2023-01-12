package typings.spreedlyIframeBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.apple_pay
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.bank_account
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cached
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.credit_card
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.google_pay
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.redacted
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.retained
import typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.third_party_token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreedly {
  
  trait InitOptions extends StObject {
    
    var cvvEl: String
    
    var numberEl: String
  }
  object InitOptions {
    
    inline def apply(cvvEl: String, numberEl: String): InitOptions = {
      val __obj = js.Dynamic.literal(cvvEl = cvvEl.asInstanceOf[js.Any], numberEl = numberEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      inline def setCvvEl(value: String): Self = StObject.set(x, "cvvEl", value.asInstanceOf[js.Any])
      
      inline def setNumberEl(value: String): Self = StObject.set(x, "numberEl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetRecacheOptions extends StObject {
    
    var card_type: SpreedlyCardType
    
    var last_four_digits: String
  }
  object SetRecacheOptions {
    
    inline def apply(card_type: SpreedlyCardType, last_four_digits: String): SetRecacheOptions = {
      val __obj = js.Dynamic.literal(card_type = card_type.asInstanceOf[js.Any], last_four_digits = last_four_digits.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetRecacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetRecacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCard_type(value: SpreedlyCardType): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
      
      inline def setLast_four_digits(value: String): Self = StObject.set(x, "last_four_digits", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr
  */
  trait SpreedlyCardType extends StObject
  object SpreedlyCardType {
    
    inline def alelo: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo = "alelo".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alelo]
    
    inline def alia: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia = "alia".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.alia]
    
    inline def american_express: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express = "american_express".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.american_express]
    
    inline def cabal: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal = "cabal".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cabal]
    
    inline def carnet: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet = "carnet".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.carnet]
    
    inline def dankort: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort = "dankort".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.dankort]
    
    inline def diners_club: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club = "diners_club".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.diners_club]
    
    inline def discover: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover = "discover".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.discover]
    
    inline def elo: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo = "elo".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.elo]
    
    inline def jcb: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb = "jcb".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.jcb]
    
    inline def maestro: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro = "maestro".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maestro]
    
    inline def master: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master = "master".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.master]
    
    inline def naranja: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja = "naranja".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.naranja]
    
    inline def olimpica: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica = "olimpica".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.olimpica]
    
    inline def sodexo: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo = "sodexo".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.sodexo]
    
    inline def visa: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa = "visa".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.visa]
    
    inline def vr: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr = "vr".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.vr]
  }
  
  trait SpreedlyConsoleError extends StObject {
    
    var col: String
    
    var line: String
    
    var msg: String
    
    var url: String
  }
  object SpreedlyConsoleError {
    
    inline def apply(col: String, line: String, msg: String, url: String): SpreedlyConsoleError = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreedlyConsoleError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpreedlyConsoleError] (val x: Self) extends AnyVal {
      
      inline def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpreedlyError extends StObject {
    
    var attribute: String
    
    var key: SpreedlyErrorKey
    
    var message: String
  }
  object SpreedlyError {
    
    inline def apply(attribute: String, key: SpreedlyErrorKey, message: String): SpreedlyError = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreedlyError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpreedlyError] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setKey(value: SpreedlyErrorKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration
  */
  trait SpreedlyErrorKey extends StObject
  object SpreedlyErrorKey {
    
    inline def errorsDotaccount_inactive: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive = "errors.account_inactive".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotaccount_inactive]
    
    inline def errorsDotblank: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank = "errors.blank".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank]
    
    inline def errorsDotblank_card_type: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type = "errors.blank_card_type".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotblank_card_type]
    
    inline def errorsDotconfiguration: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration = "errors.configuration".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotconfiguration]
    
    inline def errorsDotenvironment_key_parameter_required: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required = "errors.environment_key_parameter_required".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotenvironment_key_parameter_required]
    
    inline def errorsDotexpired: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired = "errors.expired".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotexpired]
    
    inline def errorsDotinvalid: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid = "errors.invalid".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid]
    
    inline def errorsDotinvalid_environment_key_parameter: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter = "errors.invalid_environment_key_parameter".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_environment_key_parameter]
    
    inline def errorsDotinvalid_referrer: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer = "errors.invalid_referrer".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotinvalid_referrer]
    
    inline def errorsDotunknown_referrer: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer = "errors.unknown_referrer".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.errorsDotunknown_referrer]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv
  */
  trait SpreedlyField extends StObject
  object SpreedlyField {
    
    inline def cvv: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv = "cvv".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.cvv]
    
    inline def number: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number = "number".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number]
  }
  
  trait SpreedlyFieldEventInputProperties extends StObject {
    
    var activeElement: js.UndefOr[SpreedlyField] = js.undefined
    
    var cardType: js.UndefOr[SpreedlyCardType | Null] = js.undefined
    
    var cvvLength: js.UndefOr[Double] = js.undefined
    
    var numberLength: js.UndefOr[Double] = js.undefined
    
    var validCvv: js.UndefOr[Boolean] = js.undefined
    
    var validNumber: js.UndefOr[Boolean] = js.undefined
  }
  object SpreedlyFieldEventInputProperties {
    
    inline def apply(): SpreedlyFieldEventInputProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpreedlyFieldEventInputProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpreedlyFieldEventInputProperties] (val x: Self) extends AnyVal {
      
      inline def setActiveElement(value: SpreedlyField): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
      
      inline def setActiveElementUndefined: Self = StObject.set(x, "activeElement", js.undefined)
      
      inline def setCardType(value: SpreedlyCardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setCardTypeNull: Self = StObject.set(x, "cardType", null)
      
      inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
      
      inline def setCvvLength(value: Double): Self = StObject.set(x, "cvvLength", value.asInstanceOf[js.Any])
      
      inline def setCvvLengthUndefined: Self = StObject.set(x, "cvvLength", js.undefined)
      
      inline def setNumberLength(value: Double): Self = StObject.set(x, "numberLength", value.asInstanceOf[js.Any])
      
      inline def setNumberLengthUndefined: Self = StObject.set(x, "numberLength", js.undefined)
      
      inline def setValidCvv(value: Boolean): Self = StObject.set(x, "validCvv", value.asInstanceOf[js.Any])
      
      inline def setValidCvvUndefined: Self = StObject.set(x, "validCvv", js.undefined)
      
      inline def setValidNumber(value: Boolean): Self = StObject.set(x, "validNumber", value.asInstanceOf[js.Any])
      
      inline def setValidNumberUndefined: Self = StObject.set(x, "validNumber", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab
  */
  trait SpreedlyFieldEventType extends StObject
  object SpreedlyFieldEventType {
    
    inline def blur: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur = "blur".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.blur]
    
    inline def enter: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter = "enter".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.enter]
    
    inline def escape: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape = "escape".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.escape]
    
    inline def focus: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus = "focus".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.focus]
    
    inline def input: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input = "input".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.input]
    
    inline def mouseout: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout = "mouseout".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseout]
    
    inline def mouseover: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover = "mouseover".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.mouseover]
    
    inline def shiftTab: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab = "shiftTab".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.shiftTab]
    
    inline def tab: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab = "tab".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tab]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel
  */
  trait SpreedlyFieldType extends StObject
  object SpreedlyFieldType {
    
    inline def number: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number = "number".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.number]
    
    inline def tel: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel = "tel".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.tel]
    
    inline def text: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text = "text".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat
    - typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask
  */
  trait SpreedlyNumberFormat extends StObject
  object SpreedlyNumberFormat {
    
    inline def maskedFormat: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat = "maskedFormat".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.maskedFormat]
    
    inline def prettyFormat: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat = "prettyFormat".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.prettyFormat]
    
    inline def toggleMask: typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask = "toggleMask".asInstanceOf[typings.spreedlyIframeBrowser.spreedlyIframeBrowserStrings.toggleMask]
  }
  
  // TODO: Validate this
  trait SpreedlyPaymentMethod extends StObject {
    
    var address1: String | Null
    
    var address2: String | Null
    
    var callback_url: String | Null
    
    var card_type: SpreedlyCardType
    
    var city: String | Null
    
    var company: String | Null
    
    var country: String | Null
    
    var created_at: String
    
    var data: Null
    
    var eligible_for_card_updater: Boolean
    
    var email: String | Null
    
    var errors: js.Array[Any]
    
    var fingerprint: String | Null
    
    var first_name: String | Null
    
    var first_six_digits: String | Null
    
    var full_name: String | Null
    
    var last_four_digits: String | Null
    
    var last_name: String | Null
    
    var metadata: StringDictionary[String]
    
    var month: Double | Null
    
    var number: String | Null
    
    var payment_method_type: credit_card | bank_account | apple_pay | google_pay | third_party_token
    
    var phone_number: String | Null
    
    var shipping_address1: String | Null
    
    var shipping_address2: String | Null
    
    var shipping_city: String | Null
    
    var shipping_country: String | Null
    
    var shipping_phone_number: String | Null
    
    var shipping_state: String | Null
    
    var shipping_zip: String | Null
    
    var state: String | Null
    
    var storage_state: cached | retained | redacted
    
    var test: Boolean
    
    var token: String
    
    var updated_at: String
    
    var verification_value: String | Null
    
    var year: Double | Null
    
    var zip: String | Null
  }
  object SpreedlyPaymentMethod {
    
    inline def apply(
      card_type: SpreedlyCardType,
      created_at: String,
      data: Null,
      eligible_for_card_updater: Boolean,
      errors: js.Array[Any],
      metadata: StringDictionary[String],
      payment_method_type: credit_card | bank_account | apple_pay | google_pay | third_party_token,
      storage_state: cached | retained | redacted,
      test: Boolean,
      token: String,
      updated_at: String
    ): SpreedlyPaymentMethod = {
      val __obj = js.Dynamic.literal(card_type = card_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eligible_for_card_updater = eligible_for_card_updater.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment_method_type = payment_method_type.asInstanceOf[js.Any], storage_state = storage_state.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], address1 = null, address2 = null, callback_url = null, city = null, company = null, country = null, email = null, fingerprint = null, first_name = null, first_six_digits = null, full_name = null, last_four_digits = null, last_name = null, month = null, number = null, phone_number = null, shipping_address1 = null, shipping_address2 = null, shipping_city = null, shipping_country = null, shipping_phone_number = null, shipping_state = null, shipping_zip = null, state = null, verification_value = null, year = null, zip = null)
      __obj.asInstanceOf[SpreedlyPaymentMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpreedlyPaymentMethod] (val x: Self) extends AnyVal {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Null: Self = StObject.set(x, "address1", null)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Null: Self = StObject.set(x, "address2", null)
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setCallback_urlNull: Self = StObject.set(x, "callback_url", null)
      
      inline def setCard_type(value: SpreedlyCardType): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityNull: Self = StObject.set(x, "city", null)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyNull: Self = StObject.set(x, "company", null)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryNull: Self = StObject.set(x, "country", null)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEligible_for_card_updater(value: Boolean): Self = StObject.set(x, "eligible_for_card_updater", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameNull: Self = StObject.set(x, "first_name", null)
      
      inline def setFirst_six_digits(value: String): Self = StObject.set(x, "first_six_digits", value.asInstanceOf[js.Any])
      
      inline def setFirst_six_digitsNull: Self = StObject.set(x, "first_six_digits", null)
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setFull_nameNull: Self = StObject.set(x, "full_name", null)
      
      inline def setLast_four_digits(value: String): Self = StObject.set(x, "last_four_digits", value.asInstanceOf[js.Any])
      
      inline def setLast_four_digitsNull: Self = StObject.set(x, "last_four_digits", null)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameNull: Self = StObject.set(x, "last_name", null)
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthNull: Self = StObject.set(x, "month", null)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberNull: Self = StObject.set(x, "number", null)
      
      inline def setPayment_method_type(value: credit_card | bank_account | apple_pay | google_pay | third_party_token): Self = StObject.set(x, "payment_method_type", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberNull: Self = StObject.set(x, "phone_number", null)
      
      inline def setShipping_address1(value: String): Self = StObject.set(x, "shipping_address1", value.asInstanceOf[js.Any])
      
      inline def setShipping_address1Null: Self = StObject.set(x, "shipping_address1", null)
      
      inline def setShipping_address2(value: String): Self = StObject.set(x, "shipping_address2", value.asInstanceOf[js.Any])
      
      inline def setShipping_address2Null: Self = StObject.set(x, "shipping_address2", null)
      
      inline def setShipping_city(value: String): Self = StObject.set(x, "shipping_city", value.asInstanceOf[js.Any])
      
      inline def setShipping_cityNull: Self = StObject.set(x, "shipping_city", null)
      
      inline def setShipping_country(value: String): Self = StObject.set(x, "shipping_country", value.asInstanceOf[js.Any])
      
      inline def setShipping_countryNull: Self = StObject.set(x, "shipping_country", null)
      
      inline def setShipping_phone_number(value: String): Self = StObject.set(x, "shipping_phone_number", value.asInstanceOf[js.Any])
      
      inline def setShipping_phone_numberNull: Self = StObject.set(x, "shipping_phone_number", null)
      
      inline def setShipping_state(value: String): Self = StObject.set(x, "shipping_state", value.asInstanceOf[js.Any])
      
      inline def setShipping_stateNull: Self = StObject.set(x, "shipping_state", null)
      
      inline def setShipping_zip(value: String): Self = StObject.set(x, "shipping_zip", value.asInstanceOf[js.Any])
      
      inline def setShipping_zipNull: Self = StObject.set(x, "shipping_zip", null)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStorage_state(value: cached | retained | redacted): Self = StObject.set(x, "storage_state", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setVerification_value(value: String): Self = StObject.set(x, "verification_value", value.asInstanceOf[js.Any])
      
      inline def setVerification_valueNull: Self = StObject.set(x, "verification_value", null)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearNull: Self = StObject.set(x, "year", null)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipNull: Self = StObject.set(x, "zip", null)
    }
  }
  
  trait TokenizeCreditCardAdditionalFields extends StObject {
    
    var address1: js.UndefOr[String] = js.undefined
    
    var address2: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var shipping_address1: js.UndefOr[String] = js.undefined
    
    var shipping_address2: js.UndefOr[String] = js.undefined
    
    var shipping_city: js.UndefOr[String] = js.undefined
    
    var shipping_country: js.UndefOr[String] = js.undefined
    
    var shipping_phone_number: js.UndefOr[String] = js.undefined
    
    var shipping_state: js.UndefOr[String] = js.undefined
    
    var shipping_zip: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object TokenizeCreditCardAdditionalFields {
    
    inline def apply(): TokenizeCreditCardAdditionalFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeCreditCardAdditionalFields] (val x: Self) extends AnyVal {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setShipping_address1(value: String): Self = StObject.set(x, "shipping_address1", value.asInstanceOf[js.Any])
      
      inline def setShipping_address1Undefined: Self = StObject.set(x, "shipping_address1", js.undefined)
      
      inline def setShipping_address2(value: String): Self = StObject.set(x, "shipping_address2", value.asInstanceOf[js.Any])
      
      inline def setShipping_address2Undefined: Self = StObject.set(x, "shipping_address2", js.undefined)
      
      inline def setShipping_city(value: String): Self = StObject.set(x, "shipping_city", value.asInstanceOf[js.Any])
      
      inline def setShipping_cityUndefined: Self = StObject.set(x, "shipping_city", js.undefined)
      
      inline def setShipping_country(value: String): Self = StObject.set(x, "shipping_country", value.asInstanceOf[js.Any])
      
      inline def setShipping_countryUndefined: Self = StObject.set(x, "shipping_country", js.undefined)
      
      inline def setShipping_phone_number(value: String): Self = StObject.set(x, "shipping_phone_number", value.asInstanceOf[js.Any])
      
      inline def setShipping_phone_numberUndefined: Self = StObject.set(x, "shipping_phone_number", js.undefined)
      
      inline def setShipping_state(value: String): Self = StObject.set(x, "shipping_state", value.asInstanceOf[js.Any])
      
      inline def setShipping_stateUndefined: Self = StObject.set(x, "shipping_state", js.undefined)
      
      inline def setShipping_zip(value: String): Self = StObject.set(x, "shipping_zip", value.asInstanceOf[js.Any])
      
      inline def setShipping_zipUndefined: Self = StObject.set(x, "shipping_zip", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  trait TokenizeCreditCardAdditionalFieldsFirstLastNames
    extends StObject
       with TokenizeCreditCardAdditionalFields {
    
    var first_name: String
    
    var last_name: String
  }
  object TokenizeCreditCardAdditionalFieldsFirstLastNames {
    
    inline def apply(first_name: String, last_name: String): TokenizeCreditCardAdditionalFieldsFirstLastNames = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFieldsFirstLastNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeCreditCardAdditionalFieldsFirstLastNames] (val x: Self) extends AnyVal {
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeCreditCardAdditionalFieldsFullName
    extends StObject
       with TokenizeCreditCardAdditionalFields {
    
    var full_name: String
  }
  object TokenizeCreditCardAdditionalFieldsFullName {
    
    inline def apply(full_name: String): TokenizeCreditCardAdditionalFieldsFullName = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizeCreditCardAdditionalFieldsFullName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizeCreditCardAdditionalFieldsFullName] (val x: Self) extends AnyVal {
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    }
  }
}
