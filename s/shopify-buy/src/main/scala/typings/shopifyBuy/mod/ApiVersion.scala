package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common
  */
trait ApiVersion extends StObject {
  
  var displayName: String
  
  var handle: String
  
  var supported: Boolean
}
object ApiVersion {
  
  inline def apply(displayName: String, handle: String, supported: Boolean): ApiVersion = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiVersion] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
