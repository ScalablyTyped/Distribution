package typings.pulumiAws.getCipherTextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCipherTextArgs extends js.Object {
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: String = js.native
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: String = js.native
}

object GetCipherTextArgs {
  @scala.inline
  def apply(keyId: String, plaintext: String): GetCipherTextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCipherTextArgs]
  }
  @scala.inline
  implicit class GetCipherTextArgsOps[Self <: GetCipherTextArgs] (val x: Self) extends AnyVal {
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
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: StringDictionary[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

