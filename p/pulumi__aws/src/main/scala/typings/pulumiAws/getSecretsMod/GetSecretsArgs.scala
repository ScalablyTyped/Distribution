package typings.pulumiAws.getSecretsMod

import typings.pulumiAws.inputMod.kms.GetSecretsSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsArgs extends js.Object {
  /**
    * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
    */
  val secrets: js.Array[GetSecretsSecret] = js.native
}

object GetSecretsArgs {
  @scala.inline
  def apply(secrets: js.Array[GetSecretsSecret]): GetSecretsArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsArgs]
  }
}

