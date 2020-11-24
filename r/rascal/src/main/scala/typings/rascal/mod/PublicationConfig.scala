package typings.rascal.mod

import typings.amqplib.propertiesMod.Options.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicationConfig extends js.Object {
  
  var autoCreated: js.UndefOr[Boolean] = js.native
  
  var confirm: js.UndefOr[Boolean] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var encryption: js.UndefOr[String] = js.native
  
  var exchange: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[Publish] = js.native
  
  var queue: js.UndefOr[String] = js.native
  
  var routingKey: js.UndefOr[String] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object PublicationConfig {
  
  @scala.inline
  def apply(): PublicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicationConfig]
  }
  
  @scala.inline
  implicit class PublicationConfigOps[Self <: PublicationConfig] (val x: Self) extends AnyVal {
    
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
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setEncryption(value: String): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setOptions(value: Publish): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setRoutingKey(value: String): Self = this.set("routingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingKey: Self = this.set("routingKey", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = this.set("vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
}
