package typings.pulumiAws.getSecretMod

import typings.pulumiAws.outputMod.kms.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val secrets: js.Array[GetSecretSecret] = js.native
}

object GetSecretResult {
  @scala.inline
  def apply(id: String, secrets: js.Array[GetSecretSecret]): GetSecretResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecretResult]
  }
}

