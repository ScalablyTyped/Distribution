package typings.atPulumiAws.kmsGetSecretsMod

import typings.atPulumiAws.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretsArgs extends js.Object {
  /**
    * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
    */
  val secrets: js.Array[Anon_Context]
}

object GetSecretsArgs {
  @scala.inline
  def apply(secrets: js.Array[Anon_Context]): GetSecretsArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets)
  
    __obj.asInstanceOf[GetSecretsArgs]
  }
}

