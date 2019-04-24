package typings
package atPulumiAwsLib.kmsGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val secrets: js.Array[atPulumiAwsLib.Anon_Context]
}

object GetSecretResult {
  @scala.inline
  def apply(id: java.lang.String, secrets: js.Array[atPulumiAwsLib.Anon_Context]): GetSecretResult = {
    val __obj = js.Dynamic.literal(id = id, secrets = secrets)
  
    __obj.asInstanceOf[GetSecretResult]
  }
}

