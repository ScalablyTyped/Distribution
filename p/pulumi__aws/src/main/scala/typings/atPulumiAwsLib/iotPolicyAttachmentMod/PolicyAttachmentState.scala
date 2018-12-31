package typings
package atPulumiAwsLib.iotPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentState extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iotMod.Policy]
  ] = js.undefined
  /**
    * The identity to which the policy is attached.
    */
  val target: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
}

