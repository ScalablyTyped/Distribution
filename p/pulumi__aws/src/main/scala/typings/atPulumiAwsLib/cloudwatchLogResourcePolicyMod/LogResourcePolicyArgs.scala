package typings
package atPulumiAwsLib.cloudwatchLogResourcePolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogResourcePolicyArgs extends js.Object {
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Name of the resource policy.
    */
  val policyName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

