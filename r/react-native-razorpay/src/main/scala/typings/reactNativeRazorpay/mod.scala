package typings.reactNativeRazorpay

import typings.reactNativeRazorpay.anon.Animation
import typings.reactNativeRazorpay.anon.Backdropcolor
import typings.reactNativeRazorpay.anon.Contact
import typings.reactNativeRazorpay.anon.ContactEmail
import typings.reactNativeRazorpay.anon.Display
import typings.reactNativeRazorpay.anon.Email
import typings.reactNativeRazorpay.anon.Enabled
import typings.reactNativeRazorpay.anon.Field
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-razorpay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def onExternalWalletSelection(externalWalletCallback: js.Function1[/* data */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExternalWalletSelection")(externalWalletCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def open(options: CheckoutOptions): js.Promise[SuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SuccessResponse]]
    inline def open(options: CheckoutOptions, successCallback: js.Function1[/* data */ SuccessResponse, Unit]): js.Promise[SuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SuccessResponse]]
    inline def open(
      options: CheckoutOptions,
      successCallback: js.Function1[/* data */ SuccessResponse, Unit],
      errorCallback: js.Function1[/* data */ ErrorResponse, Unit]
    ): js.Promise[SuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SuccessResponse]]
    inline def open(
      options: CheckoutOptions,
      successCallback: Unit,
      errorCallback: js.Function1[/* data */ ErrorResponse, Unit]
    ): js.Promise[SuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SuccessResponse]]
  }
  
  trait CheckoutOptions extends StObject {
    
    var allow_rotation: js.UndefOr[Boolean] = js.undefined
    
    var amount: Double
    
    var callback_url: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Display] = js.undefined
    
    var currency: String
    
    var customer_id: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var hidden: js.UndefOr[ContactEmail] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var modal: js.UndefOr[Animation] = js.undefined
    
    var name: String
    
    var notes: js.UndefOr[Record[String | Double, String]] = js.undefined
    
    var order_id: String
    
    var prefill: js.UndefOr[Contact] = js.undefined
    
    var readonly: js.UndefOr[Email] = js.undefined
    
    var recurring: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
    
    var remember_customer: js.UndefOr[Boolean] = js.undefined
    
    var retry: js.UndefOr[Enabled] = js.undefined
    
    var send_sms_hash: js.UndefOr[Boolean] = js.undefined
    
    var subscription_card_change: js.UndefOr[Boolean] = js.undefined
    
    var subscription_id: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Backdropcolor] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CheckoutOptions {
    
    inline def apply(amount: Double, currency: String, description: String, key: String, name: String, order_id: String): CheckoutOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckoutOptions] (val x: Self) extends AnyVal {
      
      inline def setAllow_rotation(value: Boolean): Self = StObject.set(x, "allow_rotation", value.asInstanceOf[js.Any])
      
      inline def setAllow_rotationUndefined: Self = StObject.set(x, "allow_rotation", js.undefined)
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
      
      inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
      
      inline def setConfig(value: Display): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
      
      inline def setCustomer_idUndefined: Self = StObject.set(x, "customer_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: ContactEmail): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setModal(value: Animation): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: Record[String | Double, String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setOrder_id(value: String): Self = StObject.set(x, "order_id", value.asInstanceOf[js.Any])
      
      inline def setPrefill(value: Contact): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
      
      inline def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
      
      inline def setReadonly(value: Email): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRecurring(value: Boolean): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
      
      inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRemember_customer(value: Boolean): Self = StObject.set(x, "remember_customer", value.asInstanceOf[js.Any])
      
      inline def setRemember_customerUndefined: Self = StObject.set(x, "remember_customer", js.undefined)
      
      inline def setRetry(value: Enabled): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSend_sms_hash(value: Boolean): Self = StObject.set(x, "send_sms_hash", value.asInstanceOf[js.Any])
      
      inline def setSend_sms_hashUndefined: Self = StObject.set(x, "send_sms_hash", js.undefined)
      
      inline def setSubscription_card_change(value: Boolean): Self = StObject.set(x, "subscription_card_change", value.asInstanceOf[js.Any])
      
      inline def setSubscription_card_changeUndefined: Self = StObject.set(x, "subscription_card_change", js.undefined)
      
      inline def setSubscription_id(value: String): Self = StObject.set(x, "subscription_id", value.asInstanceOf[js.Any])
      
      inline def setSubscription_idUndefined: Self = StObject.set(x, "subscription_id", js.undefined)
      
      inline def setTheme(value: Backdropcolor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ErrorResponse extends StObject {
    
    var code: Double
    
    var description: String
    
    var error: Field
  }
  object ErrorResponse {
    
    inline def apply(code: Double, description: String, error: Field): ErrorResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setError(value: Field): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessResponse extends StObject {
    
    var razorpay_order_id: String
    
    var razorpay_payment_id: String
    
    var razorpay_signature: String
  }
  object SuccessResponse {
    
    inline def apply(razorpay_order_id: String, razorpay_payment_id: String, razorpay_signature: String): SuccessResponse = {
      val __obj = js.Dynamic.literal(razorpay_order_id = razorpay_order_id.asInstanceOf[js.Any], razorpay_payment_id = razorpay_payment_id.asInstanceOf[js.Any], razorpay_signature = razorpay_signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessResponse] (val x: Self) extends AnyVal {
      
      inline def setRazorpay_order_id(value: String): Self = StObject.set(x, "razorpay_order_id", value.asInstanceOf[js.Any])
      
      inline def setRazorpay_payment_id(value: String): Self = StObject.set(x, "razorpay_payment_id", value.asInstanceOf[js.Any])
      
      inline def setRazorpay_signature(value: String): Self = StObject.set(x, "razorpay_signature", value.asInstanceOf[js.Any])
    }
  }
}
