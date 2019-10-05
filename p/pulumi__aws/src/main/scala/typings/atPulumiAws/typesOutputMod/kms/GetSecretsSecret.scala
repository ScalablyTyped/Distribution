package typings.atPulumiAws.typesOutputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretsSecret extends js.Object {
  /**
    * An optional mapping that makes up the Encryption Context for the secret.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An optional list of Grant Tokens for the secret.
    */
  var grantTokens: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name to export this secret under in the attributes.
    */
  var name: String
  /**
    * Base64 encoded payload, as returned from a KMS encrypt operation.
    */
  var payload: String
}

object GetSecretsSecret {
  @scala.inline
  def apply(
    name: String,
    payload: String,
    context: StringDictionary[String] = null,
    grantTokens: js.Array[String] = null
  ): GetSecretsSecret = {
    val __obj = js.Dynamic.literal(name = name, payload = payload)
    if (context != null) __obj.updateDynamic("context")(context)
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens)
    __obj.asInstanceOf[GetSecretsSecret]
  }
}

