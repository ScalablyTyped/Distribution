package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorID extends StObject {
  
  /** @deprecated */
  /* standard dom */
  val appCodeName: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val appName: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val appVersion: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val platform: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val product: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val productSub: java.lang.String
  
  /* standard dom */
  val userAgent: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val vendor: java.lang.String
  
  /** @deprecated */
  /* standard dom */
  val vendorSub: java.lang.String
}
object NavigatorID {
  
  inline def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorID] (val x: Self) extends AnyVal {
    
    inline def setAppCodeName(value: java.lang.String): Self = StObject.set(x, "appCodeName", value.asInstanceOf[js.Any])
    
    inline def setAppName(value: java.lang.String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: java.lang.String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: java.lang.String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: java.lang.String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductSub(value: java.lang.String): Self = StObject.set(x, "productSub", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: java.lang.String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: java.lang.String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorSub(value: java.lang.String): Self = StObject.set(x, "vendorSub", value.asInstanceOf[js.Any])
  }
}
