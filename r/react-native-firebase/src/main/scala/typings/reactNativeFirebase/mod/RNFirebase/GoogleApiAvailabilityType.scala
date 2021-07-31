package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiAvailabilityType extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var isAvailable: Boolean
  
  var isUserResolvableError: js.UndefOr[Boolean] = js.undefined
  
  var status: Double
}
object GoogleApiAvailabilityType {
  
  @scala.inline
  def apply(isAvailable: Boolean, status: Double): GoogleApiAvailabilityType = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiAvailabilityType]
  }
  
  @scala.inline
  implicit class GoogleApiAvailabilityTypeMutableBuilder[Self <: GoogleApiAvailabilityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserResolvableError(value: Boolean): Self = StObject.set(x, "isUserResolvableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserResolvableErrorUndefined: Self = StObject.set(x, "isUserResolvableError", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
