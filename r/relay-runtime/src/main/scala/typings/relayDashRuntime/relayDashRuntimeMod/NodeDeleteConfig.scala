package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.relayDashRuntimeStrings.NODE_DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDeleteConfig extends DeclarativeMutationConfig {
  var connectionName: js.UndefOr[String] = js.undefined
  var deletedIDFieldName: String
  var parentID: js.UndefOr[String] = js.undefined
  var parentName: js.UndefOr[String] = js.undefined
  var `type`: NODE_DELETE
}

object NodeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: String,
    `type`: NODE_DELETE,
    connectionName: String = null,
    parentID: String = null,
    parentName: String = null
  ): NodeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName)
    __obj.updateDynamic("type")(`type`)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    __obj.asInstanceOf[NodeDeleteConfig]
  }
}

