package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayErrorUpdate
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayPaymentAuthorizedEvent
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayPaymentMethodSelectedEvent
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePaySelectionUpdate
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayShippingContactSelectedEvent
import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayShippingMethodSelectedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPaymentAuthorized extends StObject {
  
  var onPaymentAuthorized: js.UndefOr[
    js.Function1[
      /* event */ ApplePayPaymentAuthorizedEvent, 
      js.Promise[ApplePayErrorUpdate] | ApplePayErrorUpdate | Unit
    ]
  ] = js.undefined
  
  var onPaymentMethodSelected: js.UndefOr[
    js.Function1[
      /* event */ ApplePayPaymentMethodSelectedEvent, 
      js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ]
  ] = js.undefined
  
  var onShippingContactSelected: js.UndefOr[
    js.Function1[
      /* event */ ApplePayShippingContactSelectedEvent, 
      js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ]
  ] = js.undefined
  
  var onShippingMethodSelected: js.UndefOr[
    js.Function1[
      /* event */ ApplePayShippingMethodSelectedEvent, 
      js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ]
  ] = js.undefined
}
object OnPaymentAuthorized {
  
  inline def apply(): OnPaymentAuthorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPaymentAuthorized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPaymentAuthorized] (val x: Self) extends AnyVal {
    
    inline def setOnPaymentAuthorized(
      value: /* event */ ApplePayPaymentAuthorizedEvent => js.Promise[ApplePayErrorUpdate] | ApplePayErrorUpdate | Unit
    ): Self = StObject.set(x, "onPaymentAuthorized", js.Any.fromFunction1(value))
    
    inline def setOnPaymentAuthorizedUndefined: Self = StObject.set(x, "onPaymentAuthorized", js.undefined)
    
    inline def setOnPaymentMethodSelected(
      value: /* event */ ApplePayPaymentMethodSelectedEvent => js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ): Self = StObject.set(x, "onPaymentMethodSelected", js.Any.fromFunction1(value))
    
    inline def setOnPaymentMethodSelectedUndefined: Self = StObject.set(x, "onPaymentMethodSelected", js.undefined)
    
    inline def setOnShippingContactSelected(
      value: /* event */ ApplePayShippingContactSelectedEvent => js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ): Self = StObject.set(x, "onShippingContactSelected", js.Any.fromFunction1(value))
    
    inline def setOnShippingContactSelectedUndefined: Self = StObject.set(x, "onShippingContactSelected", js.undefined)
    
    inline def setOnShippingMethodSelected(
      value: /* event */ ApplePayShippingMethodSelectedEvent => js.Promise[ApplePaySelectionUpdate] | ApplePaySelectionUpdate | Unit
    ): Self = StObject.set(x, "onShippingMethodSelected", js.Any.fromFunction1(value))
    
    inline def setOnShippingMethodSelectedUndefined: Self = StObject.set(x, "onShippingMethodSelected", js.undefined)
  }
}
