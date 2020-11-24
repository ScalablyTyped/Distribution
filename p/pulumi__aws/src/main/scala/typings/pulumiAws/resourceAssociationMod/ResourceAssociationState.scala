package typings.pulumiAws.resourceAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ResourceAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAssociationState]
  }
  
  @scala.inline
  implicit class ResourceAssociationStateOps[Self <: ResourceAssociationState] (val x: Self) extends AnyVal {
    
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
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: Input[String]): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
  }
}
