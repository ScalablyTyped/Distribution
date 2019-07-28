package typings.atPulumiAws.kmsGetCipherTextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCipherTextArgs extends js.Object {
  /**
    * An optional mapping that makes up the encryption context.
    */
  val context: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Globally unique key ID for the customer master key.
    */
  val keyId: String
  /**
    * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
    */
  val plaintext: String
}

object GetCipherTextArgs {
  @scala.inline
  def apply(keyId: String, plaintext: String, context: StringDictionary[String] = null): GetCipherTextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId, plaintext = plaintext)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[GetCipherTextArgs]
  }
}

