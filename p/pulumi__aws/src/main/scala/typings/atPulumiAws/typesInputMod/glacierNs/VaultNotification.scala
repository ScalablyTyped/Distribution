package typings.atPulumiAws.typesInputMod.glacierNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultNotification extends js.Object {
  /**
    * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
    */
  var events: Input[js.Array[Input[String]]]
  /**
    * The SNS Topic ARN.
    */
  var snsTopic: Input[String]
}

object VaultNotification {
  @scala.inline
  def apply(events: Input[js.Array[Input[String]]], snsTopic: Input[String]): VaultNotification = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VaultNotification]
  }
}

