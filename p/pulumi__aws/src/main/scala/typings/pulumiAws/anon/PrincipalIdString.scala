package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalIdString extends js.Object {
  var principalId: String = js.native
}

object PrincipalIdString {
  @scala.inline
  def apply(principalId: String): PrincipalIdString = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalIdString]
  }
}

