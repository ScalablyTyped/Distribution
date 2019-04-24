package typings
package atPulumiAwsLib.kmsGetCipherTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCipherTextResult extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: java.lang.String
  val context: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val keyId: java.lang.String
  val plaintext: java.lang.String
}

object GetCipherTextResult {
  @scala.inline
  def apply(
    ciphertextBlob: java.lang.String,
    id: java.lang.String,
    keyId: java.lang.String,
    plaintext: java.lang.String,
    context: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): GetCipherTextResult = {
    val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob, id = id, keyId = keyId, plaintext = plaintext)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[GetCipherTextResult]
  }
}

