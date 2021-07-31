package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushData extends StObject {
  
  /** payload for APNs messages */
  var apns: js.UndefOr[js.Any] = js.undefined
  
  /** payload for GCM messages */
  var gcm: js.UndefOr[js.Any] = js.undefined
}
object PushData {
  
  @scala.inline
  def apply(): PushData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushData]
  }
  
  @scala.inline
  implicit class PushDataMutableBuilder[Self <: PushData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: js.Any): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    @scala.inline
    def setGcm(value: js.Any): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
  }
}
