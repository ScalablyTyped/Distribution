package typings
package atPulumiAwsLib.iamGetRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: java.lang.String
  /**
    * The policy document associated with the role.
    */
  val assumeRolePolicy: java.lang.String
  val assumeRolePolicyDocument: java.lang.String
  val createDate: java.lang.String
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val maxSessionDuration: scala.Double
  /**
    * The path to the role.
    */
  val path: java.lang.String
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: java.lang.String
  val roleId: java.lang.String
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: java.lang.String
}

object GetRoleResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    assumeRolePolicy: java.lang.String,
    assumeRolePolicyDocument: java.lang.String,
    createDate: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    maxSessionDuration: scala.Double,
    path: java.lang.String,
    permissionsBoundary: java.lang.String,
    roleId: java.lang.String,
    uniqueId: java.lang.String
  ): GetRoleResult = {
    val __obj = js.Dynamic.literal(arn = arn, assumeRolePolicy = assumeRolePolicy, assumeRolePolicyDocument = assumeRolePolicyDocument, createDate = createDate, description = description, id = id, maxSessionDuration = maxSessionDuration, path = path, permissionsBoundary = permissionsBoundary, roleId = roleId, uniqueId = uniqueId)
  
    __obj.asInstanceOf[GetRoleResult]
  }
}

