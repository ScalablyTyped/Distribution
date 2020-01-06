package typings.atPulumiAws.lightsailStaticIpAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpAttachmentState extends js.Object {
  /**
    * The name of the Lightsail instance to attach the IP to
    */
  val instanceName: js.UndefOr[Input[String]] = js.native
  /**
    * The allocated static IP address
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the allocated static IP
    */
  val staticIpName: js.UndefOr[Input[String]] = js.native
}

object StaticIpAttachmentState {
  @scala.inline
  def apply(
    instanceName: Input[String] = null,
    ipAddress: Input[String] = null,
    staticIpName: Input[String] = null
  ): StaticIpAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (staticIpName != null) __obj.updateDynamic("staticIpName")(staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpAttachmentState]
  }
}

