package typings.atPulumiAws.iamGetRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: String
  /**
    * The policy document associated with the role.
    */
  val assumeRolePolicy: String
  /**
    * Creation date of the role in RFC 3339 format.
    */
  val createDate: String
  /**
    * Description for the role.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Maximum session duration.
    */
  val maxSessionDuration: Double
  val name: String
  /**
    * The path to the role.
    */
  val path: String
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: String
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: String
}

object GetRoleResult {
  @scala.inline
  def apply(
    arn: String,
    assumeRolePolicy: String,
    createDate: String,
    description: String,
    id: String,
    maxSessionDuration: Double,
    name: String,
    path: String,
    permissionsBoundary: String,
    uniqueId: String
  ): GetRoleResult = {
    val __obj = js.Dynamic.literal(arn = arn, assumeRolePolicy = assumeRolePolicy, createDate = createDate, description = description, id = id, maxSessionDuration = maxSessionDuration, name = name, path = path, permissionsBoundary = permissionsBoundary, uniqueId = uniqueId)
  
    __obj.asInstanceOf[GetRoleResult]
  }
}

