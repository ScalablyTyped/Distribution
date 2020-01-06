package typings.atPulumiAws.kmsGetKeyMod

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
  def apply(keyId: String, grantTokens: js.Array[String] = null): GetKeyArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyArgs]
  }
}

