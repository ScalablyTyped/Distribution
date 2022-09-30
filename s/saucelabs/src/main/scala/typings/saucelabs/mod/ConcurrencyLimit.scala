package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrencyLimit
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var mac: js.UndefOr[Double] = js.undefined
  
  var overall: js.UndefOr[Double] = js.undefined
  
  var real_device: js.UndefOr[Double] = js.undefined
  
  var scout: js.UndefOr[Double] = js.undefined
}
object ConcurrencyLimit {
  
  inline def apply(): ConcurrencyLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyLimit]
  }
  
  extension [Self <: ConcurrencyLimit](x: Self) {
    
    inline def setMac(value: Double): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setOverall(value: Double): Self = StObject.set(x, "overall", value.asInstanceOf[js.Any])
    
    inline def setOverallUndefined: Self = StObject.set(x, "overall", js.undefined)
    
    inline def setReal_device(value: Double): Self = StObject.set(x, "real_device", value.asInstanceOf[js.Any])
    
    inline def setReal_deviceUndefined: Self = StObject.set(x, "real_device", js.undefined)
    
    inline def setScout(value: Double): Self = StObject.set(x, "scout", value.asInstanceOf[js.Any])
    
    inline def setScoutUndefined: Self = StObject.set(x, "scout", js.undefined)
  }
}
