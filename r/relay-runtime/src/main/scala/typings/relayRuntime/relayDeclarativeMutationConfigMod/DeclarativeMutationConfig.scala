package typings.relayRuntime.relayDeclarativeMutationConfigMod

import typings.relayRuntime.AnonFilters
import typings.relayRuntime.AnonKey
import typings.relayRuntime.relayRuntimeStrings.NODE_DELETE
import typings.relayRuntime.relayRuntimeStrings.RANGE_ADD
import typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig
*/
trait DeclarativeMutationConfig extends js.Object

object DeclarativeMutationConfig {
  @scala.inline
  def RangeAddConfig(
    edgeName: String,
    `type`: RANGE_ADD,
    connectionInfo: js.Array[AnonFilters] = null,
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
    connectionKeys: js.Array[AnonKey] = null,
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

