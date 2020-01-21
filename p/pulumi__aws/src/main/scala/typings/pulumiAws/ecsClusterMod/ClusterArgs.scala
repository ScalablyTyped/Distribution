package typings.pulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typings.pulumiAws.inputMod.ecs.ClusterSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterArgs extends js.Object {
  /**
    * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
    */
  val capacityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The capacity provider strategy to use by default for the cluster. Can be one or more.  Defined below.
    */
  val defaultCapacityProviderStrategies: js.UndefOr[Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]]] = js.native
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
    */
  val settings: js.UndefOr[Input[js.Array[Input[ClusterSetting]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterArgs {
  @scala.inline
  def apply(
    capacityProviders: Input[js.Array[Input[String]]] = null,
    defaultCapacityProviderStrategies: Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]] = null,
    name: Input[String] = null,
    settings: Input[js.Array[Input[ClusterSetting]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal()
    if (capacityProviders != null) __obj.updateDynamic("capacityProviders")(capacityProviders.asInstanceOf[js.Any])
    if (defaultCapacityProviderStrategies != null) __obj.updateDynamic("defaultCapacityProviderStrategies")(defaultCapacityProviderStrategies.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

