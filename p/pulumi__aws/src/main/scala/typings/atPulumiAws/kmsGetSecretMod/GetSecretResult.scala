package typings.atPulumiAws.kmsGetSecretMod

import typings.atPulumiAws.typesOutputMod.kmsNs.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val secrets: js.Array[GetSecretSecret]
}

object GetSecretResult {
  @scala.inline
  def apply(id: String, secrets: js.Array[GetSecretSecret]): GetSecretResult = {
    val __obj = js.Dynamic.literal(id = id, secrets = secrets)
  
    __obj.asInstanceOf[GetSecretResult]
  }
}

