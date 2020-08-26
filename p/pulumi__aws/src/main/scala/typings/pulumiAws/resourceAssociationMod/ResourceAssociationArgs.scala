package typings.pulumiAws.resourceAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAssociationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: Input[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: Input[String] = js.native
}

object ResourceAssociationArgs {
  @scala.inline
  def apply(resourceArn: Input[String], resourceShareArn: Input[String]): ResourceAssociationArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssociationArgs]
  }
  @scala.inline
  implicit class ResourceAssociationArgsOps[Self <: ResourceAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceShareArn(value: Input[String]): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
  }
  
}

