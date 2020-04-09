package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Default is `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object FirehoseDeliveryStreamServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): FirehoseDeliveryStreamServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamServerSideEncryption]
  }
}

