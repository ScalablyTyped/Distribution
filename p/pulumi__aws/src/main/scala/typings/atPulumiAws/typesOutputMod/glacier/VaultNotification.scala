package typings.atPulumiAws.typesOutputMod.glacier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

