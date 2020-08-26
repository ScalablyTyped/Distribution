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
  @scala.inline
  implicit class DefaultKmsKeyArgsOps[Self <: DefaultKmsKeyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyArn(value: Input[String]): Self = this.set("keyArn", value.asInstanceOf[js.Any])
  }
  
}

