package typings.pulumiAws.outputMod.glacier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultNotification extends js.Object {
  
  /**
    * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
    */
  var events: js.Array[String] = js.native
  
  /**
    * The SNS Topic ARN.
    */
  var snsTopic: String = js.native
}
object VaultNotification {
  
  @scala.inline
  def apply(events: js.Array[String], snsTopic: String): VaultNotification = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultNotification]
  }
  
  @scala.inline
  implicit class VaultNotificationOps[Self <: VaultNotification] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopic(value: String): Self = this.set("snsTopic", value.asInstanceOf[js.Any])
  }
}
