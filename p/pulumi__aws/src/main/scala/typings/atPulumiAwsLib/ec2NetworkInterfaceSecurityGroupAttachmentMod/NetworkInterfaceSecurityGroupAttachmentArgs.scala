package typings
package atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceSecurityGroupAttachmentArgs extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the security group.
    */
  val securityGroupId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

