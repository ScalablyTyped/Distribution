package typings.pulumiAws.capacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object CapacityProviderState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): CapacityProviderState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoScalingGroupProvider != null) __obj.updateDynamic("autoScalingGroupProvider")(autoScalingGroupProvider.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderState]
  }
}

