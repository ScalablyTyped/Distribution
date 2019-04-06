package typings
package atPulumiAwsLib.kmsCiphertextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CiphertextState extends js.Object {
  /**
    * Base64 encoded ciphertext
    */
  val ciphertextBlob: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object CiphertextState {
  @scala.inline
  def apply(
    ciphertextBlob: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    context: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    keyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    plaintext: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): CiphertextState = {
    val __obj = js.Dynamic.literal()
    if (ciphertextBlob != null) __obj.updateDynamic("ciphertextBlob")(ciphertextBlob.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiphertextState]
  }
}

