package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apns extends js.Object {
  
  var apns: js.Object = js.native
  
  var fcm: js.Object = js.native
  
  var mpns: js.Object = js.native
}
object Apns {
  
  @scala.inline
  def apply(apns: js.Object, fcm: js.Object, mpns: js.Object): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
  
  @scala.inline
  implicit class ApnsOps[Self <: Apns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApns(value: js.Object): Self = this.set("apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcm(value: js.Object): Self = this.set("fcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpns(value: js.Object): Self = this.set("mpns", value.asInstanceOf[js.Any])
  }
}
