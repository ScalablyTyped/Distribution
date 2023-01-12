package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsClientInputs extends StObject {
  
  /* standard dom */
  var appid: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var credProps: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var hmacCreateSecret: js.UndefOr[scala.Boolean] = js.undefined
}
object AuthenticationExtensionsClientInputs {
  
  inline def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationExtensionsClientInputs] (val x: Self) extends AnyVal {
    
    inline def setAppid(value: java.lang.String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setCredProps(value: scala.Boolean): Self = StObject.set(x, "credProps", value.asInstanceOf[js.Any])
    
    inline def setCredPropsUndefined: Self = StObject.set(x, "credProps", js.undefined)
    
    inline def setHmacCreateSecret(value: scala.Boolean): Self = StObject.set(x, "hmacCreateSecret", value.asInstanceOf[js.Any])
    
    inline def setHmacCreateSecretUndefined: Self = StObject.set(x, "hmacCreateSecret", js.undefined)
  }
}
