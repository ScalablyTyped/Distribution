package typings.pulumiAws.resourceAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAssociationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: js.UndefOr[Input[String]] = js.native
}

object ResourceAssociationState {
  @scala.inline
  def apply(resourceArn: Input[String] = null, resourceShareArn: Input[String] = null): ResourceAssociationState = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssociationState]
  }
}

