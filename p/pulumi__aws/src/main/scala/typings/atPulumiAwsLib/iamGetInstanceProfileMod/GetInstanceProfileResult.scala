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

