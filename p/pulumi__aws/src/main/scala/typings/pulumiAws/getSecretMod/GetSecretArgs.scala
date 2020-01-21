package typings.pulumiAws.getSecretMod

import typings.pulumiAws.inputMod.kms.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretArgs extends js.Object {
  val secrets: js.Array[GetSecretSecret] = js.native
}

object GetSecretArgs {
  @scala.inline
  def apply(secrets: js.Array[GetSecretSecret]): GetSecretArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecretArgs]
  }
}

