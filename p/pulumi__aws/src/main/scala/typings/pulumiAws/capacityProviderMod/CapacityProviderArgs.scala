package typings.pulumiAws.capacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderArgs extends js.Object {
  /**
    * Nested argument defining the provider for the ECS auto scaling group. Defined below.
    */
  val autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider] = js.native
  /**
    * The name of the capacity provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object CapacityProviderArgs {
  @scala.inline
  def apply(autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider]): CapacityProviderArgs = {
    val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderArgs]
  }
  @scala.inline
  implicit class CapacityProviderArgsOps[Self <: CapacityProviderArgs] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupProvider(value: Input[CapacityProviderAutoScalingGroupProvider]): Self = this.set("autoScalingGroupProvider", value.asInstanceOf[js.Any])
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

