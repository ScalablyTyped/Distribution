package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDeleteConfig extends DeclarativeMutationConfig {
  var connectionName: js.UndefOr[java.lang.String] = js.undefined
  var deletedIDFieldName: java.lang.String
  var parentID: js.UndefOr[java.lang.String] = js.undefined
  var parentName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.NODE_DELETE
}

object NodeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: java.lang.String,
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.NODE_DELETE,
    connectionName: java.lang.String = null,
    parentID: java.lang.String = null,
    parentName: java.lang.String = null
  ): NodeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName)
    __obj.updateDynamic("type")(`type`)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    __obj.asInstanceOf[NodeDeleteConfig]
  }
}

