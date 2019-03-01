package typings
package atPulumiAwsLib.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupArgs extends js.Object {
  /**
    * The friendly IAM group name to match.
    */
  val groupName: java.lang.String
}

object GetGroupArgs {
  @scala.inline
  def apply(groupName: java.lang.String): GetGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupName")(groupName)
    __obj.asInstanceOf[GetGroupArgs]
  }
}

