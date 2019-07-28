package typings.atPulumiAws.kmsGetSecretsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Map containing each `secret` `name` as the key with its decrypted plaintext value
    */
  val plaintext: StringDictionary[String]
  val secrets: js.Array[Anon_Context]
}

object GetSecretsResult {
  @scala.inline
  def apply(id: String, plaintext: StringDictionary[String], secrets: js.Array[Anon_Context]): GetSecretsResult = {
    val __obj = js.Dynamic.literal(id = id, plaintext = plaintext, secrets = secrets)
  
    __obj.asInstanceOf[GetSecretsResult]
  }
}

