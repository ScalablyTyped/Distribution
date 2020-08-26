package typings.pulumiAws.inputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableServerSideEncryption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var kmsKeyArn: js.UndefOr[String] = js.native
}

object GetTableServerSideEncryption {
  @scala.inline
  def apply(): GetTableServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableServerSideEncryption]
  }
  @scala.inline
  implicit class GetTableServerSideEncryptionOps[Self <: GetTableServerSideEncryption] (val x: Self) extends AnyVal {
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
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
  }
  
}

