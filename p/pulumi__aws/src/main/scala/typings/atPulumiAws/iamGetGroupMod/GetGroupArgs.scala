package typings.atPulumiAws.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupArgs extends js.Object {
  /**
    * The friendly IAM group name to match.
    */
  val groupName: String
}

object GetGroupArgs {
  @scala.inline
  def apply(groupName: String): GetGroupArgs = {
    val __obj = js.Dynamic.literal(groupName = groupName)
  
    __obj.asInstanceOf[GetGroupArgs]
  }
}

