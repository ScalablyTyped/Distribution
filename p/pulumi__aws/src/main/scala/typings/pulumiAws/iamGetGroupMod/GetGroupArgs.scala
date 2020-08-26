package typings.pulumiAws.iamGetGroupMod

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
  @scala.inline
  implicit class GetGroupArgsOps[Self <: GetGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
  }
  
}

