package typings
package atPulumiAwsLib.iotPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy]
  /**
    * The identity to which the policy is attached.
    */
  val target: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]
}

