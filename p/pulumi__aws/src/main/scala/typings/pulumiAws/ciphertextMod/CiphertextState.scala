package typings.pulumiAws.ciphertextMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CiphertextState extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: js.UndefOr[Input[String]] = js.native
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: js.UndefOr[Input[String]] = js.native
}

object CiphertextState {
  @scala.inline
  def apply(
    ciphertextBlob: Input[String] = null,
    context: Input[StringDictionary[Input[String]]] = null,
    keyId: Input[String] = null,
    plaintext: Input[String] = null
  ): CiphertextState = {
    val __obj = js.Dynamic.literal()
    if (ciphertextBlob != null) __obj.updateDynamic("ciphertextBlob")(ciphertextBlob.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiphertextState]
  }
}

