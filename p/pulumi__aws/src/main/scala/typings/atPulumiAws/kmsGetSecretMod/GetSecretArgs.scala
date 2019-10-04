package typings.atPulumiAws.kmsGetSecretMod

import typings.atPulumiAws.typesInputMod.kmsNs.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretArgs extends js.Object {
  val secrets: js.Array[GetSecretSecret]
}

object GetSecretArgs {
  @scala.inline
  def apply(secrets: js.Array[GetSecretSecret]): GetSecretArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets)
  
    __obj.asInstanceOf[GetSecretArgs]
  }
}

