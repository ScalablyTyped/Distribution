package typings
package atPulumiAwsLib.ramResourceAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAssociationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ResourceAssociationArgs {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resourceShareArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ResourceAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceAssociationArgs]
  }
}

