package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableServerSideEncryption extends js.Object {
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: Boolean = js.native
  /**
    * The ARN of the CMK that should be used for the AWS KMS encryption.
    * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
    */
  var kmsKeyArn: String = js.native
}

object TableServerSideEncryption {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyArn: String): TableServerSideEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableServerSideEncryption]
  }
  @scala.inline
  implicit class TableServerSideEncryptionOps[Self <: TableServerSideEncryption] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
  }
  
}

