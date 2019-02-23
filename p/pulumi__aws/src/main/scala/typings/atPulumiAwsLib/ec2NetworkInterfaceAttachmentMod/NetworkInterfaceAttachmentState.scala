package typings
package atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachmentState extends js.Object {
  /**
    * The ENI Attachment ID.
    */
  val attachmentId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Network interface index (int).
    */
  val deviceIndex: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Instance ID to attach.
    */
  val instanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The status of the Network Interface Attachment.
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

