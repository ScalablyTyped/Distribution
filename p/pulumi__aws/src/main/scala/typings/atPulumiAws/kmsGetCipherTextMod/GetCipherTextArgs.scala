package typings.atPulumiAws.kmsGetCipherTextMod

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
  def apply(keyId: String, plaintext: String, context: StringDictionary[String] = null): GetCipherTextArgs = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCipherTextArgs]
  }
}

