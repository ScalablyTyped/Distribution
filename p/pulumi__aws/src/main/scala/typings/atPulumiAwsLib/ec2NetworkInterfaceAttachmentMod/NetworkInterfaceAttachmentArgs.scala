package typings
package atPulumiAwsLib.ec2NetworkInterfaceAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachmentArgs extends js.Object {
  /**
    * Network interface index (int).
    */
  val deviceIndex: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * Instance ID to attach.
    */
  val instanceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

