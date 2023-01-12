package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.baseline
import typings.saucelabs.saucelabsStrings.new_regime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlierDetails
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var reason: js.UndefOr[baseline | new_regime] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
}
object OutlierDetails {
  
  inline def apply(): OutlierDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlierDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlierDetails] (val x: Self) extends AnyVal {
    
    inline def setReason(value: baseline | new_regime): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
