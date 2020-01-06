package typings.atPulumiAws.typesOutputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsSecret extends js.Object {
  /**
    * An optional mapping that makes up the Encryption Context for the secret.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An optional list of Grant Tokens for the secret.
    */
  var grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name to export this secret under in the attributes.
    */
  var name: String = js.native
  /**
    * Base64 encoded payload, as returned from a KMS encrypt operation.
    */
  var payload: String = js.native
}

object GetSecretsSecret {
  @scala.inline
  def apply(
    name: String,
    payload: String,
    context: StringDictionary[String] = null,
    grantTokens: js.Array[String] = null
  ): GetSecretsSecret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsSecret]
  }
}

