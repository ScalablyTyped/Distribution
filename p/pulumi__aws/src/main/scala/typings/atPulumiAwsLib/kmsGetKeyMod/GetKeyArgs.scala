package typings
package atPulumiAwsLib.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyArgs extends js.Object {
  /**
    * List of grant tokens
    */
  val grantTokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Key identifier which can be one of the following format:
    * * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
    * * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
    * * Alias name. E.g.: `alias/my-key`
    * * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
    */
  val keyId: java.lang.String
}

object GetKeyArgs {
  @scala.inline
  def apply(keyId: java.lang.String, grantTokens: js.Array[java.lang.String] = null): GetKeyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyId")(keyId)
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens)
    __obj.asInstanceOf[GetKeyArgs]
  }
}

