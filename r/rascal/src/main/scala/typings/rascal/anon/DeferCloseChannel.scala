package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferCloseChannel extends js.Object {
  
  var deferCloseChannel: Double = js.native
  
  var prefetch: Double = js.native
  
  var redeliveries: Limit = js.native
  
  var retry: Factor = js.native
  
  var vhost: String = js.native
}
object DeferCloseChannel {
  
  @scala.inline
  def apply(deferCloseChannel: Double, prefetch: Double, redeliveries: Limit, retry: Factor, vhost: String): DeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferCloseChannel]
  }
  
  @scala.inline
  implicit class DeferCloseChannelOps[Self <: DeferCloseChannel] (val x: Self) extends AnyVal {
    
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
    def setDeferCloseChannel(value: Double): Self = this.set("deferCloseChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefetch(value: Double): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeliveries(value: Limit): Self = this.set("redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Factor): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String): Self = this.set("vhost", value.asInstanceOf[js.Any])
  }
}
