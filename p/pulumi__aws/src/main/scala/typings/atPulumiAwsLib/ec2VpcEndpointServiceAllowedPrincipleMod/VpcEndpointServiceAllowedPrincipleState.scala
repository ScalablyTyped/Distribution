package typings
package atPulumiAwsLib.ec2VpcEndpointServiceAllowedPrincipleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceAllowedPrincipleState extends js.Object {
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

