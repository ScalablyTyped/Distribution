package typings
package atPulumiAwsLib.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the group.
    */
  val arn: java.lang.String
  /**
    * The stable and unique string identifying the group.
    */
  val groupId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The path to the group.
    */
  val path: java.lang.String
}

object GetGroupResult {
  @scala.inline
  def apply(arn: java.lang.String, groupId: java.lang.String, id: java.lang.String, path: java.lang.String): GetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, groupId = groupId, id = id, path = path)
  
    __obj.asInstanceOf[GetGroupResult]
  }
}

