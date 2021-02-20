package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeyError extends StObject {
  
  val MS_MEDIA_KEYERR_CLIENT: Double = js.native
  
  val MS_MEDIA_KEYERR_DOMAIN: Double = js.native
  
  val MS_MEDIA_KEYERR_HARDWARECHANGE: Double = js.native
  
  val MS_MEDIA_KEYERR_OUTPUT: Double = js.native
  
  val MS_MEDIA_KEYERR_SERVICE: Double = js.native
  
  val MS_MEDIA_KEYERR_UNKNOWN: Double = js.native
  
  val code: Double = js.native
  
  val systemCode: Double = js.native
}
object MSMediaKeyError {
  
  @scala.inline
  def apply(
    MS_MEDIA_KEYERR_CLIENT: Double,
    MS_MEDIA_KEYERR_DOMAIN: Double,
    MS_MEDIA_KEYERR_HARDWARECHANGE: Double,
    MS_MEDIA_KEYERR_OUTPUT: Double,
    MS_MEDIA_KEYERR_SERVICE: Double,
    MS_MEDIA_KEYERR_UNKNOWN: Double,
    code: Double,
    systemCode: Double
  ): MSMediaKeyError = {
    val __obj = js.Dynamic.literal(MS_MEDIA_KEYERR_CLIENT = MS_MEDIA_KEYERR_CLIENT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_DOMAIN = MS_MEDIA_KEYERR_DOMAIN.asInstanceOf[js.Any], MS_MEDIA_KEYERR_HARDWARECHANGE = MS_MEDIA_KEYERR_HARDWARECHANGE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_OUTPUT = MS_MEDIA_KEYERR_OUTPUT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_SERVICE = MS_MEDIA_KEYERR_SERVICE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_UNKNOWN = MS_MEDIA_KEYERR_UNKNOWN.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], systemCode = systemCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSMediaKeyError]
  }
  
  @scala.inline
  implicit class MSMediaKeyErrorMutableBuilder[Self <: MSMediaKeyError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_CLIENT(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_CLIENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_DOMAIN(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_DOMAIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_HARDWARECHANGE(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_HARDWARECHANGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_OUTPUT(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_OUTPUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_SERVICE(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_SERVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_MEDIA_KEYERR_UNKNOWN(value: Double): Self = StObject.set(x, "MS_MEDIA_KEYERR_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemCode(value: Double): Self = StObject.set(x, "systemCode", value.asInstanceOf[js.Any])
  }
}
