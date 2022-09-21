package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsClientInputs extends StObject {
  
  /* standard dom */
  var appid: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var appidExclude: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var credProps: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var uvm: js.UndefOr[scala.Boolean] = js.undefined
}
object AuthenticationExtensionsClientInputs {
  
  inline def apply(): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
  
  extension [Self <: AuthenticationExtensionsClientInputs](x: Self) {
    
    inline def setAppid(value: java.lang.String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidExclude(value: java.lang.String): Self = StObject.set(x, "appidExclude", value.asInstanceOf[js.Any])
    
    inline def setAppidExcludeUndefined: Self = StObject.set(x, "appidExclude", js.undefined)
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setCredProps(value: scala.Boolean): Self = StObject.set(x, "credProps", value.asInstanceOf[js.Any])
    
    inline def setCredPropsUndefined: Self = StObject.set(x, "credProps", js.undefined)
    
    inline def setUvm(value: scala.Boolean): Self = StObject.set(x, "uvm", value.asInstanceOf[js.Any])
    
    inline def setUvmUndefined: Self = StObject.set(x, "uvm", js.undefined)
  }
}
