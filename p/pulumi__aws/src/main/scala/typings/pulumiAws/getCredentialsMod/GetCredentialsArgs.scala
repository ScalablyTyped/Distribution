package typings.pulumiAws.getCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsArgs extends js.Object {
  val registryId: String = js.native
}

object GetCredentialsArgs {
  @scala.inline
  def apply(registryId: String): GetCredentialsArgs = {
    val __obj = js.Dynamic.literal(registryId = registryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCredentialsArgs]
  }
}

