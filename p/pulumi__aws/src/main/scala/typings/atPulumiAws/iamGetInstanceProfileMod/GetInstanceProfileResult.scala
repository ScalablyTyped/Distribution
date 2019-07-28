package typings.atPulumiAws.iamGetInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the instance profile.
    */
  val arn: String
  /**
    * The string representation of the date the instance profile
    * was created.
    */
  val createDate: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The path to the instance profile.
    */
  val path: String
  /**
    * The role arn associated with this instance profile.
    */
  val roleArn: String
  /**
    * The role id associated with this instance profile.
    */
  val roleId: String
  /**
    * The role name associated with this instance profile.
    */
  val roleName: String
}

object GetInstanceProfileResult {
  @scala.inline
  def apply(
    arn: String,
    createDate: String,
    id: String,
    name: String,
    path: String,
    roleArn: String,
    roleId: String,
    roleName: String
  ): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal(arn = arn, createDate = createDate, id = id, name = name, path = path, roleArn = roleArn, roleId = roleId, roleName = roleName)
  
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
}

