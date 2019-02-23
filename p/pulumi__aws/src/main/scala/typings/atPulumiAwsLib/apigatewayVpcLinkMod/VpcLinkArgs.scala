package typings
package atPulumiAwsLib.apigatewayVpcLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcLinkArgs extends js.Object {
  /**
    * The description of the VPC link.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name used to label and identify the VPC link.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

