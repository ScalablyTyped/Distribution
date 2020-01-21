package typings.pulumiAws.getRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleArgs extends js.Object {
  /**
    * The friendly IAM role name to match.
    */
  val name: String = js.native
}

object GetRoleArgs {
  @scala.inline
  def apply(name: String): GetRoleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRoleArgs]
  }
}

