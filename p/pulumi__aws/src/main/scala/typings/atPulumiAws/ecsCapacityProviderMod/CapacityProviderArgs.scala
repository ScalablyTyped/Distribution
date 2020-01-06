package typings.atPulumiAws.ecsCapacityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ecs.CapacityProviderAutoScalingGroupProvider
import typings.atPulumiPulumi.outputMod.Input
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
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object CapacityProviderArgs {
  @scala.inline
  def apply(
    autoScalingGroupProvider: Input[CapacityProviderAutoScalingGroupProvider],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): CapacityProviderArgs = {
    val __obj = js.Dynamic.literal(autoScalingGroupProvider = autoScalingGroupProvider.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderArgs]
  }
}

