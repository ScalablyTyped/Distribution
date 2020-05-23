package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalId extends js.Object {
  var PrincipalId: String = js.native
  var Type: String = js.native
}

object PrincipalId {
  @scala.inline
  def apply(PrincipalId: String, Type: String): PrincipalId = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalId]
  }
}

