package typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod

import typings.relayDashRuntime.Anon_Filters
import typings.relayDashRuntime.Anon_FiltersKey
import typings.relayDashRuntime.relayDashRuntimeStrings.NODE_DELETE
import typings.relayDashRuntime.relayDashRuntimeStrings.RANGE_ADD
import typings.relayDashRuntime.relayDashRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeAddConfig
  - typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod.RangeDeleteConfig
  - typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod.NodeDeleteConfig
*/
trait DeclarativeMutationConfig extends js.Object

object DeclarativeMutationConfig {
  @scala.inline
  def RangeAddConfig(
    edgeName: String,
    `type`: RANGE_ADD,
    connectionInfo: js.Array[Anon_Filters] = null,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null,
    rangeBehaviors: RangeBehaviors = null
  ): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (parentID != null) __obj.updateDynamic("parentID")(parentID.asInstanceOf[js.Any])
    if (parentName != null) __obj.updateDynamic("parentName")(parentName.asInstanceOf[js.Any])
    if (rangeBehaviors != null) __obj.updateDynamic("rangeBehaviors")(rangeBehaviors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
  @scala.inline
  def RangeDeleteConfig(
    deletedIDFieldName: String | js.Array[String],
    pathToConnection: js.Array[String],
    `type`: RANGE_DELETE,
    connectionKeys: js.Array[Anon_FiltersKey] = null,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null
  ): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connectionKeys != null) __obj.updateDynamic("connectionKeys")(connectionKeys.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (parentID != null) __obj.updateDynamic("parentID")(parentID.asInstanceOf[js.Any])
    if (parentName != null) __obj.updateDynamic("parentName")(parentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
  @scala.inline
  def NodeDeleteConfig(
    deletedIDFieldName: String,
    `type`: NODE_DELETE,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null
  ): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName.asInstanceOf[js.Any])
    if (parentID != null) __obj.updateDynamic("parentID")(parentID.asInstanceOf[js.Any])
    if (parentName != null) __obj.updateDynamic("parentName")(parentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
}

