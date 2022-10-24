package typings.reactPaymentInputs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactPaymentInputs.anon.Arialabel
import typings.reactPaymentInputs.anon.AutoComplete
import typings.reactPaymentInputs.anon.CardNumberCardType
import typings.reactPaymentInputs.anon.Error
import typings.reactPaymentInputs.anon.ErrorText
import typings.reactPaymentInputs.anon.ExpiryDate
import typings.reactPaymentInputs.anon.Id
import typings.reactPaymentInputs.anon.Images
import typings.reactPaymentInputs.anon.Length
import typings.reactPaymentInputs.anon.Name
import typings.reactPaymentInputs.anon.OnBlur
import typings.reactPaymentInputs.anon.OnChange
import typings.reactPaymentInputs.anon.OnFocus
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-payment-inputs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-payment-inputs", "PaymentInputsContainer")
  @js.native
  val PaymentInputsContainer: FC[usePaymentInputsOptions] = js.native
  
  @JSImport("react-payment-inputs", "PaymentInputsWrapper")
  @js.native
  val PaymentInputsWrapper: FC[PaymentInputsWrapperProps] = js.native
  
  inline def getCVCError(
    cvc: String,
    cvcValidator: js.Function1[/* props */ typings.reactPaymentInputs.anon.CardType, String],
    param2: typings.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCVCError")(cvc.asInstanceOf[js.Any], cvcValidator.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCardNumberError(
    cardNumber: String,
    cardNumberValidator: js.Function1[/* props */ CardNumberCardType, String],
    param2: typings.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardNumberError")(cardNumber.asInstanceOf[js.Any], cardNumberValidator.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getExpiryDateError(
    expiryDate: String,
    expiryValidator: js.Function1[/* props */ ExpiryDate, String],
    param2: typings.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpiryDateError")(expiryDate.asInstanceOf[js.Any], expiryValidator.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getZIPError(zip: String, param1: typings.reactPaymentInputs.anon.ErrorMessages): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getZIPError")(zip.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def usePaymentInputs(): usePaymentInputsData = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaymentInputs")().asInstanceOf[usePaymentInputsData]
  inline def usePaymentInputs(options: usePaymentInputsOptions): usePaymentInputsData = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaymentInputs")(options.asInstanceOf[js.Any]).asInstanceOf[usePaymentInputsData]
  
  trait CardImages extends StObject {
    
    var amex: ReactElement
    
    var dinersclub: ReactElement
    
    var discover: ReactElement
    
    var hipercard: ReactElement
    
    var jcb: ReactElement
    
    var mastercard: ReactElement
    
    var placeholder: ReactElement
    
    var unionpay: ReactElement
    
    var visa: ReactElement
  }
  object CardImages {
    
    inline def apply(
      amex: ReactElement,
      dinersclub: ReactElement,
      discover: ReactElement,
      hipercard: ReactElement,
      jcb: ReactElement,
      mastercard: ReactElement,
      placeholder: ReactElement,
      unionpay: ReactElement,
      visa: ReactElement
    ): CardImages = {
      val __obj = js.Dynamic.literal(amex = amex.asInstanceOf[js.Any], dinersclub = dinersclub.asInstanceOf[js.Any], discover = discover.asInstanceOf[js.Any], hipercard = hipercard.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mastercard = mastercard.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], unionpay = unionpay.asInstanceOf[js.Any], visa = visa.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardImages]
    }
    
    extension [Self <: CardImages](x: Self) {
      
      inline def setAmex(value: ReactElement): Self = StObject.set(x, "amex", value.asInstanceOf[js.Any])
      
      inline def setDinersclub(value: ReactElement): Self = StObject.set(x, "dinersclub", value.asInstanceOf[js.Any])
      
      inline def setDiscover(value: ReactElement): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
      
      inline def setHipercard(value: ReactElement): Self = StObject.set(x, "hipercard", value.asInstanceOf[js.Any])
      
      inline def setJcb(value: ReactElement): Self = StObject.set(x, "jcb", value.asInstanceOf[js.Any])
      
      inline def setMastercard(value: ReactElement): Self = StObject.set(x, "mastercard", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setUnionpay(value: ReactElement): Self = StObject.set(x, "unionpay", value.asInstanceOf[js.Any])
      
      inline def setVisa(value: ReactElement): Self = StObject.set(x, "visa", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardType extends StObject {
    
    var code: Length
    
    var displayName: String
    
    var format: js.RegExp
    
    var gaps: js.Array[Double]
    
    var lengths: js.Array[Double]
    
    var startPattern: js.RegExp
    
    var `type`: String
  }
  object CardType {
    
    inline def apply(
      code: Length,
      displayName: String,
      format: js.RegExp,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      startPattern: js.RegExp,
      `type`: String
    ): CardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], startPattern = startPattern.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardType]
    }
    
    extension [Self <: CardType](x: Self) {
      
      inline def setCode(value: Length): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setStartPattern(value: js.RegExp): Self = StObject.set(x, "startPattern", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorMessages extends StObject {
    
    var dateOutOfRange: String
    
    var emptyCVC: String
    
    var emptyCardNumber: String
    
    var emptyExpiryDate: String
    
    var invalidCVC: String
    
    var invalidCardNumber: String
    
    var invalidExpiryDate: String
    
    var monthOutOfRange: String
    
    var yearOutOfRange: String
  }
  object ErrorMessages {
    
    inline def apply(
      dateOutOfRange: String,
      emptyCVC: String,
      emptyCardNumber: String,
      emptyExpiryDate: String,
      invalidCVC: String,
      invalidCardNumber: String,
      invalidExpiryDate: String,
      monthOutOfRange: String,
      yearOutOfRange: String
    ): ErrorMessages = {
      val __obj = js.Dynamic.literal(dateOutOfRange = dateOutOfRange.asInstanceOf[js.Any], emptyCVC = emptyCVC.asInstanceOf[js.Any], emptyCardNumber = emptyCardNumber.asInstanceOf[js.Any], emptyExpiryDate = emptyExpiryDate.asInstanceOf[js.Any], invalidCVC = invalidCVC.asInstanceOf[js.Any], invalidCardNumber = invalidCardNumber.asInstanceOf[js.Any], invalidExpiryDate = invalidExpiryDate.asInstanceOf[js.Any], monthOutOfRange = monthOutOfRange.asInstanceOf[js.Any], yearOutOfRange = yearOutOfRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessages]
    }
    
    extension [Self <: ErrorMessages](x: Self) {
      
      inline def setDateOutOfRange(value: String): Self = StObject.set(x, "dateOutOfRange", value.asInstanceOf[js.Any])
      
      inline def setEmptyCVC(value: String): Self = StObject.set(x, "emptyCVC", value.asInstanceOf[js.Any])
      
      inline def setEmptyCardNumber(value: String): Self = StObject.set(x, "emptyCardNumber", value.asInstanceOf[js.Any])
      
      inline def setEmptyExpiryDate(value: String): Self = StObject.set(x, "emptyExpiryDate", value.asInstanceOf[js.Any])
      
      inline def setInvalidCVC(value: String): Self = StObject.set(x, "invalidCVC", value.asInstanceOf[js.Any])
      
      inline def setInvalidCardNumber(value: String): Self = StObject.set(x, "invalidCardNumber", value.asInstanceOf[js.Any])
      
      inline def setInvalidExpiryDate(value: String): Self = StObject.set(x, "invalidExpiryDate", value.asInstanceOf[js.Any])
      
      inline def setMonthOutOfRange(value: String): Self = StObject.set(x, "monthOutOfRange", value.asInstanceOf[js.Any])
      
      inline def setYearOutOfRange(value: String): Self = StObject.set(x, "yearOutOfRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErroredInputs extends StObject {
    
    var cardNumber: String
    
    var cvc: String
    
    var expiryDate: String
    
    var zipField: String
  }
  object ErroredInputs {
    
    inline def apply(cardNumber: String, cvc: String, expiryDate: String, zipField: String): ErroredInputs = {
      val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any], zipField = zipField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErroredInputs]
    }
    
    extension [Self <: ErroredInputs](x: Self) {
      
      inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
      
      inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      inline def setExpiryDate(value: String): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
      
      inline def setZipField(value: String): Self = StObject.set(x, "zipField", value.asInstanceOf[js.Any])
    }
  }
  
  type InputValidationErrorCallback = js.Function2[/* error */ String, /* erroredInputs */ ErroredInputs, Unit]
  
  trait PaymentInputsWrapperProps extends StObject {
    
    var children: ReactNode
    
    var error: String
    
    /**
      * Custom props to pass to the error text component.
      */
    var errorTextProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var focused: Boolean
    
    /**
      * Custom props to pass to the input wrapper component.
      */
    var inputWrapperProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var isTouched: Boolean
    
    /**
      * Custom styling to pass through to the wrapper. Either a styled-component's css or an Object can be passed.
      */
    var styles: js.UndefOr[ErrorText] = js.undefined
  }
  object PaymentInputsWrapperProps {
    
    inline def apply(error: String, focused: Boolean, isTouched: Boolean): PaymentInputsWrapperProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentInputsWrapperProps]
    }
    
    extension [Self <: PaymentInputsWrapperProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorTextProps(value: StringDictionary[Any]): Self = StObject.set(x, "errorTextProps", value.asInstanceOf[js.Any])
      
      inline def setErrorTextPropsUndefined: Self = StObject.set(x, "errorTextProps", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setInputWrapperProps(value: StringDictionary[Any]): Self = StObject.set(x, "inputWrapperProps", value.asInstanceOf[js.Any])
      
      inline def setInputWrapperPropsUndefined: Self = StObject.set(x, "inputWrapperProps", js.undefined)
      
      inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: ErrorText): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait usePaymentInputsData extends StObject {
    
    /**
      * Returns the props to apply to the CVC input.
      */
    def getCVCProps(): Id = js.native
    def getCVCProps(props: OnFocus): Id = js.native
    
    /**
      * Returns the props to apply to the card image SVG.
      */
    def getCardImageProps(): Arialabel = js.native
    def getCardImageProps(props: Images): Arialabel = js.native
    
    /**
      * Returns the props to apply to the card number input.
      */
    def getCardNumberProps(): AutoComplete = js.native
    def getCardNumberProps(props: OnBlur): AutoComplete = js.native
    
    /**
      * Returns the props to apply to the expiry date input.
      */
    def getExpiryDateProps(): Id = js.native
    def getExpiryDateProps(props: OnChange): Id = js.native
    
    /**
      * Returns the props to apply to the ZIP input.
      */
    def getZipProps(): Name = js.native
    def getZipProps(props: OnChange): Name = js.native
    
    var meta: typings.reactPaymentInputs.anon.ErroredInputs = js.native
    
    /**
      * Returns the props to apply to <PaymentInputsWrapper>.
      */
    var wrapperProps: Error = js.native
  }
  
  trait usePaymentInputsOptions extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set custom card number validator function
      */
    var cardNumberValidator: js.UndefOr[js.Function1[/* props */ CardNumberCardType, String]] = js.undefined
    
    /**
      * Set custom cvc validator function
      */
    var cvcValidator: js.UndefOr[js.Function1[/* props */ typings.reactPaymentInputs.anon.CardType, String]] = js.undefined
    
    /**
      * custom error messages for the inputs.
      */
    var errorMessages: js.UndefOr[ErrorMessages] = js.undefined
    
    /**
      * Set expiry validator function
      */
    var expiryValidator: js.UndefOr[js.Function1[/* props */ ExpiryDate, String]] = js.undefined
    
    /**
      * Function to handle the blur event on the inputs. It is invoked when any of the inputs blur.
      */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Function to handle the change event on the inputs. It is invoked when any of the inputs change.
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Function to invoke when any of the inputs error.
      */
    var onError: js.UndefOr[InputValidationErrorCallback] = js.undefined
    
    /**
      * Function to invoke when any of the inputs are touched.
      */
    var onTouch: js.UndefOr[Any] = js.undefined
  }
  object usePaymentInputsOptions {
    
    inline def apply(): usePaymentInputsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[usePaymentInputsOptions]
    }
    
    extension [Self <: usePaymentInputsOptions](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCardNumberValidator(value: /* props */ CardNumberCardType => String): Self = StObject.set(x, "cardNumberValidator", js.Any.fromFunction1(value))
      
      inline def setCardNumberValidatorUndefined: Self = StObject.set(x, "cardNumberValidator", js.undefined)
      
      inline def setCvcValidator(value: /* props */ typings.reactPaymentInputs.anon.CardType => String): Self = StObject.set(x, "cvcValidator", js.Any.fromFunction1(value))
      
      inline def setCvcValidatorUndefined: Self = StObject.set(x, "cvcValidator", js.undefined)
      
      inline def setErrorMessages(value: ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
      
      inline def setExpiryValidator(value: /* props */ ExpiryDate => String): Self = StObject.set(x, "expiryValidator", js.Any.fromFunction1(value))
      
      inline def setExpiryValidatorUndefined: Self = StObject.set(x, "expiryValidator", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: (/* error */ String, /* erroredInputs */ ErroredInputs) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnTouch(value: Any): Self = StObject.set(x, "onTouch", value.asInstanceOf[js.Any])
      
      inline def setOnTouchUndefined: Self = StObject.set(x, "onTouch", js.undefined)
    }
  }
}
