package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCa extends StObject {
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var sslCa: js.UndefOr[js.Array[String]] = js.undefined
  
  var sslCert: js.UndefOr[String] = js.undefined
  
  var sslKey: js.UndefOr[String] = js.undefined
}
object SslCa {
  
  inline def apply(): SslCa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCa]
  }
  
  extension [Self <: SslCa](x: Self) {
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setSslCa(value: js.Array[String]): Self = StObject.set(x, "sslCa", value.asInstanceOf[js.Any])
    
    inline def setSslCaUndefined: Self = StObject.set(x, "sslCa", js.undefined)
    
    inline def setSslCaVarargs(value: String*): Self = StObject.set(x, "sslCa", js.Array(value*))
    
    inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
  }
}
