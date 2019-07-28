package typings.atPulumiAws.ec2NetworkInterfaceAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachmentArgs extends js.Object {
  /**
    * Network interface index (int).
    */
  val deviceIndex: Input[Double]
  /**
    * Instance ID to attach.
    */
  val instanceId: Input[String]
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: Input[String]
}

object NetworkInterfaceAttachmentArgs {
  @scala.inline
  def apply(deviceIndex: Input[Double], instanceId: Input[String], networkInterfaceId: Input[String]): NetworkInterfaceAttachmentArgs = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
  }
}

