package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var host: String
  
  var sslEnabled: Boolean
  
  var url: URL
}
object Domain {
  
  inline def apply(host: String, sslEnabled: Boolean, url: URL): Domain = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
