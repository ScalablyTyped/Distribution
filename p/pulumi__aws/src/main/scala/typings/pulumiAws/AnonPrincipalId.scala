package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrincipalId extends js.Object {
  var PrincipalId: String = js.native
  var Type: String = js.native
}

object AnonPrincipalId {
  @scala.inline
  def apply(PrincipalId: String, Type: String): AnonPrincipalId = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrincipalId]
  }
}

