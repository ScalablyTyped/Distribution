package typings
package atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceAllowedPrincipleArgs extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

