package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrottleOptions extends StObject {
  
  var burst: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[Boolean] = js.native
  
  var maxKeys: js.UndefOr[Double] = js.native
  
  var overrides: js.UndefOr[js.Any] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var setHeaders: js.UndefOr[Boolean] = js.native
  
  var tokensTable: js.UndefOr[js.Any] = js.native
  
  var username: js.UndefOr[Boolean] = js.native
  
  var xff: js.UndefOr[Boolean] = js.native
}
object ThrottleOptions {
  
  @scala.inline
  def apply(): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleOptions]
  }
  
  @scala.inline
  implicit class ThrottleOptionsMutableBuilder[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    @scala.inline
    def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
    
    @scala.inline
    def setOverrides(value: js.Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: Boolean): Self = StObject.set(x, "setHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    @scala.inline
    def setTokensTable(value: js.Any): Self = StObject.set(x, "tokensTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensTableUndefined: Self = StObject.set(x, "tokensTable", js.undefined)
    
    @scala.inline
    def setUsername(value: Boolean): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setXff(value: Boolean): Self = StObject.set(x, "xff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXffUndefined: Self = StObject.set(x, "xff", js.undefined)
  }
}
