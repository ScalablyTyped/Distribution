package typings
package atPulumiAwsLib.ramPrincipalAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalAssociationArgs extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object PrincipalAssociationArgs {
  @scala.inline
  def apply(
    principal: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resourceShareArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): PrincipalAssociationArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrincipalAssociationArgs]
  }
}

