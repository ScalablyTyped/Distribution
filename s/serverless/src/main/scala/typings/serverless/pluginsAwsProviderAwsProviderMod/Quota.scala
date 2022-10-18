package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quota extends StObject {
  
  var limit: js.UndefOr[Double | String] = js.undefined
  
  var offset: js.UndefOr[Double | String] = js.undefined
  
  var period: js.UndefOr[String] = js.undefined
}
object Quota {
  
  inline def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  
  extension [Self <: Quota](x: Self) {
    
    inline def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
