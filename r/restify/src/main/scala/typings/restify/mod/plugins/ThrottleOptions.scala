package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottleOptions extends StObject {
  
  var burst: js.UndefOr[Double] = js.undefined
  
  var ip: js.UndefOr[Boolean] = js.undefined
  
  var maxKeys: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[Any] = js.undefined
  
  var rate: js.UndefOr[Double] = js.undefined
  
  var setHeaders: js.UndefOr[Boolean] = js.undefined
  
  var tokensTable: js.UndefOr[Any] = js.undefined
  
  var username: js.UndefOr[Boolean] = js.undefined
  
  var xff: js.UndefOr[Boolean] = js.undefined
}
object ThrottleOptions {
  
  inline def apply(): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleOptions]
  }
  
  extension [Self <: ThrottleOptions](x: Self) {
    
    inline def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    inline def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
    
    inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setSetHeaders(value: Boolean): Self = StObject.set(x, "setHeaders", value.asInstanceOf[js.Any])
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    inline def setTokensTable(value: Any): Self = StObject.set(x, "tokensTable", value.asInstanceOf[js.Any])
    
    inline def setTokensTableUndefined: Self = StObject.set(x, "tokensTable", js.undefined)
    
    inline def setUsername(value: Boolean): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setXff(value: Boolean): Self = StObject.set(x, "xff", value.asInstanceOf[js.Any])
    
    inline def setXffUndefined: Self = StObject.set(x, "xff", js.undefined)
  }
}
