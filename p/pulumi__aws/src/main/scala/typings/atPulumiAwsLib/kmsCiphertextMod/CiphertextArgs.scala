package typings
package atPulumiAwsLib.kmsCiphertextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CiphertextArgs extends js.Object {
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
  val keyId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object CiphertextArgs {
  @scala.inline
  def apply(
    keyId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    plaintext: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    context: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): CiphertextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiphertextArgs]
  }
}

