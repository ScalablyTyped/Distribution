package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiAvailabilityType extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var isAvailable: Boolean = js.native
  
  var isUserResolvableError: js.UndefOr[Boolean] = js.native
  
  var status: Double = js.native
}
object GoogleApiAvailabilityType {
  
  @scala.inline
  def apply(isAvailable: Boolean, status: Double): GoogleApiAvailabilityType = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiAvailabilityType]
  }
  
  @scala.inline
  implicit class GoogleApiAvailabilityTypeOps[Self <: GoogleApiAvailabilityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIsUserResolvableError(value: Boolean): Self = this.set("isUserResolvableError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUserResolvableError: Self = this.set("isUserResolvableError", js.undefined)
  }
}
