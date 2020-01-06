package typings.atPulumiAws.kmsGetCipherTextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCipherTextResult extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: String = js.native
  val context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyId: String = js.native
  val plaintext: String = js.native
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
    val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCipherTextResult]
  }
}

