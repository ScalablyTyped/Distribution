package typings.pulumiAws.capacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityProviderState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the capacity provider.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested argument defining the provider for the ECS auto scaling group. Defined below.
    */
  val autoScalingGroupProvider: js.UndefOr[Input[CapacityProviderAutoScalingGroupProvider]] = js.native
  
  /**
    * The name of the capacity provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object CapacityProviderState {
  
  @scala.inline
  def apply(): CapacityProviderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityProviderState]
  }
  
  @scala.inline
  implicit class CapacityProviderStateOps[Self <: CapacityProviderState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupProvider(value: Input[CapacityProviderAutoScalingGroupProvider]): Self = this.set("autoScalingGroupProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupProvider: Self = this.set("autoScalingGroupProvider", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
