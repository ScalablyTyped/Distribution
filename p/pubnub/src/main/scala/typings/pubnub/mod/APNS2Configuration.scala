package typings.pubnub.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// APNS2
@js.native
trait APNS2Configuration extends StObject {
  
  var collapseId: js.UndefOr[String] = js.native
  
  var expirationDate: js.UndefOr[Date] = js.native
  
  var targets: js.Array[APNS2Target] = js.native
}
object APNS2Configuration {
  
  @scala.inline
  def apply(targets: js.Array[APNS2Target]): APNS2Configuration = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Configuration]
  }
  
  @scala.inline
  implicit class APNS2ConfigurationMutableBuilder[Self <: APNS2Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseId(value: String): Self = StObject.set(x, "collapseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseIdUndefined: Self = StObject.set(x, "collapseId", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[APNS2Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: APNS2Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
