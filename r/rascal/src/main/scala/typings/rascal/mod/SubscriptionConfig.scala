package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Consume
import typings.rascal.anon.Counter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionConfig extends js.Object {
  
  var autoCreated: js.UndefOr[Boolean] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var deferCloseChannel: js.UndefOr[Double] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var handler: js.UndefOr[String] = js.native
  
  var handlers: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.UndefOr[Consume] = js.native
  
  var prefetch: js.UndefOr[Double] = js.native
  
  var queue: js.UndefOr[String] = js.native
  
  var recovery: js.UndefOr[js.Any] = js.native
  
  var redeliveries: js.UndefOr[Counter] = js.native
  
  var retry: js.UndefOr[RetryConfig | Boolean] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object SubscriptionConfig {
  
  @scala.inline
  def apply(): SubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionConfig]
  }
  
  @scala.inline
  implicit class SubscriptionConfigOps[Self <: SubscriptionConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoCreated(value: Boolean): Self = this.set("autoCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreated: Self = this.set("autoCreated", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDeferCloseChannel(value: Double): Self = this.set("deferCloseChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferCloseChannel: Self = this.set("deferCloseChannel", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHandlersVarargs(value: String*): Self = this.set("handlers", js.Array(value :_*))
    
    @scala.inline
    def setHandlers(value: js.Array[String]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setOptions(value: Consume): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPrefetch(value: Double): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setRecovery(value: js.Any): Self = this.set("recovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecovery: Self = this.set("recovery", js.undefined)
    
    @scala.inline
    def setRedeliveries(value: Counter): Self = this.set("redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedeliveries: Self = this.set("redeliveries", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryConfig | Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = this.set("vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
}
