package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushData extends StObject {
  
  /** payload for APNs messages */
  var apns: js.UndefOr[Any] = js.undefined
  
  /** payload for GCM messages */
  var gcm: js.UndefOr[Any] = js.undefined
}
object PushData {
  
  inline def apply(): PushData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushData]
  }
  
  extension [Self <: PushData](x: Self) {
    
    inline def setApns(value: Any): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    inline def setGcm(value: Any): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    inline def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
  }
}
