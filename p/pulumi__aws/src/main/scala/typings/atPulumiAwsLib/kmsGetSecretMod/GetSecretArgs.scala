package typings
package atPulumiAwsLib.kmsGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  val secrets: js.Array[atPulumiAwsLib.Anon_Context]
}

object GetSecretArgs {
  @scala.inline
  def apply(secrets: js.Array[atPulumiAwsLib.Anon_Context]): GetSecretArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets)
  
    __obj.asInstanceOf[GetSecretArgs]
  }
}

