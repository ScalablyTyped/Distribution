package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelSnapshotDeliveryProperties extends js.Object {
  /**
    * - The frequency with which AWS Config recurringly delivers configuration snapshots.
    * e.g. `One_Hour` or `Three_Hours`.
    * Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
    */
  var deliveryFrequency: js.UndefOr[String] = js.native
}

object DeliveryChannelSnapshotDeliveryProperties {
  @scala.inline
  def apply(deliveryFrequency: String = null): DeliveryChannelSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    if (deliveryFrequency != null) __obj.updateDynamic("deliveryFrequency")(deliveryFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryChannelSnapshotDeliveryProperties]
  }
}

