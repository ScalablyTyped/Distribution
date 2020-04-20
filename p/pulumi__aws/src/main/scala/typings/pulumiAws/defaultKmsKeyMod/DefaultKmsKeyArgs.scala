package typings.pulumiAws.defaultKmsKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultKmsKeyArgs extends js.Object {
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
    */
  val keyArn: Input[String] = js.native
}

object DefaultKmsKeyArgs {
  @scala.inline
  def apply(keyArn: Input[String]): DefaultKmsKeyArgs = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultKmsKeyArgs]
  }
}

