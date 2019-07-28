package typings.atPulumiAws.ramPrincipalAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalAssociationArgs extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: Input[String]
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: Input[String]
}

object PrincipalAssociationArgs {
  @scala.inline
  def apply(principal: Input[String], resourceShareArn: Input[String]): PrincipalAssociationArgs = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrincipalAssociationArgs]
  }
}

