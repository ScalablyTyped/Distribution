package typings.atPulumiAws.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the group.
    */
  val arn: String
  /**
    * The stable and unique string identifying the group.
    */
  val groupId: String
  val groupName: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The path to the group.
    */
  val path: String
}

object GetGroupResult {
  @scala.inline
  def apply(arn: String, groupId: String, groupName: String, id: String, path: String): GetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, groupId = groupId, groupName = groupName, id = id, path = path)
  
    __obj.asInstanceOf[GetGroupResult]
  }
}

