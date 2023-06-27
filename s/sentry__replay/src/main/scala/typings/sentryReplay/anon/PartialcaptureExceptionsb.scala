package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  captureExceptions :boolean,   traceInternals :boolean,   delayFlushOnCheckout :number}> */
trait PartialcaptureExceptionsb extends StObject {
  
  var captureExceptions: js.UndefOr[Boolean] = js.undefined
  
  var delayFlushOnCheckout: js.UndefOr[Double] = js.undefined
  
  var traceInternals: js.UndefOr[Boolean] = js.undefined
}
object PartialcaptureExceptionsb {
  
  inline def apply(): PartialcaptureExceptionsb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcaptureExceptionsb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialcaptureExceptionsb] (val x: Self) extends AnyVal {
    
    inline def setCaptureExceptions(value: Boolean): Self = StObject.set(x, "captureExceptions", value.asInstanceOf[js.Any])
    
    inline def setCaptureExceptionsUndefined: Self = StObject.set(x, "captureExceptions", js.undefined)
    
    inline def setDelayFlushOnCheckout(value: Double): Self = StObject.set(x, "delayFlushOnCheckout", value.asInstanceOf[js.Any])
    
    inline def setDelayFlushOnCheckoutUndefined: Self = StObject.set(x, "delayFlushOnCheckout", js.undefined)
    
    inline def setTraceInternals(value: Boolean): Self = StObject.set(x, "traceInternals", value.asInstanceOf[js.Any])
    
    inline def setTraceInternalsUndefined: Self = StObject.set(x, "traceInternals", js.undefined)
  }
}
