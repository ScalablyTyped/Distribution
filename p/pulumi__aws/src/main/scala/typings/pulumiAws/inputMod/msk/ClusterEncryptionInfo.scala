package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfo extends js.Object {
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[Input[ClusterEncryptionInfoEncryptionInTransit]] = js.native
}

object ClusterEncryptionInfo {
  @scala.inline
  def apply(): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
  @scala.inline
  implicit class ClusterEncryptionInfoOps[Self <: ClusterEncryptionInfo] (val x: Self) extends AnyVal {
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
    def setEncryptionAtRestKmsKeyArn(value: Input[String]): Self = this.set("encryptionAtRestKmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAtRestKmsKeyArn: Self = this.set("encryptionAtRestKmsKeyArn", js.undefined)
    @scala.inline
    def setEncryptionInTransit(value: Input[ClusterEncryptionInfoEncryptionInTransit]): Self = this.set("encryptionInTransit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionInTransit: Self = this.set("encryptionInTransit", js.undefined)
  }
  
}

