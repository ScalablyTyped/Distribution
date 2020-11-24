package typings.relayRuntime.relayDeclarativeMutationConfigMod

import typings.relayRuntime.relayRuntimeStrings.NODE_DELETE
import typings.relayRuntime.relayRuntimeStrings.RANGE_ADD
import typings.relayRuntime.relayRuntimeStrings.RANGE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeAddConfig
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeDeleteConfig
  - typings.relayRuntime.relayDeclarativeMutationConfigMod.NodeDeleteConfig
*/
trait DeclarativeMutationConfig extends js.Object
object DeclarativeMutationConfig {
  
  @scala.inline
  def RangeAddConfig(edgeName: String, `type`: RANGE_ADD): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
  
  @scala.inline
  def RangeDeleteConfig(
    deletedIDFieldName: String | js.Array[String],
    pathToConnection: js.Array[String],
    `type`: RANGE_DELETE
  ): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
  
  @scala.inline
  def NodeDeleteConfig(deletedIDFieldName: String, `type`: NODE_DELETE): DeclarativeMutationConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeMutationConfig]
  }
}
