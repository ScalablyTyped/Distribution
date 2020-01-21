package typings.pulumiAws.defaultKmsKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultKmsKeyState extends js.Object {
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
    */
  val keyArn: js.UndefOr[Input[String]] = js.native
}

object DefaultKmsKeyState {
  @scala.inline
  def apply(keyArn: Input[String] = null): DefaultKmsKeyState = {
    val __obj = js.Dynamic.literal()
    if (keyArn != null) __obj.updateDynamic("keyArn")(keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultKmsKeyState]
  }
}

