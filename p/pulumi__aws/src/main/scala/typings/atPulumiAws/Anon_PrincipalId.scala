package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PrincipalId extends js.Object {
  var PrincipalId: String = js.native
  var Type: String = js.native
}

object Anon_PrincipalId {
  @scala.inline
  def apply(PrincipalId: String, Type: String): Anon_PrincipalId = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrincipalId]
  }
}

