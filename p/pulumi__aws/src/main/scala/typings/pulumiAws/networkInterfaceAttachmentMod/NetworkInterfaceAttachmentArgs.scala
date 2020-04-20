package typings.pulumiAws.networkInterfaceAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachmentArgs extends js.Object {
  /**
    * Network interface index (int).
    */
  val deviceIndex: Input[Double] = js.native
  /**
    * Instance ID to attach.
    */
  val instanceId: Input[String] = js.native
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: Input[String] = js.native
}

object NetworkInterfaceAttachmentArgs {
  @scala.inline
  def apply(deviceIndex: Input[Double], instanceId: Input[String], networkInterfaceId: Input[String]): NetworkInterfaceAttachmentArgs = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
  }
}

