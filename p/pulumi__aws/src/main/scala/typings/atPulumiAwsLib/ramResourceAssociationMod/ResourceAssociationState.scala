package typings
package atPulumiAwsLib.ramResourceAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAssociationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ResourceAssociationState {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceShareArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ResourceAssociationState = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssociationState]
  }
}

