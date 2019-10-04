package typings.atPulumiAws.ecsClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ecsNs.ClusterSetting
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Defined below.
    */
  val settings: js.UndefOr[Input[js.Array[Input[ClusterSetting]]]] = js.undefined
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    settings: Input[js.Array[Input[ClusterSetting]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

