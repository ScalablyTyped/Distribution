package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_Filters
import typings.relayDashRuntime.relayDashRuntimeStrings.RANGE_ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./mutations/RelayDeclarativeMutationConfig
trait RangeAddConfig extends DeclarativeMutationConfig {
  var connectionInfo: js.UndefOr[js.Array[Anon_Filters]] = js.undefined
  var connectionName: js.UndefOr[String] = js.undefined
  var edgeName: String
  var parentID: js.UndefOr[String] = js.undefined
  var parentName: js.UndefOr[String] = js.undefined
  var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.undefined
  var `type`: RANGE_ADD
}

object RangeAddConfig {
  @scala.inline
  def apply(
    edgeName: String,
    `type`: RANGE_ADD,
    connectionInfo: js.Array[Anon_Filters] = null,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null,
    rangeBehaviors: RangeBehaviors = null
  ): RangeAddConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName)
    __obj.updateDynamic("type")(`type`)
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    if (rangeBehaviors != null) __obj.updateDynamic("rangeBehaviors")(rangeBehaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAddConfig]
  }
}

