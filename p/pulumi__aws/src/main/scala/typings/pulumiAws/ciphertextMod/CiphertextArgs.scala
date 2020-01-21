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

