package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libGooglePayMod.GooglePayPaymentAuthorizationResult
import typings.recurlyRecurlyJs.libGooglePayNativeMod.GooglePayIntermediatePaymentData
import typings.recurlyRecurlyJs.libGooglePayNativeMod.GooglePayPaymentData
import typings.recurlyRecurlyJs.libGooglePayNativeMod.GooglePayPaymentDataRequestUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPaymentDataChanged extends StObject {
  
  var onPaymentAuthorized: js.UndefOr[
    js.Function1[
      /* paymentData */ GooglePayPaymentData, 
      js.Promise[GooglePayPaymentAuthorizationResult] | Unit
    ]
  ] = js.undefined
  
  var onPaymentDataChanged: js.UndefOr[
    js.Function1[
      /* intermediatePaymentData */ GooglePayIntermediatePaymentData, 
      js.Promise[GooglePayPaymentDataRequestUpdate]
    ]
  ] = js.undefined
}
object OnPaymentDataChanged {
  
  inline def apply(): OnPaymentDataChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPaymentDataChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPaymentDataChanged] (val x: Self) extends AnyVal {
    
    inline def setOnPaymentAuthorized(
      value: /* paymentData */ GooglePayPaymentData => js.Promise[GooglePayPaymentAuthorizationResult] | Unit
    ): Self = StObject.set(x, "onPaymentAuthorized", js.Any.fromFunction1(value))
    
    inline def setOnPaymentAuthorizedUndefined: Self = StObject.set(x, "onPaymentAuthorized", js.undefined)
    
    inline def setOnPaymentDataChanged(
      value: /* intermediatePaymentData */ GooglePayIntermediatePaymentData => js.Promise[GooglePayPaymentDataRequestUpdate]
    ): Self = StObject.set(x, "onPaymentDataChanged", js.Any.fromFunction1(value))
    
    inline def setOnPaymentDataChangedUndefined: Self = StObject.set(x, "onPaymentDataChanged", js.undefined)
  }
}
