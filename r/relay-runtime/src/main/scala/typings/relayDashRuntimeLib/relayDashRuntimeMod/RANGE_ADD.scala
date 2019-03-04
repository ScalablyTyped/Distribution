package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RANGE_ADD extends RelayMutationConfig {
  var connectionInfo: js.UndefOr[js.Array[relayDashRuntimeLib.Anon_Filters]] = js.undefined
  var connectionName: js.UndefOr[java.lang.String] = js.undefined
  var edgeName: java.lang.String
  var parentID: js.UndefOr[java.lang.String] = js.undefined
  var parentName: js.UndefOr[java.lang.String] = js.undefined
  var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.undefined
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.RANGE_ADD
}

object RANGE_ADD {
  @scala.inline
  def apply(
    edgeName: java.lang.String,
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.RANGE_ADD,
    connectionInfo: js.Array[relayDashRuntimeLib.Anon_Filters] = null,
    connectionName: java.lang.String = null,
    parentID: java.lang.String = null,
    parentName: java.lang.String = null,
    rangeBehaviors: RangeBehaviors = null
  ): RANGE_ADD = {
    val __obj = js.Dynamic.literal(edgeName = edgeName)
    __obj.updateDynamic("type")(`type`)
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    if (rangeBehaviors != null) __obj.updateDynamic("rangeBehaviors")(rangeBehaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RANGE_ADD]
  }
}

