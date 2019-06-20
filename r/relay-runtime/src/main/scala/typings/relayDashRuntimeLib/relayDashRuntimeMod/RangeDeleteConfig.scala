package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDeleteConfig extends DeclarativeMutationConfig {
  var connectionKeys: js.UndefOr[js.Array[relayDashRuntimeLib.Anon_FiltersKey]] = js.undefined
  var connectionName: js.UndefOr[java.lang.String] = js.undefined
  var deletedIDFieldName: java.lang.String | js.Array[java.lang.String]
  var parentID: js.UndefOr[java.lang.String] = js.undefined
  var parentName: js.UndefOr[java.lang.String] = js.undefined
  var pathToConnection: js.Array[java.lang.String]
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.RANGE_DELETE
}

object RangeDeleteConfig {
  @scala.inline
  def apply(
    deletedIDFieldName: java.lang.String | js.Array[java.lang.String],
    pathToConnection: js.Array[java.lang.String],
    `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.RANGE_DELETE,
    connectionKeys: js.Array[relayDashRuntimeLib.Anon_FiltersKey] = null,
    connectionName: java.lang.String = null,
    parentID: java.lang.String = null,
    parentName: java.lang.String = null
  ): RangeDeleteConfig = {
    val __obj = js.Dynamic.literal(deletedIDFieldName = deletedIDFieldName.asInstanceOf[js.Any], pathToConnection = pathToConnection)
    __obj.updateDynamic("type")(`type`)
    if (connectionKeys != null) __obj.updateDynamic("connectionKeys")(connectionKeys)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (parentID != null) __obj.updateDynamic("parentID")(parentID)
    if (parentName != null) __obj.updateDynamic("parentName")(parentName)
    __obj.asInstanceOf[RangeDeleteConfig]
  }
}

