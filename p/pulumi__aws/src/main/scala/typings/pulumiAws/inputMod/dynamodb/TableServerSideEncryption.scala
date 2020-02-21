package typings.pulumiAws.inputMod.dynamodb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableServerSideEncryption extends js.Object {
  /**
    * Whether to enable point-in-time recovery - note that it can take up to 10 minutes to enable for new tables. If the `pointInTimeRecovery` block is not provided then this defaults to `false`.
    */
  var enabled: Input[Boolean] = js.native
  /**
    * The ARN of the CMK that should be used for the AWS KMS encryption.
    * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
}

object TableServerSideEncryption {
  @scala.inline
  def apply(enabled: Input[Boolean], kmsKeyArn: Input[String] = null): TableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableServerSideEncryption]
  }
}

