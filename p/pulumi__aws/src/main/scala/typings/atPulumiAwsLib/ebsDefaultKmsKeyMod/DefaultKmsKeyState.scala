package typings
package atPulumiAwsLib.ebsDefaultKmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultKmsKeyState extends js.Object {
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
    */
  val keyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object DefaultKmsKeyState {
  @scala.inline
  def apply(keyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): DefaultKmsKeyState = {
    val __obj = js.Dynamic.literal()
    if (keyArn != null) __obj.updateDynamic("keyArn")(keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultKmsKeyState]
  }
}

