package typings.atPulumiAws.typesOutputMod.emrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMasterInstanceGroup extends js.Object {
  var bidPrice: js.UndefOr[String] = js.undefined
  var ebsConfigs: js.Array[ClusterMasterInstanceGroupEbsConfig]
  /**
    * The ID of the EMR Cluster
    */
  var id: String
  var instanceCount: js.UndefOr[Double] = js.undefined
  var instanceType: String
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[String] = js.undefined
}

object ClusterMasterInstanceGroup {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[ClusterMasterInstanceGroupEbsConfig],
    id: String,
    instanceType: String,
    bidPrice: String = null,
    instanceCount: Int | Double = null,
    name: String = null
  ): ClusterMasterInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceType = instanceType)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClusterMasterInstanceGroup]
  }
}

