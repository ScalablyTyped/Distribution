package typings.atPulumiAws.ramResourceAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAssociationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: Input[String]
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: Input[String]
}

object ResourceAssociationArgs {
  @scala.inline
  def apply(resourceArn: Input[String], resourceShareArn: Input[String]): ResourceAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceAssociationArgs]
  }
}

