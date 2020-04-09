package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamServerSideEncryption extends js.Object {
  /**
    * Whether to enable encryption at rest. Default is `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}

object FirehoseDeliveryStreamServerSideEncryption {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): FirehoseDeliveryStreamServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamServerSideEncryption]
  }
}

