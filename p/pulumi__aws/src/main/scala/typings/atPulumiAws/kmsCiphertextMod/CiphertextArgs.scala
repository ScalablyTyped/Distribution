package typings.atPulumiAws.kmsCiphertextMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CiphertextArgs extends js.Object {
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: Input[String]
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: Input[String]
}

object CiphertextArgs {
  @scala.inline
  def apply(
    keyId: Input[String],
    plaintext: Input[String],
    context: Input[StringDictionary[Input[String]]] = null
  ): CiphertextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiphertextArgs]
  }
}

