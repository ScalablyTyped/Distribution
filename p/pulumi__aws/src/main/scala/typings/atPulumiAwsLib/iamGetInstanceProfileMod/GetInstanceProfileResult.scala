package typings
package atPulumiAwsLib.iamGetInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the instance profile.
    */
  val arn: java.lang.String
  /**
    * The string representation of the date the instance profile
    * was created.
    */
  val createDate: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * The path to the instance profile.
    */
  val path: java.lang.String
  /**
    * The role arn associated with this instance profile.
    */
  val roleArn: java.lang.String
  /**
    * The role id associated with this instance profile.
    */
  val roleId: java.lang.String
  /**
    * The role name associated with this instance profile.
    */
  val roleName: java.lang.String
}

object GetInstanceProfileResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    createDate: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    roleArn: java.lang.String,
    roleId: java.lang.String,
    roleName: java.lang.String
  ): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal(arn = arn, createDate = createDate, id = id, name = name, path = path, roleArn = roleArn, roleId = roleId, roleName = roleName)
  
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
}

