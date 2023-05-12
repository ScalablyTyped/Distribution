package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  captureExceptions :boolean,   traceInternals :boolean,   mutationLimit :number,   mutationBreadcrumbLimit :number}> */
trait PartialcaptureExceptionsb extends StObject {
  
  var captureExceptions: js.UndefOr[Boolean] = js.undefined
  
  var mutationBreadcrumbLimit: js.UndefOr[Double] = js.undefined
  
  var mutationLimit: js.UndefOr[Double] = js.undefined
  
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
    
    inline def setMutationBreadcrumbLimit(value: Double): Self = StObject.set(x, "mutationBreadcrumbLimit", value.asInstanceOf[js.Any])
    
    inline def setMutationBreadcrumbLimitUndefined: Self = StObject.set(x, "mutationBreadcrumbLimit", js.undefined)
    
    inline def setMutationLimit(value: Double): Self = StObject.set(x, "mutationLimit", value.asInstanceOf[js.Any])
    
    inline def setMutationLimitUndefined: Self = StObject.set(x, "mutationLimit", js.undefined)
    
    inline def setTraceInternals(value: Boolean): Self = StObject.set(x, "traceInternals", value.asInstanceOf[js.Any])
    
    inline def setTraceInternalsUndefined: Self = StObject.set(x, "traceInternals", js.undefined)
  }
}
