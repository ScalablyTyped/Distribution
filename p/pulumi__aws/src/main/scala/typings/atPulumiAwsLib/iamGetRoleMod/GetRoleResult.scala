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

