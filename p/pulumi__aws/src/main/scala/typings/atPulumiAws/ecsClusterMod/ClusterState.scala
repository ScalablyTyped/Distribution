package typings.atPulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ecs.ClusterDefaultCapacityProviderStrategy
import typings.atPulumiAws.typesInputMod.ecs.ClusterSetting
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
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

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    capacityProviders: Input[js.Array[Input[String]]] = null,
    defaultCapacityProviderStrategies: Input[js.Array[Input[ClusterDefaultCapacityProviderStrategy]]] = null,
    name: Input[String] = null,
    settings: Input[js.Array[Input[ClusterSetting]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (capacityProviders != null) __obj.updateDynamic("capacityProviders")(capacityProviders.asInstanceOf[js.Any])
    if (defaultCapacityProviderStrategies != null) __obj.updateDynamic("defaultCapacityProviderStrategies")(defaultCapacityProviderStrategies.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

