package typings.pulumiAws.ciphertextMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CiphertextArgs extends js.Object {
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: Input[String] = js.native
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: Input[String] = js.native
}

object CiphertextArgs {
  @scala.inline
  def apply(keyId: Input[String], plaintext: Input[String]): CiphertextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiphertextArgs]
  }
  @scala.inline
  implicit class CiphertextArgsOps[Self <: CiphertextArgs] (val x: Self) extends AnyVal {
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
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: Input[String]): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Input[StringDictionary[Input[String]]]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

