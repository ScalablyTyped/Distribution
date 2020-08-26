package typings.pulumiAws.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyArgs extends js.Object {
  /**
    * List of grant tokens
    */
  val grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key identifier which can be one of the following format:
    * * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
    * * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
    * * Alias name. E.g.: `alias/my-key`
    * * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
    */
  val keyId: String = js.native
}

object GetKeyArgs {
  @scala.inline
  def apply(keyId: String): GetKeyArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyArgs]
  }
  @scala.inline
  implicit class GetKeyArgsOps[Self <: GetKeyArgs] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantTokensVarargs(value: String*): Self = this.set("grantTokens", js.Array(value :_*))
    @scala.inline
    def setGrantTokens(value: js.Array[String]): Self = this.set("grantTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantTokens: Self = this.set("grantTokens", js.undefined)
  }
  
}

