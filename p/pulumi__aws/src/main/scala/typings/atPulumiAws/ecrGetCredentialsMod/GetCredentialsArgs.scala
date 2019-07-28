package typings.atPulumiAws.ecrGetCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsArgs extends js.Object {
  val registryId: String
}

object GetCredentialsArgs {
  @scala.inline
  def apply(registryId: String): GetCredentialsArgs = {
    val __obj = js.Dynamic.literal(registryId = registryId)
  
    __obj.asInstanceOf[GetCredentialsArgs]
  }
}

