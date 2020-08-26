package typings.pulumiAws.getCipherTextMod

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
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyId: String = js.native
  val plaintext: String = js.native
}

object GetCipherTextResult {
  @scala.inline
  def apply(ciphertextBlob: String, id: String, keyId: String, plaintext: String): GetCipherTextResult = {
    val __obj = js.Dynamic.literal(ciphertextBlob = ciphertextBlob.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCipherTextResult]
  }
  @scala.inline
  implicit class GetCipherTextResultOps[Self <: GetCipherTextResult] (val x: Self) extends AnyVal {
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
    def setCiphertextBlob(value: String): Self = this.set("ciphertextBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: StringDictionary[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

