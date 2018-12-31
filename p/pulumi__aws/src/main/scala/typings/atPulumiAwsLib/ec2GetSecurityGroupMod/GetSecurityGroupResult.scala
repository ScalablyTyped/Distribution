package typings
package atPulumiAwsLib.ec2GetSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupResult extends js.Object {
  /**
    * The computed ARN of the security group.
    */
  val arn: java.lang.String
  /**
    * The description of the security group.
    */
  val description: java.lang.String
  val id: java.lang.String
  val name: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

