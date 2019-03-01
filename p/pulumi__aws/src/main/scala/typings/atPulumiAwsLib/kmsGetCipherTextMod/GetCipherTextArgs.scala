package typings
package atPulumiAwsLib.kmsGetCipherTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCipherTextArgs extends js.Object {
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: java.lang.String
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: java.lang.String
}

object GetCipherTextArgs {
  @scala.inline
  def apply(
    keyId: java.lang.String,
    plaintext: java.lang.String,
    context: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): GetCipherTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyId")(keyId)
    __obj.updateDynamic("plaintext")(plaintext)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[GetCipherTextArgs]
  }
}

