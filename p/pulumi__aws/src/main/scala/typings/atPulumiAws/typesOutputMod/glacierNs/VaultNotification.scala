package typings.atPulumiAws.typesOutputMod.glacierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultNotification extends js.Object {
  /**
    * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
    */
  var events: js.Array[String]
  /**
    * The SNS Topic ARN.
    */
  var snsTopic: String
}

object VaultNotification {
  @scala.inline
  def apply(events: js.Array[String], snsTopic: String): VaultNotification = {
    val __obj = js.Dynamic.literal(events = events, snsTopic = snsTopic)
  
    __obj.asInstanceOf[VaultNotification]
  }
}

