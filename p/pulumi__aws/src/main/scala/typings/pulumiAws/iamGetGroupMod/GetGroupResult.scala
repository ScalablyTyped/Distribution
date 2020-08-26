package typings.pulumiAws.iamGetGroupMod

import typings.pulumiAws.outputMod.iam.GetGroupUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the iam user.
    */
  val arn: String = js.native
  /**
    * The stable and unique string identifying the group.
    */
  val groupId: String = js.native
  val groupName: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The path to the iam user.
    */
  val path: String = js.native
  /**
    * List of objects containing group member information. See supported fields below.
    */
  val users: js.Array[GetGroupUser] = js.native
}

object GetGroupResult {
  @scala.inline
  def apply(
    arn: String,
    groupId: String,
    groupName: String,
    id: String,
    path: String,
    users: js.Array[GetGroupUser]
  ): GetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupResult]
  }
  @scala.inline
  implicit class GetGroupResultOps[Self <: GetGroupResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: GetGroupUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[GetGroupUser]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

