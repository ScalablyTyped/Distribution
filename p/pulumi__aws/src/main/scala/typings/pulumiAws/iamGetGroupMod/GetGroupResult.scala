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
    * id is the provider-assigned unique ID for this managed resource.
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
}

