package typings.atPulumiAws.typesOutputMod.cloudwatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetKinesisTarget extends js.Object {
  /**
    * The JSON path to be extracted from the event and used as the partition key.
    */
  var partitionKeyPath: js.UndefOr[String] = js.undefined
}

object EventTargetKinesisTarget {
  @scala.inline
  def apply(partitionKeyPath: String = null): EventTargetKinesisTarget = {
    val __obj = js.Dynamic.literal()
    if (partitionKeyPath != null) __obj.updateDynamic("partitionKeyPath")(partitionKeyPath)
    __obj.asInstanceOf[EventTargetKinesisTarget]
  }
}

