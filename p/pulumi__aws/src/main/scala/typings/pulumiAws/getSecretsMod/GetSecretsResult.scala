package typings.pulumiAws.getSecretsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kms.GetSecretsSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Map containing each `secret` `name` as the key with its decrypted plaintext value
    */
  val plaintext: StringDictionary[String] = js.native
  val secrets: js.Array[GetSecretsSecret] = js.native
}

object GetSecretsResult {
  @scala.inline
  def apply(id: String, plaintext: StringDictionary[String], secrets: js.Array[GetSecretsSecret]): GetSecretsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecretsResult]
  }
}

