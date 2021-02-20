package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.baseline
import typings.saucelabs.saucelabsStrings.new_regime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlierDetails
  extends /* key */ StringDictionary[js.Any] {
  
  var reason: js.UndefOr[baseline | new_regime] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
}
object OutlierDetails {
  
  @scala.inline
  def apply(): OutlierDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlierDetails]
  }
  
  @scala.inline
  implicit class OutlierDetailsMutableBuilder[Self <: OutlierDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: baseline | new_regime): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
