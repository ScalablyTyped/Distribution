package typings.atPulumiAws.kmsGetSecretMod

import typings.atPulumiAws.Anon_Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  val secrets: js.Array[Anon_Context]
}

object GetSecretArgs {
  @scala.inline
  def apply(secrets: js.Array[Anon_Context]): GetSecretArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets)
  
    __obj.asInstanceOf[GetSecretArgs]
  }
}

