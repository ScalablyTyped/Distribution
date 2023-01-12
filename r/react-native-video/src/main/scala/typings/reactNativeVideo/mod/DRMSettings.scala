package typings.reactNativeVideo.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMSettings extends StObject {
  
  var base64Certificate: js.UndefOr[Boolean] = js.undefined
  
  var certificateUrl: js.UndefOr[String] = js.undefined
  
  var contentId: js.UndefOr[String] = js.undefined
  
  var getLicense: js.UndefOr[js.Function1[/* spcString */ String, js.Promise[String]]] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var licenseServer: js.UndefOr[String] = js.undefined
  
  var `type`: DRMType
}
object DRMSettings {
  
  inline def apply(`type`: DRMType): DRMSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DRMSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DRMSettings] (val x: Self) extends AnyVal {
    
    inline def setBase64Certificate(value: Boolean): Self = StObject.set(x, "base64Certificate", value.asInstanceOf[js.Any])
    
    inline def setBase64CertificateUndefined: Self = StObject.set(x, "base64Certificate", js.undefined)
    
    inline def setCertificateUrl(value: String): Self = StObject.set(x, "certificateUrl", value.asInstanceOf[js.Any])
    
    inline def setCertificateUrlUndefined: Self = StObject.set(x, "certificateUrl", js.undefined)
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setGetLicense(value: /* spcString */ String => js.Promise[String]): Self = StObject.set(x, "getLicense", js.Any.fromFunction1(value))
    
    inline def setGetLicenseUndefined: Self = StObject.set(x, "getLicense", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLicenseServer(value: String): Self = StObject.set(x, "licenseServer", value.asInstanceOf[js.Any])
    
    inline def setLicenseServerUndefined: Self = StObject.set(x, "licenseServer", js.undefined)
    
    inline def setType(value: DRMType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
