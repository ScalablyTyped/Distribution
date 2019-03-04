package typings
package atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachmentArgs extends js.Object {
  /**
    * Network interface index (int).
    */
  val deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * Instance ID to attach.
    */
  val instanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object NetworkInterfaceAttachmentArgs {
  @scala.inline
  def apply(
    deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double],
    instanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): NetworkInterfaceAttachmentArgs = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterfaceAttachmentArgs]
  }
}

