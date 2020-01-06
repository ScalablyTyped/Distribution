package typings.atPulumiAws.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupArgs extends js.Object {
  /**
    * The friendly IAM group name to match.
    */
  val groupName: String = js.native
}

object GetGroupArgs {
  @scala.inline
  def apply(groupName: String): GetGroupArgs = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupArgs]
  }
}

