package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamServerSideEncryption extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object FirehoseDeliveryStreamServerSideEncryption {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): FirehoseDeliveryStreamServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[FirehoseDeliveryStreamServerSideEncryption]
  }
}

