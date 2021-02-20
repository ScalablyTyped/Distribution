package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrencyLimit
  extends /* key */ StringDictionary[js.Any] {
  
  var mac: js.UndefOr[Double] = js.native
  
  var overall: js.UndefOr[Double] = js.native
  
  var real_device: js.UndefOr[Double] = js.native
  
  var scout: js.UndefOr[Double] = js.native
}
object ConcurrencyLimit {
  
  @scala.inline
  def apply(): ConcurrencyLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyLimit]
  }
  
  @scala.inline
  implicit class ConcurrencyLimitMutableBuilder[Self <: ConcurrencyLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMac(value: Double): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setOverall(value: Double): Self = StObject.set(x, "overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallUndefined: Self = StObject.set(x, "overall", js.undefined)
    
    @scala.inline
    def setReal_device(value: Double): Self = StObject.set(x, "real_device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal_deviceUndefined: Self = StObject.set(x, "real_device", js.undefined)
    
    @scala.inline
    def setScout(value: Double): Self = StObject.set(x, "scout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoutUndefined: Self = StObject.set(x, "scout", js.undefined)
  }
}
