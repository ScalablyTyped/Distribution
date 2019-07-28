package typings.atPulumiAws.kmsGetCipherTextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCipherTextResult extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: String
  val context: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val keyId: String
  val plaintext: String
}

object GetCipherTextResult {
  @scala.inline
  def apply(
    ciphertextBlob: String,
    id: String,
    keyId: String,
    plaintext: String,
    context: StringDictionary[String] = null
  ): GetCipherTextResult = {
    val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob, id = id, keyId = keyId, plaintext = plaintext)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[GetCipherTextResult]
  }
}

