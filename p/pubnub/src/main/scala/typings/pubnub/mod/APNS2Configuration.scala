package typings.pubnub.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// APNS2
trait APNS2Configuration extends StObject {
  
  var collapseId: js.UndefOr[String] = js.undefined
  
  var expirationDate: js.UndefOr[Date] = js.undefined
  
  var targets: js.Array[APNS2Target]
}
object APNS2Configuration {
  
  inline def apply(targets: js.Array[APNS2Target]): APNS2Configuration = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Configuration]
  }
  
  extension [Self <: APNS2Configuration](x: Self) {
    
    inline def setCollapseId(value: String): Self = StObject.set(x, "collapseId", value.asInstanceOf[js.Any])
    
    inline def setCollapseIdUndefined: Self = StObject.set(x, "collapseId", js.undefined)
    
    inline def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setTargets(value: js.Array[APNS2Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: APNS2Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
