package typings.atPulumiAws.iamGetRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleArgs extends js.Object {
  /**
    * The friendly IAM role name to match.
    */
  val name: String
}

object GetRoleArgs {
  @scala.inline
  def apply(name: String): GetRoleArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetRoleArgs]
  }
}

