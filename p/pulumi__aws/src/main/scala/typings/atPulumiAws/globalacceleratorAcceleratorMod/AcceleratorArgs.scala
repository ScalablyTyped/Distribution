package typings.atPulumiAws.globalacceleratorAcceleratorMod

import typings.atPulumiAws.Anon_FlowLogsEnabledFlowLogsS3Bucket
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorArgs extends js.Object {
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: js.UndefOr[Input[Anon_FlowLogsEnabledFlowLogsS3Bucket]] = js.undefined
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the accelerator.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object AcceleratorArgs {
  @scala.inline
  def apply(
    attributes: Input[Anon_FlowLogsEnabledFlowLogsS3Bucket] = null,
    enabled: Input[Boolean] = null,
    ipAddressType: Input[String] = null,
    name: Input[String] = null
  ): AcceleratorArgs = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceleratorArgs]
  }
}

