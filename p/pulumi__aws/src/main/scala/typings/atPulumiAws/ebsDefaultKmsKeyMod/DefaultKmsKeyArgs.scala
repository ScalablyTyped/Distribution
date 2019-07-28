package typings.atPulumiAws.ebsDefaultKmsKeyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultKmsKeyArgs extends js.Object {
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
    */
  val keyArn: Input[String]
}

object DefaultKmsKeyArgs {
  @scala.inline
  def apply(keyArn: Input[String]): DefaultKmsKeyArgs = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultKmsKeyArgs]
  }
}

