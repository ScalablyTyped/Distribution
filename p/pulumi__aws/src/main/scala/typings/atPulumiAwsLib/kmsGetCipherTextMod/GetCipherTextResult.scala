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
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetCipherTextResult {
  @scala.inline
  def apply(ciphertextBlob: java.lang.String, id: java.lang.String): GetCipherTextResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ciphertextBlob")(ciphertextBlob)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetCipherTextResult]
  }
}

