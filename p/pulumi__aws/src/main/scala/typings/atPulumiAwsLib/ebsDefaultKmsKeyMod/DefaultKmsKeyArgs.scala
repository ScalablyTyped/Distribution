package typings
package atPulumiAwsLib.ebsDefaultKmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultKmsKeyArgs extends js.Object {
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
    */
  val keyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object DefaultKmsKeyArgs {
  @scala.inline
  def apply(keyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]): DefaultKmsKeyArgs = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultKmsKeyArgs]
  }
}

