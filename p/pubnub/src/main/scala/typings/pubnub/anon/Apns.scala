package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apns extends StObject {
  
  var apns: js.Object
  
  var fcm: js.Object
  
  var mpns: js.Object
}
object Apns {
  
  @scala.inline
  def apply(apns: js.Object, fcm: js.Object, mpns: js.Object): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
  
  @scala.inline
  implicit class ApnsMutableBuilder[Self <: Apns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: js.Object): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcm(value: js.Object): Self = StObject.set(x, "fcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpns(value: js.Object): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
  }
}
