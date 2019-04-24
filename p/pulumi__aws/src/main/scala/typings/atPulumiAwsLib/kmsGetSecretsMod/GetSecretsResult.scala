package typings
package atPulumiAwsLib.kmsGetSecretsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Map containing each `secret` `name` as the key with its decrypted plaintext value
    */
  val plaintext: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val secrets: js.Array[atPulumiAwsLib.Anon_Context]
}

object GetSecretsResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    plaintext: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    secrets: js.Array[atPulumiAwsLib.Anon_Context]
  ): GetSecretsResult = {
    val __obj = js.Dynamic.literal(id = id, plaintext = plaintext, secrets = secrets)
  
    __obj.asInstanceOf[GetSecretsResult]
  }
}

