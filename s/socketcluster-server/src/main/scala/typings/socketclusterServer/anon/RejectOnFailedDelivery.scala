package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectOnFailedDelivery extends js.Object {
  
  var rejectOnFailedDelivery: Boolean = js.native
}
object RejectOnFailedDelivery {
  
  @scala.inline
  def apply(rejectOnFailedDelivery: Boolean): RejectOnFailedDelivery = {
    val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectOnFailedDelivery]
  }
  
  @scala.inline
  implicit class RejectOnFailedDeliveryOps[Self <: RejectOnFailedDelivery] (val x: Self) extends AnyVal {
    
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
    def setRejectOnFailedDelivery(value: Boolean): Self = this.set("rejectOnFailedDelivery", value.asInstanceOf[js.Any])
  }
}
